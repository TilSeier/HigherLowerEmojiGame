package com.tilseier.higherloweremojigame.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.data.local.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.data.repository.ItemRepositoryImpl
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.extantions.viewModelFactory
import com.tilseier.higherloweremojigame.presentation.monetization.MonetizationEvent
import com.tilseier.higherloweremojigame.presentation.navigation.NavGraph
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.StatusBar
import com.tilseier.higherloweremojigame.util.GoogleMobileAdsConsentManager
import com.tilseier.higherloweremojigame.util.TrackingUtil
import java.util.concurrent.atomic.AtomicBoolean

class MainActivity : ComponentActivity() {
    private val viewModel: GameViewModel by viewModels {
        viewModelFactory { GameViewModel(GetItemsUseCase(ItemRepositoryImpl(ItemsLocalDataSource()))) }
    }

    // Ads
    private var isMobileAdsInitializeCalled = AtomicBoolean(false)
    private var rewardedAd: RewardedAd? = null
    private var hasVideoAdReward = false

    // User Consent
    private lateinit var googleMobileAdsConsentManager: GoogleMobileAdsConsentManager

    @OptIn(ExperimentalMaterialNavigationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gatherConsentAndInitializeAds()

        setContent {
            HigherLowerEmojiGameTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(
                    color = StatusBar
                )
                val bottomSheetNavigator = rememberBottomSheetNavigator()
                val navController = rememberNavController(bottomSheetNavigator)
                EventHandler(
                    viewModel = viewModel,
                    navController =  navController
                )
                NavGraph(
                    bottomSheetNavigator = bottomSheetNavigator,
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }

    @Composable
    fun EventHandler(
        navController: NavHostController,
        viewModel: GameViewModel,
    ) {
        LaunchedEffect(key1 = true) {
            viewModel.eventFlow.collect { event ->
                when (event) {
                    is GameViewModel.UiEvent.ShowRewardedVideo -> {
                        showVideoAd()
                    }
                    is GameViewModel.UiEvent.LoadRewardedVideo -> {
                        loadRewardedVideoAdIfNeeded()
                    }
                    is GameViewModel.UiEvent.OnReward -> {
                        viewModel.continueGame()
                        navController.navigate(Screen.Game.route) {
                            popUpTo(Screen.GamesMenu.route)
                        }
                    }
                    else -> {}
                }
            }
        }
    }

    // User Consent
    private fun gatherConsentAndInitializeAds() {
        googleMobileAdsConsentManager = GoogleMobileAdsConsentManager(this)
        googleMobileAdsConsentManager.gatherConsent { consentError ->
            // if consentError != null then consent not obtained in current session.

            if (googleMobileAdsConsentManager.canRequestAds) {
                initializeAdsSdkAndLoadAds()
                viewModel.onEvent(MonetizationEvent.Ads.ObtainedConsent)
            }

            viewModel.onEvent(
                MonetizationEvent.Ads.ConsentFormStatusUpdated(
                    canRequestAds = googleMobileAdsConsentManager.canRequestAds,
                    isPrivacyOptionsRequired = googleMobileAdsConsentManager.isPrivacyOptionsRequired,
                    consentError = consentError,
                )
            )
        }

        // load ads using consent obtained in the previous session.
        if (googleMobileAdsConsentManager.canRequestAds) {
            initializeAdsSdkAndLoadAds()
        }
    }

    // Monetization Video
    private fun initializeAdsSdkAndLoadAds() {
        if (isMobileAdsInitializeCalled.getAndSet(true)) {
            return
        }

        MobileAds.initialize(this) {
            // If you're using mediation, wait until the completion handler is called
            // before loading ads, as this will ensure that all mediation adapters are initialized.

            loadRewardedVideoAd()
        }
    }

    private fun loadRewardedVideoAd() {
        val context = this
        val adRequest = AdRequest.Builder().build()
        RewardedAd.load(
            context,
            Constants.AD_UNIT_ID,
            adRequest,
            object : RewardedAdLoadCallback() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    rewardedAd = null
                    viewModel.onEvent(GameEvent.OnRewardedVideoFailedToLoad)
                    TrackingUtil.trackAdError("Message: ${adError.message} Code: ${adError.code}")
                }

                override fun onAdLoaded(rewardedAd: RewardedAd) {
                    this@MainActivity.rewardedAd = rewardedAd
                    viewModel.onEvent(GameEvent.OnRewardedVideoLoaded)
                }
            }
        )
    }

    private fun loadRewardedVideoAdIfNeeded() {
        rewardedAd?.let {
            viewModel.onEvent(GameEvent.OnRewardedVideoLoaded)
        } ?: run {
            viewModel.onEvent(GameEvent.OnRewardedVideoFailedToLoad)
            loadRewardedVideoAd()
        }
    }

    private fun showVideoAd() {
        rewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {
            override fun onAdShowedFullScreenContent() {
                // Called when ad is shown.
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                // Called when ad fails to show.
                rewardedAd = null

                loadRewardedVideoAdIfNeeded()
            }

            override fun onAdDismissedFullScreenContent() {
                // Called when ad is dismissed.
                // Set the ad reference to null so you don't show the ad a second time.
                rewardedAd = null

                if (hasVideoAdReward) {
                    hasVideoAdReward = false
                    viewModel.onEvent(GameEvent.OnRewardedVideoReward)
                } else {
                    viewModel.onEvent(GameEvent.OnRewardedVideoDismissed)
                }
                loadRewardedVideoAdIfNeeded()
            }
        }

        if (rewardedAd != null) {
            rewardedAd?.show(this) {
                // User earned the reward
                hasVideoAdReward = true
            }
        } else {
            // The rewarded ad wasn't ready yet
            Toast.makeText(this, getString(R.string.error_ad_is_not_ready), Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
