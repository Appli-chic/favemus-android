package com.applichic.favemus.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.applichic.favemus.util.Resource
import com.applichic.favemus.model.User
import com.applichic.favemus.repository.UserRepository
import com.applichic.favemus.util.AbsentLiveData
import javax.inject.Inject


class HomeViewModel @Inject constructor(userRepository: UserRepository) : ViewModel() {
    private val _userId = MutableLiveData<Int>()

    val user: LiveData<Resource<User>> = Transformations
        .switchMap(_userId) { id ->
            if (id == null) {
                AbsentLiveData.create()
            } else {
                userRepository.getUser(id)
            }
        }

    fun setId(id: Int?) {
        if (_userId.value != id) {
            _userId.value = id
        }
    }
}