package com.company.sample.app

import android.app.Application
import android.util.Log

class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCeate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG, "onLowMemory")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "onTerminate")
    }

    companion object {
        const val TAG = "SampleApplication"
    }
}