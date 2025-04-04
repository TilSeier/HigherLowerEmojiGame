package com.tilseier.higherloweremojigame.extantions

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

val Int.spNotScalable: TextUnit
    @Composable
    get() = (this.toFloat() / LocalDensity.current.fontScale).sp

val Double.spNotScalable: TextUnit
    @Composable
    get() = (this.toFloat() / LocalDensity.current.fontScale).sp

val Float.spNotScalable: TextUnit
    @Composable
    get() = (this / LocalDensity.current.fontScale).sp
