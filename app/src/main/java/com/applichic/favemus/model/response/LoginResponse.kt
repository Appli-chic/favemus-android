package com.applichic.favemus.model.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @field:SerializedName("accessToken")
    val accessToken: String? = null,

    @field:SerializedName("refreshToken")
    val refreshToken: String? = null,

    @field:SerializedName("expiresIn")
    val expiresIn: Int? = null
)