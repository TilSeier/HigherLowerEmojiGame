package com.tilseier.higherloweremojigame.data.repository

import com.tilseier.higherloweremojigame.data.local.FactsLocalDataSource
import com.tilseier.higherloweremojigame.domain.model.EmojiFact
import com.tilseier.higherloweremojigame.domain.repository.FactsRepository

class FactsRepositoryImpl constructor(
    private val source: FactsLocalDataSource
) : FactsRepository {
    override suspend fun getEmojiFacts(): List<EmojiFact> {
        return source.emojiFacts
    }
}
