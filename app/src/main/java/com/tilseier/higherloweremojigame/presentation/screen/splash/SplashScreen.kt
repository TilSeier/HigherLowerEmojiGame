package com.tilseier.higherloweremojigame.presentation.screen.splash

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SplashScreen(navController: NavHostController) {
    Scaffold(
        content = {
            SplashContent(navController = navController)
        }
    )
}
