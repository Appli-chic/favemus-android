package com.applichic.favemus.model.response

import com.google.gson.annotations.SerializedName

data class RefreshResponse(
    @field:SerializedName("accessToken")
    val accessToken: String? = null,

    @field:SerializedName("expiresIn")
    val expiresIn: Int? = null
)