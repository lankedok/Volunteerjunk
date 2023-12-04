package com.example.volunteerjunk.presentation

import android.app.Application
import com.example.volunteerjunk.di.ApplicationComponent
import com.example.volunteerjunk.di.DaggerApplicationComponent
import dagger.internal.DaggerGenerated

class VolunteerJunkApplication: Application() {
    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}