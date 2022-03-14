package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.tilseier.higherloweremojigame.model.Item
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun GameContent() {

    var currentItems by remember {
        mutableStateOf(
            listOf(
                Item(
                    name = "Emoji 1",
                    imageUrl = "",
                    number = 200
                ),
                Item(
                    name = "Emoji 2",
                    imageUrl = "",
                    number = 300
                ),
                Item(
                    name = "Emoji 3",
                    imageUrl = "",
                    number = 400
                )
            )
        )
    }

    Column {

        val lazyListState: LazyListState = rememberLazyListState()
        val coroutineScope = rememberCoroutineScope()

        // TODO move logic to ViewModel
        // TODO design of game screen
        // TODO disable user scroll interaction
        SideEffect {
            coroutineScope.launch {
                delay(2000)
                lazyListState.animateScrollToItem(1)
                lazyListState.scrollToItem(0)
                currentItems = listOf(
                    Item(
                        name = "Emoji 2",
                        imageUrl = "",
                        number = 300
                    ),
                    Item(
                        name = "Emoji 3",
                        imageUrl = "",
                        number = 400
                    ),
                    Item(
                        name = "Emoji 4",
                        imageUrl = "",
                        number = 500
                    )
                )

                delay(2000)
                lazyListState.animateScrollToItem(1)
                lazyListState.scrollToItem(0)
                currentItems = listOf(
                    Item(
                        name = "Emoji 3",
                        imageUrl = "",
                        number = 400
                    ),
                    Item(
                        name = "Emoji 4",
                        imageUrl = "",
                        number = 500
                    ),
                    Item(
                        name = "Emoji 5",
                        imageUrl = "",
                        number = 600
                    ),
                )
                // TODO on animation scroll end
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = lazyListState,
            flingBehavior = rememberSnapperFlingBehavior(
                lazyListState = lazyListState,
                snapOffsetForItem = SnapOffsets.Start
            ),
        ) {
            items(currentItems) { item ->
                Text(
                    text = "Page: ${item.name} = ${item.number}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillParentMaxHeight(fraction = 0.5f)
                        .background(color = Color.Blue)
                )
            }
        }
    }


    // TODO remove
//    val scrollState = rememberScrollState()
//    Card(
//        elevation = 0.dp,
//        backgroundColor = MaterialTheme.colors.AppThemeColor
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .verticalScroll(scrollState)
//        ) {
//            Image(
//                painter = rememberImagePainter(
//                    data = BuildConfig.POSTER_URL + movie.posterPath, builder = {
//                        crossfade(true)
//                        scale(Scale.FIT)
//                    }),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(350.dp),
//                contentScale = ContentScale.FillWidth
//            )
//            Column(modifier = Modifier.padding(8.dp)) {
//                Spacer(modifier = Modifier.height(16.dp))
//                movie.title?.let {
//                    Text(
//                        text = it,
//                        style = MaterialTheme.typography.h5,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                movie.releaseDate?.let {
//                    ReleaseDateComponent(releaseDate = it)
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                movie.rating?.let { RatingComponent(rating = it) }
//                Spacer(modifier = Modifier.height(16.dp))
//                movie.overview?.let {
//                    Text(
//                        text = it,
//                        style = MaterialTheme.typography.body2
//                    )
//                }
//            }
//        }
//    }
}

@Preview(showBackground = true)
@Composable
private fun GameContentPreview() {
    HigherLowerEmojiGameTheme {
        GameContent()
    }
}
