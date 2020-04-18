package com.applichic.favemus.di.activity

import com.applichic.favemus.di.FragmentBuildersModule
import com.applichic.favemus.ui.register.RegisterActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class RegisterActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeRegisterActivityModule(): RegisterActivity
}