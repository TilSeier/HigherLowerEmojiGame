package com.tilseier.higherloweremojigame.data

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.model.Item
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundPurple

class ItemsLocalDataSource {
    val emojiItems = listOf(
        Item(
            id = 1,
            name = "Face with Tears of Joy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tears-of-joy_1f602.png",
            sign = "\uD83D\uDE02", // 😂
            backgroundColor = ItemBackgroundPurple,
            number = 200
        ),
        Item(
            id = 2,
            name = "Red Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/red-heart_2764-fe0f.png",
            sign = "❤️️",
            backgroundColor = Color.LightGray,
            number = 300
        ),
        Item(
            id = 3,
            name = "Face Blowing a Kiss",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-blowing-a-kiss_1f618.png",
            sign = "\uD83D\uDE18", // 😘
            backgroundColor = Color.Green,
            number = 400
        ),
        Item(
            id = 4,
            name = "Smiling Face with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-heart-eyes_1f60d.png",
            sign = "\uD83D\uDE0D", // 😍
            backgroundColor = Color.Cyan,
            number = 500
        ),
        Item(
            id = 5,
            name = "Rolling on the Floor Laughing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rolling-on-the-floor-laughing_1f923.png",
            sign = "\uD83E\uDD23", // 🤣
            backgroundColor = Color.Blue,
            number = 600
        ),

        Item(
            id = 6,
            name = "Loudly Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/loudly-crying-face_1f62d.png",
            sign = "\uD83D\uDE2D", // 😭
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 7,
            name = "Thumbs Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thumbs-up_1f44d.png",
            sign = "\uD83D\uDC4D", // 👍
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 8,
            name = "Smiling Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-smiling-eyes_1f60a.png",
            sign = "\uD83D\uDE0A", // 😊
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 9,
            name = "Kissing Lips",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kiss-mark_1f48b.png",
            sign = "\uD83D\uDC8B", // 💋
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 10,
            name = "Grinning Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-smiling-eyes_1f604.png",
            sign = "\uD83D\uDE04", // 😄
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 11,
            name = "Folded Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/folded-hands_1f64f.png",
            sign = "\uD83D\uDE4F", // 🙏
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 12,
            name = "Grinning Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-sweat_1f605.png",
            sign = "\uD83D\uDE05", // 😅
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 13,
            name = "Smiling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face_263a-fe0f.png",
            sign = "☺️",
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 14,
            name = "Smiling Face with Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-hearts_1f970.png",
            sign = "\uD83E\uDD70", // 🥰
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 15,
            name = "See-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/see-no-evil-monkey_1f648.png",
            sign = "\uD83D\uDE48", // 🙈
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),

        Item(
            id = 16,
            name = "Winking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face_1f609.png",
            sign = "\uD83D\uDE09", // 😉
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 17,
            name = "Face with Rolling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-rolling-eyes_1f644.png",
            sign = "\uD83D\uDE44", // 🙄
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 18,
            name = "Pensive Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pensive-face_1f614.png",
            sign = "\uD83D\uDE14", // 😔
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 19,
            name = "Winking Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face-with-tongue_1f61c.png",
            sign = "\uD83D\uDE1C", // 😜
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 20,
            name = "Clapping Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clapping-hands_1f44f.png",
            sign = "\uD83D\uDC4F", // 👏
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 21,
            name = "Smirking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smirking-face_1f60f.png",
            sign = "\uD83D\uDE0F", // 😏
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 22,
            name = "Weary Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/weary-face_1f629.png",
            sign = "\uD83D\uDE29", // 😩
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 23,
            name = "Flushed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flushed-face_1f633.png",
            sign = "\uD83D\uDE33", // 😳
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 24,
            name = "Pleading Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pleading-face_1f97a.png",
            sign = "\uD83E\uDD7A", // 🥺
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 25,
            name = "Two Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/two-hearts_1f495.png",
            sign = "\uD83D\uDC95", // 💕
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 26,
            name = "Hugging Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hugging-face_1f917.png",
            sign = "\uD83E\uDD17", // 🤗
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 27,
            name = "OK Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ok-hand_1f44c.png",
            sign = "\uD83D\uDC4C", // 👌
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 28,
            name = "Blue Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/blue-heart_1f499.png",
            sign = "\uD83D\uDC99", // 💙
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 29,
            name = "Sparkling Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkling-heart_1f496.png",
            sign = "\uD83D\uDC96", // 💖
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 30,
            name = "Person Facepalming",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-facepalming_1f926.png",
            sign = "\uD83E\uDD26", // 🤦
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 31,
            name = "Thinking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thinking-face_1f914.png",
            sign = "\uD83E\uDD14", // 🤔
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 32,
            name = "Grinning Squinting Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-squinting-face_1f606.png",
            sign = "\uD83D\uDE06", // 😆
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
//        Item( // TODO remove
//            id = 33,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600
//        ),
        Item(
            id = 34,
            name = "Purple Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/purple-heart_1f49c.png",
            sign = "\uD83D\uDC9C", // 💜
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 35,
            name = "Face Savoring Food",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-savoring-food_1f60b.png",
            sign = "\uD83D\uDE0B", // 😋
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 36,
            name = "Unamused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/unamused-face_1f612.png",
            sign = "\uD83D\uDE12", // 😒
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),

        Item(
            id = 37,
            name = "Ring",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ring_1f48d.png",
            sign = "\uD83D\uDC8D", // 💍
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 38,
            name = "Face with Hand Over Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-hand-over-mouth_1f92d.png",
            sign = "\uD83E\uDD2D", // 🤭
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 39,
            name = "Relieved Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/relieved-face_1f60c.png",
            sign = "\uD83D\uDE0C", // 😌
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 40,
            name = "Grinning Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-smiling-eyes_1f604.png",
            sign = "\uD83D\uDE04", // 😄
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 41,
            name = "Party Popper",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/party-popper_1f389.png",
            sign = "\uD83C\uDF89", // 🎉
            backgroundColor = ItemBackgroundPurple,
            number = 600
        ),
        Item(
            id = 42,
            name = "Enraged Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pouting-face_1f621.png",
            sign = "\uD83D\uDE21", // 😡
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/pouting-face/"
        ),
        Item(
            id = 43,
            name = "Fire",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fire_1f525.png",
            sign = "\uD83D\uDD25", // 🔥
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/fire/"
        ),
        Item(
            id = 44,
            name = "Zany Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zany-face_1f92a.png",
            sign = "\uD83E\uDD2A", // 🤪
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/zany-face/"
        ),
        Item(
            id = 45,
            name = "Growing Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/growing-heart_1f497.png",
            sign = "\uD83D\uDC97", // 💗
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/growing-heart/"
        ),
        Item(
            id = 46,
            name = "Heart Suit",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-suit_2665-fe0f.png",
            sign = "♥️",
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/heart-suit/"
        ),
        Item(
            id = 47,
            name = "Face Screaming in Fear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-screaming-in-fear_1f631.png",
            sign = "\uD83D\uDE31", // 😱
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/face-screaming-in-fear/"
        ),
        Item(
            id = 48,
            name = "Person Shrugging",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-shrugging_1f937.png",
            sign = "\uD83E\uDD37", // 🤷
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/person-shrugging/"
        ),
        Item(
            id = 50,
            name = "Smiling Face with Sunglasses",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-sunglasses_1f60e.png",
            sign = "\uD83D\uDE0E", // 😎
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/smiling-face-with-sunglasses/"
        ),
        Item(
            id = 51,
            name = "Broken Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/broken-heart_1f494.png",
            sign = "\uD83D\uDC94", // 💔
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/broken-heart/"
        ),
        Item(
            id = 52,
            name = "Revolving Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/revolving-hearts_1f49e.png",
            sign = "\uD83D\uDC9E", // 💞
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/revolving-hearts/"
        ),
        Item(
            id = 53,
            name = "Flexed Biceps",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flexed-biceps_1f4aa.png",
            sign = "\uD83D\uDCAA", // 💪
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/flexed-biceps/"
        ),Item(
            id = 54,
            name = "Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crying-face_1f622.png",
            sign = "\uD83D\uDE22", // 😢
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/crying-face/"
        ),
        Item(
            id = 55,
            name = "Raising Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raising-hands_1f64c.png",
            sign = "\uD83D\uDE4C", // 🙌
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/raising-hands/"
        ),
        Item(
            id = 56,
            name = "Rose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rose_1f339.png",
            sign = "\uD83C\uDF39", // 🌹
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/rose/"
        ),
        Item(
            id = 57,
            name = "Heart with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-arrow_1f498.png",
            sign = "\uD83D\uDC98", // 💘
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/heart-with-arrow/"
        ),
        Item(
            id = 58,
            name = "Slightly Smiling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/slightly-smiling-face_1f642.png",
            sign = "\uD83D\uDE42", // 🙂
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/slightly-smiling-face/"
        ),
        Item(
            id = 59,
            name = "Kissing Face with Closed Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face-with-closed-eyes_1f61a.png",
            sign = "\uD83D\uDE1A", // 😚
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/kissing-face-with-closed-eyes/"
        ),
        Item(
            id = 60,
            name = "Yellow Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/yellow-heart_1f49b.png",
            sign = "\uD83D\uDC9B", // 💛
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/yellow-heart/"
        ),
        Item(
            id = 61,
            name = "Upside-Down Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/upside-down-face_1f643.png",
            sign = "\uD83D\uDE43", // 🙃
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/upside-down-face/"
        ),
        Item(
            id = 62,
            name = "Squinting Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/squinting-face-with-tongue_1f61d.png",
            sign = "\uD83D\uDE1D", // 😝
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/squinting-face-with-tongue/"
        ),
        Item(
            id = 63,
            name = "Smiling Face with Halo",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-halo_1f607.png",
            sign = "\uD83D\uDE07", // 😇
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/smiling-face-with-halo/"
        ),
//        Item( // TODO remove
//            id = 64,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
        Item(
            id = 65,
            name = "Grinning Face with Big Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-big-eyes_1f603.png",
            sign = "\uD83D\uDE03", // 😃
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/grinning-face-with-big-eyes/"
        ),
        Item(
            id = 66,
            name = "Drooling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/drooling-face_1f924.png",
            sign = "\uD83E\uDD24", // 🤤
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/drooling-face/"
        ),
        Item( // TODO don't use
            id = 67,
            name = "Middle Finger",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/middle-finger_1f595.png",
            sign = "\uD83D\uDD95", // 🖕
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/middle-finger/"
        ),
        Item(
            id = 68,
            name = "Black Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-heart_1f5a4.png",
            sign = "\uD83D\uDDA4", // 🖤
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/black-heart/"
        ),
        Item(
            id = 69,
            name = "Star-Struck",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/star-struck_1f929.png",
            sign = "\uD83E\uDD29", // 🤩
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/star-struck/"
        ),
        Item(
            id = 70,
            name = "Grimacing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grimacing-face_1f62c.png",
            sign = "\uD83D\uDE2C", // 😬
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/grimacing-face/"
        ),
        Item(
            id = 71,
            name = "Green Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/green-heart_1f49a.png",
            sign = "\uD83D\uDC9A", // 💚
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/green-heart/"
        ),
        Item(
            id = 72,
            name = "Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eyes_1f440.png",
            sign = "\uD83D\uDC40", // 👀
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/eyes/"
        ),
        Item(
            id = 73,
            name = "Sleeping Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sleeping-face_1f634.png",
            sign = "\uD83D\uDE34", // 😴
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/sleeping-face/"
        ),
        Item(
            id = 74,
            name = "Grinning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face_1f600.png",
            sign = "\uD83D\uDE00", // 😀
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/grinning-face/"
        ),
        Item(
            id = 75,
            name = "Heart Exclamation",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-exclamation_2763-fe0f.png",
            sign = "❣️",
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/heart-exclamation/"
        ),
        Item(
            id = 76,
            name = "Disappointed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/disappointed-face_1f61e.png",
            sign = "\uD83D\uDE1E", // 😞
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/disappointed-face/"
        ),

        Item(
            id = 77,
            name = "Birthday Cake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/birthday-cake_1f382.png",
            sign = "\uD83C\uDF82", // 🎂
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/birthday-cake/"
        ),
        Item(
            id = 78,
            name = "Partying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/partying-face_1f973.png",
            sign = "\uD83E\uDD73", // 🥳
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/partying-face/"
        ),
        Item(
            id = 79,
            name = "Frowning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/frowning-face_2639-fe0f.png",
            sign = "☹️",
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/frowning-face/"
        ),
        Item(
            id = 80,
            name = "Smiling Face with Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-horns_1f608.png",
            sign = "\uD83D\uDE08", // 😈
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/smiling-face-with-horns/"
        ),
        Item(
            id = 81,
            name = "Speak-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speak-no-evil-monkey_1f64a.png",
            sign = "\uD83D\uDE4A", // 🙊
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/speak-no-evil-monkey/"
        ),
        Item(
            id = 82,
            name = "Tired Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tired-face_1f62b.png",
            sign = "\uD83D\uDE2B", // 😫
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/tired-face/"
        ),
        Item(
            id = 83,
            name = "Victory Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/victory-hand_270c-fe0f.png",
            sign = "✌️",
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/victory-hand/"
        ),
        Item(
            id = 84,
            name = "Cat with Tears of Joy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-with-tears-of-joy_1f639.png",
            sign = "\uD83D\uDE39", // 😹
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/cat-with-tears-of-joy/"
        ),
        Item(
            id = 85,
            name = "Woman Dancing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman-dancing_1f483.png",
            sign = "\uD83D\uDC83", // 💃
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/woman-dancing/"
        ),
        Item(
            id = 86,
            name = "Expressionless Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/expressionless-face_1f611.png",
            sign = "\uD83D\uDE11", // 😑
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/expressionless-face/"
        ),
        Item(
            id = 87,
            name = "Sparkles",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkles_2728.png",
            sign = "✨",
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/sparkles/"
        ),
        Item(
            id = 88,
            name = "Confused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confused-face_1f615.png",
            sign = "\uD83D\uDE15", // 😕
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/confused-face/"
        ),
        Item(
            id = 89,
            name = "Beating Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/beating-heart_1f493.png",
            sign = "\uD83D\uDC93", // 💓
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/beating-heart/"
        ),
        Item(
            id = 90,
            name = "Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tongue_1f61b.png",
            sign = "\uD83D\uDE1B", // 😛
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/face-with-tongue/"
        ),
        Item(
            id = 91,
            name = "Hundred Points",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hundred-points_1f4af.png",
            sign = "\uD83D\uDCAF", // 💯
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/hundred-points/"
        ),
        Item(
            id = 92,
            name = "Crossed Fingers",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crossed-fingers_1f91e.png",
            sign = "\uD83E\uDD1E", // 🤞
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/crossed-fingers/"
        ),
        Item(
            id = 93,
            name = "Sweat Droplets",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sweat-droplets_1f4a6.png",
            sign = "\uD83D\uDCA6", // 💦
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/sweat-droplets/"
        ),
        Item(
            id = 94,
            name = "Smiling Cat with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-cat-with-heart-eyes_1f63b.png",
            sign = "\uD83D\uDE3B", // 😻
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/smiling-cat-with-heart-eyes/"
        ),
        Item(
            id = 95,
            name = "Skull",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/skull_1f480.png",
            sign = "\uD83D\uDC80", // 💀
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/skull/"
        ),
        Item(
            id = 96,
            name = "Nerd Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nerd-face_1f913.png",
            sign = "\uD83E\uDD13", // 🤓
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/nerd-face/"
        ),
        Item(
            id = 97,
            name = "Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tongue_1f445.png",
            sign = "\uD83D\uDC45", // 👅
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/tongue/"
        ),
        Item(
            id = 98,
            name = "Waving Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/waving-hand_1f44b.png",
            sign = "\uD83D\uDC4B", // 👋
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/waving-hand/"
        ),
        Item(
            id = 99,
            name = "Heart with Ribbon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-ribbon_1f49d.png",
            sign = "\uD83D\uDC9D", // 💝
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/heart-with-ribbon/"
        ),
        Item(
            id = 100,
            name = "Neutral Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/neutral-face_1f610.png",
            sign = "\uD83D\uDE10", // 😐
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/neutral-face/"
        ),
        Item(
            id = 101,
            name = "Oncoming Fist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/oncoming-fist_1f44a.png",
            sign = "\uD83D\uDC4A", // 👊
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/oncoming-fist/"
        ),
        Item(
            id = 102,
            name = "Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/balloon_1f388.png",
            sign = "\uD83C\uDF88", // 🎈
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/balloon/"
        ),
        Item(
            id = 103,
            name = "Face with Steam From Nose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-steam-from-nose_1f624.png",
            sign = "\uD83D\uDE24", // 😤
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/face-with-steam-from-nose/"
        ),
        Item(
            id = 104,
            name = "Cherry Blossom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cherry-blossom_1f338.png",
            sign = "\uD83C\uDF38", // 🌸
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/cherry-blossom/"
        ),
        Item(
            id = 105,
            name = "Wrapped Gift",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wrapped-gift_1f381.png",
            sign = "\uD83C\uDF81", // 🎁
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/wrapped-gift/"
        ),
        Item(
            id = 106,
            name = "Pile of Poop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pile-of-poo_1f4a9.png",
            sign = "\uD83D\uDCA9", // 💩
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/pile-of-poo/"
        ),
        Item(
            id = 107,
            name = "Confetti Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confetti-ball_1f38a.png",
            sign = "\uD83C\uDF8A", // 🎊
            backgroundColor = ItemBackgroundPurple,
            number = 600,
            url = "https://emojipedia.org/confetti-ball/"
        ),

//        Item(
//            id = 108,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 109,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 110,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 111,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 112,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 113,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),
//        Item(
//            id = 114,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600,
//            url = "url"
//        ),

    )
}
