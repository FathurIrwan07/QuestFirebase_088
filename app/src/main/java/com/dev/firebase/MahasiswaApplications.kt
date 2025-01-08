package com.dev.firebase

import android.app.Application
import com.dev.firebase.di.AppContainer
import com.dev.firebase.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}