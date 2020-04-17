package com.applichic.favemus.util

import com.google.gson.Gson


class Error {
    val error: String? = null
    val code: String? = null

    companion object {
        fun fromJson(data: String?): Error {
            val gson = Gson()
            return gson.fromJson(data, Error::class.java)
        }
    }
}