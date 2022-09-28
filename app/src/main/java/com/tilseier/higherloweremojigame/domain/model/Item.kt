package com.tilseier.higherloweremojigame.domain.model

import androidx.compose.ui.graphics.Color

data class Item(
    val id: Long,
    val emojiId: String? = null,
    val name: String,
    val imageUrl: String,
    val sign: String? = null,
    val backgroundColor: Color? = null,
    val number: Long,
    val url: String? = null // TODO use this url to open info for emoji
)
