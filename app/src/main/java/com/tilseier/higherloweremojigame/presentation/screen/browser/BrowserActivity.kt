package com.tilseier.higherloweremojigame.presentation.screen.browser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundDarkPurple

class BrowserActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val moreInfoUrl = intent.extras?.getString(MORE_INFO_URL)
        val itemName = intent.extras?.getString(ITEM_NAME)
        val itemEmoji = intent.extras?.getString(ITEM_EMOJI)
        val itemColorAgb = intent.extras?.getInt(ITEM_COLOR)

        val itemColor = if (itemColorAgb == 0 || itemColorAgb == null) {
            ItemBackgroundDarkPurple
        } else {
            Color(
                itemColorAgb.red,
                itemColorAgb.green,
                itemColorAgb.blue,
                itemColorAgb.alpha
            )
        }

        setContent {
            HigherLowerEmojiGameTheme {
                BrowserContent(
                    initialUrl = moreInfoUrl ?: "",
                    itemName = itemName ?: "",
                    itemEmoji = itemEmoji ?: "",
                    itemColor = itemColor,
                    onBackClick = { finish() }
                )
            }
        }
    }

    companion object {
        const val TAG = "MainActivity"
        const val MORE_INFO_URL = "more_info_url"
        const val ITEM_NAME = "item_name"
        const val ITEM_EMOJI = "item_emoji"
        const val ITEM_COLOR = "item_color"
    }
}
