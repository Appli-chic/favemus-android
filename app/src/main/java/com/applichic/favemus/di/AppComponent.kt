package com.applichic.favemus.di

import android.app.Application
import com.applichic.favemus.FavemusApplication
import com.applichic.favemus.di.activity.LoginActivityModule
import com.applichic.favemus.di.activity.MainActivityModule
import com.applichic.favemus.di.activity.SplashActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class,
        SplashActivityModule::class,
        LoginActivityModule::class
    ]
)

interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: FavemusApplication)
}