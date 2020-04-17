package com.applichic.favemus.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import com.applichic.favemus.AppExecutors
import com.applichic.favemus.api.ApiEmptyResponse
import com.applichic.favemus.api.ApiErrorResponse
import com.applichic.favemus.api.ApiResponse
import com.applichic.favemus.api.ApiSuccessResponse
import com.applichic.favemus.favemusContext
import com.applichic.favemus.util.ACCESS_TOKEN_KEY
import com.applichic.favemus.util.AbsentLiveData
import com.applichic.favemus.util.PrivateKeyManager
import com.applichic.favemus.util.Resource

abstract class NetworkBoundResource<ResultType, RequestType>
@MainThread constructor(private val appExecutors: AppExecutors) {

    private val result = MediatorLiveData<Resource<ResultType>>()

    init {
        result.value = Resource.loading(null)
        @Suppress("LeakingThis")
        val dbSource = loadFromDb()
        result.addSource(dbSource) { data ->
            result.removeSource(dbSource)
            if (shouldFetch(data)) {
                fetchFromNetwork(dbSource)
            } else {
                result.addSource(dbSource) { newData ->
                    setValue(Resource.success(newData))
                }
            }
        }
    }

    @MainThread
    private fun setValue(newValue: Resource<ResultType>) {
        if (result.value != newValue) {
            result.value = newValue
        }
    }

    private fun fetchFromNetwork(dbSource: LiveData<ResultType>) {
        val keyManager = PrivateKeyManager(favemusContext!!)
        var accessToken = keyManager.readData(ACCESS_TOKEN_KEY)

        if(accessToken != null && accessToken.isNotBlank()) {
            accessToken = "Bearer $accessToken"
        }

        val apiResponse = createCall(accessToken)
        // we re-attach dbSource as a new source, it will dispatch its latest value quickly
        result.addSource(dbSource) { newData ->
            setValue(Resource.loading(newData))
        }
        result.addSource(apiResponse) { response ->
            result.removeSource(apiResponse)
            result.removeSource(dbSource)
            when (response) {
                is ApiSuccessResponse -> {
                    appExecutors.diskIO().execute {
                        saveCallResult(processResponse(response))
                        appExecutors.mainThread().execute {
                            // we specially request a new live data,
                            // otherwise we will get immediately last cached value,
                            // which may not be updated with latest results received from network.

                            if(shouldLoadFromDb()) {
                                result.addSource(loadFromDb()) { newData ->
                                    setValue(Resource.success(newData))
                                }
                            } else {
                                setValue(Resource.success(response.body as ResultType))
                            }
                        }
                    }
                }
                is ApiEmptyResponse -> {
                    appExecutors.mainThread().execute {
                        // reload from disk whatever we had
                        if(shouldLoadFromDb()) {
                            result.addSource(loadFromDb()) { newData ->
                                setValue(Resource.success(newData))
                            }
                        } else {
                            AbsentLiveData.create<ResultType>()
                        }
                    }
                }
                is ApiErrorResponse -> {
                    onFetchFailed()

                    result.addSource(dbSource) { newData ->
                        setValue(Resource.error(response.errorMessage, newData))
                    }
                }
            }
        }
    }

    protected open fun onFetchFailed() {}

    fun asLiveData() = result as LiveData<Resource<ResultType>>

    @WorkerThread
    protected open fun processResponse(response: ApiSuccessResponse<RequestType>) = response.body

    @WorkerThread
    protected abstract fun saveCallResult(item: RequestType)

    @MainThread
    protected abstract fun shouldFetch(data: ResultType?): Boolean

    @MainThread
    protected abstract fun loadFromDb(): LiveData<ResultType>

    @MainThread
    protected abstract fun shouldLoadFromDb(): Boolean

    @MainThread
    protected abstract fun createCall(accessToken: String?): LiveData<ApiResponse<RequestType>>
}