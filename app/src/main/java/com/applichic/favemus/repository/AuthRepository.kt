package com.applichic.favemus.repository

import androidx.lifecycle.LiveData
import com.applichic.favemus.AppExecutors
import com.applichic.favemus.api.AuthService
import com.applichic.favemus.model.body.LoginBody
import com.applichic.favemus.model.body.RefreshBody
import com.applichic.favemus.model.response.LoginResponse
import com.applichic.favemus.model.response.RefreshResponse
import com.applichic.favemus.util.AbsentLiveData
import com.applichic.favemus.util.Resource
import javax.inject.Inject
import javax.inject.Singleton

const val CODE_ERROR_SERVER = "CODE_ERROR_SERVER"
const val CODE_ERROR_EMAIL_ALREADY_EXISTS = "CODE_ERROR_EMAIL_ALREADY_EXISTS"
const val CODE_ERROR_EMAIL_OR_PASSWORD_INCORRECT = "CODE_ERROR_EMAIL_OR_PASSWORD_INCORRECT"

@Singleton
class AuthRepository @Inject constructor(
    private val appExecutors: AppExecutors,
    private val authService: AuthService
) {
    fun login(loginBody: LoginBody): LiveData<Resource<LoginResponse>> {
        return object : NetworkBoundResource<LoginResponse, LoginResponse>(appExecutors) {

            override fun saveCallResult(item: LoginResponse) {
            }

            override fun shouldFetch(data: LoginResponse?) = true

            override fun loadFromDb() = AbsentLiveData.create<LoginResponse>()

            override fun shouldLoadFromDb() = false

            override fun createCall(accessToken: String?) = authService.login(loginBody)
        }.asLiveData()
    }
}