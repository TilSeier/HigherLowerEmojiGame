package com.tilseier.higherloweremojigame

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.tilseier.higherloweremojigame.util.AppPreferences
import com.tilseier.higherloweremojigame.util.TrackingUtil

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        TrackingUtil.initialize(this)
        AppPreferences.initialize(this)
        MobileAds.initialize(this) { initializationStatus ->
            // If you're using mediation, wait until the completion handler is called
            // before loading ads, as this will ensure that all mediation adapters are initialized.
        }
    }
}
