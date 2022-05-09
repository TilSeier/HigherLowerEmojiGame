package com.tilseier.higherloweremojigame.domain.repository

import com.tilseier.higherloweremojigame.domain.model.EmojiFact

interface FactsRepository {
    suspend fun getEmojiFacts(): List<EmojiFact>
}
