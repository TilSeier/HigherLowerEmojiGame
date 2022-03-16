package com.tilseier.higherloweremojigame

import android.app.Application
import com.tilseier.higherloweremojigame.util.AppPreferences

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppPreferences.initialize(this)
    }
}
