package com.applichic.favemus.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.applichic.favemus.model.Resource
import com.applichic.favemus.model.User
import com.applichic.favemus.repository.UserRepository
import com.applichic.favemus.util.AbsentLiveData
import javax.inject.Inject


class UserViewModel @Inject constructor(userRepository: UserRepository) : ViewModel() {
    private val _id = MutableLiveData<Int>()

    val user: LiveData<Resource<User>> = Transformations
        .switchMap(_id) { id ->
            if (id == null) {
                AbsentLiveData.create()
            } else {
                userRepository.getUser(id)
            }
        }

    fun setId(id: Int?) {
        if (_id.value != id) {
            _id.value = id
        }
    }
}