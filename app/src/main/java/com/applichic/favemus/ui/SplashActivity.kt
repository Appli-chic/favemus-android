package com.applichic.favemus.ui

import android.content.Intent
import android.os.Bundle
import com.applichic.favemus.R
import com.applichic.favemus.ui.login.LoginActivity
import dagger.android.support.DaggerAppCompatActivity

class SplashActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val loginActivity = Intent(this, LoginActivity::class.java)
        startActivity(loginActivity)
    }

}
