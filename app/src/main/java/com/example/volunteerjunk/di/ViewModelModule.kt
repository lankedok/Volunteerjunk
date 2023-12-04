package com.example.volunteerjunk.di

import androidx.lifecycle.ViewModel
import com.example.volunteerjunk.presentation.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(viewModel: MainViewModel) : ViewModel
}