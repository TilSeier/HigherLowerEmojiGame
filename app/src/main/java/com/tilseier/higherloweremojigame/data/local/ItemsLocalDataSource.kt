package com.tilseier.higherloweremojigame.data.local

import com.tilseier.higherloweremojigame.extantions.*
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.ui.theme.*

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
    private val socialMultiplier = 3 // 3 // Tweeter + Facebook + Instagram
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
            backgroundColor = ItemBackgroundDarkPurple,
            number = calculateMonthAverage(3_545_593_820), // (calculateMonthAverage(3_545_593_820) / daysFromStartOfStatistic) * countOfAverageMonths // + 198_953
            url = "https://emojipedia.org/face-with-tears-of-joy/"
        ),
        Item(
            id = 2,
            name = "Red Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/red-heart_2764-fe0f.png",
            sign = "❤️️",
            backgroundColor = ItemBackgroundOrange,
            number = calculateMonthAverage(1_844_458_767), // (1_844_458_767 / daysFromStartOfStatistic).toLong() * countOfAverageMonths  // + 106_929
            url = "https://emojipedia.org/red-heart/"
        ),
        Item(
            id = 3,
            name = "Face Blowing a Kiss",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-blowing-a-kiss_1f618.png",
            sign = "\uD83D\uDE18", // 😘
            backgroundColor = ItemBackgroundRed,
            number = calculateMonthAverage(1_627_182_948), // far-fetched
            url = "https://emojipedia.org/face-blowing-a-kiss/"
        ),
        Item(
            id = 4,
            name = "Smiling Face with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-heart-eyes_1f60d.png",
            sign = "\uD83D\uDE0D", // 😍
            backgroundColor = ItemBackgroundRed,
            number = calculateMonthAverage(1_597_984_273), // far-fetched
            url = "https://emojipedia.org/smiling-face-with-heart-eyes/"
        ),
        Item( // TODO remove
            id = 64,
            name = "Rolling on the Floor Laughing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rolling-on-the-floor-laughing_1f923.png",
            sign = "\uD83E\uDD23", // 🤣
            backgroundColor = null,
            number = calculateMonthAverage(1_523_652_156), // far-fetched
            url = "https://emojipedia.org/rolling-on-the-floor-laughing/"
        ),
        Item(
            id = 6,
            name = "Loudly Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/loudly-crying-face_1f62d.png",
            sign = "\uD83D\uDE2D", // 😭
            backgroundColor = ItemBackgroundLightGreen,
            number = calculateMonthAverage(1_505_548_763), // (1505548763 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/loudly-crying-face/"
        ),
        Item(
            id = 7,
            name = "Thumbs Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thumbs-up_1f44d.png",
            sign = "\uD83D\uDC4D", // 👍
            backgroundColor = null,
            number = calculateMonthAverage(1_323_832_271), // far-fetched
            url = "https://emojipedia.org/thumbs-up/"
        ),
        Item(
            id = 8,
            name = "Smiling Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-smiling-eyes_1f60a.png",
            sign = "\uD83D\uDE0A", // 😊
            backgroundColor = ItemBackgroundLightPurple,
            number = calculateMonthAverage(1_186_282_275), // far-fetched
            url = "https://emojipedia.org/smiling-face-with-smiling-eyes/"
        ),
        Item(
            id = 9,
            name = "Kissing Lips",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kiss-mark_1f48b.png",
            sign = "\uD83D\uDC8B", // 💋
            backgroundColor = null,
            number = calculateMonthAverage(976_456_234), // (130991975 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/kiss-mark/"
        ),
        Item(
            id = 10,
            name = "Grinning Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-smiling-eyes_1f604.png",
            sign = "\uD83D\uDE04", // 😄
            backgroundColor = null,
            number = calculateMonthAverage(896_873_873) // far-fetched
        ),
        Item(
            id = 14,
            name = "Smiling Face with Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-hearts_1f970.png",
            sign = "\uD83E\uDD70", // 🥰
            backgroundColor = null,
            number = calculateMonthAverage(776_632_829), // far-fetched
            url = "https://emojipedia.org/smiling-face-with-hearts/"
        ),
        Item(
            id = 11,
            name = "Folded Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/folded-hands_1f64f.png",
            sign = "\uD83D\uDE4F", // 🙏
            backgroundColor = null,
            number = calculateMonthAverage(751_843_958), // far-fetched
            url = "https://emojipedia.org/folded-hands/"
        ),
        Item(
            id = 12,
            name = "Grinning Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-sweat_1f605.png",
            sign = "\uD83D\uDE05", // 😅
            backgroundColor = null,
            number = calculateMonthAverage(721_473_182), // far-fetched
            url = "https://emojipedia.org/grinning-face-with-sweat/"
        ),
        Item(
            id = 15,
            name = "See-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/see-no-evil-monkey_1f648.png",
            sign = "\uD83D\uDE48", // 🙈
            backgroundColor = null,
            number = calculateMonthAverage(703_832_544), // far-fetched
            url = "https://emojipedia.org/see-no-evil-monkey/"
        ),
        Item(
            id = 13,
            name = "Smiling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face_263a-fe0f.png",
            sign = "☺️",
            backgroundColor = null,
            number = calculateMonthAverage(687_374_982), // far-fetched
            url = "https://emojipedia.org/smiling-face/"
        ),
        Item(
            id = 16,
            name = "Winking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face_1f609.png",
            sign = "\uD83D\uDE09", // 😉
            backgroundColor = null,
            number = calculateMonthAverage(626_847_198), // far-fetched
            url = "https://emojipedia.org/winking-face/"
        ),
        Item(
            id = 17,
            name = "Face with Rolling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-rolling-eyes_1f644.png",
            sign = "\uD83D\uDE44", // 🙄
            backgroundColor = null,
            number = calculateMonthAverage(604_928_281), // far-fetched
            url = "https://emojipedia.org/face-with-rolling-eyes/"
        ),
        Item(
            id = 18,
            name = "Pensive Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pensive-face_1f614.png",
            sign = "\uD83D\uDE14", // 😔
            backgroundColor = ItemBackgroundOrange,
            number = calculateMonthAverage(597_938_876), // far-fetched
            url = "https://emojipedia.org/pensive-face/"
        ),
        Item(
            id = 24,
            name = "Pleading Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pleading-face_1f97a.png",
            sign = "\uD83E\uDD7A", // 🥺
            backgroundColor = null,
            number = calculateMonthAverage(597_938_876), // far-fetched
            url = "https://emojipedia.org/pleading-face/"
        ),
        Item(
            id = 19,
            name = "Winking Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/winking-face-with-tongue_1f61c.png",
            sign = "\uD83D\uDE1C", // 😜
            backgroundColor = null,
            number = calculateMonthAverage(594_643_764), // far-fetched
            url = "https://emojipedia.org/winking-face-with-tongue/"
        ),
        Item(
            id = 20,
            name = "Clapping Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clapping-hands_1f44f.png",
            sign = "\uD83D\uDC4F", // 👏
            backgroundColor = null,
            number = calculateMonthAverage(590_523_123), // far-fetched
            url = "https://emojipedia.org/clapping-hands/"
        ),
        Item(
            id = 21,
            name = "Smirking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smirking-face_1f60f.png",
            sign = "\uD83D\uDE0F", // 😏
            backgroundColor = null,
            number = calculateMonthAverage(589_999_982), // far-fetched
            url = "https://emojipedia.org/smirking-face/"
        ),
        Item(
            id = 22,
            name = "Weary Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/weary-face_1f629.png",
            sign = "\uD83D\uDE29", // 😩
            backgroundColor = null,
            number = calculateMonthAverage(585_734_644), // far-fetched
            url = "https://emojipedia.org/weary-face/"
        ),
        Item(
            id = 23,
            name = "Flushed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flushed-face_1f633.png",
            sign = "\uD83D\uDE33", // 😳
            backgroundColor = null,
            number = calculateMonthAverage(582_134_855), // far-fetched
            url = "https://emojipedia.org/flushed-face/"
        ),
        Item(
            id = 25,
            name = "Two Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/two-hearts_1f495.png",
            sign = "\uD83D\uDC95", // 💕
            backgroundColor = ItemBackgroundDarkOrange,
            number = calculateMonthAverage(579_737_470),
            url = "https://emojipedia.org/two-hearts/"
        ),
        Item(
            id = 26,
            name = "Hugging Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hugging-face_1f917.png",
            sign = "\uD83E\uDD17", // 🤗
            backgroundColor = null,
            number = calculateMonthAverage(573_982_482), // far-fetched
        ),
        Item(
            id = 27,
            name = "OK Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ok-hand_1f44c.png",
            sign = "\uD83D\uDC4C", // 👌
            backgroundColor = null,
            number = calculateMonthAverage(568_293_623), // far-fetched
            url = "https://emojipedia.org/ok-hand/"
        ),
        Item(
            id = 34,
            name = "Blue Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/blue-heart_1f499.png",
            sign = "\uD83D\uDC99", // 💙
            backgroundColor = null,
            number = calculateMonthAverage(565_234_455), // far-fetched
            url = "https://emojipedia.org/blue-heart/"
        ),
        Item(
            id = 29,
            name = "Sparkling Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkling-heart_1f496.png",
            sign = "\uD83D\uDC96", // 💖
            backgroundColor = null,
            number = calculateMonthAverage(562_853_542), // far-fetched
            url = "https://emojipedia.org/sparkling-heart/"
        ),
        Item(
            id = 30,
            name = "Person Facepalming",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-facepalming_1f926.png",
            sign = "\uD83E\uDD26", // 🤦
            backgroundColor = null,
            number = calculateMonthAverage(562_853_542), // far-fetched
            url = "https://emojipedia.org/person-facepalming/"
        ),
        Item(
            id = 32,
            name = "Grinning Squinting Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-squinting-face_1f606.png",
            sign = "\uD83D\uDE06", // 😆
            backgroundColor = null,
            number = calculateMonthAverage(557_372_948),
            url = "https://emojipedia.org/grinning-squinting-face/"
        ),
        Item(
            id = 31,
            name = "Thinking Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thinking-face_1f914.png",
            sign = "\uD83E\uDD14", // 🤔
            backgroundColor = null,
            number = calculateMonthAverage(541654265), // far-fetched
            url = "https://emojipedia.org/thinking-face/"
        ),
        Item(
            id = 34,
            name = "Purple Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/purple-heart_1f49c.png",
            sign = "\uD83D\uDC9C", // 💜
            backgroundColor = null,
            number = calculateMonthAverage(528493823), // (327962144 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/purple-heart/"
        ),
        Item(
            id = 36,
            name = "Unamused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/unamused-face_1f612.png",
            sign = "\uD83D\uDE12", // 😒
            backgroundColor = null,
            number = calculateMonthAverage(516209329), // (556209329 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/unamused-face/"
        ),
        Item(
            id = 35,
            name = "Face Savoring Food",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-savoring-food_1f60b.png",
            sign = "\uD83D\uDE0B", // 😋
            backgroundColor = null,
            number = calculateMonthAverage(499984832), // far-fetched
            url = "https://emojipedia.org/face-savoring-food/"
        ),
        Item(
            id = 38,
            name = "Face with Hand Over Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-hand-over-mouth_1f92d.png",
            sign = "\uD83E\uDD2D", // 🤭
            backgroundColor = null,
            number = calculateMonthAverage(495729874), // far-fetched
            url = "https://emojipedia.org/face-with-hand-over-mouth/"
        ),
        Item(
            id = 37,
            name = "Ring",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ring_1f48d.png",
            sign = "\uD83D\uDC8D", // 💍
            backgroundColor = null,
            number = calculateMonthAverage(491432523), // far-fetched
            url = "https://emojipedia.org/ring/"
        ),
        Item(
            id = 39,
            name = "Relieved Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/relieved-face_1f60c.png",
            sign = "\uD83D\uDE0C", // 😌
            backgroundColor = null,
            number = calculateMonthAverage(478_341_523), // (336754040 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
            url = "https://emojipedia.org/relieved-face/"
        ),
        Item(
            id = 41,
            name = "Party Popper",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/party-popper_1f389.png",
            sign = "\uD83C\uDF89", // 🎉
            backgroundColor = null,
            number = calculateMonthAverage(464_523_984) // (136805390 / daysFromStartOfStatistic).toLong() * countOfAverageMonths
        ),
        Item(
            id = 43,
            name = "Fire",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fire_1f525.png",
            sign = "\uD83D\uDD25", // 🔥
            backgroundColor = null,
            number = calculateMonthAverage(444_523_984), // far-fetched
            url = "https://emojipedia.org/fire/"
        ),
        Item(
            id = 44,
            name = "Zany Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zany-face_1f92a.png",
            sign = "\uD83E\uDD2A", // 🤪
            backgroundColor = null,
            number = calculateMonthAverage(439_634_235), // far-fetched
            url = "https://emojipedia.org/zany-face/"
        ),
        Item(
            id = 42,
            name = "Enraged Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pouting-face_1f621.png",
            sign = "\uD83D\uDE21", // 😡
            backgroundColor = null,
            number = calculateMonthAverage(434_655_345), // far-fetched
            url = "https://emojipedia.org/pouting-face/"
        ),
        Item(
            id = 45,
            name = "Growing Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/growing-heart_1f497.png",
            sign = "\uD83D\uDC97", // 💗
            backgroundColor = null,
            number = calculateMonthAverage(431_534_623), // far-fetched
            url = "https://emojipedia.org/growing-heart/"
        ),
        Item(
            id = 51,
            name = "Broken Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/broken-heart_1f494.png",
            sign = "\uD83D\uDC94", // 💔
            backgroundColor = null,
            number = calculateMonthAverage(428_534_623), // far-fetched
            url = "https://emojipedia.org/broken-heart/"
        ),
        Item(
            id = 48,
            name = "Person Shrugging",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-shrugging_1f937.png",
            sign = "\uD83E\uDD37", // 🤷
            backgroundColor = null,
            number = calculateMonthAverage(426_534_623), // far-fetched
            url = "https://emojipedia.org/person-shrugging/"
        ),
        Item(
            id = 47,
            name = "Face Screaming in Fear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-screaming-in-fear_1f631.png",
            sign = "\uD83D\uDE31", // 😱
            backgroundColor = null,
            number = calculateMonthAverage(424_534_623), // far-fetched
            url = "https://emojipedia.org/face-screaming-in-fear/"
        ),
        Item(
            id = 50,
            name = "Smiling Face with Sunglasses",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-sunglasses_1f60e.png",
            sign = "\uD83D\uDE0E", // 😎
            backgroundColor = null,
            number = calculateMonthAverage(422_534_623), // far-fetched
            url = "https://emojipedia.org/smiling-face-with-sunglasses/"
        ),
        Item(
            id = 65,
            name = "Grinning Face with Big Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face-with-big-eyes_1f603.png",
            sign = "\uD83D\uDE03", // 😃
            backgroundColor = null,
            number = calculateMonthAverage(418_534_623), // (136255374 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/grinning-face-with-big-eyes/"
        ),

        // START 412_534_623 -> 60_336_232

        Item(
            id = 56,
            name = "Rose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rose_1f339.png",
            sign = "\uD83C\uDF39", // 🌹
            backgroundColor = null,
            number = calculateMonthAverage(412_534_623), // far-fetched
            url = "https://emojipedia.org/rose/"
        ),
        Item(
            id = 58,
            name = "Slightly Smiling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/slightly-smiling-face_1f642.png",
            sign = "\uD83D\uDE42", // 🙂
            backgroundColor = null,
            number = calculateMonthAverage(402_534_623), // far-fetched
            url = "https://emojipedia.org/slightly-smiling-face/"
        ),
        Item(
            id = 53,
            name = "Flexed Biceps",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flexed-biceps_1f4aa.png",
            sign = "\uD83D\uDCAA", // 💪
            backgroundColor = null,
            number = calculateMonthAverage(398_534_623), // far-fetched
            url = "https://emojipedia.org/flexed-biceps/"
        ),
        Item(
            id = 54,
            name = "Crying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crying-face_1f622.png",
            sign = "\uD83D\uDE22", // 😢
            backgroundColor = null,
            number = calculateMonthAverage(391_534_623), // far-fetched
            url = "https://emojipedia.org/crying-face/"
        ),
        Item(
            id = 52,
            name = "Revolving Hearts",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/revolving-hearts_1f49e.png",
            sign = "\uD83D\uDC9E", // 💞
            backgroundColor = null,
            number = calculateMonthAverage(391_534_623), // far-fetched
            url = "https://emojipedia.org/revolving-hearts/"
        ),
        Item(
            id = 55,
            name = "Raising Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raising-hands_1f64c.png",
            sign = "\uD83D\uDE4C", // 🙌
            backgroundColor = null,
            number = calculateMonthAverage(386_534_623), // far-fetched
            url = "https://emojipedia.org/raising-hands/"
        ),
        Item(
            id = 57,
            name = "Heart with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-arrow_1f498.png",
            sign = "\uD83D\uDC98", // 💘
            backgroundColor = null,
            number = calculateMonthAverage(374_534_623), // far-fetched
            url = "https://emojipedia.org/heart-with-arrow/"
        ),
        Item(
            id = 59,
            name = "Kissing Face with Closed Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face-with-closed-eyes_1f61a.png",
            sign = "\uD83D\uDE1A", // 😚
            backgroundColor = null,
            number = calculateMonthAverage(371_534_623), // far-fetched
            url = "https://emojipedia.org/kissing-face-with-closed-eyes/"
        ),
        Item(
            id = 60,
            name = "Yellow Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/yellow-heart_1f49b.png",
            sign = "\uD83D\uDC9B", // 💛
            backgroundColor = null,
            number = calculateMonthAverage(370_534_623), // far-fetched
            url = "https://emojipedia.org/yellow-heart/"
        ),
        Item(
            id = 61,
            name = "Upside-Down Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/upside-down-face_1f643.png",
            sign = "\uD83D\uDE43", // 🙃
            backgroundColor = null,
            number = calculateMonthAverage(369_504_623), // far-fetched
            url = "https://emojipedia.org/upside-down-face/"
        ),
        Item(
            id = 66,
            name = "Drooling Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/drooling-face_1f924.png",
            sign = "\uD83E\uDD24", // 🤤
            backgroundColor = null,
            number = calculateMonthAverage(367_504_623), // far-fetched
            url = "https://emojipedia.org/drooling-face/"
        ),
        Item(
            id = 62,
            name = "Squinting Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/squinting-face-with-tongue_1f61d.png",
            sign = "\uD83D\uDE1D", // 😝
            backgroundColor = null,
            number = calculateMonthAverage(363_504_623), // far-fetched
            url = "https://emojipedia.org/squinting-face-with-tongue/"
        ),
        Item(
            id = 63,
            name = "Smiling Face with Halo",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-halo_1f607.png",
            sign = "\uD83D\uDE07", // 😇
            backgroundColor = null,
            number = calculateMonthAverage(360_504_623), // far-fetched
            url = "https://emojipedia.org/smiling-face-with-halo/"
        ),
        Item(
            id = 69,
            name = "Star-Struck",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/star-struck_1f929.png",
            sign = "\uD83E\uDD29", // 🤩
            backgroundColor = null,
            number = calculateMonthAverage(351_504_623), // far-fetched
            url = "https://emojipedia.org/star-struck/"
        ),
        Item(
            id = 70,
            name = "Grimacing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grimacing-face_1f62c.png",
            sign = "\uD83D\uDE2C", // 😬
            backgroundColor = null,
            number = calculateMonthAverage(346_504_623), // far-fetched
            url = "https://emojipedia.org/grimacing-face/"
        ),
        Item(
            id = 72,
            name = "Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eyes_1f440.png",
            sign = "\uD83D\uDC40", // 👀
            backgroundColor = null,
            number = calculateMonthAverage(345_504_623), // far-fetched
            url = "https://emojipedia.org/eyes/"
        ),
        Item(
            id = 75,
            name = "Heart Exclamation",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-exclamation_2763-fe0f.png",
            sign = "❣️",
            backgroundColor = null,
            number = calculateMonthAverage(343_504_623), // far-fetched
            url = "https://emojipedia.org/heart-exclamation/"
        ),
        Item(
            id = 78,
            name = "Partying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/partying-face_1f973.png",
            sign = "\uD83E\uDD73", // 🥳
            backgroundColor = null,
            number = calculateMonthAverage(331_504_623), // far-fetched
            url = "https://emojipedia.org/partying-face/"
        ),
        Item(
            id = 73,
            name = "Sleeping Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sleeping-face_1f634.png",
            sign = "\uD83D\uDE34", // 😴
            backgroundColor = null,
            number = calculateMonthAverage(331_504_623), // (190059223 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/sleeping-face/"
        ),
        Item(
            id = 74,
            name = "Grinning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-face_1f600.png",
            sign = "\uD83D\uDE00", // 😀
            backgroundColor = null,
            number = calculateMonthAverage(311_504_623), // (154844887 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/grinning-face/"
        ),
        Item(
            id = 77,
            name = "Birthday Cake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/birthday-cake_1f382.png",
            sign = "\uD83C\uDF82", // 🎂
            backgroundColor = null,
            number = calculateMonthAverage(310_524_523), // (36846549 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/birthday-cake/"
        ),
        Item(
            id = 76,
            name = "Disappointed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/disappointed-face_1f61e.png",
            sign = "\uD83D\uDE1E", // 😞
            backgroundColor = null,
            number = calculateMonthAverage(305_524_523), // (190927553 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/disappointed-face/"
        ),
        Item(
            id = 79,
            name = "Frowning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/frowning-face_2639-fe0f.png",
            sign = "☹️",
            backgroundColor = null,
            number = calculateMonthAverage(301_524_523),
            url = "https://emojipedia.org/frowning-face/"
        ),
        Item(
            id = 80,
            name = "Smiling Face with Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-face-with-horns_1f608.png",
            sign = "\uD83D\uDE08", // 😈
            backgroundColor = null,
            number = calculateMonthAverage(298_524_523), // (140185189 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/smiling-face-with-horns/"
        ),
        Item( // TODO check the number
            id = 82,
            name = "Tired Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tired-face_1f62b.png",
            sign = "\uD83D\uDE2B", // 😫
            backgroundColor = null,
            number = calculateMonthAverage(297_524_523), // (533669396 / daysFromStartOfStatistic).toLong() * countOfAverageMonths, // ?
            url = "https://emojipedia.org/tired-face/"
        ),
        Item(
            id = 84,
            name = "Cat with Tears of Joy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-with-tears-of-joy_1f639.png",
            sign = "\uD83D\uDE39", // 😹
            backgroundColor = null,
            number = calculateMonthAverage(285_524_523),
            url = "https://emojipedia.org/cat-with-tears-of-joy/"
        ),
        Item(
            id = 87,
            name = "Sparkles",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sparkles_2728.png",
            sign = "✨",
            backgroundColor = null,
            number = calculateMonthAverage(285_345_865), // (342870849 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/sparkles/"
        ),
        Item(
            id = 81,
            name = "Speak-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speak-no-evil-monkey_1f64a.png",
            sign = "\uD83D\uDE4A", // 🙊
            backgroundColor = null,
            number = calculateMonthAverage(283_345_865), // (112881939 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/speak-no-evil-monkey/"
        ),
        Item(
            id = 83,
            name = "Victory Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/victory-hand_270c-fe0f.png",
            sign = "✌️",
            backgroundColor = null,
            number = calculateMonthAverage(267_345_865), // (199006983 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/victory-hand/"
        ),
        Item(
            id = 85,
            name = "Woman Dancing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman-dancing_1f483.png",
            sign = "\uD83D\uDC83", // 💃
            backgroundColor = null,
            number = calculateMonthAverage(253_345_865), // (54509681 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/woman-dancing/"
        ),
            Item(
            id = 86,
            name = "Expressionless Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/expressionless-face_1f611.png",
            sign = "\uD83D\uDE11", // 😑
            backgroundColor = null,
            number = calculateMonthAverage(250_345_865), // (192458032 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/expressionless-face/"
        ),
        Item(
            id = 91,
            name = "Hundred Points",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hundred-points_1f4af.png",
            sign = "\uD83D\uDCAF", // 💯
            backgroundColor = null,
            number = calculateMonthAverage(247_345_865), // (253512430 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/hundred-points/"
        ),
        Item(
            id = 88,
            name = "Confused Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confused-face_1f615.png",
            sign = "\uD83D\uDE15", // 😕
            backgroundColor = null,
            number = calculateMonthAverage(246_345_865), // (174072565 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/confused-face/"
        ),
        Item(
            id = 89,
            name = "Beating Heart",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/beating-heart_1f493.png",
            sign = "\uD83D\uDC93", // 💓
            backgroundColor = null,
            number = calculateMonthAverage(240_345_865), // (112119536 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/beating-heart/"
        ),
        Item(
            id = 92,
            name = "Crossed Fingers",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crossed-fingers_1f91e.png",
            sign = "\uD83E\uDD1E", // 🤞
            backgroundColor = null,
            number = calculateMonthAverage(236_345_865), // far-fetched
            url = "https://emojipedia.org/crossed-fingers/"
        ),
        Item(
            id = 90,
            name = "Face with Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-tongue_1f61b.png",
            sign = "\uD83D\uDE1B", // 😛
            backgroundColor = null,
            number = calculateMonthAverage(233_345_865), // far-fetched
            url = "https://emojipedia.org/face-with-tongue/"
        ),
        Item(
            id = 94,
            name = "Smiling Cat with Heart-Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/smiling-cat-with-heart-eyes_1f63b.png",
            sign = "\uD83D\uDE3B", // 😻
            backgroundColor = null,
            number = calculateMonthAverage(227_345_865), // far-fetched
            url = "https://emojipedia.org/smiling-cat-with-heart-eyes/"
        ),
        Item(
            id = 95,
            name = "Skull",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/skull_1f480.png",
            sign = "\uD83D\uDC80", // 💀
            backgroundColor = null,
            number = calculateMonthAverage(224_345_865), // far-fetched
            url = "https://emojipedia.org/skull/"
        ),

        Item(
            id = 93,
            name = "Sweat Droplets",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sweat-droplets_1f4a6.png",
            sign = "\uD83D\uDCA6", // 💦
            backgroundColor = null,
            number = calculateMonthAverage(220_345_865),
            url = "https://emojipedia.org/sweat-droplets/"
        ),
        Item(
            id = 98,
            name = "Waving Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/waving-hand_1f44b.png",
            sign = "\uD83D\uDC4B", // 👋
            backgroundColor = null,
            number = calculateMonthAverage(218_345_865), // (82797328 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/waving-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Rocket",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rocket_1f680.png",
            sign = "\uD83D\uDE80", // 🚀
            backgroundColor = null,
            number = calculateMonthAverage(217_845_865),
            url = "https://emojipedia.org/rocket/"
        ),
        Item(
            id = 96,
            name = "Nerd Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nerd-face_1f913.png",
            sign = "\uD83E\uDD13", // 🤓
            backgroundColor = null,
            number = calculateMonthAverage(216_345_865), // far-fetched
            url = "https://emojipedia.org/nerd-face/"
        ),
        Item(
            id = 97,
            name = "Tongue",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tongue_1f445.png",
            sign = "\uD83D\uDC45", // 👅
            backgroundColor = null,
            number = calculateMonthAverage(210_345_865), // (46718345 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/tongue/"
        ),
        Item(
            id = 100,
            name = "Neutral Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/neutral-face_1f610.png",
            sign = "\uD83D\uDE10", // 😐
            backgroundColor = null,
            number = calculateMonthAverage(208_345_865), // (180220835 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/neutral-face/"
        ),
        Item(
            id = 99,
            name = "Heart with Ribbon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-with-ribbon_1f49d.png",
            sign = "\uD83D\uDC9D", // 💝
            backgroundColor = null,
            number = calculateMonthAverage(201_345_865), // (30628968 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/heart-with-ribbon/"
        ),
        Item(
            id = 102,
            name = "Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/balloon_1f388.png",
            sign = "\uD83C\uDF88", // 🎈
            backgroundColor = null,
            number = calculateMonthAverage(198_345_865), // (40831082 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/balloon/"
        ),
        Item(
            id = 101,
            name = "Oncoming Fist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/oncoming-fist_1f44a.png",
            sign = "\uD83D\uDC4A", // 👊
            backgroundColor = null,
            number = calculateMonthAverage(197_345_865), // (93617935 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/oncoming-fist/"
        ),
        Item(
            id = 104,
            name = "Cherry Blossom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cherry-blossom_1f338.png",
            sign = "\uD83C\uDF38", // 🌸
            backgroundColor = null,
            number = calculateMonthAverage(197_145_865), // (138259263 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/cherry-blossom/"
        ),
        Item(
            id = 103,
            name = "Face with Steam From Nose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-steam-from-nose_1f624.png",
            sign = "\uD83D\uDE24", // 😤
            backgroundColor = null,
            number = calculateMonthAverage(196_945_865), // (123544220 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/face-with-steam-from-nose/"
        ),
        Item(
            id = 105,
            name = "Wrapped Gift",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wrapped-gift_1f381.png",
            sign = "\uD83C\uDF81", // 🎁
            backgroundColor = null,
            number = calculateMonthAverage(195_945_865), // (41674470 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/wrapped-gift/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sun",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sun_2600-fe0f.png",
            sign = "☀️",
            backgroundColor = null,
            number = calculateMonthAverage(195_545_865),
            url = "https://emojipedia.org/sun/"
        ),
        Item(
            id = 107,
            name = "Confetti Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confetti-ball_1f38a.png",
            sign = "\uD83C\uDF8A", // 🎊
            backgroundColor = null,
            number = calculateMonthAverage(194_845_865), // (37054422 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/confetti-ball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Downcast Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/downcast-face-with-sweat_1f613.png",
            sign = "\uD83D\uDE13", // 😓
            backgroundColor = null,
            number = calculateMonthAverage(193_845_865),
            url = "https://emojipedia.org/downcast-face-with-sweat/"
        ),
        Item(
            id = 106,
            name = "Pile of Poop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pile-of-poo_1f4a9.png",
            sign = "\uD83D\uDCA9", // 💩
            backgroundColor = null,
            number = calculateMonthAverage(190_845_865), // (50927535 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
            url = "https://emojipedia.org/pile-of-poo/"
        ),
        Item(
            id = 107,
            name = "Slightly Frowning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/slightly-frowning-face_1f641.png",
            sign = "\uD83D\uDE41", // 🙁
            backgroundColor = null,
            number = calculateMonthAverage(185_845_865), // far-fetched
            url = "https://emojipedia.org/slightly-frowning-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sleepy Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sleepy-face_1f62a.png",
            sign = "\uD83D\uDE2A", // 😪
            backgroundColor = null,
            number = calculateMonthAverage(185_245_865),
            url = "https://emojipedia.org/sleepy-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Bouquet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bouquet_1f490.png",
            sign = "\uD83D\uDC90", // 💐
            backgroundColor = null,
            number = calculateMonthAverage(183_245_865),
            url = "https://emojipedia.org/bouquet/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Shushing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/shushing-face_1f92b.png",
            sign = "\uD83E\uDD2B", // 🤫
            backgroundColor = null,
            number = calculateMonthAverage(180_245_865),
            url = "https://emojipedia.org/shushing-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Exploding Head",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/exploding-head_1f92f.png",
            sign = "\uD83E\uDD2F", // 🤯
            backgroundColor = null,
            number = calculateMonthAverage(180_145_865),
            url = "https://emojipedia.org/exploding-head/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Bottle with Popping Cork",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bottle-with-popping-cork_1f37e.png",
            sign = "\uD83C\uDF7E", // 🍾
            backgroundColor = null,
            number = calculateMonthAverage(179_145_865),
            url = "https://emojipedia.org/bottle-with-popping-cork/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hibiscus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hibiscus_1f33a.png",
            sign = "\uD83C\uDF3A", // 🌺
            backgroundColor = null,
            number = calculateMonthAverage(178_945_865),
            url = "https://emojipedia.org/hibiscus/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face Vomiting",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-vomiting_1f92e.png",
            sign = "\uD83E\uDD2E", // 🤮
            backgroundColor = null,
            number = calculateMonthAverage(178_545_865),
            url = "https://emojipedia.org/face-vomiting/"
        ),
        Item(
            id = 111111111, // TODO
            name = "New Moon Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/new-moon-face_1f31a.png",
            sign = "\uD83C\uDF1A", // 🌚
            backgroundColor = null,
            number = calculateMonthAverage(178_145_865),
            url = "https://emojipedia.org/new-moon-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Raising Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-raising-hand_1f64b.png",
            sign = "\uD83D\uDE4B", // 🙋
            backgroundColor = null,
            number = calculateMonthAverage(175_145_865),
            url = "https://emojipedia.org/person-raising-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Kissing Face with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face-with-smiling-eyes_1f619.png",
            sign = "\uD83D\uDE19", // 😙
            backgroundColor = null,
            number = calculateMonthAverage(174_145_865),
            url = "https://emojipedia.org/kissing-face-with-smiling-eyes/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Confounded Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/confounded-face_1f616.png",
            sign = "\uD83D\uDE16", // 😖
            backgroundColor = null,
            number = calculateMonthAverage(173_945_865),
            url = "https://emojipedia.org/confounded-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Anxious Face with Sweat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anxious-face-with-sweat_1f630.png",
            sign = "\uD83D\uDE30", // 😰
            backgroundColor = null,
            number = calculateMonthAverage(173_645_865),
            url = "https://emojipedia.org/anxious-face-with-sweat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Clinking Glasses",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clinking-glasses_1f942.png",
            sign = "\uD83E\uDD42", // 🥂
            backgroundColor = null,
            number = calculateMonthAverage(173_345_865),
            url = "https://emojipedia.org/clinking-glasses/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Nauseated Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nauseated-face_1f922.png",
            sign = "\uD83E\uDD22", // 🤢
            backgroundColor = null,
            number = calculateMonthAverage(173_145_865),
            url = "https://emojipedia.org/nauseated-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Call Me Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/call-me-hand_1f919.png",
            sign = "\uD83E\uDD19", // 🤙
            backgroundColor = null,
            number = calculateMonthAverage(171_945_865),
            url = "https://emojipedia.org/call-me-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sad but Relieved Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sad-but-relieved-face_1f625.png",
            sign = "\uD83D\uDE25", // 😥
            backgroundColor = null,
            number = calculateMonthAverage(171_545_865),
            url = "https://emojipedia.org/sad-but-relieved-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Woozy Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woozy-face_1f974.png",
            sign = "\uD83E\uDD74", // 🥴
            backgroundColor = null,
            number = calculateMonthAverage(171_245_865),
            url = "https://emojipedia.org/woozy-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Tipping Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-tipping-hand_1f481.png",
            sign = "\uD83D\uDC81", // 💁
            backgroundColor = null,
            number = calculateMonthAverage(170_145_865),
            url = "https://emojipedia.org/person-tipping-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Monocle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-monocle_1f9d0.png",
            sign = "\uD83E\uDDD0", // 🧐
            backgroundColor = null,
            number = calculateMonthAverage(168_945_865),
            url = "https://emojipedia.org/face-with-monocle/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Heart Decoration",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-decoration_1f49f.png",
//            sign = "\uD83D\uDC9F", // 💟
//            backgroundColor = null,
//            number = calculateMonthAverage(27216129),
//            url = "https://emojipedia.org/heart-decoration/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Sign of the Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sign-of-the-horns_1f918.png",
            sign = "\uD83E\uDD18", // 🤘
            backgroundColor = null,
            number = calculateMonthAverage(168_345_865),
            url = "https://emojipedia.org/sign-of-the-horns/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Money-Mouth Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/money-mouth-face_1f911.png",
            sign = "\uD83E\uDD11", // 🤑
            backgroundColor = null,
            number = calculateMonthAverage(166_745_865),
            url = "https://emojipedia.org/money-mouth-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Musical Notes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-notes_1f3b6.png",
            sign = "\uD83C\uDFB6", // 🎶
            backgroundColor = null,
            number = calculateMonthAverage(165_745_865),
            url = "https://emojipedia.org/musical-notes/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Four Leaf Clover",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/four-leaf-clover_1f340.png",
            sign = "\uD83C\uDF40", // 🍀
            backgroundColor = null,
            number = calculateMonthAverage(165_445_865),
            url = "https://emojipedia.org/four-leaf-clover/"
        ),
//        Item( // controversial emoji
//            id = 111111111, // TODO
//            name = "Clinking Beer Mugs",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clinking-beer-mugs_1f37b.png",
//            sign = "\uD83C\uDF7B", // 🍻
//            backgroundColor = null,
//            number = calculateMonthAverage(34983833),
//            url = "https://emojipedia.org/clinking-beer-mugs/"
//        ),
                Item(
            id = 111111111, // TODO
            name = "Butterfly",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/butterfly_1f98b.png",
            sign = "\uD83E\uDD8B", // 🦋
            backgroundColor = null,
            number = calculateMonthAverage(165_145_865),
            url = "https://emojipedia.org/butterfly/"
        ),
        Item(
            id = 111111111,
            name = "Backhand Index Pointing Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-up_1f446.png",
            sign = "\uD83D\uDC46", // 👆
            backgroundColor = null,
            number = calculateMonthAverage(163_945_865),
            url = "https://emojipedia.org/backhand-index-pointing-up/"
        ),
        Item(
            id = 111111111,
            name = "Clown Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clown-face_1f921.png",
            sign = "\uD83E\uDD21", // 🤡
            backgroundColor = null,
            number = calculateMonthAverage(163_445_865),
            url = "https://emojipedia.org/clown-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Persevering Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/persevering-face_1f623.png",
            sign = "\uD83D\uDE23", // 😣
            backgroundColor = null,
            number = calculateMonthAverage(161_445_865),
            url = "https://emojipedia.org/persevering-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Raised Eyebrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-raised-eyebrow_1f928.png",
            sign = "\uD83E\uDD28", // 🤨
            backgroundColor = null,
            number = calculateMonthAverage(161_145_865),
            url = "https://emojipedia.org/face-with-raised-eyebrow/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Kissing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-face_1f617.png",
            sign = "\uD83D\uDE17", // 😗
            backgroundColor = null,
            number = calculateMonthAverage(160_145_865),
            url = "https://emojipedia.org/kissing-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Thumbs Down",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thumbs-down_1f44e.png",
            sign = "\uD83D\uDC4E", // 👎
            backgroundColor = null,
            number = calculateMonthAverage(159_984_398),
            url = "https://emojipedia.org/thumbs-down/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Cross Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cross-mark_274c.png",
//            sign = "❌",
//            backgroundColor = null,
//            number = calculateMonthAverage(50184960),
//            url = "https://emojipedia.org/cross-mark/"
//        ),
//        Item( // controversial emoji
//            id = 111111111,
//            emojiId = "1F491",
//            name = "Couple with Heart",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/couple-with-heart_medium-light-skin-tone_1f491-1f3fc_1f3fc.png",
//            sign = "\uD83D\uDC91\uD83C\uDFFC", // 💑🏼
//            backgroundColor = null,
//            number = calculateMonthAverage(11832105),
//            url = "https://emojipedia.org/couple-with-heart-medium-light-skin-tone/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Cold Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cold-face_1f976.png",
            sign = "\uD83E\uDD76", // 🥶
            backgroundColor = null,
            number = calculateMonthAverage(158_684_398),
            url = "https://emojipedia.org/cold-face/"
        ),
        Item(
            id = 111111111,
            name = "Eggplant",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eggplant_1f346.png",
            sign = "\uD83C\uDF46", // 🍆
            backgroundColor = null,
            number = calculateMonthAverage(158_284_398),
            url = "https://emojipedia.org/eggplant/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Tulip",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tulip_1f337.png",
            sign = "\uD83C\uDF37", // 🌷
            backgroundColor = null,
            number = calculateMonthAverage(157_884_398),
            url = "https://emojipedia.org/tulip/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Double Exclamation Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/double-exclamation-mark_203c-fe0f.png",
//            sign = "‼️",
//            backgroundColor = null,
//            number = calculateMonthAverage(84891194),
//            url = "https://emojipedia.org/double-exclamation-mark/"
//        ),
                Item(
            id = 111111111, // TODO
            name = "Crown",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crown_1f451.png",
            sign = "\uD83D\uDC51", // 👑
            backgroundColor = null,
            number = calculateMonthAverage(157_184_398),
            url = "https://emojipedia.org/crown/"
        ),
                Item(
            id = 111111111, // TODO
            name = "Dog Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dog-face_1f436.png",
            sign = "\uD83D\uDC36", // 🐶
            backgroundColor = null,
            number = calculateMonthAverage(156_284_398),
            url = "https://emojipedia.org/dog-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Medical Mask",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-medical-mask_1f637.png",
            sign = "\uD83D\uDE37", // 😷
            backgroundColor = null,
            number = calculateMonthAverage(155_284_398),
            url = "https://emojipedia.org/face-with-medical-mask/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Star",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/star_2b50.png",
            sign = "⭐",
            backgroundColor = null,
            number = calculateMonthAverage(154_984_398),
            url = "https://emojipedia.org/star/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sneezing Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sneezing-face_1f927.png",
            sign = "\uD83E\uDD27", // 🤧
            backgroundColor = null,
            number = calculateMonthAverage(154_784_398),
            url = "https://emojipedia.org/sneezing-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Collision",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/collision_1f4a5.png",
            sign = "\uD83D\uDCA5", // 💥
            backgroundColor = null,
            number = calculateMonthAverage(154_284_398),
            url = "https://emojipedia.org/collision/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Check Mark Button",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-mark-button_2705.png",
            sign = "✅",
            backgroundColor = null,
            number = calculateMonthAverage(153_984_398),
            url = "https://emojipedia.org/check-mark-button/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Peach",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/peach_1f351.png",
            sign = "\uD83C\uDF51", // 🍑
            backgroundColor = null,
            number = calculateMonthAverage(152_984_398),
            url = "https://emojipedia.org/peach/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Rainbow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rainbow_1f308.png",
            sign = "\uD83C\uDF08", // 🌈
            backgroundColor = null,
            number = calculateMonthAverage(151_984_398),
            url = "https://emojipedia.org/rainbow/"
        ),
        Item(
            id = 111111111,
            name = "Wine Glass",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wine-glass_1f377.png",
            sign = "\uD83C\uDF77", // 🍷
            backgroundColor = null,
            number = calculateMonthAverage(150_984_398),
            url = "https://emojipedia.org/wine-glass/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Worried Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/worried-face_1f61f.png",
            sign = "\uD83D\uDE1F", // 😟
            backgroundColor = null,
            number = calculateMonthAverage(150_284_398),
            url = "https://emojipedia.org/worried-face/"
        ),
//        Item( // controversial emoji
//            id = 111111111,
//            name = "Beer Mug",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/beer-mug_1f37a.png",
//            sign = "\uD83C\uDF7A", // 🍺
//            backgroundColor = null,
//            number = calculateMonthAverage(14638604),
//            url = "https://emojipedia.org/beer-mug/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Right",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-right_1f449.png",
            sign = "\uD83D\uDC49", // 👉
            backgroundColor = null,
            number = calculateMonthAverage(149_884_398),
            url = "https://emojipedia.org/backhand-index-pointing-right/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Zipper-Mouth Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zipper-mouth-face_1f910.png",
            sign = "\uD83E\uDD10", // 🤐
            backgroundColor = null,
            number = calculateMonthAverage(149_484_398),
            url = "https://emojipedia.org/zipper-mouth-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Unicorn",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/unicorn_1f984.png",
            sign = "\uD83E\uDD84", // 🦄
            backgroundColor = null,
            number = calculateMonthAverage(149_184_398),
            url = "https://emojipedia.org/unicorn/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Raised Fist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raised-fist_270a.png",
            sign = "✊",
            backgroundColor = null,
            number = calculateMonthAverage(148_884_398),
            url = "https://emojipedia.org/raised-fist/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face Without Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-without-mouth_1f636.png",
            sign = "\uD83D\uDE36", // 😶
            backgroundColor = null,
            number = calculateMonthAverage(146_884_398),
            url = "https://emojipedia.org/face-without-mouth/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sunflower",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sunflower_1f33b.png",
            sign = "\uD83C\uDF3B", // 🌻
            backgroundColor = null,
            number = calculateMonthAverage(146_584_398),
            url = "https://emojipedia.org/sunflower/"
        ),
        Item(
            id = 111111111,
            name = "Woman",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman_1f469.png",
            sign = "\uD83D\uDC69", // 👩
            backgroundColor = null,
            number = calculateMonthAverage(146_184_398),
            url = "https://emojipedia.org/woman/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cowboy Hat Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cowboy-hat-face_1f920.png",
            sign = "\uD83E\uDD20", // 🤠
            backgroundColor = null,
            number = calculateMonthAverage(146_084_398),
            url = "https://emojipedia.org/cowboy-hat-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Water Pistol",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pistol_1f52b.png",
            sign = "\uD83D\uDD2B", // 🔫
            backgroundColor = null,
            number = calculateMonthAverage(147_884_398),
            url = "https://emojipedia.org/pistol/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Index Pointing Up",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/index-pointing-up_261d-fe0f.png",
            sign = "☝️",
            backgroundColor = null,
            number = calculateMonthAverage(147_384_398),
            url = "https://emojipedia.org/index-pointing-up/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Palms Up Together",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/palms-up-together_1f932.png",
            sign = "\uD83E\uDD32", // 🤲
            backgroundColor = null,
            number = calculateMonthAverage(147_084_398),
            url = "https://emojipedia.org/palms-up-together/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Christmas Tree",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/christmas-tree_1f384.png",
            sign = "\uD83C\uDF84", // 🎄
            backgroundColor = null,
            number = calculateMonthAverage(146_782_874),
            url = "https://emojipedia.org/christmas-tree/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Running",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-running_1f3c3.png",
            sign = "\uD83C\uDFC3", // 🏃
            backgroundColor = null,
            number = calculateMonthAverage(146_382_874),
            url = "https://emojipedia.org/person-running/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dizzy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dizzy_1f4ab.png",
            sign = "\uD83D\uDCAB", // 💫
            backgroundColor = null,
            number = calculateMonthAverage(146_382_874),
            url = "https://emojipedia.org/dizzy/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Eye",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eye_1f441-fe0f.png",
            sign = "\uD83D\uDC41️", // 👁️
            backgroundColor = null,
            number = calculateMonthAverage(146_082_874),
            url = "https://emojipedia.org/eye/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Open Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-open-mouth_1f62e.png",
            sign = "\uD83D\uDE2E", // 😮
            backgroundColor = null,
            number = calculateMonthAverage(145_882_874),
            url = "https://emojipedia.org/face-with-open-mouth/"
        ),
//        Item(
//            id = 111111111,
//            name = "Woman and Man Holding Hands",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/woman-and-man-holding-hands_1f46b.png",
//            sign = "\uD83D\uDC6B", // 👫
//            backgroundColor = null,
//            number = calculateMonthAverage(16519348),
//            url = "https://emojipedia.org/woman-and-man-holding-hands/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Ghost",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ghost_1f47b.png",
            sign = "\uD83D\uDC7B", // 👻
            backgroundColor = null,
            number = calculateMonthAverage(145_582_874),
            url = "https://emojipedia.org/ghost/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Check Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-mark_2714-fe0f.png",
//            sign = "✔️",
//            backgroundColor = null,
//            number = calculateMonthAverage(100558289),
//            url = "https://emojipedia.org/check-mark/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Gem Stone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/gem-stone_1f48e.png",
            sign = "\uD83D\uDC8E", // 💎
            backgroundColor = null,
            number = calculateMonthAverage(145_282_874),
            url = "https://emojipedia.org/gem-stone/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hot Beverage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-beverage_2615.png",
            sign = "☕",
            backgroundColor = null,
            number = calculateMonthAverage(145_082_874),
            url = "https://emojipedia.org/hot-beverage/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Blossom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/blossom_1f33c.png",
            sign = "\uD83C\uDF3C", // 🌼
            backgroundColor = null,
            number = calculateMonthAverage(144_982_874),
            url = "https://emojipedia.org/blossom/"
        ),
        Item(
            id = 111111111,
            name = "Pig Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pig-face_1f437.png",
            sign = "\uD83D\uDC37", // 🐷
            backgroundColor = null,
            number = calculateMonthAverage(144_682_874),
            url = "https://emojipedia.org/pig-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Gesturing OK",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-gesturing-ok_1f646.png",
            sign = "\uD83D\uDE46", // 🙆
            backgroundColor = null,
            number = calculateMonthAverage(144_282_874),
            url = "https://emojipedia.org/person-gesturing-ok/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Angry Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/angry-face_1f620.png",
            sign = "\uD83D\uDE20", // 😠
            backgroundColor = null,
            number = calculateMonthAverage(143_882_874),
            url = "https://emojipedia.org/angry-face/"
        ),
        Item(
            id = 111111111,
            name = "Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mouth_1f444.png",
            sign = "\uD83D\uDC44", // 👄
            backgroundColor = null,
            number = calculateMonthAverage(143_182_874),
            url = "https://emojipedia.org/mouth/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dizzy Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dizzy-face_1f635.png",
            sign = "\uD83D\uDE35", // 😵
            backgroundColor = null,
            number = calculateMonthAverage(142_782_874),
            url = "https://emojipedia.org/dizzy-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Raised Hand",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/raised-hand_270b.png",
            sign = "✋",
            backgroundColor = null,
            number = calculateMonthAverage(142_282_874),
            url = "https://emojipedia.org/raised-hand/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Snowflake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/snowflake_2744-fe0f.png",
            sign = "❄️",
            backgroundColor = null,
            number = calculateMonthAverage(142_082_874),
            url = "https://emojipedia.org/snowflake/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fearful Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fearful-face_1f628.png",
            sign = "\uD83D\uDE28", // 😨
            backgroundColor = null,
            number = calculateMonthAverage(141_882_874),
            url = "https://emojipedia.org/fearful-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Man Dancing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/man-dancing_1f57a.png",
            sign = "\uD83D\uDD7A", // 🕺
            backgroundColor = null,
            number = calculateMonthAverage(141_282_874),
            url = "https://emojipedia.org/man-dancing/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Handshake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/handshake_1f91d.png",
            sign = "\uD83E\uDD1D", // 🤝
            backgroundColor = null,
            number = calculateMonthAverage(140_482_874),
            url = "https://emojipedia.org/handshake/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Wilted Flower",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/wilted-flower_1f940.png",
            sign = "\uD83E\uDD40", // 🥀
            backgroundColor = null,
            number = calculateMonthAverage(139_882_874),
            url = "https://emojipedia.org/wilted-flower/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Astonished Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/astonished-face_1f632.png",
            sign = "\uD83D\uDE32", // 😲
            backgroundColor = null,
            number = calculateMonthAverage(139_482_874),
            url = "https://emojipedia.org/astonished-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Left",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-left_1f448.png",
            sign = "\uD83D\uDC48", // 👈
            backgroundColor = null,
            number = calculateMonthAverage(139_182_874),
            url = "https://emojipedia.org/backhand-index-pointing-left/"
        ),
        Item(
            id = 111111111,
            name = "Hear-No-Evil Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hear-no-evil-monkey_1f649.png",
            sign = "\uD83D\uDE49", // 🙉
            backgroundColor = null,
            number = calculateMonthAverage(138_982_874),
            url = "https://emojipedia.org/hear-no-evil-monkey/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Skull and Crossbones",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/skull-and-crossbones_2620-fe0f.png",
            sign = "☠️",
            backgroundColor = null,
            number = calculateMonthAverage(138_482_874),
            url = "https://emojipedia.org/skull-and-crossbones/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F370",
            name = "Shortcake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/shortcake_1f370.png",
            sign = "\uD83C\uDF70", // 🍰
            backgroundColor = null,
            number = calculateMonthAverage(138_182_874),
            url = "https://emojipedia.org/shortcake/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Love Letter",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/love-letter_1f48c.png",
            sign = "\uD83D\uDC8C", // 💌
            backgroundColor = null,
            number = calculateMonthAverage(137_882_874),
            url = "https://emojipedia.org/love-letter/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Glowing Star",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/glowing-star_1f31f.png",
            sign = "\uD83C\uDF1F", // 🌟
            backgroundColor = null,
            number = calculateMonthAverage(137_582_874),
            url = "https://emojipedia.org/glowing-star/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Backhand Index Pointing Down",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/backhand-index-pointing-down_1f447.png",
            sign = "\uD83D\uDC47", // 👇
            backgroundColor = null,
            number = calculateMonthAverage(137_382_874),
            url = "https://emojipedia.org/backhand-index-pointing-down/"
        ),
        Item(
            id = 111111111,
            name = "Paw Prints",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/paw-prints_1f43e.png",
            sign = "\uD83D\uDC3E", // 🐾
            backgroundColor = null,
            number = calculateMonthAverage(137_182_874),
            url = "https://emojipedia.org/paw-prints/"
        ),
        Item(
            id = 111111111,
            name = "Princess",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/princess_1f478.png",
            sign = "\uD83D\uDC78", // 👸
            backgroundColor = null,
            number = calculateMonthAverage(136_782_874),
            url = "https://emojipedia.org/princess/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Walking",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-walking_1f6b6.png",
            sign = "\uD83D\uDEB6", // 🚶
            backgroundColor = null,
            number = calculateMonthAverage(136_482_874),
            url = "https://emojipedia.org/person-walking/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Zzz",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/zzz_1f4a4.png",
            sign = "\uD83D\uDCA4", // 💤
            backgroundColor = null,
            number = calculateMonthAverage(135_182_874),
            url = "https://emojipedia.org/zzz/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Gesturing No",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-gesturing-no_1f645.png",
            sign = "\uD83D\uDE45", // 🙅
            backgroundColor = null,
            number = calculateMonthAverage(134_982_874),
            url = "https://emojipedia.org/person-gesturing-no/"
        ),
        Item(
            id = 111111111,
            name = "Kissing Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kissing-cat_1f63d.png",
            sign = "\uD83D\uDE3D", // 😽
            backgroundColor = null,
            number = calculateMonthAverage(134_282_874),
            url = "https://emojipedia.org/kissing-cat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "High Voltage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/high-voltage_26a1.png",
            sign = "⚡", // ⚡
            backgroundColor = null,
            number = calculateMonthAverage(133_982_874),
            url = "https://emojipedia.org/high-voltage/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dashing Away",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dashing-away_1f4a8.png",
            sign = "\uD83D\uDCA8", // 💨
            backgroundColor = null,
            number = calculateMonthAverage(133_782_874),
            url = "https://emojipedia.org/dashing-away/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Yawning Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/yawning-face_1f971.png",
            sign = "\uD83E\uDD71", // 🥱
            backgroundColor = null,
            number = calculateMonthAverage(133_282_874),
            url = "https://emojipedia.org/yawning-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Full Moon Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/full-moon-face_1f31d.png",
            sign = "\uD83C\uDF1D", // 🌝
            backgroundColor = null,
            number = calculateMonthAverage(132_882_874),
            url = "https://emojipedia.org/full-moon-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Money Bag",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/money-bag_1f4b0.png",
            sign = "\uD83D\uDCB0", // 💰
            backgroundColor = null,
            number = calculateMonthAverage(132_482_874),
            url = "https://emojipedia.org/money-bag/"
        ),
        Item(
            id = 111111111,
            name = "Angry Face with Horns",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/angry-face-with-horns_1f47f.png",
            sign = "\uD83D\uDC7F", // 👿
            backgroundColor = null,
            number = calculateMonthAverage(132_182_874),
            url = "https://emojipedia.org/angry-face-with-horns/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Head-Bandage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-head-bandage_1f915.png",
            sign = "\uD83E\uDD15", // 🤕
            backgroundColor = null,
            number = calculateMonthAverage(131_882_874),
            url = "https://emojipedia.org/face-with-head-bandage/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Nail Polish",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nail-polish_1f485.png",
            sign = "\uD83D\uDC85", // 💅
            backgroundColor = null,
            number = calculateMonthAverage(131_182_874),
            url = "https://emojipedia.org/nail-polish/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Soccer Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/soccer-ball_26bd.png",
            sign = "⚽",
            backgroundColor = null,
            number = calculateMonthAverage(130_782_874),
            url = "https://emojipedia.org/soccer-ball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Anguished Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anguished-face_1f627.png",
            sign = "\uD83D\uDE27", // 😧
            backgroundColor = null,
            number = calculateMonthAverage(130_182_874),
            url = "https://emojipedia.org/anguished-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Bowing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-bowing_1f647.png",
            sign = "\uD83D\uDE47", // 🙇
            backgroundColor = null,
            number = calculateMonthAverage(129_982_874),
            url = "https://emojipedia.org/person-bowing/"
        ),
        Item(
            id = 111111111, // TODO
            name = "1st Place Medal",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/1st-place-medal_1f947.png",
            sign = "\uD83E\uDD47", // 🥇
            backgroundColor = null,
            number = calculateMonthAverage(129_682_874),
            url = "https://emojipedia.org/1st-place-medal/"
        ),
        Item(
            id = 111111111,
            name = "People with Bunny Ears",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/people-with-bunny-ears_1f46f.png",
            sign = "\uD83D\uDC6F", // 👯
            backgroundColor = null,
            number = calculateMonthAverage(129_382_874),
            url = "https://emojipedia.org/people-with-bunny-ears/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Sun with Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sun-with-face_1f31e.png",
            sign = "\uD83C\uDF1E", // 🌞
            backgroundColor = null,
            number = calculateMonthAverage(129_182_874),
            url = "https://emojipedia.org/sun-with-face/"
        ),
        Item(
            id = 111111111,
            name = "Bear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bear_1f43b.png",
            sign = "\uD83D\uDC3B", // 🐻
            backgroundColor = null,
            number = calculateMonthAverage(128_982_874),
            url = "https://emojipedia.org/bear/"
        ),
        Item(
            id = 111111111,
            name = "Rabbit Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/rabbit-face_1f430.png",
            sign = "\uD83D\uDC30", // 🐰
            backgroundColor = null,
            number = calculateMonthAverage(128_682_874),
            url = "https://emojipedia.org/rabbit-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face with Thermometer",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-with-thermometer_1f912.png",
            sign = "\uD83E\uDD12", // 🤒
            backgroundColor = null,
            number = calculateMonthAverage(128_382_874),
            url = "https://emojipedia.org/face-with-thermometer/"
        ),
        Item(
            id = 111111111,
            name = "Strawberry",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/strawberry_1f353.png",
            sign = "\uD83C\uDF53", // 🍓
            backgroundColor = null,
            number = calculateMonthAverage(128_182_874),
            url = "https://emojipedia.org/strawberry/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hushed Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hushed-face_1f62f.png",
            sign = "\uD83D\uDE2F", // 😯
            backgroundColor = null,
            number = calculateMonthAverage(127_882_874),
            url = "https://emojipedia.org/hushed-face/"
        ),
        Item(
            id = 111111111,
            name = "Kitchen Knife",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kitchen-knife_1f52a.png",
            sign = "\uD83D\uDD2A", // 🔪
            backgroundColor = null,
            number = calculateMonthAverage(127_682_874),
            url = "https://emojipedia.org/kitchen-knife/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Globe Showing Europe-Africa",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-europe-africa_1f30d.png",
//            sign = "\uD83C\uDF0D", // 🌍
//            backgroundColor = null,
//            number = calculateMonthAverage(23888836),
//            url = "https://emojipedia.org/globe-showing-europe-africa/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Baby Angel",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/baby-angel_1f47c.png",
            sign = "\uD83D\uDC7C", // 👼
            backgroundColor = null,
            number = calculateMonthAverage(127_382_874),
            url = "https://emojipedia.org/baby-angel/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F476",
            name = "Baby",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/baby_1f476.png",
            sign = "\uD83D\uDC76", // 👶
            backgroundColor = null,
            number = calculateMonthAverage(127_082_874),
            url = "https://emojipedia.org/baby/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Face Holding Back Tears",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/face-holding-back-tears_1f979.png",
            sign = "\uD83E\uDD79", // 🥹
            backgroundColor = null,
            number = calculateMonthAverage(126_882_874),
            url = "https://emojipedia.org/face-holding-back-tears/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Red Exclamation Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/exclamation-mark_2757.png",
//            sign = "❗",
//            backgroundColor = null,
//            number = calculateMonthAverage(47202889),
//            url = "https://emojipedia.org/exclamation-mark/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F425",
            name = "Front-Facing Baby Chick",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/front-facing-baby-chick_1f425.png",
            sign = "\uD83D\uDC25", // 🐥
            backgroundColor = null,
            number = calculateMonthAverage(126_682_874),
            url = "https://emojipedia.org/front-facing-baby-chick/"
        ),
//        Item(
//            id = 111111111,
//            name = "Top Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/top-arrow_1f51d.png",
//            sign = "\uD83D\uDD1D", // 🔝
//            backgroundColor = null,
//            number = calculateMonthAverage(17143430),
//            url = "https://emojipedia.org/top-arrow/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F34C",
            name = "Banana",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/banana_1f34c.png",
            sign = "\uD83C\uDF4C", // 🍌
            backgroundColor = null,
            number = calculateMonthAverage(126_482_874),
            url = "https://emojipedia.org/banana/"
        ),
        Item(
            id = 111111111,
            name = "Weary Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/weary-cat_1f640.png",
            sign = "\uD83D\uDE40", // 🙀
            backgroundColor = null,
            number = calculateMonthAverage(126_182_874),
            url = "https://emojipedia.org/weary-cat/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Money with Wings",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/money-with-wings_1f4b8.png",
            sign = "\uD83D\uDCB8", // 💸
            backgroundColor = null,
            number = calculateMonthAverage(125_882_874),
            url = "https://emojipedia.org/money-with-wings/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F479",
            name = "Ogre",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ogre_1f479.png",
            sign = "\uD83D\uDC79", // 👹
            backgroundColor = null,
            number = calculateMonthAverage(125_482_874),
            url = "https://emojipedia.org/ogre/"
        ),
        Item(
            id = 111111111,
            name = "Dollar Banknote",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dollar-banknote_1f4b5.png",
            sign = "\uD83D\uDCB5", // 💵
            backgroundColor = null,
            number = calculateMonthAverage(125_082_874),
            url = "https://emojipedia.org/dollar-banknote/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Nazar Amulet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nazar-amulet_1f9ff.png",
            sign = "\uD83E\uDDFF", // 🧿
            backgroundColor = null,
            number = calculateMonthAverage(124_982_874),
            url = "https://emojipedia.org/nazar-amulet/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Trophy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/trophy_1f3c6.png",
            sign = "\uD83C\uDFC6", // 🏆
            backgroundColor = null,
            number = calculateMonthAverage(124_582_874),
            url = "https://emojipedia.org/trophy/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Palm Tree",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/palm-tree_1f334.png",
            sign = "\uD83C\uDF34", // 🌴
            backgroundColor = null,
            number = calculateMonthAverage(124_282_874),
            url = "https://emojipedia.org/palm-tree/"
        ),
        Item(
            id = 111111111,
            name = "Panda",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/panda_1f43c.png",
            sign = "\uD83D\uDC3C", // 🐼
            backgroundColor = null,
            number = calculateMonthAverage(123_982_874),
            url = "https://emojipedia.org/panda/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Pizza",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pizza_1f355.png",
            sign = "\uD83C\uDF55", // 🍕
            backgroundColor = null,
            number = calculateMonthAverage(123_882_874),
            url = "https://emojipedia.org/pizza/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Airplane",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/airplane_2708-fe0f.png",
            sign = "✈️",
            backgroundColor = null,
            number = calculateMonthAverage(123_682_874),
            url = "https://emojipedia.org/airplane/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Ribbon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ribbon_1f380.png",
            sign = "\uD83C\uDF80", // 🎀
            backgroundColor = null,
            number = calculateMonthAverage(123_282_874),
            url = "https://emojipedia.org/ribbon/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F423",
            name = "Hatching Chick",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hatching-chick_1f423.png",
            sign = "\uD83D\uDC23", // 🐣
            backgroundColor = null,
            number = calculateMonthAverage(123_182_874),
            url = "https://emojipedia.org/hatching-chick/"
        ),
//        Item(
//            id = 111111111,
//            name = "Hollow Red Circle",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hollow-red-circle_2b55.png",
//            sign = "⭕",
//            backgroundColor = null,
//            number = calculateMonthAverage(18371271),
//            url = "https://emojipedia.org/hollow-red-circle/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Crying Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crying-cat_1f63f.png",
            sign = "\uD83D\uDE3F", // 😿
            backgroundColor = null,
            number = calculateMonthAverage(122_982_874),
            url = "https://emojipedia.org/crying-cat/"
        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Tumbler Glass",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tumbler-glass_1f943.png",
//            sign = "\uD83E\uDD43", // 🥃
//            backgroundColor = null,
//            number = calculateMonthAverage(0),
//            url = "https://emojipedia.org/tumbler-glass/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "2753",
//            name = "Red Question Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/question-mark_2753.png",
//            sign = "❓",
//            backgroundColor = null,
//            number = calculateMonthAverage(12878932),
//            url = "https://emojipedia.org/question-mark/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F379",
            name = "Tropical Drink",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tropical-drink_1f379.png",
            sign = "\uD83C\uDF79", // 🍹
            backgroundColor = null,
            number = calculateMonthAverage(122_682_874),
            url = "https://emojipedia.org/tropical-drink/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Crescent Moon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crescent-moon_1f319.png",
            sign = "\uD83C\uDF19", // 🌙
            backgroundColor = null,
            number = calculateMonthAverage(122_282_874),
            url = "https://emojipedia.org/crescent-moon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Teddy Bear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/teddy-bear_1f9f8.png",
            sign = "\uD83E\uDDF8", // 🧸
            backgroundColor = null,
            number = calculateMonthAverage(121_882_874),
            url = "https://emojipedia.org/teddy-bear/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F332",
//            name = "Evergreen Tree",
//            imageUrl = "",
//            sign = "\uD83C\uDF32", // 🌲
//            backgroundColor = null,
//            number = calculateMonthAverage(8036385),
//            url = "https://emojipedia.org/evergreen-tree/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Television",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/television_1f4fa.png",
            sign = "\uD83D\uDCFA", // 📺
            backgroundColor = null,
            number = calculateMonthAverage(121_782_874),
            url = "https://emojipedia.org/television/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Globe Showing Americas",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-americas_1f30e.png",
            sign = "\uD83C\uDF0E", // 🌎
            backgroundColor = null,
            number = calculateMonthAverage(121_682_874),
            url = "https://emojipedia.org/globe-showing-americas/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Bullseye",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/direct-hit_1f3af.png",
            sign = "\uD83C\uDFAF", // 🎯
            backgroundColor = null,
            number = calculateMonthAverage(121_582_874),
            url = "https://emojipedia.org/direct-hit/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Mobile Phone with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mobile-phone-with-arrow_1f4f2.png",
            sign = "\uD83D\uDCF2", // 📲
            backgroundColor = null,
            number = calculateMonthAverage(121_482_874),
            url = "https://emojipedia.org/mobile-phone-with-arrow/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F378",
            name = "Cocktail Glass",
            imageUrl = "",
            sign = "\uD83C\uDF78", // 🍸
            backgroundColor = null,
            number = calculateMonthAverage(121_382_874),
            url = "https://emojipedia.org/cocktail-glass/"
        ),
        Item(
            id = 111111111,
            name = "Frog",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/frog_1f438.png",
            sign = "\uD83D\uDC38", // 🐸
            backgroundColor = null,
            number = calculateMonthAverage(121_182_874),
            url = "https://emojipedia.org/frog/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Dove",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/dove_1f54a-fe0f.png",
            sign = "\uD83D\uDD4A️", // 🕊️
            backgroundColor = null,
            number = calculateMonthAverage(120_982_874),
            url = "https://emojipedia.org/dove/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Lion",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/lion_1f981.png",
            sign = "\uD83E\uDD81", // 🦁
            backgroundColor = null,
            number = calculateMonthAverage(120_382_874),
            url = "https://emojipedia.org/lion/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Herb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/herb_1f33f.png",
            sign = "\uD83C\uDF3F", // 🌿
            backgroundColor = null,
            number = calculateMonthAverage(120_082_874),
            url = "https://emojipedia.org/herb/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cat Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-face_1f431.png",
            sign = "\uD83D\uDC31", // 🐱
            backgroundColor = null,
            number = calculateMonthAverage(119_982_874),
            url = "https://emojipedia.org/cat-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Musical Note",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-note_1f3b5.png",
            sign = "\uD83C\uDFB5", // 🎵
            backgroundColor = null,
            number = calculateMonthAverage(119_782_874),
            url = "https://emojipedia.org/musical-note/"
        ),
        Item(
            id = 111111111,
            name = "Cherries",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cherries_1f352.png",
            sign = "\uD83C\uDF52", // 🍒
            backgroundColor = null,
            number = calculateMonthAverage(119_482_874),
            url = "https://emojipedia.org/cherries/"
        ),
//        Item( // controversial
//            id = 111111111,
//            name = "Women Holding Hands",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/women-holding-hands_1f46d.png",
//            sign = "\uD83D\uDC6D", // 👭
//            backgroundColor = null,
//            number = calculateMonthAverage(13779514),
//            url = "https://emojipedia.org/women-holding-hands/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Leaf Fluttering in Wind",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/leaf-fluttering-in-wind_1f343.png",
            sign = "\uD83C\uDF43", // 🍃
            backgroundColor = null,
            number = calculateMonthAverage(119_182_874),
            url = "https://emojipedia.org/leaf-fluttering-in-wind/"
        ),
        Item(
            id = 111111111,
            name = "Frowning Face with Open Mouth",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/320/apple/325/frowning-face-with-open-mouth_1f626.png",
            sign = "\uD83D\uDE26", // 😦
            backgroundColor = null,
            number = calculateMonthAverage(118_982_874),
            url = "https://emojipedia.org/frowning-face-with-open-mouth/"
        ),
        Item(
            id = 111111111,
            name = "Bomb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bomb_1f4a3.png",
            sign = "\uD83D\uDCA3", // 💣
            backgroundColor = null,
            number = calculateMonthAverage(118_682_874),
            url = "https://emojipedia.org/bomb/"
        ),
//        Item( // controversial emoji
//            id = 111111111,
//            emojiId = "1F489",
//            name = "Syringe",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/syringe_1f489.png",
//            sign = "\uD83D\uDC89", // 💉
//            backgroundColor = null,
//            number = calculateMonthAverage(12760584),
//            url = "https://emojipedia.org/syringe/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F412",
            name = "Monkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/monkey_1f412.png",
            sign = "\uD83D\uDC12", // 🐒
            backgroundColor = null,
            number = calculateMonthAverage(118_482_874),
            url = "https://emojipedia.org/monkey/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Pig Nose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pig-nose_1f43d.png",
            sign = "\uD83D\uDC3D", // 🐽
            backgroundColor = null,
            number = calculateMonthAverage(118_382_874),
            url = "https://emojipedia.org/pig-nose/"
        ),
        Item(
            id = 111111111,
            name = "Lollipop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/lollipop_1f36d.png",
            sign = "\uD83C\uDF6D", // 🍭
            backgroundColor = null,
            number = calculateMonthAverage(118_182_874),
            url = "https://emojipedia.org/lollipop/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Water Wave",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/water-wave_1f30a.png",
            sign = "\uD83C\uDF0A", // 🌊
            backgroundColor = null,
            number = calculateMonthAverage(117_882_874),
            url = "https://emojipedia.org/water-wave/"
        ),
        Item(
            id = 111111111,
            name = "Honeybee",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/honeybee_1f41d.png",
            sign = "\uD83D\uDC1D", // 🐝
            backgroundColor = null,
            number = calculateMonthAverage(117_482_874),
            url = "https://emojipedia.org/honeybee/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Maple Leaf",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/maple-leaf_1f341.png",
            sign = "\uD83C\uDF41", // 🍁
            backgroundColor = null,
            number = calculateMonthAverage(117_182_874),
            url = "https://emojipedia.org/maple-leaf/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F484",
            name = "Lipstick",
            imageUrl = "",
            sign = "\uD83D\uDC84", // 💄
            backgroundColor = null,
            number = calculateMonthAverage(117_082_874),
            url = "https://emojipedia.org/lipstick/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Alien",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/alien_1f47d.png",
            sign = "\uD83D\uDC7D", // 👽
            backgroundColor = null,
            number = calculateMonthAverage(116_882_874),
            url = "https://emojipedia.org/alien/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F36B",
            name = "Chocolate Bar",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/chocolate-bar_1f36b.png",
            sign = "\uD83C\uDF6B", // 🍫
            backgroundColor = null,
            number = calculateMonthAverage(116_082_874),
            url = "https://emojipedia.org/chocolate-bar/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Basketball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/basketball_1f3c0.png",
            sign = "\uD83C\uDFC0", // 🏀
            backgroundColor = null,
            number = calculateMonthAverage(115_782_874),
            url = "https://emojipedia.org/basketball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Lying Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/lying-face_1f925.png",
            sign = "\uD83E\uDD25", // 🤥
            backgroundColor = null,
            number = calculateMonthAverage(115_582_874),
            url = "https://emojipedia.org/lying-face/"
        ),
        Item(
            id = 111111111,
            name = "Person Getting Massage",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-getting-massage_1f486.png",
            sign = "\uD83D\uDC86", // 💆
            backgroundColor = null,
            number = calculateMonthAverage(115_382_874),
            url = "https://emojipedia.org/person-getting-massage/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F354",
            name = "Hamburger",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hamburger_1f354.png",
            sign = "\uD83C\uDF54", // 🍔
            backgroundColor = null,
            number = calculateMonthAverage(115_282_874),
            url = "https://emojipedia.org/hamburger/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Baby Bottle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/baby-bottle_1f37c.png",
            sign = "\uD83C\uDF7C", // 🍼
            backgroundColor = null,
            number = calculateMonthAverage(115_082_874),
            url = "https://emojipedia.org/baby-bottle/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Microphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/microphone_1f3a4.png",
            sign = "\uD83C\uDFA4", // 🎤
            backgroundColor = null,
            number = calculateMonthAverage(114_982_874),
            url = "https://emojipedia.org/microphone/"
        ),
        Item(
            id = 111111111,
            name = "Jack-O-Lantern",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/jack-o-lantern_1f383.png",
            sign = "\uD83C\uDF83", // 🎃
            backgroundColor = null,
            number = calculateMonthAverage(114_782_874),
            url = "https://emojipedia.org/jack-o-lantern/"
        ),
        Item(
            id = 111111111,
            name = "Grinning Cat with Smiling Eyes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-cat-with-smiling-eyes_1f638.png",
            sign = "\uD83D\uDE38", // 😸
            backgroundColor = null,
            number = calculateMonthAverage(114_482_874),
            url = "https://emojipedia.org/grinning-cat-with-smiling-eyes/"
        ),
        Item(
            id = 111111111,
            name = "Snake",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/snake_1f40d.png",
            sign = "\uD83D\uDC0D", // 🐍
            backgroundColor = null,
            number = calculateMonthAverage(114_282_874),
            url = "https://emojipedia.org/snake/"
        ),
        Item(
            id = 111111111,
            name = "Watermelon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/watermelon_1f349.png",
            sign = "\uD83C\uDF49", // 🍉
            backgroundColor = null,
            number = calculateMonthAverage(114_082_874),
            url = "https://emojipedia.org/watermelon/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Thought Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/thought-balloon_1f4ad.png",
            sign = "\uD83D\uDCAD", // 💭
            backgroundColor = null,
            number = calculateMonthAverage(113_982_874),
            url = "https://emojipedia.org/thought-balloon/"
        ),
//        Item( // constoversial emoji
//            id = 111111111,
//            emojiId = "1F459",
//            name = "Bikini",
//            imageUrl = "",
//            sign = "\uD83D\uDC59", // 👙
//            backgroundColor = null,
//            number = calculateMonthAverage(7890651),
//            url = "https://emojipedia.org/bikini/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Cat with Wry Smile",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cat-with-wry-smile_1f63c.png",
            sign = "\uD83D\uDE3C", // 😼
            backgroundColor = null,
            number = calculateMonthAverage(113_728_736),
            url = "https://emojipedia.org/cat-with-wry-smile/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cloud with Rain",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cloud-with-rain_1f327-fe0f.png",
            sign = "\uD83C\uDF27️", // 🌧️
            backgroundColor = null,
            number = calculateMonthAverage(113_628_736),
            url = "https://emojipedia.org/cloud-with-rain/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Taco",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/taco_1f32e.png",
            sign = "\uD83C\uDF2E", // 🌮
            backgroundColor = null,
            number = calculateMonthAverage(113_428_736),
            url = "https://emojipedia.org/taco/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hot Pepper",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-pepper_1f336-fe0f.png",
            sign = "\uD83C\uDF36️", // 🌶️
            backgroundColor = null,
            number = calculateMonthAverage(113_228_736),
            url = "https://emojipedia.org/hot-pepper/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F463",
            name = "Footprints",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/footprints_1f463.png",
            sign = "\uD83D\uDC63", // 👣
            backgroundColor = null,
            number = calculateMonthAverage(113_028_736),
            url = "https://emojipedia.org/footprints/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F36A",
            name = "Cookie",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cookie_1f36a.png",
            sign = "\uD83C\uDF6A", // 🍪
            backgroundColor = null,
            number = calculateMonthAverage(112_928_736),
            url = "https://emojipedia.org/cookie/"
        ),
        Item(
            id = 111111111,
            name = "Tiger Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tiger-face_1f42f.png",
            sign = "\uD83D\uDC2F", // 🐯
            backgroundColor = null,
            number = calculateMonthAverage(112_728_736),
            url = "https://emojipedia.org/tiger-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fallen Leaf",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fallen-leaf_1f342.png",
            sign = "\uD83C\uDF42", // 🍂
            backgroundColor = null,
            number = calculateMonthAverage(112_628_736),
            url = "https://emojipedia.org/fallen-leaf/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F369",
            name = "Doughnut",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/doughnut_1f369.png",
            sign = "\uD83C\uDF69", // 🍩
            backgroundColor = null,
            number = calculateMonthAverage(112_428_736),
            url = "https://emojipedia.org/doughnut/"
        ),
        Item(
            id = 111111111,
            name = "Musical Score",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/musical-score_1f3bc.png",
            sign = "\uD83C\uDFBC", // 🎼
            backgroundColor = null,
            number = calculateMonthAverage(112_228_736),
            url = "https://emojipedia.org/musical-score/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fox",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fox_1f98a.png",
            sign = "\uD83E\uDD8A", // 🦊
            backgroundColor = null,
            number = calculateMonthAverage(112_028_736),
            url = "https://emojipedia.org/fox/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F366",
            name = "Soft Ice Cream",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/soft-ice-cream_1f366.png",
            sign = "\uD83C\uDF66", // 🍦
            backgroundColor = null,
            number = calculateMonthAverage(111_428_736),
            url = "https://emojipedia.org/soft-ice-cream/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Camera with Flash",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/camera-with-flash_1f4f8.png",
            sign = "\uD83D\uDCF8", // 📸
            backgroundColor = null,
            number = calculateMonthAverage(110_028_736),
            url = "https://emojipedia.org/camera-with-flash/"
        ),
        // from here 110_028_736 -> 38_389_622
        Item(
            id = 111111111, // TODO
            name = "Cloud",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cloud_2601-fe0f.png",
            sign = "☁️",
            backgroundColor = null,
            number = calculateMonthAverage(108_028_736),
            url = "https://emojipedia.org/cloud/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F34E",
            name = "Red Apple",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/red-apple_1f34e.png",
            sign = "\uD83C\uDF4E", // 🍎
            backgroundColor = null,
            number = calculateMonthAverage(106_828_736),
            url = "https://emojipedia.org/red-apple/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Open Hands",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/open-hands_1f450.png",
            sign = "\uD83D\uDC50", // 👐
            backgroundColor = null,
            number = calculateMonthAverage(106_228_736),
            url = "https://emojipedia.org/open-hands/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Honey Pot",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/honey-pot_1f36f.png",
            sign = "\uD83C\uDF6F", // 🍯
            backgroundColor = null,
            number = calculateMonthAverage(105_728_736),
            url = "https://emojipedia.org/honey-pot/"
        ),
        Item(
            id = 111111111,
            name = "Pouting Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pouting-cat_1f63e.png",
            sign = "\uD83D\uDE3E", // 😾
            backgroundColor = null,
            number = calculateMonthAverage(105_228_736),
            url = "https://emojipedia.org/pouting-cat/"
        ),
        Item(
            id = 111111111,
            name = "American Football",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/american-football_1f3c8.png",
            sign = "\uD83C\uDFC8", // 🏈
            backgroundColor = null,
            number = calculateMonthAverage(104_928_736),
            url = "https://emojipedia.org/american-football/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Prince",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/prince_1f934.png",
            sign = "\uD83E\uDD34", // 🤴
            backgroundColor = null,
            number = calculateMonthAverage(104_128_736),
            url = "https://emojipedia.org/prince/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F422",
            name = "Turtle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/turtle_1f422.png",
            sign = "\uD83D\uDC22", // 🐢
            backgroundColor = null,
            number = calculateMonthAverage(103_428_736),
            url = "https://emojipedia.org/turtle/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F47A",
            name = "Goblin",
            imageUrl = "",
            sign = "\uD83D\uDC7A", // 👺
            backgroundColor = null,
            number = calculateMonthAverage(102_428_736),
            url = "https://emojipedia.org/goblin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Ear",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ear_1f442.png",
            sign = "\uD83D\uDC42", // 👂
            backgroundColor = null,
            number = calculateMonthAverage(98_428_736),
            url = "https://emojipedia.org/ear/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Police Car Light",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/police-car-light_1f6a8.png",
            sign = "\uD83D\uDEA8", // 🚨
            backgroundColor = null,
            number = calculateMonthAverage(96_928_736),
            url = "https://emojipedia.org/police-car-light/"
        ),
        Item(
            id = 111111111,
            name = "Droplet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/droplet_1f4a7.png",
            sign = "\uD83D\uDCA7", // 💧
            backgroundColor = null,
            number = calculateMonthAverage(96_128_736),
            url = "https://emojipedia.org/droplet/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Eagle",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/eagle_1f985.png",
            sign = "\uD83E\uDD85", // 🦅
            backgroundColor = null,
            number = calculateMonthAverage(96_028_736),
            url = "https://emojipedia.org/eagle/"
        ),
        Item(
            id = 111111111,
            name = "Seedling",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/seedling_1f331.png",
            sign = "\uD83C\uDF31", // 🌱
            backgroundColor = ItemBackgroundDarkPurple,
            number = calculateMonthAverage(94_728_736),
            url = "https://emojipedia.org/seedling/"
        ),
        Item(
            id = 111111111,
            name = "Cactus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cactus_1f335.png",
            sign = "\uD83C\uDF35", // 🌵
            backgroundColor = null,
            number = calculateMonthAverage(94_228_736),
            url = "https://emojipedia.org/cactus/"
        ),
        Item(
            id = 111111111,
            name = "Grinning Cat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grinning-cat_1f63a.png",
            sign = "\uD83D\uDE3A", // 😺
            backgroundColor = null,
            number = calculateMonthAverage(93_628_736),
            url = "https://emojipedia.org/grinning-cat/"
        ),
        Item(
            id = 111111111,
            name = "Man",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/man_1f468.png",
            sign = "\uD83D\uDC68", // 👨
            backgroundColor = null,
            number = calculateMonthAverage(92_228_736),
            url = "https://emojipedia.org/man/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F347",
            name = "Grapes",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/grapes_1f347.png",
            sign = "\uD83C\uDF47", // 🍇
            backgroundColor = null,
            number = calculateMonthAverage(90_828_736),
            url = "https://emojipedia.org/grapes/"
        ),
        Item(
            id = 111111111, // TODO
            name = "No One Under Eighteen",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/no-one-under-eighteen_1f51e.png",
            sign = "\uD83D\uDD1E", // 🔞
            backgroundColor = null,
            number = calculateMonthAverage(90_028_736),
            url = "https://emojipedia.org/no-one-under-eighteen/"
        ),
        Item(
            id = 111111111,
            name = "Cigarette",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cigarette_1f6ac.png",
            sign = "\uD83D\uDEAC", // 🚬
            backgroundColor = null,
            number = calculateMonthAverage(89_728_736),
            url = "https://emojipedia.org/cigarette/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F333",
            name = "Deciduous Tree",
            imageUrl = "",
            sign = "\uD83C\uDF33", // 🌳
            backgroundColor = null,
            number = calculateMonthAverage(87_928_736),
            url = "https://emojipedia.org/deciduous-tree/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F34B",
            name = "Lemon",
            imageUrl = "",
            sign = "\uD83C\uDF4B", // 🍋
            backgroundColor = null,
            number = calculateMonthAverage(87_428_736),
            url = "https://emojipedia.org/lemon/"
        ),
        Item(
            id = 111111111,
            emojiId = "26C4",
            name = "Snowman Without Snow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/snowman-without-snow_26c4.png",
            sign = "⛄",
            backgroundColor = null,
            number = calculateMonthAverage(87_028_736),
            url = "https://emojipedia.org/snowman-without-snow/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F41F",
            name = "Fish",
            imageUrl = "",
            sign = "\uD83D\uDC1F", // 🐟
            backgroundColor = null,
            number = calculateMonthAverage(85_828_736),
            url = "https://emojipedia.org/fish/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Horse Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/horse-face_1f434.png",
            sign = "\uD83D\uDC34", // 🐴
            backgroundColor = null,
            number = calculateMonthAverage(85_228_736),
            url = "https://emojipedia.org/horse-face/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Mouse Face",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mouse-face_1f42d.png",
            sign = "\uD83D\uDC2D", // 🐭
            backgroundColor = null,
            number = calculateMonthAverage(85_028_736),
            url = "https://emojipedia.org/mouse-face/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F34D",
            name = "Pineapple",
            imageUrl = "",
            sign = "\uD83C\uDF4D", // 🍍
            backgroundColor = null,
            number = calculateMonthAverage(84_628_736),
            url = "https://emojipedia.org/pineapple/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F35F",
            name = "French Fries",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/french-fries_1f35f.png",
            sign = "\uD83C\uDF5F", // 🍟
            backgroundColor = null,
            number = calculateMonthAverage(82_628_736),
            url = "https://emojipedia.org/french-fries/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Tornado",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tornado_1f32a-fe0f.png",
            sign = "\uD83C\uDF2A️", // 🌪️
            backgroundColor = null,
            number = calculateMonthAverage(81_228_736),
            url = "https://emojipedia.org/tornado/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F34A",
            name = "Tangerine",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tangerine_1f34a.png",
            sign = "\uD83C\uDF4A", // 🍊
            backgroundColor = null,
            number = calculateMonthAverage(81_028_736),
            url = "https://emojipedia.org/tangerine/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F344",
            name = "Mushroom",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mushroom_1f344.png",
            sign = "\uD83C\uDF44", // 🍄
            backgroundColor = null,
            number = calculateMonthAverage(80_128_736),
            url = "https://emojipedia.org/mushroom/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F42C",
            name = "Dolphin",
            imageUrl = "",
            sign = "\uD83D\uDC2C", // 🐬
            backgroundColor = null,
            number = calculateMonthAverage(75_328_736),
            url = "https://emojipedia.org/dolphin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Headphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/headphone_1f3a7.png",
            sign = "\uD83C\uDFA7", // 🎧
            backgroundColor = null,
            number = calculateMonthAverage(74_928_736),
            url = "https://emojipedia.org/headphone/"
        ),
        Item(
            id = 111111111,
            name = "Umbrella with Rain Drops",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/umbrella-with-rain-drops_2614.png",
            sign = "☔",
            backgroundColor = null,
            number = calculateMonthAverage(73_228_736),
            url = "https://emojipedia.org/umbrella-with-rain-drops/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F47E",
            name = "Alien Monster",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/alien-monster_1f47e.png",
            sign = "\uD83D\uDC7E", // 👾
            backgroundColor = null,
            number = calculateMonthAverage(72_528_736),
            url = "https://emojipedia.org/alien-monster/"
        ),
        Item(
            id = 111111111,
            emojiId = "26BE",
            name = "Baseball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/baseball_26be.png",
            sign = "⚾",
            backgroundColor = null,
            number = calculateMonthAverage(70_228_736),
            url = "https://emojipedia.org/baseball/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Fairy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fairy_1f9da.png",
            sign = "\uD83E\uDDDA", // 🧚
            backgroundColor = null,
            number = calculateMonthAverage(69_928_736),
            url = "https://emojipedia.org/fairy/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F697",
            name = "Automobile",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/automobile_1f697.png",
            sign = "\uD83D\uDE97", // 🚗
            backgroundColor = null,
            number = calculateMonthAverage(69_228_736),
            url = "https://emojipedia.org/automobile/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Chicken",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/chicken_1f414.png",
            sign = "\uD83D\uDC14", // 🐔
            backgroundColor = null,
            number = calculateMonthAverage(69_028_736),
            url = "https://emojipedia.org/chicken/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Nose",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/nose_1f443.png",
            sign = "\uD83D\uDC43", // 👃
            backgroundColor = null,
            number = calculateMonthAverage(68_628_736),
            url = "https://emojipedia.org/nose/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Tropical Fish",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/tropical-fish_1f420.png",
            sign = "\uD83D\uDC20", // 🐠
            backgroundColor = null,
            number = calculateMonthAverage(67_328_736),
            url = "https://emojipedia.org/tropical-fish/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Euro Banknote",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/euro-banknote_1f4b6.png",
            sign = "\uD83D\uDCB6", // 💶
            backgroundColor = null,
            number = calculateMonthAverage(62_628_736),
            url = "https://emojipedia.org/euro-banknote/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F34F",
            name = "Green Apple",
            imageUrl = "",
            sign = "\uD83C\uDF4F", // 🍏
            backgroundColor = null,
            number = calculateMonthAverage(60_628_736),
            url = "https://emojipedia.org/green-apple/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Warning",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/warning_26a0-fe0f.png",
            sign = "⚠️",
            backgroundColor = null,
            number = calculateMonthAverage(59_228_736),
            url = "https://emojipedia.org/warning/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Popcorn",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/popcorn_1f37f.png",
            sign = "\uD83C\uDF7F", // 🍿
            backgroundColor = null,
            number = calculateMonthAverage(58_628_736),
            url = "https://emojipedia.org/popcorn/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Brain",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/brain_1f9e0.png",
            sign = "\uD83E\uDDE0", // 🧠
            backgroundColor = null,
            number = calculateMonthAverage(57_928_736),
            url = "https://emojipedia.org/brain/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Person Lifting Weights",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/person-lifting-weights_1f3cb-fe0f.png",
            sign = "\uD83C\uDFCB️", // 🏋️
            backgroundColor = null,
            number = calculateMonthAverage(57_628_736),
            url = "https://emojipedia.org/person-lifting-weights/"
        ),
//        Item(
//            id = 111111111,
//            name = "Globe Showing Asia-Australia",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-showing-asia-australia_1f30f.png",
//            sign = "\uD83C\uDF0F", // 🌏
//            backgroundColor = null,
//            number = calculateMonthAverage(13684579),
//            url = "https://emojipedia.org/globe-showing-asia-australia/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Koala",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/koala_1f428.png",
            sign = "\uD83D\uDC28", // 🐨
            backgroundColor = null,
            number = calculateMonthAverage(57_128_736),
            url = "https://emojipedia.org/koala/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Poultry Leg",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/poultry-leg_1f357.png",
            sign = "\uD83C\uDF57", // 🍗
            backgroundColor = null,
            number = calculateMonthAverage(56_728_736),
            url = "https://emojipedia.org/poultry-leg/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Spider",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/spider_1f577-fe0f.png",
            sign = "\uD83D\uDD77️", // 🕷️
            backgroundColor = null,
            number = calculateMonthAverage(53_328_736),
            url = "https://emojipedia.org/spider/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Cheese Wedge",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cheese-wedge_1f9c0.png",
            sign = "\uD83E\uDDC0", // 🧀
            backgroundColor = null,
            number = calculateMonthAverage(50_328_736),
            url = "https://emojipedia.org/cheese-wedge/"
        ),
//        Item(
//            id = 111111111,
//            name = "Cyclone",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/cyclone_1f300.png",
//            sign = "\uD83C\uDF00", // 🌀
//            backgroundColor = null,
//            number = calculateMonthAverage(13243627),
//            url = "https://emojipedia.org/cyclone/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Mechanical Arm",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mechanical-arm_1f9be.png",
            sign = "\uD83E\uDDBE", // 🦾
            backgroundColor = null,
            number = calculateMonthAverage(46_728_736),
            url = "https://emojipedia.org/mechanical-arm/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Hot Dog",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-dog_1f32d.png",
            sign = "\uD83C\uDF2D", // 🌭
            backgroundColor = null,
            number = calculateMonthAverage(45_828_736),
            url = "https://emojipedia.org/hot-dog/"
        ),
        Item(
            id = 111111111,
            name = "Guitar",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/guitar_1f3b8.png",
            sign = "\uD83C\uDFB8", // 🎸
            backgroundColor = null,
            number = calculateMonthAverage(45_228_736),
            url = "https://emojipedia.org/guitar/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Spouting Whale",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/320/apple/325/spouting-whale_1f433.png",
            sign = "\uD83D\uDC33", // 🐳
            backgroundColor = null,
            number = calculateMonthAverage(44_128_736),
            url = "https://emojipedia.org/spouting-whale/"
        ),
//        Item( // constoversial emoji
//            id = 111111111,
//            emojiId = "1F48A",
//            name = "Pill",
//            imageUrl = "",
//            sign = "\uD83D\uDC8A", // 💊
//            backgroundColor = null,
//            number = calculateMonthAverage(8918887),
//            url = "https://emojipedia.org/pill/"
//        ),
        Item(
            id = 111111111, // TODO
            name = "Crab",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crab_1f980.png",
            sign = "\uD83E\uDD80", // 🦀
            backgroundColor = null,
            number = calculateMonthAverage(43_428_736),
            url = "https://emojipedia.org/crab/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Pushpin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pushpin_1f4cc.png",
            sign = "\uD83D\uDCCC", // 📌
            backgroundColor = null,
            number = calculateMonthAverage(42_928_736),
            url = "https://emojipedia.org/pushpin/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F36C",
            name = "Candy",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/candy_1f36c.png",
            sign = "\uD83C\uDF6C", // 🍬
            backgroundColor = null,
            number = calculateMonthAverage(41_328_736),
            url = "https://emojipedia.org/candy/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Avocado",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/avocado_1f951.png",
            sign = "\uD83E\uDD51", // 🥑
            backgroundColor = null,
            number = calculateMonthAverage(41_128_736),
            url = "https://emojipedia.org/avocado/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Turkey",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/turkey_1f983.png",
            sign = "\uD83E\uDD83", // 🦃
            backgroundColor = null,
            number = calculateMonthAverage(40_228_736),
            url = "https://emojipedia.org/turkey/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F198",
            name = "SOS Button",
            imageUrl = "",
            sign = "\uD83C\uDD98", // 🆘
            backgroundColor = null,
            number = calculateMonthAverage(39_928_736),
            url = "https://emojipedia.org/sos-button/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Penguin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/penguin_1f427.png",
            sign = "\uD83D\uDC27", // 🐧
            backgroundColor = null,
            number = calculateMonthAverage(39_828_736),
            url = "https://emojipedia.org/penguin/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Comet",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/comet_2604-fe0f.png",
            sign = "☄️",
            backgroundColor = null,
            number = calculateMonthAverage(39_128_736),
            url = "https://emojipedia.org/comet/"
        ),

        // END OF ORDERED POINT http://www.emojistats.org/

//        Item(
//            id = 111111111, // TODO
//            name = "Left Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/left-arrow_2b05-fe0f.png",
//            sign = "⬅️",
//            backgroundColor = null,
//            number = calculateMonthAverage(240063300),
//            url = "https://emojipedia.org/left-arrow/"
//        ),

//        Item(
//            id = 71,
//            name = "Green Heart",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/green-heart_1f49a.png",
//            sign = "\uD83D\uDC9A", // 💚
//            backgroundColor = null,
//            number = calculateMonthAverage(145493542), // (145493542 / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/green-heart/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Play Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/play-button_25b6-fe0f.png",
//            sign = "▶️",
//            backgroundColor = null,
//            number = calculateMonthAverage(112037700),
//            url = "https://emojipedia.org/play-button/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Right Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow_27a1-fe0f.png",
//            sign = "➡️",
//            backgroundColor = null,
//            number = calculateMonthAverage(108238114),
//            url = "https://emojipedia.org/right-arrow/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Red Circle",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/large-red-circle_1f534.png",
//            sign = "\uD83D\uDD34", // 🔴
//            backgroundColor = null,
//            number = calculateMonthAverage(101889783),
//            url = "https://emojipedia.org/large-red-circle/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Keycap Digit One",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/keycap-digit-one_31-fe0f-20e3.png",
//            sign = "1️⃣",
//            backgroundColor = null,
//            number = calculateMonthAverage(48869465),
//            url = "https://emojipedia.org/keycap-digit-one/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Keycap Digit Two",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/keycap-digit-two_32-fe0f-20e3.png",
//            sign = "2️⃣",
//            backgroundColor = null,
//            number = calculateMonthAverage(45974442),
//            url = "https://emojipedia.org/keycap-digit-two/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Copyright",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/copyright_a9-fe0f.png",
//            sign = "©️",
//            backgroundColor = null,
//            number = calculateMonthAverage(43048470),
//            url = "https://emojipedia.org/copyright/"
//        ),
//        Item(
//            id = 111111111, // TODO
//            name = "Flag: United States",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flag-united-states_1f1fa-1f1f8.png",
//            sign = "\uD83C\uDDFA\uD83C\uDDF8", // 🇺🇸
//            backgroundColor = null,
//            number = calculateMonthAverage(42173813),
//            url = "https://emojipedia.org/flag-united-states/"
//        ),

        Item(
            id = 111111111,
            emojiId = "1F552",
            name = "Clock",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/three-oclock_1f552.png",
            sign = "\uD83D\uDD52", // 🕒
            backgroundColor = null,
            number = calculateMonthAverage(38_389_622), // Three O'Click - 11039538
            url = "https://emojipedia.org/three-oclock/"
        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Left Arrow Curving Right",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/left-arrow-curving-right_21aa-fe0f.png",
//            sign = "↪️",
//            backgroundColor = null,
//            number = calculateMonthAverage(37094598),
//            url = "https://emojipedia.org/left-arrow-curving-right/"
//        ),

        Item(
            id = 111111111, // TODO
            name = "Telephone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/telephone_260e-fe0f.png",
            sign = "☎️",
            backgroundColor = null,
            number = calculateMonthAverage(36120888),
            url = "https://emojipedia.org/telephone/"
        ),

        Item(
            id = 111111111, // TODO
            name = "Movie Camera",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/movie-camera_1f3a5.png",
            sign = "\uD83C\uDFA5", // 🎥
            backgroundColor = null,
            number = calculateMonthAverage(36051816),
            url = "https://emojipedia.org/movie-camera/"
        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Reverse Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/reverse-button_25c0-fe0f.png",
//            sign = "◀️",
//            backgroundColor = null,
//            number = calculateMonthAverage(35165760),
//            url = "https://emojipedia.org/reverse-button/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Check Box with Check",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/check-box-with-check_2611-fe0f.png",
//            sign = "☑️",
//            backgroundColor = null,
//            number = calculateMonthAverage(33963622),
//            url = "https://emojipedia.org/check-box-with-check/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Right Arrow Curving Left",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow-curving-left_21a9-fe0f.png",
//            sign = "↩️",
//            backgroundColor = null,
//            number = calculateMonthAverage(33022878),
//            url = "https://emojipedia.org/right-arrow-curving-left/"
//        ),

//        Item(
//            id = 111111111, // TODO
//            name = "Down Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/down-arrow_2b07-fe0f.png",
//            sign = "⬇️",
//            backgroundColor = null,
//            number = calculateMonthAverage(29689476),
//            url = "https://emojipedia.org/down-arrow/"
//        ),

        Item(
            id = 111111111, // TODO
            name = "Loudspeaker",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/loudspeaker_1f4e2.png",
            sign = "\uD83D\uDCE2", // 📢
            backgroundColor = null,
            number = calculateMonthAverage(26614557),
            url = "https://emojipedia.org/loudspeaker/"
        ),
        Item(
            id = 111111111, // TODO
            name = "Round Pushpin",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/round-pushpin_1f4cd.png",
            sign = "\uD83D\uDCCD", // 📍
            backgroundColor = null,
            number = calculateMonthAverage(26384678),
            url = "https://emojipedia.org/round-pushpin/"
        ),

        Item(
            id = 111111111, // TODO
            name = "Goat",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/goat_1f410.png",
            sign = "\uD83D\uDC10", // 🐐
            backgroundColor = null,
            number = calculateMonthAverage(24919442),
            url = "https://emojipedia.org/goat/"
        ),

        Item(
            id = 111111111,
            name = "Alarm Clock",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/alarm-clock_23f0.png",
            sign = "⏰",
            backgroundColor = null,
            number = calculateMonthAverage(21957229),
            url = "https://emojipedia.org/alarm-clock/"
        ),
        Item(
            id = 111111111,
            name = "Hot Springs",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/hot-springs_2668-fe0f.png",
            sign = "♨️",
            backgroundColor = null,
            number = calculateMonthAverage(21928832),
            url = "https://emojipedia.org/hot-springs/"
        ),
//        Item(
//            id = 111111111,
//            name = "Club Suit",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/club-suit_2663-fe0f.png",
//            sign = "♣️",
//            backgroundColor = null,
//            number = calculateMonthAverage(21874657),
//            url = "https://emojipedia.org/club-suit/"
//        ),

        Item(
            id = 111111111,
            name = "Video Camera",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/video-camera_1f4f9.png",
            sign = "\uD83D\uDCF9", // 📹
            backgroundColor = null,
            number = calculateMonthAverage(21519366),
            url = "https://emojipedia.org/video-camera/"
        ),

        Item(
            id = 111111111,
            name = "Megaphone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/megaphone_1f4e3.png",
            sign = "\uD83D\uDCE3", // 📣
            backgroundColor = null,
            number = calculateMonthAverage(21301385),
            url = "https://emojipedia.org/megaphone/"
        ),


        Item(
            id = 111111111,
            name = "Speaker High Volume",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speaker-high-volume_1f50a.png",
            sign = "\uD83D\uDD0A", // 🔊
            backgroundColor = null,
            number = calculateMonthAverage(20783219),
            url = "https://emojipedia.org/speaker-high-volume/"
        ),

//        Item(
//            id = 111111111,
//            name = "Multiply",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/multiply_2716-fe0f.png",
//            sign = "✖️",
//            backgroundColor = null,
//            number = calculateMonthAverage(19651444),
//            url = "https://emojipedia.org/multiply/"
//        ),
//        Item(
//            id = 111111111,
//            name = "Blue Circle",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/large-blue-circle_1f535.png",
//            sign = "\uD83D\uDD35", // 🔵
//            backgroundColor = null,
//            number = calculateMonthAverage(19239423),
//            url = "https://emojipedia.org/large-blue-circle/"
//        ),
        Item(
            id = 111111111,
            name = "Telephone Receiver",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/telephone-receiver_1f4de.png",
            sign = "\uD83D\uDCDE", // 📞
            backgroundColor = null,
            number = calculateMonthAverage(19091995),
            url = "https://emojipedia.org/telephone-receiver/"
        ),
        Item(
            id = 111111111,
            name = "Mobile Phone",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/mobile-phone_1f4f1.png",
            sign = "\uD83D\uDCF1", // 📱
            backgroundColor = null,
            number = calculateMonthAverage(18867332),
            url = "https://emojipedia.org/mobile-phone/"
        ),





        Item(
            id = 111111111,
            name = "Clapper Board",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/clapper-board_1f3ac.png",
            sign = "\uD83C\uDFAC", // 🎬
            backgroundColor = null,
            number = calculateMonthAverage(17873581),
            url = "https://emojipedia.org/clapper-board/"
        ),

        Item(
            id = 111111111,
            name = "Link",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/link_1f517.png",
            sign = "\uD83D\uDD17", // 🔗
            backgroundColor = null,
            number = calculateMonthAverage(17623594),
            url = "https://emojipedia.org/link/"
        ),


//        Item(
//            id = 111111111,
//            name = "Spade Suit",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/spade-suit_2660-fe0f.png",
//            sign = "♠️",
//            backgroundColor = null,
//            number = calculateMonthAverage(17170293),
//            url = "https://emojipedia.org/spade-suit/"
//        ),



        Item(
            id = 111111111,
            name = "Anchor",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anchor_2693.png",
            sign = "⚓",
            backgroundColor = null,
            number = calculateMonthAverage(16630982),
            url = "https://emojipedia.org/anchor/"
        ),

//        Item(
//            id = 111111111,
//            name = "Fast-Forward Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fast-forward-button_23e9.png",
//            sign = "⏩",
//            backgroundColor = null,
//            number = calculateMonthAverage(16410865),
//            url = "https://emojipedia.org/fast-forward-button/"
//        ),


        Item(
            id = 111111111,
            name = "Memo",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/memo_1f4dd.png",
            sign = "\uD83D\uDCDD", // 📝
            backgroundColor = null,
            number = calculateMonthAverage(15336351),
            url = "https://emojipedia.org/memo/"
        ),


        Item(
            id = 111111111,
            name = "Bell",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/bell_1f514.png",
            sign = "\uD83D\uDD14", // 🔔
            backgroundColor = null,
            number = calculateMonthAverage(15265940),
            url = "https://emojipedia.org/bell/"
        ),


//        Item( // TODO maybe comment
//            id = 111111111,
//            name = "Kiss: Woman, Man",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/kiss_1f48f.png",
//            sign = "\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC8B\u200D\uD83D\uDC68", // 👩‍❤️‍💋‍👨
//            backgroundColor = null,
//            number = calculateMonthAverage(15027217),
//            url = "https://emojipedia.org/kiss-woman-man/"
//        ),


        Item(
            id = 111111111,
            name = "Speech Balloon",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/speech-balloon_1f4ac.png",
            sign = "\uD83D\uDCAC", // 💬
            backgroundColor = null,
            number = calculateMonthAverage(14653888),
            url = "https://emojipedia.org/speech-balloon/"
        ),

//        Item(
//            id = 111111111,
//            name = "Small Orange Diamond",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/small-orange-diamond_1f538.png",
//            sign = "\uD83D\uDD38", // 🔸
//            backgroundColor = null,
//            number = calculateMonthAverage(14510334),
//            url = "https://emojipedia.org/small-orange-diamond/"
//        ),
        Item(
            id = 111111111,
            name = "Books",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/books_1f4da.png",
            sign = "\uD83D\uDCDA", // 📚
            backgroundColor = null,
            number = calculateMonthAverage(14496044),
            url = "https://emojipedia.org/books/"
        ),

        Item(
            id = 111111111,
            name = "Light Bulb",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/light-bulb_1f4a1.png",
            sign = "\uD83D\uDCA1", // 💡
            backgroundColor = null,
            number = calculateMonthAverage(14230743),
            url = "https://emojipedia.org/light-bulb/"
        ),
//        Item( // TODO maybe comment
//            id = 111111111,
//            name = "Flag: France",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flag-france_1f1eb-1f1f7.png",
//            sign = "\uD83C\uDDEB\uD83C\uDDF7", // 🇫🇷
//            backgroundColor = null,
//            number = calculateMonthAverage(14116965),
//            url = "https://emojipedia.org/flag-france/"
//        ),
//        Item(
//            id = 111111111,
//            name = "Anger Symbol",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/anger-symbol_1f4a2.png",
//            sign = "\uD83D\uDCA2", // 💢
//            backgroundColor = null,
//            number = calculateMonthAverage(14110139),
//            url = "https://emojipedia.org/anger-symbol/"
//        ),
//        Item(
//            id = 111111111,
//            name = "Diamond Suit",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/diamond-suit_2666-fe0f.png",
//            sign = "♦️",
//            backgroundColor = null,
//            number = calculateMonthAverage(13969913),
//            url = "https://emojipedia.org/diamond-suit/"
//        ),
        Item(
            id = 111111111,
            name = "Santa Claus",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/santa-claus_1f385.png",
            sign = "\uD83C\uDF85", // 🎅
            backgroundColor = null,
            number = calculateMonthAverage(13961572),
            url = "https://emojipedia.org/santa-claus/"
        ),



//        Item(
//            id = 111111111,
//            name = "Black Small Square",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-small-square_25aa-fe0f.png",
//            sign = "▪️",
//            backgroundColor = null,
//            number = calculateMonthAverage(13678909),
//            url = "https://emojipedia.org/black-small-square/"
//        ),

        Item(
            id = 111111111,
            name = "Video Game",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/video-game_1f3ae.png",
            sign = "\uD83C\uDFAE", // 🎮
            backgroundColor = null,
            number = calculateMonthAverage(13588965),
            url = "https://emojipedia.org/video-game/"
        ),

//        Item(
//            id = 111111111,
//            name = "Small Blue Diamond",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/small-blue-diamond_1f539.png",
//            sign = "\uD83D\uDD39", // 🔹
//            backgroundColor = null,
//            number = calculateMonthAverage(13007925),
//            url = "https://emojipedia.org/small-blue-diamond/"
//        ),

//        Item(
//            id = 111111111,
//            name = "Right Arrow Curving Down",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/right-arrow-curving-down_2935-fe0f.png",
//            sign = "⤵️",
//            backgroundColor = null,
//            number = calculateMonthAverage(12608552),
//            url = "https://emojipedia.org/right-arrow-curving-down/"
//        ),
        Item(
            id = 111111111,
            name = "Laptop",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/laptop_1f4bb.png",
            sign = "\uD83D\uDCBB", // 💻
            backgroundColor = null,
            number = calculateMonthAverage(12526043),
            url = "https://emojipedia.org/laptop/"
        ),

        // 24.09.2022

        Item(
            id = 111111111,
            emojiId = "1F4FB",
            name = "Radio",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/radio_1f4fb.png",
            sign = "\uD83D\uDCFB", // 📻
            backgroundColor = null,
            number = calculateMonthAverage(12914404),
            url = "https://emojipedia.org/radio/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "2753",
//            name = "Red Question Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/question-mark_2753.png",
//            sign = "❓",
//            backgroundColor = null,
//            number = calculateMonthAverage(12878932),
//            url = "https://emojipedia.org/question-mark/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "26AA",
//            name = "White Circle",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/white-circle_26aa.png",
//            sign = "⚪",
//            backgroundColor = null,
//            number = calculateMonthAverage(12828360),
//            url = "https://emojipedia.org/white-circle/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F4C8",
            name = "Chart Increasing",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/chart-increasing_1f4c8.png",
            sign = "\uD83D\uDCC8", // 📈
            backgroundColor = null,
            number = calculateMonthAverage(12820607),
            url = "https://emojipedia.org/chart-increasing/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F3E1",
            name = "House with Garden",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/house-with-garden_1f3e1.png",
            sign = "\uD83C\uDFE1", // 🏡
            backgroundColor = null,
            number = calculateMonthAverage(12808884),
            url = "https://emojipedia.org/house-with-garden/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F5FF",
            name = "Moai",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/moai_1f5ff.png",
            sign = "\uD83D\uDDFF", // 🗿
            backgroundColor = null,
            number = calculateMonthAverage(12387058),
            url = "https://emojipedia.org/moai/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F6AB",
            name = "Prohibited",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/prohibited_1f6ab.png",
            sign = "\uD83D\uDEAB", // 🚫
            backgroundColor = null,
            number = calculateMonthAverage(12271923),
            url = "https://emojipedia.org/prohibited/"
        ),
        Item(
            id = 111111111,
            emojiId = "270F",
            name = "Pencil",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/pencil_270f-fe0f.png",
            sign = "✏️",
            backgroundColor = null,
            number = calculateMonthAverage(12163277),
            url = "https://emojipedia.org/pencil/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F52E",
            name = "Crystal Ball",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/crystal-ball_1f52e.png",
            sign = "\uD83D\uDD2E", // 🔮
            backgroundColor = null,
            number = calculateMonthAverage(12153373),
            url = "https://emojipedia.org/crystal-ball/"
        ),

//        Item(
//            id = 111111111,
//            emojiId = "2122",
//            name = "Trade Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/trade-mark_2122-fe0f.png",
//            sign = "™️",
//            backgroundColor = null,
//            number = calculateMonthAverage(12022215),
//            url = "https://emojipedia.org/trade-mark/"
//        ),
        Item(
            id = 111111111,
            emojiId = "26C5",
            name = "Sun Behind Cloud",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/sun-behind-cloud_26c5.png",
            sign = "⛅",
            backgroundColor = null,
            number = calculateMonthAverage(11916426),
            url = "https://emojipedia.org/sun-behind-cloud/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F3E0",
            name = "House",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/house_1f3e0.png",
            sign = "\uD83C\uDFE0", // 🏠
            backgroundColor = null,
            number = calculateMonthAverage(11844361),
            url = "https://emojipedia.org/house/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F4E9",
            name = "Envelope with Arrow",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/envelope-with-arrow_1f4e9.png",
            sign = "\uD83D\uDCE9", // 📩
            backgroundColor = null,
            number = calculateMonthAverage(11757617),
            url = "https://emojipedia.org/envelope-with-arrow/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F6AE",
//            name = "Litter in Bin Sign",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/litter-in-bin-sign_1f6ae.png",
//            sign = "\uD83D\uDEAE", // 🚮
//            backgroundColor = null,
//            number = calculateMonthAverage(11740914),
//            url = "https://emojipedia.org/litter-in-bin-sign/"
//        ),

        Item(
            id = 111111111,
            emojiId = "1F33E",
            name = "Farmer",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/farmer_1f9d1-200d-1f33e.png",
            sign = "\uD83E\uDDD1\u200D\uD83C\uDF3E", // 🧑‍🌾
            backgroundColor = null,
            number = calculateMonthAverage(11589239),
            url = "https://emojipedia.org/farmer/"
        ),

//        Item(
//            id = 111111111,
//            emojiId = "1F1EE-1F1F9",
//            name = "Flag: Italy",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/flag-italy_1f1ee-1f1f9.png",
//            sign = "\uD83C\uDDEE\uD83C\uDDF9", // 🇮🇹
//            backgroundColor = null,
//            number = calculateMonthAverage(11532762),
//            url = "https://emojipedia.org/flag-italy/"
//        ),

//        Item(
//            id = 111111111,
//            emojiId = "00AE",
//            name = "",
//            imageUrl = "",
//            sign = "", //
//            backgroundColor = null,
//            number = calculateMonthAverage(11397124),
//            url = ""
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F1EA-1F1F8",
//            name = "Flag: Sweden",
//            imageUrl = "",
//            sign = "\uD83C\uDDF8\uD83C\uDDEA", // 🇸🇪
//            backgroundColor = null,
//            number = calculateMonthAverage(11371797),
//            url = "https://emojipedia.org/flag-sweden/"
//        ),

//        Item(
//            id = 111111111,
//            emojiId = "2049",
//            name = "Exclamation Question Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/exclamation-question-mark_2049-fe0f.png",
//            sign = "⁉️",
//            backgroundColor = null,
//            number = calculateMonthAverage(11088587),
//            url = "https://emojipedia.org/exclamation-question-mark/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F30C",
            name = "Milky Way",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/milky-way_1f30c.png",
            sign = "\uD83C\uDF0C", // 🌌
            backgroundColor = null,
            number = calculateMonthAverage(10776901),
            url = "https://emojipedia.org/milky-way/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "26AB",
//            name = "Black Circle",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-circle_26ab.png",
//            sign = "⚫",
//            backgroundColor = null,
//            number = calculateMonthAverage(10684491),
//            url = "https://emojipedia.org/black-circle/"
//        ),

        Item(
            id = 111111111,
            emojiId = "1F64D",
            name = "Man Frowning",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/man-frowning_1f64d-200d-2642-fe0f.png",
            sign = "\uD83D\uDE4D\u200D️", // 🙍‍
            backgroundColor = null,
            number = calculateMonthAverage(10373896),
            url = "https://emojipedia.org/man-frowning/"
        ),

//        Item(
//            id = 111111111,
//            emojiId = "1F197",
//            name = "OK Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/ok-button_1f197.png",
//            sign = "\uD83C\uDD97", // 🆗
//            backgroundColor = null,
//            number = calculateMonthAverage(10208608),
//            url = "https://emojipedia.org/ok-button/"
//        ),

//        Item(
//            id = 111111111,
//            emojiId = "1F19A",
//            name = "Vs Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/vs-button_1f19a.png",
//            sign = "\uD83C\uDD9A", // 🆚
//            backgroundColor = null,
//            number = calculateMonthAverage(10095606),
//            url = "https://emojipedia.org/vs-button/"
//        ),

        Item(
            id = 111111111,
            emojiId = "1F3A8",
            name = "Artist",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/artist_1f9d1-200d-1f3a8.png",
            sign = "\uD83E\uDDD1\u200D\uD83C\uDFA8", // 🧑‍🎨
            backgroundColor = null,
            number = calculateMonthAverage(9867374),
            url = "https://emojipedia.org/artist/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F4D6",
            name = "Open Book",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/open-book_1f4d6.png",
            sign = "\uD83D\uDCD6", // 📖
            backgroundColor = null,
            number = calculateMonthAverage(9765115),
            url = "https://emojipedia.org/open-book/"
        ),
        Item(
            id = 111111111,
            emojiId = "2702",
            name = "Scissors",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/scissors_2702-fe0f.png",
            sign = "✂️",
            backgroundColor = null,
            number = calculateMonthAverage(9630993),
            url = "https://emojipedia.org/scissors/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F310",
            name = "Globe with Meridians",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/globe-with-meridians_1f310.png",
            sign = "\uD83C\uDF10", // 🌐
            backgroundColor = null,
            number = calculateMonthAverage(9629278),
            url = "https://emojipedia.org/globe-with-meridians/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F4F0",
            name = "Newspaper",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/newspaper_1f4f0.png",
            sign = "\uD83D\uDCF0", // 📰
            backgroundColor = null,
            number = calculateMonthAverage(9475392),
            url = "https://emojipedia.org/newspaper/"
        ),
//        Item( // controversial emoli
//            id = 111111111,
//            emojiId = "1F467",
//            name = "Family",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/family-man-woman-girl-girl_1f468-200d-1f469-200d-1f467-200d-1f467.png",
//            sign = "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67", // 👨‍👩‍👧‍👧
//            backgroundColor = null,
//            number = calculateMonthAverage(9385287),
//            url = "https://emojipedia.org/family-man-woman-girl-girl/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "0034-20E3",
//            name = "",
//            imageUrl = "",
//            sign = "", //
//            backgroundColor = null,
//            number = calculateMonthAverage(9353382),
//            url = ""
//        ),


        Item(
            id = 111111111,
            emojiId = "1F374",
            name = "Fork and Knife",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/fork-and-knife_1f374.png",
            sign = "\uD83C\uDF74", // 🍴
            backgroundColor = null,
            number = calculateMonthAverage(9205833),
            url = "https://emojipedia.org/fork-and-knife/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "2B06",
//            name = "Up Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/up-arrow_2b06-fe0f.png",
//            sign = "⬆️",
//            backgroundColor = null,
//            number = calculateMonthAverage(9165970),
//            url = "https://emojipedia.org/up-arrow/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "2194",
//            name = "Left-Right Arrow",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/left-right-arrow_2194-fe0f.png",
//            sign = "↔️",
//            backgroundColor = null,
//            number = calculateMonthAverage(9121514),
//            url = "https://emojipedia.org/left-right-arrow/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F511",
            name = "Key",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/key_1f511.png",
            sign = "\uD83D\uDD11", // 🔑
            backgroundColor = null,
            number = calculateMonthAverage(9113742),
            url = "https://emojipedia.org/key/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F501",
//            name = "Repeat Button",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/repeat-button_1f501.png",
//            sign = "\uD83D\uDD01", // 🔁
//            backgroundColor = null,
//            number = calculateMonthAverage(9113042),
//            url = "https://emojipedia.org/repeat-button/"
//        ),
        Item(
            id = 111111111,
            emojiId = "1F696",
            name = "Oncoming Taxi",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/oncoming-taxi_1f696.png",
            sign = "\uD83D\uDE96", // 🚖
            backgroundColor = null,
            number = calculateMonthAverage(9088679),
            url = "https://emojipedia.org/oncoming-taxi/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F320",
            name = "Shooting Star",
            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/shooting-star_1f320.png",
            sign = "\uD83C\uDF20", // 🌠
            backgroundColor = null,
            number = calculateMonthAverage(9035085),
            url = "https://emojipedia.org/shooting-star/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "2755",
//            name = "White Exclamation Mark",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/white-exclamation-mark_2755.png",
//            sign = "❕",
//            backgroundColor = null,
//            number = calculateMonthAverage(9033868),
//            url = "https://emojipedia.org/white-exclamation-mark/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F537",
//            name = "Large Blue Diamond",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/large-blue-diamond_1f537.png",
//            sign = "\uD83D\uDD37", // 🔷
//            backgroundColor = null,
//            number = calculateMonthAverage(8987120),
//            url = "https://emojipedia.org/large-blue-diamond/"
//        ),

        // NEXT STEP

        Item(
            id = 111111111,
            emojiId = "1F415",
            name = "Dog",
            imageUrl = "",
            sign = "\uD83D\uDC15", // 🐕‍
            backgroundColor = null,
            number = calculateMonthAverage(8915660),
            url = "https://emojipedia.org/dog/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F419",
            name = "Octopus",
            imageUrl = "",
            sign = "\uD83D\uDC19", // 🐙
            backgroundColor = null,
            number = calculateMonthAverage(8846652),
            url = "https://emojipedia.org/octopus/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F426",
            name = "Bird",
            imageUrl = "",
            sign = "\uD83D\uDC26", // 🐦
            backgroundColor = null,
            number = calculateMonthAverage(8826518),
            url = "https://emojipedia.org/bird/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F408",
            name = "Cat",
            imageUrl = "",
            sign = "\uD83D\uDC08", // 🐈
            backgroundColor = null,
            number = calculateMonthAverage(8746050),
            url = "https://emojipedia.org/cat/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F460",
            name = "High-Heeled Shoe",
            imageUrl = "",
            sign = "\uD83D\uDC60", // 👠
            backgroundColor = null,
            number = calculateMonthAverage(8706372),
            url = "https://emojipedia.org/high-heeled-shoe/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F3C1",
            name = "Chequered Flag",
            imageUrl = "",
            sign = "\uD83C\uDFC1", // 🏁
            backgroundColor = null,
            number = calculateMonthAverage(8699016),
            url = "https://emojipedia.org/chequered-flag/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F1E9-1F1EA",
//            name = "Flag: Germany",
//            imageUrl = "",
//            sign = "\uD83C\uDDE9\uD83C\uDDEA", // 🇩🇪
//            backgroundColor = null,
//            number = calculateMonthAverage(8633231),
//            url = "https://emojipedia.org/flag-germany/"
//        ),

//        Item(
//            id = 111111111,
//            emojiId = "1F53B",
//            name = "Red Triangle Pointed Down",
//            imageUrl = "",
//            sign = "\uD83D\uDD3B", // 🔻
//            backgroundColor = null,
//            number = calculateMonthAverage(8510354),
//            url = "https://emojipedia.org/red-triangle-pointed-down/"
//        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F536",
//            name = "Large Orange Diamond",
//            imageUrl = "",
//            sign = "\uD83D\uDD36", // 🔶
//            backgroundColor = null,
//            number = calculateMonthAverage(8500593),
//            url = "https://emojipedia.org/large-orange-diamond/"
//        ),

        Item(
            id = 111111111,
            emojiId = "1F305",
            name = "Sunrise",
            imageUrl = "",
            sign = "\uD83C\uDF05", // 🌅
            backgroundColor = null,
            number = calculateMonthAverage(8489736),
            url = "https://emojipedia.org/sunrise/"
        ),


        Item(
            id = 111111111,
            emojiId = "1F43A",
            name = "Wolf",
            imageUrl = "",
            sign = "\uD83D\uDC3A", // 🐺
            backgroundColor = null,
            number = calculateMonthAverage(8459446),
            url = "https://emojipedia.org/wolf/"
        ),

        Item(
            id = 111111111,
            emojiId = "1F393",
            name = "Student",
            imageUrl = "",
            sign = "\uD83E\uDDD1\u200D\uD83C\uDF93", // 🧑‍🎓
            backgroundColor = null,
            number = calculateMonthAverage(8288571),
            url = "https://emojipedia.org/student/"
        ),
        Item(
            id = 111111111,
            emojiId = "2709",
            name = "Envelope",
            imageUrl = "",
            sign = "✉️",
            backgroundColor = null,
            number = calculateMonthAverage(8215129),
            url = "https://emojipedia.org/envelope/"
        ),


//        Item(
//            id = 111111111,
//            emojiId = "0035-20E3",
//            name = "",
//            imageUrl = "",
//            sign = "", //
//            backgroundColor = null,
//            number = calculateMonthAverage(8162375),
//            url = ""
//        ),

        Item(
            id = 111111111,
            emojiId = "231A",
            name = "Watch",
            imageUrl = "",
            sign = "⌚",
            backgroundColor = null,
            number = calculateMonthAverage(7918031),
            url = "https://emojipedia.org/watch/"
        ),
//        Item(
//            id = 111111111,
//            emojiId = "1F503",
//            name = "Clockwise Vertical Arrows",
//            imageUrl = "",
//            sign = "\uD83D\uDD03", // 🔃
//            backgroundColor = null,
//            number = calculateMonthAverage(7915389),
//            url = "https://emojipedia.org/clockwise-vertical-arrows/"
//        ),

        Item(
            id = 111111111,
            emojiId = "26D4",
            name = "No Entry",
            imageUrl = "",
            sign = "⛔",
            backgroundColor = null,
            number = calculateMonthAverage(7749986),
            url = "https://emojipedia.org/no-entry/"
        ),
        Item(
            id = 111111111,
            emojiId = "1F386",
            name = "Fireworks",
            imageUrl = "",
            sign = "\uD83C\uDF86", // 🎆
            backgroundColor = null,
            number = calculateMonthAverage(7682276),
            url = "https://emojipedia.org/fireworks/"
        ),



//        Item(
//            id = 46,
//            name = "Heart Suit",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/heart-suit_2665-fe0f.png",
//            sign = "♥️",
//            backgroundColor = null,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonths,
//            url = "https://emojipedia.org/heart-suit/"
//        ),

//        Item( // TODO don't use
//            id = 67,
//            name = "Middle Finger",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/middle-finger_1f595.png",
//            sign = "\uD83D\uDD95", // 🖕
//            backgroundColor = null,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/middle-finger/"
//        ),
//        Item(
//            id = 68,
//            name = "Black Heart",
//            imageUrl = "https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/apple/325/black-heart_1f5a4.png",
//            sign = "\uD83D\uDDA4", // 🖤
//            backgroundColor = null,
//            number = (TODO / daysFromStartOfStatistic).toLong() * countOfAverageMonth,
//            url = "https://emojipedia.org/black-heart/"
//        ),

    )
}
