package com.tilseier.higherloweremojigame.util

import android.content.Context
import android.content.Intent
import com.tilseier.higherloweremojigame.R

object ShareUtil {
    fun shareGame(context: Context) {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        val shareSubject = "The Higher Lower Emoji Game"
        val shareBody: String = context.getString(R.string.share_game_message)
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
        context.startActivity(Intent.createChooser(sharingIntent, "Share via"))
    }

    fun shareScore(context: Context, score: Int) {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        val shareSubject = "The Higher Lower Emoji Game"
        val shareBody: String = context.getString(R.string.share_score_message, score)
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
        context.startActivity(Intent.createChooser(sharingIntent, "Share via"))
    }
}
