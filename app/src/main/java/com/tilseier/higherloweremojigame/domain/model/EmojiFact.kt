package com.tilseier.higherloweremojigame.domain.model

data class EmojiFact(
    val title: String,
    val shortDescription: String,
    val description: String,
    val author: String? = null,
)
