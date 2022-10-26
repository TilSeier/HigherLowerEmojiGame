package com.tilseier.higherloweremojigame.domain.model

import androidx.compose.ui.graphics.Color

// TODO remove useless code
data class Item(
    val id: Long,
    val emojiId: String? = null,
//    val name: String,
//    val imageUrl: String,
//    val sign: String? = null,
    val backgroundColor: Color? = null,
//    val number: Long,
//    val url: String? = null, // TODO use this url to open info for emoji
    val category: Category = Category.Default,
    val emoji: Emoji? = null,
    val invention: Invention? = null,
) {
    sealed class Category {
        object Default: Category()
        object OnlyInvented: Category()
        object OnlyEmoji: Category()
    }

    data class Emoji(
        val emojiId: String? = null,
        val name: String,
        val imageUrl: String,
        val sign: String? = null,
        val backgroundColor: Color? = null,
        val number: Long,
        val url: String? = null, // TODO use this url to open info for emoji
    )

    data class Invention(
        val nameOfInvention: String,
        val yearOfInvention: Int,
        val yearOfInventionEnd: Int? = null,
        val urlWithMoreInformation: String,
        val emoji: String? = null, // temporary
        val imageUrl: String? = null, // temporary
    )
}
