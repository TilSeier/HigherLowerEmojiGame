package com.tilseier.higherloweremojigame.domain.use_case.get_items

import coil.network.HttpException
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.repository.ItemRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetItemsUseCase constructor(
    private val repository: ItemRepository
) {
    operator fun invoke(): Flow<Resource<EmojiItems>> = flow {
        try {
            emit(Resource.Loading<EmojiItems>())
            val items = repository.getEmojiItems()
            emit(Resource.Success<EmojiItems>(items))
        } catch(e: HttpException) {
            emit(Resource.Error<EmojiItems>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<EmojiItems>("Couldn't reach server. Check your internet connection."))
        }
    }
}
