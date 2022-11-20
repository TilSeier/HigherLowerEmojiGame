package com.tilseier.higherloweremojigame.presentation.screen.browser

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
                BrowserContent()
            }
        }
    }

    companion object {
        const val TAG = "MainActivity"
        const val MORE_INFO_URL = "more_info_url"
        const val OBJECT_NAME = "object_name"
        const val OBJECT_EMOJI = "object_emoji"
    }
}
