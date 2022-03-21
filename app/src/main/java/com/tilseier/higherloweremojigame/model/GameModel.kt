package com.tilseier.higherloweremojigame.model

// TODO remove this model if it doesn't wor properly
data class GameModel(
    val allItems: List<Item>,
    val currentItems: List<Item> = listOf(),
    val currentItemIndex: Int = 0,
    val score: Int = 0,
    val higherScore: Int = 0,
    val isGameOver: Boolean = false,

//    val categories: Set<LifeGroupsCategory>? = null,
//    val selectedCampusIndex: Int = 0,
//    val kidsWelcome: Boolean? = null,
//    val age: Int? = null,
//    val selectedCountryCode: String? = null,
//    val showCountries: Boolean = false,
//    val campusMap: Map<String, String> = mapOf("" to ""),
//    val countryMap: Map<String, String> = mapOf("" to ""),
) {

    // TODO generate items properly
    fun generateItems(): List<Item> {
        return allItems // allItems.shuffled()
    }

    val compareItem: Item
        get() = currentItems[currentItemIndex]

    val guessItem: Item
        get() = currentItems[currentItemIndex + 1]

//    val searchUri: Uri
//        get() = Uri.parse(
//            "https://www.life.church/lifegroups/search?$urlParameters"
//        )
//
//    private val urlParameters: String
//        get() = (queryParameters + categoryParameters).joinToString("&")
//
//    private val queryParameters: List<String>
//        get() = mapOf(
//            "age" to age,
//            "campus" to slug,
//            "kidsWelcome" to kidsWelcome,
//            "group_location" to selectedCountryCode
//        )
//            .filterValues { it != null }
//            .map { "${it.key}=${it.value}" }
//
//    private val categoryParameters: String?
//        get() = categories?.mapIndexed { index, category ->
//            "categories[${index}]=${category.slug}"
//        }?.joinToString("&")
//
//    private val slug: String?
//        get() {
//            val campusNames = campusMap.keys.toList()
//            val selectedCampusName = campusNames[selectedCampusIndex]
//            return campusMap[selectedCampusName]
//        }
}
