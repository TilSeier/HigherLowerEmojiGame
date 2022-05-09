package com.tilseier.higherloweremojigame.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.tilseier.higherloweremojigame.data.local.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.data.repository.ItemRepositoryImpl
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.extantions.viewModelFactory
import com.tilseier.higherloweremojigame.presentation.navigation.NavGraph
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.StatusBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HigherLowerEmojiGameTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(
                    color = StatusBar
                )
                // TODO mb splash screen here
                val navController = rememberNavController()
                val viewModel: GameViewModel = viewModel(factory = viewModelFactory {
                    GameViewModel(GetItemsUseCase(ItemRepositoryImpl(ItemsLocalDataSource())))
                })
                NavGraph(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}
