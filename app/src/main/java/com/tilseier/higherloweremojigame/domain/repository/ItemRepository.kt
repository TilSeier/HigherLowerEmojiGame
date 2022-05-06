package com.tilseier.higherloweremojigame.domain.repository

import com.tilseier.higherloweremojigame.domain.model.EmojiItems

interface ItemRepository {
    suspend fun getEmojiItems(): EmojiItems
}
