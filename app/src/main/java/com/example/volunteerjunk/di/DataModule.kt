package com.example.volunteerjunk.di

import com.example.volunteerjunk.data.network.ApiFactory
import com.example.volunteerjunk.data.network.ApiService
import com.example.volunteerjunk.data.repository.VolunteerJunkRepositoryImp
import com.example.volunteerjunk.domain.repository.VolunteerJunkRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindRepository(imp: VolunteerJunkRepositoryImp): VolunteerJunkRepository

    companion object {
        @ApplicationScope
        @Provides
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }
}