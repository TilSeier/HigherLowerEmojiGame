package com.tilseier.higherloweremojigame.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tilseier.higherloweremojigame.presentation.screen.game.GameScreen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.presentation.screen.gameover.GameOverScreen
import com.tilseier.higherloweremojigame.presentation.screen.menu.HomeScreen
import com.tilseier.higherloweremojigame.util.Constant

@Composable
fun NavGraph(navController: NavHostController, viewModel: GameViewModel = viewModel()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Menu.route
    ) {
        composable(route = Screen.Menu.route) {
            HomeScreen(navController = navController, viewModel)
        }
        composable(
            route = Screen.Game.route,
            arguments = listOf(navArgument(Constant.ARGUMENT_KEY_CATEGORY) {
                type = NavType.StringType
                defaultValue = Constant.CATEGORY_EMOJI
            })
        ) { backStackEntry ->
            backStackEntry.arguments?.getString(Constant.ARGUMENT_KEY_CATEGORY)
                ?.let { GameScreen(it, navController, viewModel) }
        }
        composable(
            route = Screen.GameOver.route,
            arguments = listOf(navArgument(Constant.ARGUMENT_KEY_SCORE) {
                type = NavType.IntType
                defaultValue = 0
            })
        ) { backStackEntry ->
            backStackEntry.arguments?.getInt(Constant.ARGUMENT_KEY_SCORE)
                ?.let { GameOverScreen(it, navController, viewModel) }
        }
    }
}
