package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.domain.model.EmojiFact
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetFactsUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlin.random.Random

class GameOverViewModel(
    private val getItemsUseCase: GetFactsUseCase,
) : ViewModel() {
    val emojiFacts: MutableState<List<EmojiFact>> = mutableStateOf(emptyList())
    val moveToFactIndex: MutableState<Int> = mutableStateOf(0)
    val currentFactIndex: MutableState<Int> = mutableStateOf(0)

    init {
        loadEmojiFacts()
        setCurrentFactIndex(randomFactIndex())
        moveToFactIndex.value = currentFactIndex.value
    }

    fun nextFact() {
        setCurrentFactIndex(currentFactIndex.value + 1)
        moveToFactIndex.value = currentFactIndex.value
    }

    fun previousFact() {
        setCurrentFactIndex(currentFactIndex.value - 1)
        moveToFactIndex.value = currentFactIndex.value
    }

    fun setCurrentFactIndex(index: Int) {
        if (index < 0) return
        if (index >= emojiFacts.value.size) return
        currentFactIndex.value = index
    }

    private fun randomFactIndex(): Int {
        return Random.nextInt(emojiFacts.value.size)
    }

    private fun loadEmojiFacts() {
        getItemsUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    emojiFacts.value = result.data ?: emptyList()
                }
                // this part of code is not used so far because we use only local data
                else -> {}
            }
        }.launchIn(viewModelScope)
    }
}
