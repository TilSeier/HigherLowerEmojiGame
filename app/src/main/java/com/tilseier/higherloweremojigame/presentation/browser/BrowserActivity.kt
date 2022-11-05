package com.tilseier.higherloweremojigame.presentation.browser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme

class BrowserActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HigherLowerEmojiGameTheme {
                // TODO implement
            }
        }
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
