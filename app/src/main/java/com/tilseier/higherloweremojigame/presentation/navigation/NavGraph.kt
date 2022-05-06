package com.tilseier.higherloweremojigame.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tilseier.higherloweremojigame.presentation.screen.game.GameScreen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.presentation.screen.gameover.GameOverScreen
import com.tilseier.higherloweremojigame.presentation.screen.menu.HomeScreen
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.common.Difficulty

@Composable
fun NavGraph(navController: NavHostController, viewModel: GameViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        composable(route = Screen.Menu.route) {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable(
            route = Screen.Game.route,
            arguments = listOf(
                navArgument(Constants.ARGUMENT_KEY_CATEGORY) {
                    type = NavType.StringType
                    defaultValue = Constants.CATEGORY_EMOJI
                },
                navArgument(Constants.ARGUMENT_KEY_DIFFICULTY) {
                    type = NavType.StringType
                    defaultValue = Difficulty.EASY.name
                },
            )
        ) { backStackEntry ->
            val arguments = backStackEntry.arguments ?: return@composable
            val category = arguments.getString(Constants.ARGUMENT_KEY_CATEGORY) ?: return@composable
            val difficulty = arguments.getString(Constants.ARGUMENT_KEY_DIFFICULTY) ?: return@composable

            GameScreen(
                category = category,
                difficulty = difficulty,
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = Screen.GameOver.route) {
            GameOverScreen(navController = navController, viewModel = viewModel)
        }
    }
}
