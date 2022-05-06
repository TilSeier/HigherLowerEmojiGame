package com.tilseier.higherloweremojigame.presentation.screen.menu

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.AppContentColor
import com.tilseier.higherloweremojigame.ui.theme.AppThemeColor
import com.tilseier.higherloweremojigame.ui.theme.Background

@Composable
fun HomeScreen(navController: NavHostController, viewModel: GameViewModel) {
    Scaffold(
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = Background,
        content = {
            MenuContent(
                navController = navController,
                viewModel = viewModel
            )
        }
    )

//    Text(
//        text = "HomeScreen",
//        modifier = Modifier.clickable {
//            viewModel.newGame()
//            navController.navigate(route = Screen.Game.passCategory(Constants.CATEGORY_EMOJI))
//        }
//    )

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

