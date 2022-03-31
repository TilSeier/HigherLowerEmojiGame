package com.tilseier.higherloweremojigame.domain.repository

import com.tilseier.higherloweremojigame.domain.model.Item

interface ItemRepository {
    suspend fun getItems(): List<Item>
}
