package com.applichic.favemus.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.applichic.favemus.repository.AuthRepository
import javax.inject.Inject

class RegisterViewModel @Inject constructor() : ViewModel() {
    private var _isLoading = MutableLiveData<Boolean>()

    val isLoading: LiveData<Boolean> = _isLoading

    fun setLoading(isLoading: Boolean) {
        _isLoading.value = isLoading
    }
}