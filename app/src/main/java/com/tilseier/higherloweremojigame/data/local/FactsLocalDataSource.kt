package com.tilseier.higherloweremojigame.data.local

import com.tilseier.higherloweremojigame.domain.model.EmojiFact

/**
 * Emoji Facts from:
 * 1. https://www.rectxt.com/post/10-fun-facts-about-emojis-copy
 */

class FactsLocalDataSource {
    val emojiFacts = listOf(
        EmojiFact(
            title = "Emoji Fact #1",
            shortDescription = "The emoji language is the world’s fastest growing language.",
            description = "Emoji use has increased rapidly since Apple added the Emoji keyboard to iOS in 2011 and has been widely described as the 'world's fastest growing language' by many experts. In August 2013 the word 'emoji' was officially added to the Oxford English Dictionary with the definition being \"a small digital image or icon used to express an idea or emotion.\""
        ),
        EmojiFact(
            title = "Emoji Fact #2",
            shortDescription = "There's controversy around who actually invented emojis.",
            description = "While the Egyptians are responsible for creating hieroglyphics (which could be argued as the first true emoji), Japanese phone carrier Docomo has most often been widely credited as the originator of what we know as emoji today. However, new evidence shows that, in fact, Softbank Japan released a phone with support for 90 distinct emoji characters in 1997 which is 2 years before Docomo released emoji capability on their phone.",
        ),
        EmojiFact(
            title = "Emoji Fact #3",
            shortDescription = "'Emoji' translation is \"picture character\".",
            description = "The word emoji literally means \"picture\" (e) + \"character\" (moji) in Japanese.",
        ),
        EmojiFact(
            title = "Emoji Fact #4",
            shortDescription = "Today there are 3000+ emojis.",
            description = "Unicode's official library of emojis is updated every year and as of March 2019 there are 3019 official emojis. 230 new emojis were approved for 2019 with additions including new colors for squares, circles, and hearts as well as a diving mask, hindu temple, and flamingo. Accessibility emojis proposed by Apple in 2018 are also included in this release, as well as a gender inclusive couple.",
        ),
        EmojiFact(
            title = "Emoji Fact #5",
            shortDescription = "There is a World Emoji Day.",
            description = "World Emoji Day is an unofficial holiday celebrated on July 17 every year. The day is deemed a \"global celebration of emoji\" and is celebrated with emoji events and product releases. July 17 was chosen because its the date displayed on the Calendar Emoji.",
        ),
        EmojiFact(
            title = "Emoji Fact #6",
            shortDescription = "'Face With Tears of Joy' was 2018's most used emoji.",
            description = "For the third year running, the \"Face with Tears of Joy\" emoji reigns supreme on social media - this same symbol was even the Oxford Dictionary's Word of the Year in 2015. 'Red Heart', 'Smiling Face With Heart Eyes' and 'Thinking Face' followed as the next 3 most popular emojis used in 2018."
        ),
        EmojiFact(
            title = "Emoji Fact #7",
            shortDescription = "More negative emojis were used during 2016's US Election than ever before.",
            description = "According to Brandwatch, the largest volume of negative emojis ever recorded was during the American election in November 2016. During the week of the election, negative emoji use grew to 28.9% which was a two year high at the time."
        ),
        EmojiFact(
            title = "Emoji Fact #8",
            shortDescription = "Men and women use emojis differently.",
            description = "Another interesting fact released by Brandwatch shows that emoji use differs between men and women. Apparently, women are 11% more likely to use emojis that represent joy and men are 35% more likely to use emojis that represent fear. Other studies show that women are 16% more likely to use emojis compared to men. However, 56% of Eggplant emojis are sent by men..."
        ),
        EmojiFact(
            title = "Emoji Fact #9",
            shortDescription = "3472222 emojis are sent PER SECOND on Messenger.",
            description = "Over 5 billion emojis are sent of Messenger everyday vs 'only' 60 million emojis being sent on Facebook. Stats also show that people are a lot more likely to send heart emojis on Messenger (because it's a private channel) vs 'Tears of Joy' being the most popular on Facebook."
        ),
    )
}
