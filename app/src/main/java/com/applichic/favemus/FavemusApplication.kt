package com.applichic.favemus

import android.app.Application
import android.content.Context
import com.applichic.favemus.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

var favemusContext: Context? = null

class FavemusApplication: Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()
        favemusContext = applicationContext
        AppInjector.init(this)
    }
}