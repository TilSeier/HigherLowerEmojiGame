package com.tilseier.higherloweremojigame.extantions

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val Int.dpScalable: Dp
    @Composable
    get() = this.dp * LocalDensity.current.fontScale

val Double.dpScalable: Dp
    @Composable
    get() = this.dp * LocalDensity.current.fontScale

val Float.dpScalable: Dp
    @Composable
    get() = this.dp * LocalDensity.current.fontScale
