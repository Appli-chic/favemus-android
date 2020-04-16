package com.applichic.favemus.di.activity

import com.applichic.favemus.ui.login.LoginActivity
import com.applichic.favemus.di.FragmentBuildersModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class LoginActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeLoginActivity(): LoginActivity
}