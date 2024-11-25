package com.tilseier.higherloweremojigame.util

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import androidx.preference.PreferenceManager
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game

class AppPreferences private constructor(context: Context) {
    private val preferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    fun watchForChanges(listener: OnSharedPreferenceChangeListener?) {
        preferences.registerOnSharedPreferenceChangeListener(listener)
    }

    fun higherScore(game: Game, difficulty: Difficulty): Int {
        return when (game) {
            Game.EMOJI_GAME -> {
                when (difficulty) {
                    Difficulty.EASY -> preferences.getInt(HIGHER_SCORE_EASY, DEFAULT_HIGHER_SCORE)
                    Difficulty.MEDIUM -> preferences.getInt(HIGHER_SCORE_MEDIUM, DEFAULT_HIGHER_SCORE)
                    Difficulty.HARD -> preferences.getInt(HIGHER_SCORE_HARD, DEFAULT_HIGHER_SCORE)
                }
            }
            Game.INVENTION_GAME -> {
                preferences.getInt(INVENTION_HIGHER_SCORE, DEFAULT_HIGHER_SCORE)
            }
        }
    }

    fun setHigherScore(game: Game, score: Int, difficulty: Difficulty) {
        when (game) {
            Game.EMOJI_GAME -> {
                when (difficulty) {
                    Difficulty.EASY -> preferences.edit().putInt(HIGHER_SCORE_EASY, score).apply()
                    Difficulty.MEDIUM -> preferences.edit().putInt(HIGHER_SCORE_MEDIUM, score).apply()
                    Difficulty.HARD -> preferences.edit().putInt(HIGHER_SCORE_HARD, score).apply()
                }
            }
            Game.INVENTION_GAME -> {
                preferences.edit().putInt(INVENTION_HIGHER_SCORE, score).apply()
            }
        }
    }

    companion object {
        private const val HIGHER_SCORE_EASY = "higher_score_easy"
        private const val HIGHER_SCORE_MEDIUM = "higher_score_medium"
        private const val HIGHER_SCORE_HARD = "higher_score_hard"

        private const val INVENTION_HIGHER_SCORE = "invention_higher_score"

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
