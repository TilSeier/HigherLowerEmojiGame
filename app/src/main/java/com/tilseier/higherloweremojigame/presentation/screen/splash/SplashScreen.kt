package com.tilseier.higherloweremojigame.presentation.screen.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun SplashScreen(navController: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                SplashContent(navController = navController)
            }
        }
    )
}
