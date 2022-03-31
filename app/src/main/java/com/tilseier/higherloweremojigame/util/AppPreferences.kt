package com.tilseier.higherloweremojigame.util

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import androidx.preference.PreferenceManager

class AppPreferences private constructor(context: Context) {
    private val preferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    fun watchForChanges(listener: OnSharedPreferenceChangeListener?) {
        preferences.registerOnSharedPreferenceChangeListener(listener)
    }

    fun higherScore(): Int {
        return preferences.getInt(HIGHER_SCORE, DEFAULT_HIGHER_SCORE) ?: DEFAULT_HIGHER_SCORE
    }

    fun setHigherScore(score: Int) {
        preferences.edit().putInt(HIGHER_SCORE, score).apply()
    }

    companion object {
        private const val HIGHER_SCORE = "higher_score"

        // default values
        const val DEFAULT_HIGHER_SCORE = 0

        private var appPreferences: AppPreferences? = null

        fun initialize(application: Application) {
            if (appPreferences != null) return
            appPreferences = AppPreferences(application)
        }

        fun preferences(): AppPreferences? {
            return appPreferences
        }
    }
}
