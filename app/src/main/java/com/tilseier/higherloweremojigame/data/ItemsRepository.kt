package com.tilseier.higherloweremojigame.data

import com.tilseier.higherloweremojigame.model.Item

class ItemsRepository(
    itemsLocalDataSource: ItemsLocalDataSource
) {
    val emojiItems: List<Item> = itemsLocalDataSource.emojiItems
}