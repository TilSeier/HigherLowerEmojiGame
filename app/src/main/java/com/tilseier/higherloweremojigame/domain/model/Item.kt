package com.tilseier.higherloweremojigame.domain.model

import androidx.compose.ui.graphics.Color

data class Item(
    val id: Long,
    val name: String,
    val imageUrl: String, // TODO maybe list of images
    val sign: String? = null,
    val backgroundColor: Color,
    val number: Long,
    val url: String? = null // TODO use this url to open info for emoji
)
