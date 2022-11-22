package com.tilseier.higherloweremojigame.domain.model

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.common.UiText

// TODO remove useless code
data class Item(
    val id: Long,
    val emojiId: String? = null,
    val backgroundColor: Color? = null,
    val emoji: Emoji? = null,
    val invention: Invention? = null,
) {
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
        val nameOfInvention: UiText,
        val subtextOfInvention: UiText? = null,
        val yearOfInvention: Int,
        val yearOfInventionEnd: Int? = null,
        val urlWithMoreInformation: String? = null,
        val urlWithMoreInformationUiText: UiText? = null,
        val emoji: String? = null, // temporary
        val imageUrl: String? = null, // temporary
    )
}
