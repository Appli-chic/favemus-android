package com.applichic.favemus.api

import androidx.lifecycle.LiveData
import com.applichic.favemus.model.body.LoginBody
import com.applichic.favemus.model.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/api/auth/login")
    fun login(@Body loginBody: LoginBody): LiveData<ApiResponse<LoginResponse>>
}