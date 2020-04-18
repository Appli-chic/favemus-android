package com.applichic.favemus.ui.login

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.applichic.favemus.AppExecutors
import com.applichic.favemus.R
import com.applichic.favemus.repository.CODE_ERROR_EMAIL_OR_PASSWORD_INCORRECT
import com.applichic.favemus.repository.CODE_ERROR_SERVER
import com.applichic.favemus.ui.MainActivity
import com.applichic.favemus.ui.register.RegisterActivity
import com.applichic.favemus.util.*
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject
import kotlin.system.exitProcess


class LoginActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var appExecutors: AppExecutors

    private val loginViewModel: LoginViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginViewModel.isLoading.observe(this, Observer {
            if(it) {
                layout_loading.visibility = View.VISIBLE
            } else {
                layout_loading.visibility = View.GONE
            }
        })

        loginViewModel.loginResponse.observe(this, Observer {
            if (it.status == Status.ERROR) {
                val err = Error.fromJson(it.message)

                if(err == null) {
                    val message = resources.getString(R.string.server_error)
                    loginViewModel.setErrors(arrayListOf(message))
                } else {
                    val message = when (err.code) {
                        CODE_ERROR_SERVER -> resources.getString(R.string.server_error)
                        CODE_ERROR_EMAIL_OR_PASSWORD_INCORRECT -> resources.getString(R.string.login_error_email_or_password_incorrect)
                        else -> resources.getString(R.string.server_error)
                    }

                    loginViewModel.setErrors(arrayListOf(message))
                }
            }

            if (it.status == Status.SUCCESS) {
                // Keep the access token and refresh token
                val keyManager = PrivateKeyManager(this)

                if(it.data?.refreshToken != null && it.data.accessToken != null) {
                    keyManager.putData(REFRESH_TOKEN_KEY, it.data.refreshToken)
                    keyManager.putData(ACCESS_TOKEN_KEY, it.data.accessToken)

                    val mainActivity = Intent(this, MainActivity::class.java)
                    startActivity(mainActivity)
                }
            }
        })

        loginViewModel.errors.observe(this, Observer {
            if (it.isNotEmpty()) {
                loginViewModel.setLoading(false)
                displaysErrors(it)
            }
        })
    }

    private fun displaysErrors(errors: ArrayList<String>) {
        var message = ""

        for (msg in errors) {
            message += msg + "\n"
        }

        AlertDialog.Builder(this, R.style.DialogTheme)
            .setTitle(resources.getString(R.string.error))
            .setMessage(message)
            .setPositiveButton(
                android.R.string.ok
            ) { _, _ -> }
            .show()
    }

    fun onLoginClicked(view: View) {
        loginViewModel.onLoginClicked(
            email_text_field.text.toString(),
            password_text_field.text.toString(),
            this
        )
    }

    fun onRegisterClicked(view: View) {
        val registerActivity = Intent(this, RegisterActivity::class.java)
        startActivity(registerActivity)
    }

    override fun onBackPressed() {
        finishAffinity()
        exitProcess(0)
    }
}
