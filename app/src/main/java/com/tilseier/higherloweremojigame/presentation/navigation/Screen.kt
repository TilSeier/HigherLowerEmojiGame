package com.tilseier.higherloweremojigame.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object GamesMenu : Screen("games_menu_screen")
    object EmojiDifficultiesMenu : Screen("emoji_difficulties_menu_screen")
    object Game : Screen("game_screen/{category}/{difficulty}") {
        fun pass(category: String, difficulty: String) = "game_screen/$category/$difficulty"
    }

    object GameOver : Screen("game_over_screen/{score}") {
        fun passScore(score: Int) = "game_over_screen/$score"
    }
    object ExitDialog : Screen("exit_dialog")
}
