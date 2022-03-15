package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
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

    val faceWithTearsOfJoy = Item(
        id = 1,
        name = "Face with Tears of Joy",
        imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tears-of-joy_1f602.png",
        sign = "\uD83D\uDE02", // 😂
        backgroundColor = Color.White,
        number = 200
    )
    val redHeart = Item(
        id = 2,
        name = "Red Heart",
        imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/red-heart_2764-fe0f.png",
        sign = "❤️️",
        backgroundColor = Color.LightGray,
        number = 300
    )
    val faceBlowingKiss = Item(
        id = 3,
        name = "Face Blowing a Kiss",
        imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-blowing-a-kiss_1f618.png",
        sign = "\uD83D\uDE18", // 😘
        backgroundColor = Color.Green,
        number = 400
    )
    val smilingFaceWithHeartEyes = Item(
        id = 4,
        name = "Smiling Face with Heart-Eyes",
        imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-heart-eyes_1f60d.png",
        sign = "\uD83D\uDE0D", // 😍
        backgroundColor = Color.Cyan,
        number = 500
    )
    val rollingOnTheFloorLaughingFace = Item(
        id = 5,
        name = "Rolling on the Floor Laughing Face",
        imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rolling-on-the-floor-laughing_1f923.png",
        sign = "\uD83E\uDD23", // 🤣
        backgroundColor = Color.Blue,
        number = 600
    )

//    var currentItems by remember {
//        mutableStateOf(
//            listOf(
//                faceWithTearsOfJoy,
//                redHeart,
//                faceBlowingKiss
//            )
//        )
//    }
    val currentItems = remember {
        mutableStateListOf(
            faceWithTearsOfJoy,
            redHeart,
            faceBlowingKiss
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
                currentItems.add(smilingFaceWithHeartEyes)
                lazyListState.animateScrollToItem(1)
//                lazyListState.scrollToItem(0)
//                currentItems.remove(faceWithTearsOfJoy)
//                currentItems.add(smilingFaceWithHeartEyes)
//                currentItems = listOf(
//                    redHeart,
//                    faceBlowingKiss,
//                    smilingFaceWithHeartEyes
//                )

                delay(2000)
                currentItems.add(rollingOnTheFloorLaughingFace)
                lazyListState.animateScrollToItem(2)
//                lazyListState.scrollToItem(0)
//                currentItems.remove(redHeart)
//                currentItems.add(rollingOnTheFloorLaughingFace)

//                currentItems = listOf(
//                    faceBlowingKiss,
//                    smilingFaceWithHeartEyes,
//                    rollingOnTheFloorLaughingFace,
//                )
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
            itemsIndexed(currentItems) { index, item ->
                // TODO first item always opened
                if (item.sign == null) {
                    ItemWithEmojiImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillParentMaxHeight(fraction = 0.5f)
                            .background(color = item.backgroundColor),
                        item = item
                    )
                } else {
                    ItemWithEmojiSign(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillParentMaxHeight(fraction = 0.5f)
                            .background(color = item.backgroundColor),
                        item = item
                    )
                }
            }
        }
    }
}

@Composable
private fun ItemWithEmojiImage(
    modifier: Modifier = Modifier,
    item: Item
) {
    Box(modifier = modifier) {
        val emojiImage = rememberImagePainter(item.imageUrl)
        Image(
            painter = emojiImage,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        )
    }
}

@Composable
private fun ItemWithEmojiSign(
    modifier: Modifier = Modifier,
    item: Item
) {
    Box(modifier = modifier) {
        item.sign?.let { sign ->
            Text(
                text = sign,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                fontSize = 120.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameContentPreview() {
    HigherLowerEmojiGameTheme {
        GameContent()
    }
}
