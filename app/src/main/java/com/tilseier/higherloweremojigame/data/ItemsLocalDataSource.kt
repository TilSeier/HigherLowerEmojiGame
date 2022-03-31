package com.tilseier.higherloweremojigame.data

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.extantions.*
import com.tilseier.higherloweremojigame.model.Item
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundPurple

/**
 * Statistic from:
 * 1. http://www.emojitracker.com/ (Statistic tracked from 04.07.2013 for Emojis used in Tweeter)
 *
 * 2. http://www.emojistats.org/
 *
 * Calculate Days Between Two Dates:
 * https://www.timeanddate.com/date/durationresult.html?d1=4&m1=7&y1=2013&d2=23&m2=3&y2=2022
 * 04.07.2013 - 23.03.2022 (current date)
 *
 * 275,097,600 seconds
 * 4,584,960 minutes
 * 76,416 hours
 * 3184 days
 * 454 weeks and 6 days
 *
 * To calculate "number":
 * - get statistic for emoji from http://www.emojitracker.com/ and calculate month average
 * - add month average for emoji from http://www.emojistats.org/
 *
 */

class ItemsLocalDataSource {
    private val socialMultiplier = 1 // Tweeter // 3 // Tweeter + Facebook + Instagram
    private val daysFromStartOfStatistic = 3184 // 04.07.2013 - 23.03.2022 (current date)
    private val countOfAverageMonths = 30

    private fun calculateMonthAverage(number: Long): Long {
        val result = ((number / daysFromStartOfStatistic) * countOfAverageMonths) * socialMultiplier
        return when {
            result < 100L -> result.roundTo10()
            result < 1000L -> result.roundTo100()
            result < 10000L -> result.roundTo1000()
            result < 100000L -> result.roundTo10000()
            else -> result.roundTo100000()
        }
    }

    // TODO update IDs
    val emojiItems = listOf(
        Item(
            id = 1,
            name = "Face with Tears of Joy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tears-of-joy_1f602.png",
            sign = "\uD83D\uDE02", // 😂
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(3_545_593_820), // (calculateMonthAverage(3_545_593_820) / daysFromStartOfStatistic) * countOfAverageMonths // + 198_953
            url = "https://emojipedia.org/face-with-tears-of-joy/"
        ),
        Item(
            id = 2,
            name = "Red Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/red-heart_2764-fe0f.png",
            sign = "❤️️",
            backgroundColor = Color.LightGray,
            number = calculateMonthAverage(1_844_458_767), // (1_844_458_767 / daysFromStartOfStatistic).toLong() * countOfAverageMonths  // + 106_929
            url = "https://emojipedia.org/red-heart/"
        ),
        Item(
            id = 6,
            name = "Loudly Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/loudly-crying-face_1f62d.png",
            sign = "\uD83D\uDE2D", // 😭
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(1505548763), // (1505548763 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/loudly-crying-face/"
        ),
        Item(
            id = 4,
            name = "Smiling Face with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-heart-eyes_1f60d.png",
            sign = "\uD83D\uDE0D", // 😍
            backgroundColor = Color.Cyan,
            number = calculateMonthAverage(1_255_670_981), // (1_255_670_981 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/smiling-face-with-heart-eyes/"
        ),
        Item(
            id = 8,
            name = "Smiling Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-smiling-eyes_1f60a.png",
            sign = "\uD83D\uDE0A", // 😊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(786282275), // (786282275 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/smiling-face-with-smiling-eyes/"
        ),
        Item(
            id = 25,
            name = "Two Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/two-hearts_1f495.png",
            sign = "\uD83D\uDC95", // 💕
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(589737470), // (589737470 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/two-hearts/"
        ),
        Item(
            id = 18,
            name = "Pensive Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pensive-face_1f614.png",
            sign = "\uD83D\uDE14", // 😔
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(579119198), // (579119198 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/pensive-face/"
        ),
        Item(
            id = 3,
            name = "Face Blowing a Kiss",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-blowing-a-kiss_1f618.png",
            sign = "\uD83D\uDE18", // 😘
            backgroundColor = Color.Green,
            number = calculateMonthAverage(577_598_241), // (577_598_241 / daysFromStartOfStatistic).toLong() * countOfAverageMonths // + 71_097
            url = "https://emojipedia.org/face-blowing-a-kiss/"
        ),
        Item(
            id = 36,
            name = "Unamused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/unamused-face_1f612.png",
            sign = "\uD83D\uDE12", // 😒
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(556209329), // (556209329 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/unamused-face/"
        ),
        Item(
            id = 22,
            name = "Weary Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/weary-face_1f629.png",
            sign = "\uD83D\uDE29", // 😩
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(533651663), // (533651663 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/weary-face/"
        ),
        Item(
            id = 10,
            name = "Grinning Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-smiling-eyes_1f604.png",
            sign = "\uD83D\uDE04", // 😄
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(505821846) // (505821846 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
        ),
        Item(
            id = 13,
            name = "Smiling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face_263a-fe0f.png",
            sign = "☺️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(468651986), // (468651986 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/smiling-face/"
        ),
        Item(
            id = 11,
            name = "Folded Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/folded-hands_1f64f.png",
            sign = "\uD83D\uDE4F", // 🙏
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(426585238), // (426585238 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/folded-hands/"
        ),
        Item(
            id = 7,
            name = "Thumbs Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thumbs-up_1f44d.png",
            sign = "\uD83D\uDC4D", // 👍
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(417936966), // (417936966 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/thumbs-up/"
        ),
        Item(
            id = 16,
            name = "Winking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face_1f609.png",
            sign = "\uD83D\uDE09", // 😉
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(415836764), // (415836764 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/winking-face/"
        ),
        Item(
            id = 27,
            name = "OK Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ok-hand_1f44c.png",
            sign = "\uD83D\uDC4C", // 👌
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(415325254), // (415325254 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/ok-hand/"
        ),
        Item(
            id = 12,
            name = "Grinning Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-sweat_1f605.png",
            sign = "\uD83D\uDE05", // 😅
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(407908695), // (407908695 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/grinning-face-with-sweat/"
        ),
        Item(
            id = 21,
            name = "Smirking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smirking-face_1f60f.png",
            sign = "\uD83D\uDE0F", // 😏
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(403719200), // (403719200 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/smirking-face/"
        ),
        Item(
            id = 72,
            name = "Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eyes_1f440.png",
            sign = "\uD83D\uDC40", // 👀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(400174906), // (400174906 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/eyes/"
        ),
        Item(
            id = 43,
            name = "Fire",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fire_1f525.png",
            sign = "\uD83D\uDD25", // 🔥
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(391170463), // (391170463 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/fire/"
        ),
        Item(
            id = 87,
            name = "Sparkles",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkles_2728.png",
            sign = "✨",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(342870849), // (342870849 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/sparkles/"
        ),
        Item(
            id = 39,
            name = "Relieved Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/relieved-face_1f60c.png",
            sign = "\uD83D\uDE0C", // 😌
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(336754040), // (336754040 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/relieved-face/"
        ),
        Item(
            id = 51,
            name = "Broken Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/broken-heart_1f494.png",
            sign = "\uD83D\uDC94", // 💔
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(335933158), //(335933158 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/broken-heart/"
        ),
        Item(
            id = 50,
            name = "Smiling Face with Sunglasses",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-sunglasses_1f60e.png",
            sign = "\uD83D\uDE0E", // 😎
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(328009513), //(328009513 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/smiling-face-with-sunglasses/"
        ),
        Item(
            id = 34,
            name = "Purple Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/purple-heart_1f49c.png",
            sign = "\uD83D\uDC9C", // 💜
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(327962144), // (327962144 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/purple-heart/"
        ),
        Item(
            id = 34,
            name = "Blue Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/blue-heart_1f499.png",
            sign = "\uD83D\uDC99", // 💙
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(324106726), // (327962144 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/blue-heart/"
        ),
        Item(
            id = 54,
            name = "Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crying-face_1f622.png",
            sign = "\uD83D\uDE22", // 😢
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(312729831), // (312729831 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/crying-face/"
        ),
        Item(
            id = 23,
            name = "Flushed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flushed-face_1f633.png",
            sign = "\uD83D\uDE33", // 😳
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(306543311), // (306543311 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/flushed-face/"
        ),
        Item(
            id = 29,
            name = "Sparkling Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkling-heart_1f496.png",
            sign = "\uD83D\uDC96", // 💖
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(255299184), // (255106405 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/sparkling-heart/"
        ),
        Item(
            id = 91,
            name = "Hundred Points",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hundred-points_1f4af.png",
            sign = "\uD83D\uDCAF", // 💯
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(253512430), // (253512430 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/hundred-points/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Musical Notes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-notes_1f3b6.png",
            sign = "\uD83C\uDFB6", // 🎶
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(253332742),
            url = "https://emojipedia.org/musical-notes/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Left Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/left-arrow_2b05-fe0f.png",
            sign = "⬅️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(240063300),
            url = "https://emojipedia.org/left-arrow/"
        ),
        Item(
            id = 55,
            name = "Raising Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raising-hands_1f64c.png",
            sign = "\uD83D\uDE4C", // 🙌
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(232061734), // (232061734 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/raising-hands/"
        ),
        Item(
            id = 15,
            name = "See-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/see-no-evil-monkey_1f648.png",
            sign = "\uD83D\uDE48", // 🙈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(222763283), // (222650726 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/see-no-evil-monkey/"
        ),
        Item(
            id = 35,
            name = "Face Savoring Food",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-savoring-food_1f60b.png",
            sign = "\uD83D\uDE0B", // 😋
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(214299720), // (214299720 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/face-savoring-food/"
        ),
        Item(
            id = 40,
            name = "Grinning Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-smiling-eyes_1f604.png",
            sign = "\uD83D\uDE04", // 😄
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(206476301), // (206327793 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/grinning-face-with-smiling-eyes/"
        ),
        Item(
            id = 83,
            name = "Victory Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/victory-hand_270c-fe0f.png",
            sign = "✌️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(199006983), // (199006983 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/victory-hand/"
        ),
        Item(
            id = 45,
            name = "Growing Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/growing-heart_1f497.png",
            sign = "\uD83D\uDC97", // 💗
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(196395880), //(196395880 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/growing-heart/"
        ),
        Item(
            id = 86,
            name = "Expressionless Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/expressionless-face_1f611.png",
            sign = "\uD83D\uDE11", // 😑
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(192458032), // (192458032 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/expressionless-face/"
        ),
        Item(
            id = 76,
            name = "Disappointed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/disappointed-face_1f61e.png",
            sign = "\uD83D\uDE1E", // 😞
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(190927553), // (190927553 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/disappointed-face/"
        ),
        Item(
            id = 19,
            name = "Winking Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face-with-tongue_1f61c.png",
            sign = "\uD83D\uDE1C", // 😜
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(190396863), // (190396863 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/winking-face-with-tongue/"
        ),
        Item(
            id = 73,
            name = "Sleeping Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sleeping-face_1f634.png",
            sign = "\uD83D\uDE34", // 😴
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(190059223), // (190059223 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/sleeping-face/"
        ),
        Item(
            id = 95,
            name = "Skull",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/skull_1f480.png",
            sign = "\uD83D\uDC80", // 💀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(188102594),
            url = "https://emojipedia.org/skull/"
        ),
        Item(
            id = 20,
            name = "Clapping Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clapping-hands_1f44f.png",
            sign = "\uD83D\uDC4F", // 👏
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(182863381), // (182863381 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/clapping-hands/"
        ),
        Item(
            id = 100,
            name = "Neutral Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/neutral-face_1f610.png",
            sign = "\uD83D\uDE10", // 😐
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(180220835), // (180220835 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/neutral-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Right",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-right_1f449.png",
            sign = "\uD83D\uDC49", // 👉
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(178676462),
            url = "https://emojipedia.org/backhand-index-pointing-right/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sleepy Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sleepy-face_1f62a.png",
            sign = "\uD83D\uDE2A", // 😪
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(178476524),
            url = "https://emojipedia.org/sleepy-face/"
        ),
        Item(
            id = 88,
            name = "Confused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confused-face_1f615.png",
            sign = "\uD83D\uDE15", // 😕
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(174072565), // (174072565 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/confused-face/"
        ),
        Item(
            id = 56,
            name = "Rose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rose_1f339.png",
            sign = "\uD83C\uDF39", // 🌹
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(173549799), // (173549799 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/rose/"
        ),
        Item(
            id = 32,
            name = "Grinning Squinting Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-squinting-face_1f606.png",
            sign = "\uD83D\uDE06", // 😆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(172688804),
            url = "https://emojipedia.org/grinning-squinting-face/"
        ),
        Item(
            id = 60,
            name = "Yellow Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/yellow-heart_1f49b.png",
            sign = "\uD83D\uDC9B", // 💛
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(169596069), // (169596069 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/yellow-heart/"
        ),
        Item(
            id = 53,
            name = "Flexed Biceps",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flexed-biceps_1f4aa.png",
            sign = "\uD83D\uDCAA", // 💪
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(164418412), // (164418412 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/flexed-biceps/"
        ),
        Item(
            id = 52,
            name = "Revolving Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/revolving-hearts_1f49e.png",
            sign = "\uD83D\uDC9E", // 💞
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(156749417), //(156749417 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/revolving-hearts/"
        ),
        Item(
            id = 74,
            name = "Grinning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face_1f600.png",
            sign = "\uD83D\uDE00", // 😀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(154844887), // (154844887 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/grinning-face/"
        ),
        Item(
            id = 42,
            name = "Enraged Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pouting-face_1f621.png",
            sign = "\uD83D\uDE21", // 😡
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(152371117), // (152371117 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/pouting-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Check Mark Button",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-mark-button_2705.png",
            sign = "✅",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(150622274),
            url = "https://emojipedia.org/check-mark-button/"
        ),
        Item(
            id = 47,
            name = "Face Screaming in Fear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-screaming-in-fear_1f631.png",
            sign = "\uD83D\uDE31", // 😱
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(150324279),
            url = "https://emojipedia.org/face-screaming-in-fear/"
        ),
        Item(
            id = 71,
            name = "Green Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/green-heart_1f49a.png",
            sign = "\uD83D\uDC9A", // 💚
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(145493542), // (145493542 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/green-heart/"
        ),
        Item(
            id = 80,
            name = "Smiling Face with Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-horns_1f608.png",
            sign = "\uD83D\uDE08", // 😈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(140185189), // (140185189 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/smiling-face-with-horns/"
        ),
        Item(
            id = 57,
            name = "Heart with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-arrow_1f498.png",
            sign = "\uD83D\uDC98", // 💘
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(138780168), // (138780168 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/heart-with-arrow/"
        ),
        Item(
            id = 104,
            name = "Cherry Blossom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cherry-blossom_1f338.png",
            sign = "\uD83C\uDF38", // 🌸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(138259263), // (138259263 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/cherry-blossom/"
        ),
        Item(
            id = 41,
            name = "Party Popper",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/party-popper_1f389.png",
            sign = "\uD83C\uDF89", // 🎉
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(136805390) // (136805390 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
        ),
        Item(
            id = 65,
            name = "Grinning Face with Big Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-big-eyes_1f603.png",
            sign = "\uD83D\uDE03", // 😃
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(136255374), // (136255374 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/grinning-face-with-big-eyes/"
        ),
        Item(
            id = 9,
            name = "Kissing Lips",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kiss-mark_1f48b.png",
            sign = "\uD83D\uDC8B", // 💋
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(131090447), // (130991975 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/kiss-mark/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Camera",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/camera_1f4f7.png",
            sign = "\uD83D\uDCF7", // 📷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(130745733),
            url = "https://emojipedia.org/camera/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Down",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-down_1f447.png",
            sign = "\uD83D\uDC47", // 👇
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(126309067),
            url = "https://emojipedia.org/backhand-index-pointing-down/"
        ),
        Item(
            id = 82,
            name = "Tired Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tired-face_1f62b.png",
            sign = "\uD83D\uDE2B", // 😫
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(533669396), // (533669396 / daysFromStartOfStatistic).toLong() * countOfAverageMonths, // ?
            url = "https://emojipedia.org/tired-face/"
        ),
        Item(
            id = 70,
            name = "Grimacing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grimacing-face_1f62c.png",
            sign = "\uD83D\uDE2C", // 😬
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(124923619), // (124779812 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/grimacing-face/"
        ),
        Item(
            id = 103,
            name = "Face with Steam From Nose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-steam-from-nose_1f624.png",
            sign = "\uD83D\uDE24", // 😤
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(123544220), // (123544220 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/face-with-steam-from-nose/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Left",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-left_1f448.png",
            sign = "\uD83D\uDC48", // 👈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(117872545),
            url = "https://emojipedia.org/backhand-index-pointing-left/"
        ),
        Item(
            id = 81,
            name = "Speak-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speak-no-evil-monkey_1f64a.png",
            sign = "\uD83D\uDE4A", // 🙊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(112910656), // (112881939 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/speak-no-evil-monkey/"
        ),
        Item(
            id = 89,
            name = "Beating Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/beating-heart_1f493.png",
            sign = "\uD83D\uDC93", // 💓
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(112119536), // (112119536 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/beating-heart/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Play Button",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/play-button_25b6-fe0f.png",
            sign = "▶️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(112037700),
            url = "https://emojipedia.org/play-button/"
        ),
        Item(
            id = 111111111, // TODO
            name = "New Moon Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/new-moon-face_1f31a.png",
            sign = "\uD83C\uDF1A", // 🌚
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(110438636),
            url = "https://emojipedia.org/new-moon-face/"
        ),
        Item(
            id = 62,
            name = "Squinting Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/squinting-face-with-tongue_1f61d.png",
            sign = "\uD83D\uDE1D", // 😝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(109567360), // (109567360 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/squinting-face-with-tongue/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Right Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow_27a1-fe0f.png",
            sign = "➡️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(108238114),
            url = "https://emojipedia.org/right-arrow/"
        ),
        Item(
            id = 63,
            name = "Smiling Face with Halo",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-halo_1f607.png",
            sign = "\uD83D\uDE07", // 😇
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(108061758), // (108061758 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/smiling-face-with-halo/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Tipping Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-tipping-hand_1f481.png",
            sign = "\uD83D\uDC81", // 💁
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(107645584),
            url = "https://emojipedia.org/person-tipping-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sun",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sun_2600-fe0f.png",
            sign = "☀️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(107414322),
            url = "https://emojipedia.org/sun/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Persevering Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/persevering-face_1f623.png",
            sign = "\uD83D\uDE23", // 😣
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(105038315),
            url = "https://emojipedia.org/persevering-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Raised Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raised-hand_270b.png",
            sign = "✋",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(104713568),
            url = "https://emojipedia.org/raised-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Crown",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crown_1f451.png",
            sign = "\uD83D\uDC51", // 👑
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(102307187),
            url = "https://emojipedia.org/crown/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Red Circle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/large-red-circle_1f534.png",
            sign = "\uD83D\uDD34", // 🔴
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(101889783),
            url = "https://emojipedia.org/large-red-circle/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Check Mark",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-mark_2714-fe0f.png",
            sign = "✔️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(100558289),
            url = "https://emojipedia.org/check-mark/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Downcast Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/downcast-face-with-sweat_1f613.png",
            sign = "\uD83D\uDE13", // 😓
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(98356354),
            url = "https://emojipedia.org/downcast-face-with-sweat/"
        ),
        Item(
            id = 94,
            name = "Smiling Cat with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-cat-with-heart-eyes_1f63b.png",
            sign = "\uD83D\uDE3B", // 😻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(97611705), // (97611705 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/smiling-cat-with-heart-eyes/"
        ),
        Item(
            id = 101,
            name = "Oncoming Fist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/oncoming-fist_1f44a.png",
            sign = "\uD83D\uDC4A", // 👊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(93663483), // (93617935 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/oncoming-fist/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sad but Relieved Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sad-but-relieved-face_1f625.png",
            sign = "\uD83D\uDE25", // 😥
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(93332288),
            url = "https://emojipedia.org/sad-but-relieved-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Collision",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/collision_1f4a5.png",
            sign = "\uD83D\uDCA5", // 💥
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(88194567),
            url = "https://emojipedia.org/collision/"
        ),
        Item(
            id = 111111111, // TODO
            name = "High Voltage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/high-voltage_26a1.png",
            sign = "⚡", // ⚡
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(85350261),
            url = "https://emojipedia.org/high-voltage/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Double Exclamation Mark",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/double-exclamation-mark_203c-fe0f.png",
            sign = "‼️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(84891194),
            url = "https://emojipedia.org/double-exclamation-mark/"
        ),
        Item(
            id = 98,
            name = "Waving Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/waving-hand_1f44b.png",
            sign = "\uD83D\uDC4B", // 👋
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(82797328), // (82797328 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/waving-hand/"
        ),
        Item(
            id = 59,
            name = "Kissing Face with Closed Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face-with-closed-eyes_1f61a.png",
            sign = "\uD83D\uDE1A", // 😚
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(81571726), // (81571726 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/kissing-face-with-closed-eyes/"
        ),
        Item(
            id = 90,
            name = "Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tongue_1f61b.png",
            sign = "\uD83D\uDE1B", // 😛
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(80535507), // (80535507 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/face-with-tongue/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Star",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/star_2b50.png",
            sign = "⭐",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(77825658),
            url = "https://emojipedia.org/star/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Money Bag",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/money-bag_1f4b0.png",
            sign = "\uD83D\uDCB0", // 💰
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(75606899),
            url = "https://emojipedia.org/money-bag/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Medical Mask",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-medical-mask_1f637.png",
            sign = "\uD83D\uDE37", // 😷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(74928404),
            url = "https://emojipedia.org/face-with-medical-mask/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Angry Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/angry-face_1f620.png",
            sign = "\uD83D\uDE20", // 😠
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(70181610),
            url = "https://emojipedia.org/angry-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Glowing Star",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/glowing-star_1f31f.png",
            sign = "\uD83C\uDF1F", // 🌟
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(70051523),
            url = "https://emojipedia.org/glowing-star/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face Without Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-without-mouth_1f636.png",
            sign = "\uD83D\uDE36", // 😶
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(70031817),
            url = "https://emojipedia.org/face-without-mouth/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Confounded Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confounded-face_1f616.png",
            sign = "\uD83D\uDE16", // 😖
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(68901305),
            url = "https://emojipedia.org/confounded-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dizzy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dizzy_1f4ab.png",
            sign = "\uD83D\uDCAB", // 💫
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(65427062),
            url = "https://emojipedia.org/dizzy/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Headphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/headphone_1f3a7.png",
            sign = "\uD83C\uDFA7", // 🎧
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(60336232),
            url = "https://emojipedia.org/headphone/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hibiscus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hibiscus_1f33a.png",
            sign = "\uD83C\uDF3A", // 🌺
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(59352498),
            url = "https://emojipedia.org/hibiscus/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Musical Note",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-note_1f3b5.png",
            sign = "\uD83C\uDFB5", // 🎵
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(57622555),
            url = "https://emojipedia.org/musical-note/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Soccer Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/soccer-ball_26bd.png",
            sign = "⚽",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(56055162),
            url = "https://emojipedia.org/soccer-ball/"
        ),
        Item(
            id = 84,
            name = "Cat with Tears of Joy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-with-tears-of-joy_1f639.png",
            sign = "\uD83D\uDE39", // 😹
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(55909177),
            url = "https://emojipedia.org/cat-with-tears-of-joy/"
        ),
        Item(
            id = 93,
            name = "Sweat Droplets",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sweat-droplets_1f4a6.png",
            sign = "\uD83D\uDCA6", // 💦
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(55894654),
            url = "https://emojipedia.org/sweat-droplets/"
        ),
        Item(
            id = 85,
            name = "Woman Dancing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman-dancing_1f483.png",
            sign = "\uD83D\uDC83", // 💃
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(54509681), // (54509681 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/woman-dancing/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Raised Fist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raised-fist_270a.png",
            sign = "✊",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(53444224),
            url = "https://emojipedia.org/raised-fist/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Raising Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-raising-hand_1f64b.png",
            sign = "\uD83D\uDE4B", // 🙋
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(53388237),
            url = "https://emojipedia.org/person-raising-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Thumbs Down",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thumbs-down_1f44e.png",
            sign = "\uD83D\uDC4E", // 👎
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(51548287),
            url = "https://emojipedia.org/thumbs-down/"
        ),
        Item(
            id = 106,
            name = "Pile of Poop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pile-of-poo_1f4a9.png",
            sign = "\uD83D\uDCA9", // 💩
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(50927535), // (50927535 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/pile-of-poo/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Anxious Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anxious-face-with-sweat_1f630.png",
            sign = "\uD83D\uDE30", // 😰
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(50239527),
            url = "https://emojipedia.org/anxious-face-with-sweat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cross Mark",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cross-mark_274c.png",
            sign = "❌",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(50184960),
            url = "https://emojipedia.org/cross-mark/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sun with Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sun-with-face_1f31e.png",
            sign = "\uD83C\uDF1E", // 🌞
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(50031982),
            url = "https://emojipedia.org/sun-with-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Keycap Digit One",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/keycap-digit-one_31-fe0f-20e3.png",
            sign = "1️⃣",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(48869465),
            url = "https://emojipedia.org/keycap-digit-one/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Gem Stone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/gem-stone_1f48e.png",
            sign = "\uD83D\uDC8E", // 💎
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(48844065),
            url = "https://emojipedia.org/gem-stone/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Four Leaf Clover",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/four-leaf-clover_1f340.png",
            sign = "\uD83C\uDF40", // 🍀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(48085968),
            url = "https://emojipedia.org/four-leaf-clover/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Airplane",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/airplane_2708-fe0f.png",
            sign = "✈️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(47385205),
            url = "https://emojipedia.org/airplane/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Red Exclamation Mark",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/exclamation-mark_2757.png",
            sign = "❗",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(47202889),
            url = "https://emojipedia.org/exclamation-mark/"
        ),
        Item(
            id = 97,
            name = "Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tongue_1f445.png",
            sign = "\uD83D\uDC45", // 👅
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(46718345), // (46718345 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/tongue/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Rocket",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rocket_1f680.png",
            sign = "\uD83D\uDE80", // 🚀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(46377734),
            url = "https://emojipedia.org/rocket/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Keycap Digit Two",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/keycap-digit-two_32-fe0f-20e3.png",
            sign = "2️⃣",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(45974442),
            url = "https://emojipedia.org/keycap-digit-two/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hot Beverage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-beverage_2615.png",
            sign = "☕",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(45448307),
            url = "https://emojipedia.org/hot-beverage/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Tulip",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tulip_1f337.png",
            sign = "\uD83C\uDF37", // 🌷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(45022960),
            url = "https://emojipedia.org/tulip/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Thought Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thought-balloon_1f4ad.png",
            sign = "\uD83D\uDCAD", // 💭
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(44345706),
            url = "https://emojipedia.org/thought-balloon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Bouquet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bouquet_1f490.png",
            sign = "\uD83D\uDC90", // 💐
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(44201402),
            url = "https://emojipedia.org/bouquet/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Leaf Fluttering in Wind",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/leaf-fluttering-in-wind_1f343.png",
            sign = "\uD83C\uDF43", // 🍃
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(44163246),
            url = "https://emojipedia.org/leaf-fluttering-in-wind/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Worried Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/worried-face_1f61f.png",
            sign = "\uD83D\uDE1F", // 😟
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(43569691),
            url = "https://emojipedia.org/worried-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Trophy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/trophy_1f3c6.png",
            sign = "\uD83C\uDFC6", // 🏆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(43080494),
            url = "https://emojipedia.org/trophy/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Copyright",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/copyright_a9-fe0f.png",
            sign = "©️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(43048470),
            url = "https://emojipedia.org/copyright/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Flag: United States",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flag-united-states_1f1fa-1f1f8.png",
            sign = "\uD83C\uDDFA\uD83C\uDDF8", // 🇺🇸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(42173813),
            url = "https://emojipedia.org/flag-united-states/"
        ),
        Item(
            id = 105,
            name = "Wrapped Gift",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wrapped-gift_1f381.png",
            sign = "\uD83C\uDF81", // 🎁
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(41674470), // (41674470 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/wrapped-gift/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Water Pistol",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pistol_1f52b.png",
            sign = "\uD83D\uDD2B", // 🔫
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(41722793),
            url = "https://emojipedia.org/pistol/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Rainbow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rainbow_1f308.png",
            sign = "\uD83C\uDF08", // 🌈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(40976710),
            url = "https://emojipedia.org/rainbow/"
        ),
        Item(
            id = 102,
            name = "Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/balloon_1f388.png",
            sign = "\uD83C\uDF88", // 🎈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(40831082), // (40831082 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/balloon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Ghost",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ghost_1f47b.png",
            sign = "\uD83D\uDC7B", // 👻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(39724955),
            url = "https://emojipedia.org/ghost/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sunflower",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sunflower_1f33b.png",
            sign = "\uD83C\uDF3B", // 🌻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(39576571),
            url = "https://emojipedia.org/sunflower/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Open Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-open-mouth_1f62e.png",
            sign = "\uD83D\uDE2E", // 😮
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(38933837),
            url = "https://emojipedia.org/face-with-open-mouth/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Crescent Moon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crescent-moon_1f319.png",
            sign = "\uD83C\uDF19", // 🌙
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(37816711),
            url = "https://emojipedia.org/crescent-moon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Left Arrow Curving Right",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/left-arrow-curving-right_21aa-fe0f.png",
            sign = "↪️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(37094598),
            url = "https://emojipedia.org/left-arrow-curving-right/"
        ),
        Item(
            id = 107,
            name = "Confetti Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confetti-ball_1f38a.png",
            sign = "\uD83C\uDF8A", // 🎊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(37054422), // (37054422 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/confetti-ball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Index Pointing Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/index-pointing-up_261d-fe0f.png",
            sign = "☝️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36897084),
            url = "https://emojipedia.org/index-pointing-up/"
        ),
        Item(
            id = 77,
            name = "Birthday Cake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/birthday-cake_1f382.png",
            sign = "\uD83C\uDF82", // 🎂
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36846549), // (36846549 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/birthday-cake/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cloud",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cloud_2601-fe0f.png",
            sign = "☁️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36838027),
            url = "https://emojipedia.org/cloud/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Police Car Light",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/police-car-light_1f6a8.png",
            sign = "\uD83D\uDEA8", // 🚨
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36629880),
            url = "https://emojipedia.org/police-car-light/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Telephone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/telephone_260e-fe0f.png",
            sign = "☎️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36120888),
            url = "https://emojipedia.org/telephone/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Ribbon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ribbon_1f380.png",
            sign = "\uD83C\uDF80", // 🎀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36069421),
            url = "https://emojipedia.org/ribbon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Movie Camera",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/movie-camera_1f3a5.png",
            sign = "\uD83C\uDFA5", // 🎥
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(36051816),
            url = "https://emojipedia.org/movie-camera/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Gesturing OK",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-gesturing-ok_1f646.png",
            sign = "\uD83D\uDE46", // 🙆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(35813429),
            url = "https://emojipedia.org/person-gesturing-ok/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Zzz",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zzz_1f4a4.png",
            sign = "\uD83D\uDCA4", // 💤
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(35719050),
            url = "https://emojipedia.org/zzz/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Kissing Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face-with-smiling-eyes_1f619.png",
            sign = "\uD83D\uDE19", // 😙
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(35713291),
            url = "https://emojipedia.org/kissing-face-with-smiling-eyes/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fearful Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fearful-face_1f628.png",
            sign = "\uD83D\uDE28", // 😨
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(35567901),
            url = "https://emojipedia.org/fearful-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Reverse Button",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/reverse-button_25c0-fe0f.png",
            sign = "◀️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(35165760),
            url = "https://emojipedia.org/reverse-button/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Clinking Beer Mugs",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clinking-beer-mugs_1f37b.png",
            sign = "\uD83C\uDF7B", // 🍻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(34983833),
            url = "https://emojipedia.org/clinking-beer-mugs/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Microphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/microphone_1f3a4.png",
            sign = "\uD83C\uDFA4", // 🎤
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(34592493),
            url = "https://emojipedia.org/microphone/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Snowflake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/snowflake_2744-fe0f.png",
            sign = "❄️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(34576368),
            url = "https://emojipedia.org/snowflake/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Christmas Tree",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/christmas-tree_1f384.png",
            sign = "\uD83C\uDF84", // 🎄
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(34295770),
            url = "https://emojipedia.org/christmas-tree/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Check Box with Check",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-box-with-check_2611-fe0f.png",
            sign = "☑️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(33963622),
            url = "https://emojipedia.org/check-box-with-check/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Warning",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/warning_26a0-fe0f.png",
            sign = "⚠️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(33621444),
            url = "https://emojipedia.org/warning/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Right Arrow Curving Left",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow-curving-left_21a9-fe0f.png",
            sign = "↩️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(33022878),
            url = "https://emojipedia.org/right-arrow-curving-left/"
        ),
        Item(
            id = 111111111, // TODO
            name = "No One Under Eighteen",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/no-one-under-eighteen_1f51e.png",
            sign = "\uD83D\uDD1E", // 🔞
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(32913769),
            url = "https://emojipedia.org/no-one-under-eighteen/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Astonished Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/astonished-face_1f632.png",
            sign = "\uD83D\uDE32", // 😲
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(32902211),
            url = "https://emojipedia.org/astonished-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dog Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dog-face_1f436.png",
            sign = "\uD83D\uDC36", // 🐶
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(32460824),
            url = "https://emojipedia.org/dog-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Gesturing No",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-gesturing-no_1f645.png",
            sign = "\uD83D\uDE45", // 🙅
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(32048877),
            url = "https://emojipedia.org/person-gesturing-no/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Pushpin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pushpin_1f4cc.png",
            sign = "\uD83D\uDCCC", // 📌
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(31646908),
            url = "https://emojipedia.org/pushpin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Herb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/herb_1f33f.png",
            sign = "\uD83C\uDF3F", // 🌿
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(30892138),
            url = "https://emojipedia.org/herb/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Pizza",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pizza_1f355.png",
            sign = "\uD83C\uDF55", // 🍕
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(30817214),
            url = "https://emojipedia.org/pizza/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Money with Wings",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/money-with-wings_1f4b8.png",
            sign = "\uD83D\uDCB8", // 💸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(30763399),
            url = "https://emojipedia.org/money-with-wings/"
        ),
        Item(
            id = 99,
            name = "Heart with Ribbon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-ribbon_1f49d.png",
            sign = "\uD83D\uDC9D", // 💝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(30628968), // (30628968 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/heart-with-ribbon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Blossom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/blossom_1f33c.png",
            sign = "\uD83C\uDF3C", // 🌼
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(29779836),
            url = "https://emojipedia.org/blossom/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Down Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/down-arrow_2b07-fe0f.png",
            sign = "⬇️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(29689476),
            url = "https://emojipedia.org/down-arrow/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Walking",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-walking_1f6b6.png",
            sign = "\uD83D\uDEB6", // 🚶
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(28934800),
            url = "https://emojipedia.org/person-walking/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Nail Polish",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nail-polish_1f485.png",
            sign = "\uD83D\uDC85", // 💅
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(28927269),
            url = "https://emojipedia.org/nail-polish/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Love Letter",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/love-letter_1f48c.png",
            sign = "\uD83D\uDC8C", // 💌
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(28713046),
            url = "https://emojipedia.org/love-letter/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hushed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hushed-face_1f62f.png",
            sign = "\uD83D\uDE2F", // 😯
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(28327346),
            url = "https://emojipedia.org/hushed-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Palm Tree",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/palm-tree_1f334.png",
            sign = "\uD83C\uDF34", // 🌴
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(28101638),
            url = "https://emojipedia.org/palm-tree/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Spouting Whale",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/320/apple/325/spouting-whale_1f433.png",
            sign = "\uD83D\uDC33", // 🐳
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(27587177),
            url = "https://emojipedia.org/spouting-whale/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Anguished Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anguished-face_1f627.png",
            sign = "\uD83D\uDE27", // 😧
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(27310978),
            url = "https://emojipedia.org/anguished-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Heart Decoration",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-decoration_1f49f.png",
            sign = "\uD83D\uDC9F", // 💟
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(27216129),
            url = "https://emojipedia.org/heart-decoration/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dizzy Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dizzy-face_1f635.png",
            sign = "\uD83D\uDE35", // 😵
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(27086031),
            url = "https://emojipedia.org/dizzy-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Crying Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crying-cat_1f63f.png",
            sign = "\uD83D\uDE3F", // 😿
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(27023534),
            url = "https://emojipedia.org/crying-cat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Bowing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-bowing_1f647.png",
            sign = "\uD83D\uDE47", // 🙇
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(26924035),
            url = "https://emojipedia.org/person-bowing/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Alien",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/alien_1f47d.png",
            sign = "\uD83D\uDC7D", // 👽
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(26620534),
            url = "https://emojipedia.org/alien/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Loudspeaker",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/loudspeaker_1f4e2.png",
            sign = "\uD83D\uDCE2", // 📢
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(26614557),
            url = "https://emojipedia.org/loudspeaker/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Round Pushpin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/round-pushpin_1f4cd.png",
            sign = "\uD83D\uDCCD", // 📍
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(26384678),
            url = "https://emojipedia.org/round-pushpin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Open Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/open-hands_1f450.png",
            sign = "\uD83D\uDC50", // 👐
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(25980267),
            url = "https://emojipedia.org/open-hands/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Full Moon Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/full-moon-face_1f31d.png",
            sign = "\uD83C\uDF1D", // 🌝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(25975481),
            url = "https://emojipedia.org/full-moon-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cat with Wry Smile",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-with-wry-smile_1f63c.png",
            sign = "\uD83D\uDE3C", // 😼
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(25904279),
            url = "https://emojipedia.org/cat-with-wry-smile/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Globe Showing Americas",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-americas_1f30e.png",
            sign = "\uD83C\uDF0E", // 🌎
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(25540133),
            url = "https://emojipedia.org/globe-showing-americas/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Maple Leaf",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/maple-leaf_1f341.png",
            sign = "\uD83C\uDF41", // 🍁
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(25265968),
            url = "https://emojipedia.org/maple-leaf/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Goat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/goat_1f410.png",
            sign = "\uD83D\uDC10", // 🐐
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24919442),
            url = "https://emojipedia.org/goat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Penguin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/penguin_1f427.png",
            sign = "\uD83D\uDC27", // 🐧
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24742865),
            url = "https://emojipedia.org/penguin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fallen Leaf",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fallen-leaf_1f342.png",
            sign = "\uD83C\uDF42", // 🍂
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24514760),
            url = "https://emojipedia.org/fallen-leaf/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Running",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-running_1f3c3.png",
            sign = "\uD83C\uDFC3", // 🏃
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24460082),
            url = "https://emojipedia.org/person-running/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cat Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-face_1f431.png",
            sign = "\uD83D\uDC31", // 🐱
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24337674),
            url = "https://emojipedia.org/cat-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Peach",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/peach_1f351.png",
            sign = "\uD83C\uDF51", // 🍑
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(24118431),
            url = "https://emojipedia.org/peach/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Globe Showing Europe-Africa",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-europe-africa_1f30d.png",
            sign = "\uD83C\uDF0D", // 🌍
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23888836),
            url = "https://emojipedia.org/globe-showing-europe-africa/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Mobile Phone with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mobile-phone-with-arrow_1f4f2.png",
            sign = "\uD83D\uDCF2", // 📲
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23875620),
            url = "https://emojipedia.org/mobile-phone-with-arrow/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Television",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/television_1f4fa.png",
            sign = "\uD83D\uDCFA", // 📺
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23774942),
            url = "https://emojipedia.org/television/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Bullseye",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/direct-hit_1f3af.png",
            sign = "\uD83C\uDFAF", // 🎯
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23736268),
            url = "https://emojipedia.org/direct-hit/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Kissing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face_1f617.png",
            sign = "\uD83D\uDE17", // 😗
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23718693),
            url = "https://emojipedia.org/kissing-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Basketball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/basketball_1f3c0.png",
            sign = "\uD83C\uDFC0", // 🏀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(23580875),
            url = "https://emojipedia.org/basketball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Water Wave",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/water-wave_1f30a.png",
            sign = "\uD83C\uDF0A", // 🌊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(22860254),
            url = "https://emojipedia.org/water-wave/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dashing Away",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dashing-away_1f4a8.png",
            sign = "\uD83D\uDCA8", // 💨
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(22038263),
            url = "https://emojipedia.org/dashing-away/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Baby Angel",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/baby-angel_1f47c.png",
            sign = "\uD83D\uDC7C", // 👼
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21984952),
            url = "https://emojipedia.org/baby-angel/"
        ),
        Item(
            id = 111111111,
            name = "Alarm Clock",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/alarm-clock_23f0.png",
            sign = "⏰",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21957229),
            url = "https://emojipedia.org/alarm-clock/"
        ),
        Item(
            id = 111111111,
            name = "Hot Springs",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-springs_2668-fe0f.png",
            sign = "♨️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21928832),
            url = "https://emojipedia.org/hot-springs/"
        ),
        Item(
            id = 111111111,
            name = "Club Suit",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/club-suit_2663-fe0f.png",
            sign = "♣️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21874657),
            url = "https://emojipedia.org/club-suit/"
        ),
        Item(
            id = 111111111,
            name = "Backhand Index Pointing Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-up_1f446.png",
            sign = "\uD83D\uDC46", // 👆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21640497),
            url = "https://emojipedia.org/backhand-index-pointing-up/"
        ),
        Item(
            id = 111111111,
            name = "Video Camera",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/video-camera_1f4f9.png",
            sign = "\uD83D\uDCF9", // 📹
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21519366),
            url = "https://emojipedia.org/video-camera/"
        ),
        Item(
            id = 111111111,
            name = "Rabbit Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rabbit-face_1f430.png",
            sign = "\uD83D\uDC30", // 🐰
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21408072),
            url = "https://emojipedia.org/rabbit-face/"
        ),
        Item(
            id = 111111111,
            name = "Megaphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/megaphone_1f4e3.png",
            sign = "\uD83D\uDCE3", // 📣
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21301385),
            url = "https://emojipedia.org/megaphone/"
        ),
        Item(
            id = 111111111,
            name = "Bomb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bomb_1f4a3.png",
            sign = "\uD83D\uDCA3", // 💣
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(21209090),
            url = "https://emojipedia.org/bomb/"
        ),
        Item(
            id = 111111111,
            name = "Cactus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cactus_1f335.png",
            sign = "\uD83C\uDF35", // 🌵
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(20971032),
            url = "https://emojipedia.org/cactus/"
        ),
        Item(
            id = 111111111,
            name = "Speaker High Volume",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speaker-high-volume_1f50a.png",
            sign = "\uD83D\uDD0A", // 🔊
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(20783219),
            url = "https://emojipedia.org/speaker-high-volume/"
        ),
        Item(
            id = 37,
            name = "Ring",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ring_1f48d.png",
            sign = "\uD83D\uDC8D", // 💍
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19911636), // (19896481 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/ring/"
        ),
        Item(
            id = 111111111,
            name = "People with Bunny Ears",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/people-with-bunny-ears_1f46f.png",
            sign = "\uD83D\uDC6F", // 👯
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19911370),
            url = "https://emojipedia.org/people-with-bunny-ears/"
        ),
        Item(
            id = 111111111,
            name = "Musical Score",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-score_1f3bc.png",
            sign = "\uD83C\uDFBC", // 🎼
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19804479),
            url = "https://emojipedia.org/musical-score/"
        ),
        Item(
            id = 111111111,
            name = "Multiply",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/multiply_2716-fe0f.png",
            sign = "✖️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19651444),
            url = "https://emojipedia.org/multiply/"
        ),
        Item(
            id = 111111111,
            name = "Blue Circle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/large-blue-circle_1f535.png",
            sign = "\uD83D\uDD35", // 🔵
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19239423),
            url = "https://emojipedia.org/large-blue-circle/"
        ),
        Item(
            id = 111111111,
            name = "Telephone Receiver",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/telephone-receiver_1f4de.png",
            sign = "\uD83D\uDCDE", // 📞
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(19091995),
            url = "https://emojipedia.org/telephone-receiver/"
        ),
        Item(
            id = 111111111,
            name = "Mobile Phone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mobile-phone_1f4f1.png",
            sign = "\uD83D\uDCF1", // 📱
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(18867332),
            url = "https://emojipedia.org/mobile-phone/"
        ),
        Item(
            id = 111111111,
            name = "Cherries",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cherries_1f352.png",
            sign = "\uD83C\uDF52", // 🍒
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(18555712),
            url = "https://emojipedia.org/cherries/"
        ),
        Item(
            id = 111111111,
            name = "Hollow Red Circle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hollow-red-circle_2b55.png",
            sign = "⭕",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(18371271),
            url = "https://emojipedia.org/hollow-red-circle/"
        ),
        Item(
            id = 111111111,
            name = "Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mouth_1f444.png",
            sign = "\uD83D\uDC44", // 👄
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(18208273),
            url = "https://emojipedia.org/mouth/"
        ),
        Item(
            id = 111111111,
            name = "Kissing Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-cat_1f63d.png",
            sign = "\uD83D\uDE3D", // 😽
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(18026441),
            url = "https://emojipedia.org/kissing-cat/"
        ),
        Item(
            id = 111111111,
            name = "Strawberry",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/strawberry_1f353.png",
            sign = "\uD83C\uDF53", // 🍓
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17959163),
            url = "https://emojipedia.org/strawberry/"
        ),
        Item(
            id = 111111111,
            name = "Clapper Board",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clapper-board_1f3ac.png",
            sign = "\uD83C\uDFAC", // 🎬
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17873581),
            url = "https://emojipedia.org/clapper-board/"
        ),
        Item(
            id = 111111111,
            name = "Seedling",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/seedling_1f331.png",
            sign = "\uD83C\uDF31", // 🌱
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17771373),
            url = "https://emojipedia.org/seedling/"
        ),
        Item(
            id = 111111111,
            name = "Link",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/link_1f517.png",
            sign = "\uD83D\uDD17", // 🔗
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17623594),
            url = "https://emojipedia.org/link/"
        ),
        Item(
            id = 111111111,
            name = "Frowning Face with Open Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/320/apple/325/frowning-face-with-open-mouth_1f626.png",
            sign = "\uD83D\uDE26", // 😦
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17574150),
            url = "https://emojipedia.org/frowning-face-with-open-mouth/"
        ),
        Item(
            id = 111111111,
            name = "Kitchen Knife",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kitchen-knife_1f52a.png",
            sign = "\uD83D\uDD2A", // 🔪
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17526766),
            url = "https://emojipedia.org/kitchen-knife/"
        ),
        Item(
            id = 111111111,
            name = "Spade Suit",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/spade-suit_2660-fe0f.png",
            sign = "♠️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17170293),
            url = "https://emojipedia.org/spade-suit/"
        ),
        Item(
            id = 111111111,
            name = "Top Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/top-arrow_1f51d.png",
            sign = "\uD83D\uDD1D", // 🔝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17143430),
            url = "https://emojipedia.org/top-arrow/"
        ),
        Item(
            id = 111111111,
            name = "Pig Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pig-face_1f437.png",
            sign = "\uD83D\uDC37", // 🐷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(17117226),
            url = "https://emojipedia.org/pig-face/"
        ),
        Item(
            id = 111111111,
            name = "Eggplant",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eggplant_1f346.png",
            sign = "\uD83C\uDF46", // 🍆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(16791239),
            url = "https://emojipedia.org/eggplant/"
        ),
        Item(
            id = 111111111,
            name = "Anchor",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anchor_2693.png",
            sign = "⚓",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(16630982),
            url = "https://emojipedia.org/anchor/"
        ),
        Item(
            id = 111111111,
            name = "Woman and Man Holding Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman-and-man-holding-hands_1f46b.png",
            sign = "\uD83D\uDC6B", // 👫
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(16519348),
            url = "https://emojipedia.org/woman-and-man-holding-hands/"
        ),
        Item(
            id = 111111111,
            name = "Fast-Forward Button",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fast-forward-button_23e9.png",
            sign = "⏩",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(16410865),
            url = "https://emojipedia.org/fast-forward-button/"
        ),
        Item(
            id = 111111111,
            name = "Grinning Cat with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-cat-with-smiling-eyes_1f638.png",
            sign = "\uD83D\uDE38", // 😸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(16110876),
            url = "https://emojipedia.org/grinning-cat-with-smiling-eyes/"
        ),
        Item(
            id = 111111111,
            name = "Honeybee",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/honeybee_1f41d.png",
            sign = "\uD83D\uDC1D", // 🐝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15762005),
            url = "https://emojipedia.org/honeybee/"
        ),
        Item(
            id = 111111111,
            name = "Memo",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/memo_1f4dd.png",
            sign = "\uD83D\uDCDD", // 📝
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15336351),
            url = "https://emojipedia.org/memo/"
        ),
        Item(
            id = 111111111,
            name = "Hear-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hear-no-evil-monkey_1f649.png",
            sign = "\uD83D\uDE49", // 🙉
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15325236),
            url = "https://emojipedia.org/hear-no-evil-monkey/"
        ),
        Item(
            id = 111111111,
            name = "Angry Face with Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/angry-face-with-horns_1f47f.png",
            sign = "\uD83D\uDC7F", // 👿
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15303857),
            url = "https://emojipedia.org/angry-face-with-horns/"
        ),
        Item(
            id = 111111111,
            name = "Bell",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bell_1f514.png",
            sign = "\uD83D\uDD14", // 🔔
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15265940),
            url = "https://emojipedia.org/bell/"
        ),
        Item(
            id = 111111111,
            name = "Umbrella with Rain Drops",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/umbrella-with-rain-drops_2614.png",
            sign = "☔",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15185985),
            url = "https://emojipedia.org/umbrella-with-rain-drops/"
        ),
        Item(
            id = 111111111,
            name = "Wine Glass",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wine-glass_1f377.png",
            sign = "\uD83C\uDF77", // 🍷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15107139),
            url = "https://emojipedia.org/wine-glass/"
        ),
        Item( // TODO maybe comment
            id = 111111111,
            name = "Kiss: Woman, Man",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kiss_1f48f.png",
            sign = "\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC8B\u200D\uD83D\uDC68", // 👩‍❤️‍💋‍👨
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15027217),
            url = "https://emojipedia.org/kiss-woman-man/"
        ),
        Item(
            id = 111111111,
            name = "Bear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bear_1f43b.png",
            sign = "\uD83D\uDC3B", // 🐻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(15006419),
            url = "https://emojipedia.org/bear/"
        ),
        Item(
            id = 111111111,
            name = "Woman",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman_1f469.png",
            sign = "\uD83D\uDC69", // 👩
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14958877),
            url = "https://emojipedia.org/woman/"
        ),
        Item(
            id = 111111111,
            name = "Princess",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/princess_1f478.png",
            sign = "\uD83D\uDC78", // 👸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14938542),
            url = "https://emojipedia.org/princess/"
        ),
        Item(
            id = 111111111,
            name = "Paw Prints",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/paw-prints_1f43e.png",
            sign = "\uD83D\uDC3E", // 🐾
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14917551),
            url = "https://emojipedia.org/paw-prints/"
        ),
        Item(
            id = 111111111,
            name = "Snake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/snake_1f40d.png",
            sign = "\uD83D\uDC0D", // 🐍
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14847562),
            url = "https://emojipedia.org/snake/"
        ),
        Item(
            id = 111111111,
            name = "Jack-O-Lantern",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/jack-o-lantern_1f383.png",
            sign = "\uD83C\uDF83", // 🎃
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14730156),
            url = "https://emojipedia.org/jack-o-lantern/"
        ),
        Item(
            id = 111111111,
            name = "Lollipop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/lollipop_1f36d.png",
            sign = "\uD83C\uDF6D", // 🍭
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14681704),
            url = "https://emojipedia.org/lollipop/"
        ),
        Item(
            id = 111111111,
            name = "Speech Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speech-balloon_1f4ac.png",
            sign = "\uD83D\uDCAC", // 💬
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14653888),
            url = "https://emojipedia.org/speech-balloon/"
        ),
        Item(
            id = 111111111,
            name = "Beer Mug",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/beer-mug_1f37a.png",
            sign = "\uD83C\uDF7A", // 🍺
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14638604),
            url = "https://emojipedia.org/beer-mug/"
        ),
        Item(
            id = 111111111,
            name = "Small Orange Diamond",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/small-orange-diamond_1f538.png",
            sign = "\uD83D\uDD38", // 🔸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14510334),
            url = "https://emojipedia.org/small-orange-diamond/"
        ),
        Item(
            id = 111111111,
            name = "Books",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/books_1f4da.png",
            sign = "\uD83D\uDCDA", // 📚
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14496044),
            url = "https://emojipedia.org/books/"
        ),
        Item(
            id = 111111111,
            name = "American Football",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/american-football_1f3c8.png",
            sign = "\uD83C\uDFC8", // 🏈
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14418317),
            url = "https://emojipedia.org/american-football/"
        ),
        Item(
            id = 111111111,
            name = "Light Bulb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/light-bulb_1f4a1.png",
            sign = "\uD83D\uDCA1", // 💡
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14230743),
            url = "https://emojipedia.org/light-bulb/"
        ),
        Item( // TODO maybe comment
            id = 111111111,
            name = "Flag: France",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flag-france_1f1eb-1f1f7.png",
            sign = "\uD83C\uDDEB\uD83C\uDDF7", // 🇫🇷
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14116965),
            url = "https://emojipedia.org/flag-france/"
        ),
        Item(
            id = 111111111,
            name = "Anger Symbol",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anger-symbol_1f4a2.png",
            sign = "\uD83D\uDCA2", // 💢
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(14110139),
            url = "https://emojipedia.org/anger-symbol/"
        ),
        Item(
            id = 111111111,
            name = "Diamond Suit",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/diamond-suit_2666-fe0f.png",
            sign = "♦️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13969913),
            url = "https://emojipedia.org/diamond-suit/"
        ),
        Item(
            id = 111111111,
            name = "Santa Claus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/santa-claus_1f385.png",
            sign = "\uD83C\uDF85", // 🎅
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13961572),
            url = "https://emojipedia.org/santa-claus/"
        ),
        Item(
            id = 111111111,
            name = "Droplet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/droplet_1f4a7.png",
            sign = "\uD83D\uDCA7", // 💧
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13833846),
            url = "https://emojipedia.org/droplet/"
        ),
        Item(
            id = 111111111,
            name = "Women Holding Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/women-holding-hands_1f46d.png",
            sign = "\uD83D\uDC6D", // 👭
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13779514),
            url = "https://emojipedia.org/women-holding-hands/"
        ),
        Item(
            id = 111111111,
            name = "Globe Showing Asia-Australia",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-asia-australia_1f30f.png",
            sign = "\uD83C\uDF0F", // 🌏
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13684579),
            url = "https://emojipedia.org/globe-showing-asia-australia/"
        ),
        Item(
            id = 111111111,
            name = "Black Small Square",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-small-square_25aa-fe0f.png",
            sign = "▪️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13678909),
            url = "https://emojipedia.org/black-small-square/"
        ),
        Item(
            id = 111111111,
            name = "Frog",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/frog_1f438.png",
            sign = "\uD83D\uDC38", // 🐸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13620468),
            url = "https://emojipedia.org/frog/"
        ),
        Item(
            id = 111111111,
            name = "Video Game",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/video-game_1f3ae.png",
            sign = "\uD83C\uDFAE", // 🎮
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13588965),
            url = "https://emojipedia.org/video-game/"
        ),
        Item(
            id = 111111111,
            name = "Person Getting Massage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-getting-massage_1f486.png",
            sign = "\uD83D\uDC86", // 💆
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13493701),
            url = "https://emojipedia.org/person-getting-massage/"
        ),
        Item(
            id = 111111111,
            name = "Tiger Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tiger-face_1f42f.png",
            sign = "\uD83D\uDC2F", // 🐯
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13463588),
            url = "https://emojipedia.org/tiger-face/"
        ),
        Item(
            id = 111111111,
            name = "Man",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/man_1f468.png",
            sign = "\uD83D\uDC68", // 👨
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13355510),
            url = "https://emojipedia.org/man/"
        ),
        Item(
            id = 111111111,
            name = "Cyclone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cyclone_1f300.png",
            sign = "\uD83C\uDF00", // 🌀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13243627),
            url = "https://emojipedia.org/cyclone/"
        ),
        Item(
            id = 111111111,
            name = "Weary Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/weary-cat_1f640.png",
            sign = "\uD83D\uDE40", // 🙀
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13154718),
            url = "https://emojipedia.org/weary-cat/"
        ),
        Item(
            id = 111111111,
            name = "Dollar Banknote",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dollar-banknote_1f4b5.png",
            sign = "\uD83D\uDCB5", // 💵
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13134386),
            url = "https://emojipedia.org/dollar-banknote/"
        ),
        Item(
            id = 111111111,
            name = "Pouting Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pouting-cat_1f63e.png",
            sign = "\uD83D\uDE3E", // 😾
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13092515),
            url = "https://emojipedia.org/pouting-cat/"
        ),
        Item(
            id = 111111111,
            name = "Grinning Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-cat_1f63a.png",
            sign = "\uD83D\uDE3A", // 😺
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13073544),
            url = "https://emojipedia.org/grinning-cat/"
        ),
        Item(
            id = 111111111,
            name = "Small Blue Diamond",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/small-blue-diamond_1f539.png",
            sign = "\uD83D\uDD39", // 🔹
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(13007925),
            url = "https://emojipedia.org/small-blue-diamond/"
        ),
        Item(
            id = 111111111,
            name = "Panda",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/panda_1f43c.png",
            sign = "\uD83D\uDC3C", // 🐼
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12776770),
            url = "https://emojipedia.org/panda/"
        ),
        Item(
            id = 111111111,
            name = "Guitar",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/guitar_1f3b8.png",
            sign = "\uD83C\uDFB8", // 🎸
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12748109),
            url = "https://emojipedia.org/guitar/"
        ),
        Item(
            id = 111111111,
            name = "Cigarette",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cigarette_1f6ac.png",
            sign = "\uD83D\uDEAC", // 🚬
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12688631),
            url = "https://emojipedia.org/cigarette/"
        ),
        Item(
            id = 111111111,
            name = "Watermelon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/watermelon_1f349.png",
            sign = "\uD83C\uDF49", // 🍉
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12656067),
            url = "https://emojipedia.org/watermelon/"
        ),
        Item(
            id = 111111111,
            name = "Right Arrow Curving Down",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow-curving-down_2935-fe0f.png",
            sign = "⤵️",
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12608552),
            url = "https://emojipedia.org/right-arrow-curving-down/"
        ),
        Item(
            id = 111111111,
            name = "Laptop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/laptop_1f4bb.png",
            sign = "\uD83D\uDCBB", // 💻
            backgroundColor = ItemBackgroundPurple,
            number = calculateMonthAverage(12526043),
            url = "https://emojipedia.org/laptop/"
        ),































//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),
//        Item(
//            id = 111111111,
//            name = "name",
//            imageUrl = "url",
//            sign = "sign", //
//            backgroundColor = ItemBackgroundPurple,
//            number = calculateMonthAverage(number),
//            url = "url"
//        ),














//        Item(
//            id = 5,
//            name = "Rolling on the Floor Laughing Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rolling-on-the-floor-laughing_1f923.png",
//            sign = "\uD83E\uDD23", // 🤣
//            backgroundColor = Color.Blue,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),

//        Item(
//            id = 14,
//            name = "Smiling Face with Hearts",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-hearts_1f970.png",
//            sign = "\uD83E\uDD70", // 🥰
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),


//        Item(
//            id = 17,
//            name = "Face with Rolling Eyes",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-rolling-eyes_1f644.png",
//            sign = "\uD83D\uDE44", // 🙄
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),


//        Item(
//            id = 24,
//            name = "Pleading Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pleading-face_1f97a.png",
//            sign = "\uD83E\uDD7A", // 🥺
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),

//        Item(
//            id = 26,
//            name = "Hugging Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hugging-face_1f917.png",
//            sign = "\uD83E\uDD17", // 🤗
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),

//        Item(
//            id = 30,
//            name = "Person Facepalming",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-facepalming_1f926.png",
//            sign = "\uD83E\uDD26", // 🤦
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),
//        Item(
//            id = 31,
//            name = "Thinking Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thinking-face_1f914.png",
//            sign = "\uD83E\uDD14", // 🤔
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),

//        Item( // TODO remove
//            id = 33,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = 600
//        ),

//        Item(
//            id = 38,
//            name = "Face with Hand Over Mouth",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-hand-over-mouth_1f92d.png",
//            sign = "\uD83E\uDD2D", // 🤭
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths
//        ),




//        Item(
//            id = 44,
//            name = "Zany Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zany-face_1f92a.png",
//            sign = "\uD83E\uDD2A", // 🤪
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/zany-face/"
//        ),
//        Item(
//            id = 46,
//            name = "Heart Suit",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-suit_2665-fe0f.png",
//            sign = "♥️",
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/heart-suit/"
//        ),
//        Item(
//            id = 48,
//            name = "Person Shrugging",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-shrugging_1f937.png",
//            sign = "\uD83E\uDD37", // 🤷
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/person-shrugging/"
//        ),



//        Item(
//            id = 58,
//            name = "Slightly Smiling Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/slightly-smiling-face_1f642.png",
//            sign = "\uD83D\uDE42", // 🙂
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/slightly-smiling-face/"
//        ),

//        Item(
//            id = 61,
//            name = "Upside-Down Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/upside-down-face_1f643.png",
//            sign = "\uD83D\uDE43", // 🙃
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/upside-down-face/"
//        ),


//        Item( // TODO remove
//            id = 64,
//            name = "Name",
//            imageUrl = "url",
//            sign = "sign", // 🤣
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "url"
//        ),
//        Item(
//            id = 66,
//            name = "Drooling Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/drooling-face_1f924.png",
//            sign = "\uD83E\uDD24", // 🤤
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/drooling-face/"
//        ),
//        Item( // TODO don't use
//            id = 67,
//            name = "Middle Finger",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/middle-finger_1f595.png",
//            sign = "\uD83D\uDD95", // 🖕
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/middle-finger/"
//        ),
//        Item(
//            id = 68,
//            name = "Black Heart",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-heart_1f5a4.png",
//            sign = "\uD83D\uDDA4", // 🖤
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/black-heart/"
//        ),
//        Item(
//            id = 69,
//            name = "Star-Struck",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/star-struck_1f929.png",
//            sign = "\uD83E\uDD29", // 🤩
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/star-struck/"
//        ),

//        Item(
//            id = 75,
//            name = "Heart Exclamation",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-exclamation_2763-fe0f.png",
//            sign = "❣️",
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/heart-exclamation/"
//        ),



//        Item(
//            id = 78,
//            name = "Partying Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/partying-face_1f973.png",
//            sign = "\uD83E\uDD73", // 🥳
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/partying-face/"
//        ),
//        Item(
//            id = 79,
//            name = "Frowning Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/frowning-face_2639-fe0f.png",
//            sign = "☹️",
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/frowning-face/"
//        ),
//        Item(
//            id = 92,
//            name = "Crossed Fingers",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crossed-fingers_1f91e.png",
//            sign = "\uD83E\uDD1E", // 🤞
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/crossed-fingers/"
//        ),


//        Item(
//            id = 96,
//            name = "Nerd Face",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nerd-face_1f913.png",
//            sign = "\uD83E\uDD13", // 🤓
//            backgroundColor = ItemBackgroundPurple,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/nerd-face/"
//        ),
    )
}
