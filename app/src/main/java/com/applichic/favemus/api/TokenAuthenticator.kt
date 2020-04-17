package com.applichic.favemus.api

import com.applichic.favemus.di.URL
import com.applichic.favemus.favemusContext
import com.applichic.favemus.model.body.RefreshBody
import com.applichic.favemus.model.response.RefreshResponse
import com.applichic.favemus.util.ACCESS_TOKEN_KEY
import com.applichic.favemus.util.PrivateKeyManager
import com.applichic.favemus.util.REFRESH_TOKEN_KEY
import com.google.gson.Gson
import okhttp3.*


class TokenAuthenticator() : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {
        if (favemusContext != null) {
            val keyManager = PrivateKeyManager(favemusContext!!)
            val data = callRefreshTokenApi(keyManager)

            if (data?.accessToken != null) {
                keyManager.putData(ACCESS_TOKEN_KEY, data.accessToken)
                return response.request().newBuilder()
                    .header("Authorization", "Bearer ${data.accessToken}")
                    .build()
            }
        }

        return response.request().newBuilder()
            .build()
    }

    private fun callRefreshTokenApi(keyManager: PrivateKeyManager): RefreshResponse? {
        val client = OkHttpClient()
        val mediaType = MediaType.parse("application/json; charset=utf-8")
        val gson = Gson()
        val refreshToken = keyManager.readData(REFRESH_TOKEN_KEY)

        if (refreshToken != null) {
            val json = gson.toJson(RefreshBody(refreshToken))

            val body: RequestBody = RequestBody.create(mediaType, json)
            val request: Request = Request.Builder()
                .url(URL + "api/auth/refresh")
                .post(body)
                .build()
            val response = client.newCall(request).execute()

            if (response.code() == 200) {
                return gson.fromJson(response.body()?.string(), RefreshResponse::class.java)
            }
        }

        return null
    }
}