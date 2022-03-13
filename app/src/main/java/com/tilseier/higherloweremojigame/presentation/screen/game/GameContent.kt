package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme

@Composable
fun GameContent() { // movie: Movie
    Text(text = "GameContent")


    // Display 10 items
//    VerticalPager(count = 10) { page ->
//        // Our page content
//        Text(
//            text = "Page: $page",
//            modifier = Modifier.fillMaxWidth()
//        )
//    }

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
