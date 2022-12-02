package com.tilseier.higherloweremojigame.common

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

// More information: https://www.youtube.com/watch?v=mB1Lej0aDus
sealed class UiText {
    data class DynamicString(val value: String): UiText()
    class StringResource(
        @StringRes val resId: Int,
        vararg val args: Any
    ): UiText()

    @Composable
    fun asString(): String {
        return when(this) {
            is DynamicString -> value
            is StringResource -> {
                if (args.isEmpty()) {
                    stringResource(resId)
                } else {
                    stringResource(resId, *args)
                }
            }
        }
    }

    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> value
            is StringResource -> {
                if (args.isEmpty()) {
                    context.getString(resId)
                } else {
                    context.getString(resId, *args)
                }
            }
        }
    }
}
