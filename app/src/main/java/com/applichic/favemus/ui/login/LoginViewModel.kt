package com.applichic.favemus.ui.login

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.applichic.favemus.R
import com.applichic.favemus.model.body.LoginBody
import com.applichic.favemus.model.response.LoginResponse
import com.applichic.favemus.repository.AuthRepository
import com.applichic.favemus.util.AbsentLiveData
import com.applichic.favemus.util.Resource
import javax.inject.Inject


class LoginViewModel @Inject constructor(authRepository: AuthRepository) : ViewModel() {
    private var _loginBody = MutableLiveData<LoginBody>()
    private var _errorList = MutableLiveData<ArrayList<String>>()

    val errors: LiveData<ArrayList<String>> = _errorList

    val loginResponse: LiveData<Resource<LoginResponse>> = Transformations
        .switchMap(_loginBody) { loginBody: LoginBody ->
            if (loginBody.email.isNotBlank() && loginBody.password.isNotBlank()) {
                authRepository.login(loginBody)
            } else {
                AbsentLiveData.create()
            }
        }

    fun setErrors(errors: ArrayList<String>) {
        _errorList.value = errors
    }

    fun onLoginClicked(email: String, password: String, context: Context) {
        val errorList = ArrayList<String>()

        // Check email
        val emailError = checkEmail(email, context)
        if (emailError != null) {
            errorList.add(emailError)
        }

        // Check password
        val passwordError = checkPassword(password, context)
        if (passwordError != null) {
            errorList.add(passwordError)
        }

        // Login or show the errors
        if (errorList.isEmpty()) {
            _loginBody.value =
                LoginBody(email, password)
        } else {
            _errorList.value = errorList
        }
    }

    private fun checkEmail(email: String, context: Context): String? {
        if (email.isBlank()) {
            return context.resources.getString(R.string.login_error_email_empty)
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return context.resources.getString(R.string.login_error_invalid_email)
        }

        return null
    }

    private fun checkPassword(password: String, context: Context): String? {
        if (password.isBlank()) {
            return context.resources.getString(R.string.login_error_password_empty)
        }

        if (password.length < 6) {
            return context.resources.getString(R.string.login_error_password_too_short)
        }

        return null
    }
}