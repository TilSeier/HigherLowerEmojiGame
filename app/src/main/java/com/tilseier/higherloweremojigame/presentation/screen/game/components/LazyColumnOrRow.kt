package com.tilseier.higherloweremojigame.presentation.screen.game.components

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun LazyColumnOrRow(
    useLazyColumn: Boolean,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    flingBehavior: FlingBehavior = ScrollableDefaults.flingBehavior(),
    content: LazyListScope.() -> Unit
) {
    if (useLazyColumn) {
        LazyColumn(
            modifier = modifier,
            state = state,
            flingBehavior = flingBehavior,
            content = content
        )
    } else {
        LazyRow(
            modifier = modifier,
            state = state,
            flingBehavior = flingBehavior,
            content = content
        )
    }
}
