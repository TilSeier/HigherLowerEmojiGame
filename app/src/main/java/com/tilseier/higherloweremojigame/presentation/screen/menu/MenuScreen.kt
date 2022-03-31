package com.tilseier.higherloweremojigame.presentation.screen.menu

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.common.Constants

@Composable
fun HomeScreen(navController: NavHostController, viewModel: GameViewModel) {

    Text(
        text = "HomeScreen",
        modifier = Modifier.clickable {
            viewModel.newGame()
            navController.navigate(route = Screen.Game.passCategory(Constants.CATEGORY_EMOJI))
        }
    )

//    val systemUiController = rememberSystemUiController()
//    val systemBarColor = MaterialTheme.colors.AppThemeColor
//    val allMovies = viewModel.getAllPopularMovies.collectAsLazyPagingItems()
//
//    SideEffect {
//        systemUiController.setStatusBarColor(
//            color = systemBarColor
//        )
//    }
//
//    Scaffold(
//        backgroundColor = MaterialTheme.colors.AppThemeColor,
//        contentColor = MaterialTheme.colors.AppContentColor,
//        topBar = {
//            HomeTopBar()
//        },
//        content = {
//            MovieListContent(allMovies = allMovies, navController = navController)
//        }
//    )
}

