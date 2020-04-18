package com.applichic.favemus.ui

import android.content.Intent
import android.os.Bundle
import com.applichic.favemus.R
import com.applichic.favemus.ui.login.LoginActivity
import com.applichic.favemus.util.PrivateKeyManager
import com.applichic.favemus.util.REFRESH_TOKEN_KEY
import dagger.android.support.DaggerAppCompatActivity

class SplashActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        val keyManager = PrivateKeyManager(this)
//        if(keyManager.readData(REFRESH_TOKEN_KEY) != null) {
//            // The user is already connected
//            val mainActivity = Intent(this, MainActivity::class.java)
//            startActivity(mainActivity)
//        } else {
            // Not connected yet
            val loginActivity = Intent(this, LoginActivity::class.java)
            startActivity(loginActivity)
//        }
    }
}
