package com.tilseier.higherloweremojigame.util

import android.content.Context
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.domain.model.EmojiFact

object TrackingUtil {
    private const val TAG = "TrackingUtil"

    private const val EVENT_NAME_PLAY_GAME_CLICK = "Play Game Click"
    private const val EVENT_NAME_SELECT_DIFFICULTY = "Select Difficulty"
    private const val EVENT_NAME_RATE_INTERACTION = "Rate Interaction"
    private const val EVENT_NAME_SHARE_INTERACTION = "Share Interaction"
    private const val EVENT_NAME_FACT_INTERACTION = "Fact Interaction"
    private const val EVENT_NAME_AD_ERROR = "Ad Error"
    private const val EVENT_NAME_SCREEN_INTERACTION = "Screen Interaction"
    private const val EVENT_NAME_COPY_EMOJI = "Copy Emoji"
    private const val EVENT_NAME_MORE_INFO = "More Info"
    private const val EVENT_NAME_BUTTON_CLICK = "Button Click"
    private const val EVENT_NAME_CONSENT_FORM_ERROR = "Consent Form Error"
    private const val EVENT_NAME_CONSENT_OBTAINED = "Consent Obtained"

    private const val ATTR_DIFFICULTY = "Difficulty"
    private const val ATTR_INTERACTION = "Interaction"
    private const val ATTR_SCORE = "Score"
    private const val ATTR_HIGH_SCORE = "HighScore"
    private const val ATTR_EMOJI = "Emoji"
    private const val ATTR_BUTTON = "Button"
    private const val ATTR_TITLE = "Title"
    private const val ATTR_MESSAGE = "Message"
    private const val ATTR_GAME_NAME = "GameName"
    private const val ATTR_CODE = "Code"

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    fun initialize(context: Context) {
        firebaseAnalytics = FirebaseAnalytics.getInstance(context)
    }

    fun fireEvent(event: TrackingEvent) {
        val bundle = Bundle()
        event.attributes.entries.forEach { entry ->
            val value = entry.value
            val escapedKeyName = entry.key.replace(' ', '_')
            when (value) {
                is String -> bundle.putString(escapedKeyName, value)
                is Boolean -> bundle.putBoolean(escapedKeyName, value)
                is Int -> bundle.putInt(escapedKeyName, value)
                is Double -> bundle.putDouble(escapedKeyName, value)
                is Long -> bundle.putLong(escapedKeyName, value)
                else -> bundle.putString(escapedKeyName, value?.toString() ?: "")
            }
        }
        val escapedEventName: String = event.eventName.replace(' ', '_')
        firebaseAnalytics.logEvent(escapedEventName, bundle)
    }

    // TRACKING EVENTS

    fun trackPlayClick(game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_PLAY_GAME_CLICK)
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackSelectDifficulty(difficulty: Difficulty) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_SELECT_DIFFICULTY)
            .withAttribute(ATTR_DIFFICULTY, difficulty.name)
            .build()
            .fire()
    }

    fun trackThumbUpClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_RATE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "thumb up click")
            .build()
            .fire()
    }

    fun trackRateClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_RATE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "rate click")
            .build()
            .fire()
    }

    fun trackMaybeLaterClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_RATE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "maybe later click")
            .build()
            .fire()
    }

    fun trackRateDismissClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_RATE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "dismiss click")
            .build()
            .fire()
    }

    fun trackMenuShareClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_SHARE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "menu share click")
            .build()
            .fire()
    }

    fun trackGamesMenuShareClick() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_SHARE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "games menu share click")
            .build()
            .fire()
    }

    fun trackScoreShareClick(score: Int, highScore: Int, difficulty: Difficulty) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_SHARE_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "game over share click")
            .withAttribute(ATTR_SCORE, score)
            .withAttribute(ATTR_HIGH_SCORE, highScore)
            .withAttribute(ATTR_DIFFICULTY, difficulty.name)
            .build()
            .fire()
    }

    fun trackCopyEmojiClick(emoji: String, game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_COPY_EMOJI)
            .withAttribute(ATTR_EMOJI, emoji)
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackMoreInfoClick(title: String, emoji: String, game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_MORE_INFO)
            .withAttribute(ATTR_EMOJI, emoji)
            .withAttribute(ATTR_TITLE, title)
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackContinueClick(game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_BUTTON_CLICK)
            .withAttribute(ATTR_BUTTON, "continue?")
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackRestartClick(game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_BUTTON_CLICK)
            .withAttribute(ATTR_BUTTON, "restart")
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackFactClick(emojiFact: EmojiFact) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_FACT_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "fact click")
            .withAttribute(ATTR_TITLE, emojiFact.title)
            .build()
            .fire()
    }

    fun trackGameOverScreenOpen(score: Int, highScore: Int, difficulty: Difficulty, game: Game) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_SCREEN_INTERACTION)
            .withAttribute(ATTR_INTERACTION, "game over open")
            .withAttribute(ATTR_SCORE, score)
            .withAttribute(ATTR_HIGH_SCORE, highScore)
            .withAttribute(ATTR_DIFFICULTY, difficulty.name)
            .withAttribute(ATTR_GAME_NAME, game.name)
            .build()
            .fire()
    }

    fun trackAdError(message: String) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_AD_ERROR)
            .withAttribute(ATTR_MESSAGE, message)
            .build()
            .fire()
    }

    // Consent Form
    fun trackObtainedConsent() {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_CONSENT_OBTAINED)
            .build()
            .fire()
    }

    fun trackConsentFormError(message: String, code: String) {
        TrackingEvent.newBuilder()
            .withEventName(EVENT_NAME_CONSENT_FORM_ERROR)
            .withAttribute(ATTR_MESSAGE, message)
            .withAttribute(ATTR_CODE, code)
            .build()
            .fire()
    }
}
