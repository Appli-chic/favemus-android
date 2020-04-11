package com.applichic.favemus.di


import com.applichic.favemus.fragment.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun homeFragment(): HomeFragment

}