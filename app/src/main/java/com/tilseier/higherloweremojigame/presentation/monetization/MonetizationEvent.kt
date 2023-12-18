package com.tilseier.higherloweremojigame.presentation.monetization

import com.google.android.ump.FormError

sealed class MonetizationEvent {
    sealed class Ads {
        object Initialized: Ads()
        data class ConsentFormStatusUpdated(
            val canRequestAds: Boolean = true,
            val isPrivacyOptionsRequired: Boolean = false,
            val consentError: FormError? = null,
        ): Ads()
        object ObtainedConsent: Ads()
    }
}
