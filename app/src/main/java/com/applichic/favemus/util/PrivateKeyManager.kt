package com.applichic.favemus.util

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

const val REFRESH_TOKEN_KEY = "refresh_token"
const val ACCESS_TOKEN_KEY = "access_token"

class PrivateKeyManager(context: Context) {
    private var pref: SharedPreferences? = null

    init {
        val masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
        pref = EncryptedSharedPreferences.create(
            "PreferencesFilename",
            masterKeyAlias,
            context,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    fun putData(key: String, data: String) {
        pref?.edit()?.putString(key, data)?.apply()
    }

    fun readData(key: String): String? {
        return pref?.getString(key, "")
    }
}