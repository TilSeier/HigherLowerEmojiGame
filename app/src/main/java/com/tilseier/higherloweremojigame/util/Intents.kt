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

    // TODO open browser
    fun toBrowser(
        context: Context?,
        url: String
    ): Intent {
        val intent = Intent(context, BrowserActivity::class.java)
        intent.putExtra(BrowserActivity.MORE_INFO_URL, url)
        return intent
    }
}