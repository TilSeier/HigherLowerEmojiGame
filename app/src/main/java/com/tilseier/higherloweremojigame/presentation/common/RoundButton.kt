package com.tilseier.higherloweremojigame.presentation.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RoundButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    elevation: ButtonElevation? = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 2.dp),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        colors = colors,
        elevation = elevation,
        contentPadding = contentPadding
    ) {
        content()
    }
}
