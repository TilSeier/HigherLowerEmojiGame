package com.tilseier.higherloweremojigame.data.repository

import com.tilseier.higherloweremojigame.data.local.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.domain.repository.ItemRepository

class ItemRepositoryImpl constructor(
    private val source: ItemsLocalDataSource
) : ItemRepository {

    override suspend fun getItems(): List<Item> {
        return source.emojiItems
    }
}
