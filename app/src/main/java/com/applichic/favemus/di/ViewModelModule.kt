package com.applichic.favemus.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.applichic.favemus.ui.home.HomeViewModel
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
    abstract fun bindUserViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}