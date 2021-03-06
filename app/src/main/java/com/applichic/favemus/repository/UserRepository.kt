package com.applichic.favemus.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.applichic.favemus.AppExecutors
import com.applichic.favemus.api.ApiResponse
import com.applichic.favemus.api.UserService
import com.applichic.favemus.db.UserDao
import com.applichic.favemus.favemusContext
import com.applichic.favemus.util.Resource
import com.applichic.favemus.model.User
import com.applichic.favemus.util.ACCESS_TOKEN_KEY
import com.applichic.favemus.util.PrivateKeyManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val appExecutors: AppExecutors,
    private val userService: UserService,
    private val userDao: UserDao
) {

    fun getUser(userId: Int): LiveData<Resource<User>> {
        return object : NetworkBoundResource<User, User>(appExecutors) {
            override fun saveCallResult(item: User) {
                userDao.insert(item)
            }

            override fun shouldFetch(data: User?) = true

            override fun loadFromDb() = userDao.findById(userId)

            override fun shouldLoadFromDb() = true

            override fun createCall(accessToken: String?) =  userService.getUser(userId, accessToken)
        }.asLiveData()
    }
}