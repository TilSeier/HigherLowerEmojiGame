package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.data.local.FactsLocalDataSource
import com.tilseier.higherloweremojigame.data.repository.FactsRepositoryImpl
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetFactsUseCase
import com.tilseier.higherloweremojigame.extantions.viewModelFactory
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.AppContentColor
import com.tilseier.higherloweremojigame.ui.theme.AppThemeColor

@Composable
fun GameOverScreen(navController: NavHostController, viewModel: GameViewModel) {
    val gameOverViewModel: GameOverViewModel = viewModel(factory = viewModelFactory {
        GameOverViewModel(GetFactsUseCase(FactsRepositoryImpl(FactsLocalDataSource())))
    })
    Scaffold(
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {
            GameOverContent(
                navController = navController,
                viewModel = viewModel,
                gameOverViewModel = gameOverViewModel
            )
        }
    )
}
