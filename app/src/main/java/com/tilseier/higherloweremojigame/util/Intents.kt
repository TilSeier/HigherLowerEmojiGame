package com.tilseier.higherloweremojigame.util

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.tilseier.higherloweremojigame.presentation.screen.browser.BrowserActivity

object Intents {
    fun openRatePage(context: Context) {
        try {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=com.tilseier.higherloweremojigame")
                )
            )
        } catch (e: ActivityNotFoundException) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.tilseier.higherloweremojigame")
                )
            )
        }
    }

    fun toBrowser(
        context: Context?,
        url: String,
        itemName: String?,
        itemEmoji: String?,
        itemColorArgb: Int?,
    ): Intent {
        val intent = Intent(context, BrowserActivity::class.java)
        intent.putExtra(BrowserActivity.MORE_INFO_URL, url)
        intent.putExtra(BrowserActivity.ITEM_NAME, itemName)
        intent.putExtra(BrowserActivity.ITEM_EMOJI, itemEmoji)
        intent.putExtra(BrowserActivity.ITEM_COLOR, itemColorArgb)
        return intent
    }
}