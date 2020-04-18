package com.applichic.favemus.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.applichic.favemus.ui.home.HomeViewModel
import com.applichic.favemus.ui.login.LoginViewModel
import com.applichic.favemus.ui.register.RegisterViewModel
import com.applichic.favemus.viewmodel.ViewModelFactory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginViewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RegisterViewModel::class)
    abstract fun bindRegisterViewModel(registerViewModel: RegisterViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}