package com.tilseier.higherloweremojigame.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithBottomBorder(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    borderColor: Color,
    backgroundColor: Color,
    contentPadding: PaddingValues = PaddingValues(horizontal = 28.dp, vertical = 24.dp),
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .background(borderColor)
            .padding(bottom = 4.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(backgroundColor)
            .clickable { onClick() }
            .padding(contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        content()
    }
}
