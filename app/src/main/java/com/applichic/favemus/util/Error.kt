package com.applichic.favemus.util

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException


class Error {
    val error: String? = null
    val code: String? = null

    companion object {
        fun fromJson(data: String?): Error? {
            return try {
                val gson = Gson()
                gson.fromJson(data, Error::class.java)
            } catch (e: JsonSyntaxException) {
                null
            }
        }
    }
}