package com.tilseier.higherloweremojigame.domain.use_case.get_items

import coil.network.HttpException
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.domain.repository.ItemRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetItemsUseCase constructor(
    private val repository: ItemRepository
) {
    operator fun invoke(): Flow<Resource<List<Item>>> = flow {
        try {
            emit(Resource.Loading<List<Item>>())
            val coins = repository.getItems()
            emit(Resource.Success<List<Item>>(coins))
        } catch(e: HttpException) {
            emit(Resource.Error<List<Item>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<List<Item>>("Couldn't reach server. Check your internet connection."))
        }
    }
}
