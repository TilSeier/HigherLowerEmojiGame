package com.tilseier.higherloweremojigame.presentation.navigation

sealed class Screen(val route: String) {
    object Menu : Screen("menu_screen")
    object Game : Screen("game_screen/{category}") {
        fun passCategory(category: String) = "game_screen/$category"
    }

    object GameOver : Screen("game_over_screen/{score}") {
        fun passScore(score: Int) = "game_over_screen/$score"
    }
}
