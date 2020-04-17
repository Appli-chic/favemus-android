package com.applichic.favemus.api

import androidx.lifecycle.LiveData
import com.applichic.favemus.model.User
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface UserService {
    @GET("/api/users/{id}")
    fun getUser(
        @Path("id") id: Int,
        @Header("Authorization") authHeader: String?
    ): LiveData<ApiResponse<User>>
}