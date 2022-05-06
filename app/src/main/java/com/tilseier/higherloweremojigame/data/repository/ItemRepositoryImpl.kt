package com.tilseier.higherloweremojigame.data.repository

import com.tilseier.higherloweremojigame.data.local.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.repository.ItemRepository

class ItemRepositoryImpl constructor(
    private val source: ItemsLocalDataSource
) : ItemRepository {

    override suspend fun getEmojiItems(): EmojiItems {
        return EmojiItems(
            easyItems = source.emojiItems,
            mediumItems = source.emojiItems,
            hardItems = source.emojiItems,
        )
    }
}
