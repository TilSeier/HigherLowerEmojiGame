package com.tilseier.higherloweremojigame.presentation

sealed class GameEvent {
    object OnRewardedVideoLoaded: GameEvent()
    object OnRewardedVideoFailedToLoad: GameEvent()
    object OnRewardedVideoDismissed: GameEvent()
    object OnRewardedVideoReward: GameEvent()
    object OnContinueButtonClick: GameEvent()
    object OnGameOverScreenOpen: GameEvent()
}
