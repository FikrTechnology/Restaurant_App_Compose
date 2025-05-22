package com.example.restaurantapps

import android.app.Application
import com.example.restaurantapps.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RestaurantApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize Koin
        startKoin {
            androidContext(this@RestaurantApp)
            modules(appModule)
        }
    }
}