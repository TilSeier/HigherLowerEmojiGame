package com.tilseier.higherloweremojigame.presentation.screen.splash

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.SplashScreenBackground
import kotlinx.coroutines.delay

@Composable
fun SplashContent(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(2000)
        navController.popBackStack()
        navController.navigate(Screen.Menu.route)
    }
    val infiniteTransition = rememberInfiniteTransition()
    val movingDotsCount by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 3f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1200,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        )
    )
    val dots: String = when {
        movingDotsCount <= 1f -> ".  "
        movingDotsCount <= 2f -> ".. "
        else -> "..."
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SplashScreenBackground)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.splash_smile_emoji),
                contentDescription = "Splash Image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 80.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(id = R.string.text_loading) + dots,
                modifier = Modifier.defaultMinSize(minWidth = 82.dp),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameOverContentPreview() {
    HigherLowerEmojiGameTheme {
        SplashContent(navController = rememberNavController())
    }
}
