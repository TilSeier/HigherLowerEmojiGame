package com.tilseier.higherloweremojigame.domain.use_case.get_items

import coil.network.HttpException
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.domain.model.EmojiFact
import com.tilseier.higherloweremojigame.domain.repository.FactsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetFactsUseCase constructor(
    private val repository: FactsRepository
) {
    operator fun invoke(): Flow<Resource<List<EmojiFact>>> = flow {
        try {
            emit(Resource.Loading<List<EmojiFact>>())
            val items = repository.getEmojiFacts()
            emit(Resource.Success<List<EmojiFact>>(items))
        } catch(e: HttpException) {
            emit(Resource.Error<List<EmojiFact>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<List<EmojiFact>>("Couldn't reach server. Check your internet connection."))
        }
    }
}
