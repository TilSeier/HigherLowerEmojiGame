package com.tilseier.higherloweremojigame.data.local

import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.UiText
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundDarkPurple
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundLightPurple
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundOrange
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundRed

object InventedItemsList {
    val testItems = listOf(
        Item(
            id = 0,
            backgroundColor = ItemBackgroundRed,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_airplane),
                yearOfInvention = 1903,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Airplane",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_airplane),
                emoji = "✈️", // ✈️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = ItemBackgroundLightPurple,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_car),
                yearOfInvention = 1886,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_automobile",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_car),
                emoji = "\uD83D\uDE97", // 🚗
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_largest_accordion),
                yearOfInvention = 2001,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/largest-accordion",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_largest_accordion),
                emoji = "🪗", // 🪗
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_piñata),
                yearOfInvention = 1586,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pi%C3%B1ata",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_piñata),
                emoji = "🪅", // 🪅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ghosts_n_goblins_video_game),
                yearOfInvention = 1985,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ghosts_%27n_Goblins_(video_game)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ghosts_n_goblins_video_game),
                emoji = "👺", // 👺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_twenty_pound_note),
                yearOfInvention = 1725,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bank_of_England_%C2%A320_note",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_twenty_pound_note),
                emoji = "💷", // 💷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pointe_shoe),
                yearOfInvention = 1795,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pointe_shoe",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pointe_shoe),
                emoji = "🩰", // 🩰
                imageUrl = ""
            )
        ),
    )

    val emojiInventionItems = listOf(
        Item(
            id = 0,
            backgroundColor = ItemBackgroundLightPurple,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_car),
                yearOfInvention = 1886,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_automobile",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_car),
                emoji = "\uD83D\uDE97", // 🚗
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_hamburger),
                yearOfInvention = 1747,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Hamburger",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_hamburger),
                emoji = "🍔", // 🍔
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bomb),
                yearOfInvention = 1221,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bomb",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bomb),
                emoji = "💣", // 💣
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_compass),
                yearOfInvention = 1088,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Compass",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_compass),
                emoji = "🧭", // 🧭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_manual_wheelchair),
                yearOfInvention = 1655,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Wheelchair#Manual_self-propelled_wheelchairs",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_manual_wheelchair),
                emoji = "🦽", // 🦽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorized_wheelchair),
                subtextOfInvention = UiText.StringResource(R.string.text_was_invented_he),
                yearOfInvention = 1930,
                yearOfInventionEnd = 1939,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Motorized_wheelchair",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorized_wheelchair),
                emoji = "🦼", // 🦼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_flashlight),
                yearOfInvention = 1899,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Flashlight",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_flashlight),
                emoji = "🔦", // 🔦
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mechanical_alarm_clock),
                yearOfInvention = 1787,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Alarm_clock",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mechanical_alarm_clock),
                emoji = "⏰", // ⏰
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_stopwatch),
                yearOfInvention = 1695,
                urlWithMoreInformation = "https://museum.seiko.co.jp/en/knowledge/story_06/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_stopwatch),
                emoji = "⏱️", // ⏱️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_manual_wheelchair),
                yearOfInvention = 1655,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Wheelchair#Manual_self-propelled_wheelchairs",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_manual_wheelchair),
                emoji = "🦽", // 🦽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorized_wheelchair),
                yearOfInvention = 1930,
                yearOfInventionEnd = 1939,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Motorized_wheelchair",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorized_wheelchair),
                emoji = "🦼", // 🦼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_flashlight),
                yearOfInvention = 1899,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Flashlight",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_flashlight),
                emoji = "🔦", // 🔦
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mechanical_alarm_clock),
                yearOfInvention = 1787,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Alarm_clock",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mechanical_alarm_clock),
                emoji = "⏰", // ⏰
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_stopwatch),
                yearOfInvention = 1695,
                urlWithMoreInformation = "https://museum.seiko.co.jp/en/knowledge/story_06/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_stopwatch),
                emoji = "⏱️", // ⏱️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mantelpiece_clock),
                yearOfInvention = 1750,
                yearOfInventionEnd = 1759,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mantel_clock",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mantelpiece_clock),
                emoji = "🕰️", // 🕰️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_thermometer),
                yearOfInvention = 1629,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Thermometer",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_thermometer),
                emoji = "🌡️", // 🌡️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_rubber_balloon),
                yearOfInvention = 1824,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Balloon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_rubber_balloon),
                emoji = "🎈", // 🎈
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_joystick),
                yearOfInvention = 1926,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Joystick",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_joystick),
                emoji = "🕹️", // 🕹️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_teddy_bear),
                yearOfInvention = 1902,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Teddy_bear",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_teddy_bear),
                emoji = "🧸", // 🧸
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_piñata),
                yearOfInvention = 1586,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pi%C3%B1ata",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_piñata),
                emoji = "🪅", // 🪅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_studio_microphone),
                yearOfInvention = 1876,
                yearOfInventionEnd = 1877,
                urlWithMoreInformation = "https://digilab.libs.uga.edu/scl/exhibits/show/steel_vintage_mics/mic_early_history",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_studio_microphone),
                emoji = "🎙️", // 🎙️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_banjo),
                yearOfInvention = 1770,
                yearOfInventionEnd = 1777,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Banjo",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_banjo),
                emoji = "🪕", // 🪕
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_radio),
                yearOfInvention = 1895,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Invention_of_radio",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_radio),
                emoji = "📻", // 📻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mobile_phone),
                yearOfInvention = 1973,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mobile_phone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mobile_phone),
                emoji = "📱", // 📱
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = ItemBackgroundDarkPurple,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_smartphone),
                yearOfInvention = 1992,
                yearOfInventionEnd = 1994,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Smartphone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_smartphone),
                emoji = "📱", // 📱
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_iphone),
                yearOfInvention = 2007,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/IPhone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_iphone),
                emoji = "📱", // 📱
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pager),
                yearOfInvention = 1950,
                yearOfInventionEnd = 1959,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pager",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pager),
                emoji = "📟", // 📟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_fax_machine),
                yearOfInvention = 1964, // but the technology that led to that advancement was created much earlier
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fax",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_fax_machine),
                emoji = "📠", // 📠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_battery),
                yearOfInvention = 1800,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Electric_battery",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_battery),
                emoji = "🔋", // 🔋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_plug),
                yearOfInvention = 1904,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_AC_power_plugs_and_sockets",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_plug),
                emoji = "🔌", // 🔌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_laptop),
                yearOfInvention = 1981,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Laptop",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_laptop),
                emoji = "💻", // 💻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_desktop_computer),
                yearOfInvention = 1970, // Programma 101 computer - 1964
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Desktop_computer",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_desktop_computer),
                emoji = "🖥️", // 🖥️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_printer),
                yearOfInvention = 1968,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Printer_(computing)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_printer),
                emoji = "🖨️", // 🖨️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_qwerty_keyboard),
                yearOfInvention = 1873,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/QWERTY",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_qwerty_keyboard),
                emoji = "⌨️", // ⌨️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_computer_mouse),
                yearOfInvention = 1964,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Computer_mouse",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_computer_mouse),
                emoji = "🖱️", // 🖱️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_trackball),
                yearOfInvention = 1946,
                yearOfInventionEnd = 1947,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Trackball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_trackball),
                emoji = "🖲️", // 🖲️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_computer_disk),
                yearOfInvention = 1956,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Disk_storage",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_computer_disk),
                emoji = "💽", // 💽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_floppy_disk),
                yearOfInvention = 1971,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Floppy_disk",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_floppy_disk),
                emoji = "💾", // 💾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_optical_disk),
                yearOfInvention = 1958,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Optical_disc",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_optical_disk),
                emoji = "💿", // 💿
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_dvd),
                yearOfInvention = 1995,
                yearOfInventionEnd = 1996,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/DVD",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_dvd),
                emoji = "📀", // 📀
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_movie_camera),
                yearOfInvention = 1890,
                yearOfInventionEnd = 1891,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Movie_camera",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_movie_camera),
                emoji = "🎥", // 🎥
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_movie_projector),
                yearOfInvention = 1879,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Movie_projector",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_movie_projector),
                emoji = "📽️", // 📽️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_television),
                yearOfInvention = 1926,
                yearOfInventionEnd = 1927,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Television",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_television),
                emoji = "📺", // 📺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_photographic_camera),
                yearOfInvention = 1816,
                urlWithMoreInformation = "https://www.nfi.edu/when-was-the-camera-invented/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_photographic_camera),
                emoji = "📷", // 📷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_videocassette),
                yearOfInvention = 1951,
                yearOfInventionEnd = 1956,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Videotape",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_videocassette),
                emoji = "📼", // 📼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_one_dollar_bill),
                yearOfInvention = 1862,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/United_States_one-dollar_bill",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_one_dollar_bill),
                emoji = "💵", // 💵
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_100_euro_note),
                yearOfInvention = 1999,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/100_euro_note",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_100_euro_note),
                emoji = "💶", // 💶
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_1000_yen_note),
                yearOfInvention = 1945,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/1000_yen_note",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_1000_yen_note),
                emoji = "💴", // 💴
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_twenty_pound_note),
                yearOfInvention = 1725,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bank_of_England_%C2%A320_note",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_twenty_pound_note),
                emoji = "💷", // 💷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_credit_card),
                yearOfInvention = 1950,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Credit_card",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_credit_card),
                emoji = "💳", // 💳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_e_mail),
                yearOfInvention = 1971,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Email",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_e_mail),
                emoji = "📧", // 📧
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_postbox),
                yearOfInvention = 1653,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Post_box",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_postbox),
                emoji = "📮", // 📮
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ballot_box),
                yearOfInvention = 1872,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ballot_box",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ballot_box),
                emoji = "🗳️", // 🗳️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pushpin),
                yearOfInvention = 1900,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Drawing_pin",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pushpin),
                emoji = "📌", // 📌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bar_chart),
                yearOfInvention = 1780,
                yearOfInventionEnd = 1781,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bar_chart",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bar_chart),
                emoji = "📊", // 📊
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_clipboard),
                yearOfInvention = 1870,
                yearOfInventionEnd = 1871,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Clipboard",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_clipboard),
                emoji = "📋", // 📋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ballpoint_pen),
                yearOfInvention = 1888,
                urlWithMoreInformation = "https://www.bbc.com/future/article/20201028-history-of-the-ballpoint-pen",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ballpoint_pen),
                emoji = "🖊️", // 🖊️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_crayon),
                yearOfInvention = 1903,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Crayon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_crayon),
                emoji = "🖍️", // 🖍️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pen_nib),
                yearOfInvention = 1803,
                urlWithMoreInformation = "https://www.zenzoi.com/blogs/articles/the-journey-of-the-pen-nib",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pen_nib),
                emoji = "✒️", // ✒️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_fountain_pen),
                yearOfInvention = 1827,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fountain_pen",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_fountain_pen),
                emoji = "🖋️", // 🖋️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_pencil),
                yearOfInvention = 1795,
                urlWithMoreInformation = "https://blogs.bl.uk/untoldlives/2019/05/the-history-of-the-pencil.html",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_pencil),
                emoji = "✏️", // ✏️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_notebook),
                yearOfInvention = 1888,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Notebook",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_notebook),
                emoji = "📓", // 📓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_paperclip),
                yearOfInvention = 1867,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Paper_clip",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_paperclip),
                emoji = "📎", // 📎
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_file_cabinet),
                yearOfInvention = 1893,
                yearOfInventionEnd = 1895,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Filing_cabinet",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_file_cabinet),
                emoji = "🗄️", // 🗄️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_water_gun),
                yearOfInvention = 1896,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Water_gun",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_water_gun),
                emoji = "🔫", // 🔫
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_wrench),
                yearOfInvention = 1835,
                urlWithMoreInformation = "https://patentyogi.com/this-day-in-patent-history/first-wrench-patented-day-day-patent-history/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_wrench),
                emoji = "🔧", // 🔧
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_screwdriver),
                yearOfInvention = 1475, // between 1475 and 1490
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Screwdriver",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_screwdriver),
                emoji = "🪛", // 🪛
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_hyperlink),
                yearOfInvention = 1964,
                yearOfInventionEnd = 1965,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Hyperlink",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_hyperlink),
                emoji = "🔗", // 🔗
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_test_tube),
                yearOfInvention = 1820,
                yearOfInventionEnd = 1829,
                urlWithMoreInformation = "https://daily.jstor.org/the-invention-of-the-test-tube/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_test_tube),
                emoji = "🧪", // 🧪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_petri_dish),
                yearOfInvention = 1881,
                yearOfInventionEnd = 1887,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Petri_dish",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_petri_dish),
                emoji = "🧫", // 🧫
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_dna_investigation),
                yearOfInvention = 1869,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/DNA",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_dna_investigation),
                emoji = "🧬", // 🧬
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_microscope),
                yearOfInvention = 1600, // around
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Microscope",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_microscope),
                emoji = "🔬", // 🔬
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_telescope),
                yearOfInvention = 1608,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Telescope",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_telescope),
                emoji = "🔭", // 🔭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_satellite_dish),
                yearOfInvention =
                1976,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Satellite_dish",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_satellite_dish),
                emoji = "📡", // 📡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_syringe),
                yearOfInvention = 1853,
                urlWithMoreInformation = "https://www.nms.ac.uk/explore-our-collections/stories/science-and-technology/syringes/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_syringe),
                emoji = "💉", // 💉
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_adhesive_bandage),
                yearOfInvention = 1920,
                yearOfInventionEnd = 1921,
                urlWithMoreInformation = "https://www.band-aid.com/our-brand/brand-history",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_adhesive_bandage),
                emoji = "🩹", // 🩹
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_crutch),
                yearOfInvention = 1917,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Crutch",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_crutch),
                emoji = "🩼", // 🩼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = ItemBackgroundOrange,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_stethoscope),
                yearOfInvention = 1816,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Stethoscope",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_stethoscope),
                emoji = "🩺", // 🩺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_flush_toilet),
                yearOfInvention = 1596,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Flush_toilet",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_flush_toilet),
                emoji = "🚽", // 🚽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_plunger),
                yearOfInvention = 1874,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Plunger",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_plunger),
                emoji = "🪠", // 🪠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_shower),
                yearOfInvention = 1767,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Shower",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_shower),
                emoji = "🚿", // 🚿
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bathtub),
                yearOfInvention = 1883,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bathtub",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bathtub),
                emoji = "🛁", // 🛁
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mouse_trap),
                yearOfInvention = 1894,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mousetrap",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mouse_trap),
                emoji = "🪤", // 🪤
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_razor),
                yearOfInvention = 1762,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Razor",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_razor),
                emoji = "🪒", // 🪒
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_safety_pin),
                yearOfInvention = 1849,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Safety_pin",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_safety_pin),
                emoji = "🧷", // 🧷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_toilet_paper),
                yearOfInvention = 1857,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Toilet_paper",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_toilet_paper),
                emoji = "🧻", // 🧻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_fire_extinguisher),
                yearOfInvention = 1723,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fire_extinguisher",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_fire_extinguisher),
                emoji = "🧯", // 🧯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_shopping_cart),
                yearOfInvention = 1937,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Shopping_cart",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_shopping_cart),
                emoji = "🛒", // 🛒
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_identification_card),
                yearOfInvention = 1985,
                yearOfInventionEnd = 1988,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Identity_document",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_identification_card),
                emoji = "\uD83E\uDEAA", // 🪪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_croissant),
                yearOfInvention = 1838,
                yearOfInventionEnd = 1839,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Croissant",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_croissant),
                emoji = "🥐", // 🥐
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_baguette),
                yearOfInvention = 1920,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Baguette",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_baguette),
                emoji = "🥖", // 🥖
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bagel),
                yearOfInvention = 1610,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bagel",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bagel),
                emoji = "🥯", // 🥯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_french_fries),
                yearOfInvention = 1775, //1795
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/French_Fries",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_french_fries),
                emoji = "🍟", // 🍟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pepperoni_pizza),
                yearOfInvention = 1919, // 1950
                urlWithMoreInformation = "https://www.pizzerialocale.com/pepperoni-a-short-history/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pepperoni_pizza),
                emoji = "🍕", // 🍕
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_taco),
                yearOfInvention = 1905,
                urlWithMoreInformation = "https://www.twistedtaco.com/the-history-of-the-taco",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_taco),
                emoji = "🌮", // 🌮
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_kebab),
                yearOfInvention = 1867,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Kebab",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_kebab),
                emoji = "🍢", // 🍢
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_sushi),
                yearOfInvention = 1824,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_sushi",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_sushi),
                emoji = "🍣", // 🍣
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_narutomaki),
                yearOfInvention = 1800,
                yearOfInventionEnd = 1809,
                urlWithMoreInformation = "https://www.atlasobscura.com/foods/narutomaki-fishcake-ramen",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_narutomaki),
                emoji = "🍥", // 🍥
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_hanami_dango),
                yearOfInvention = 1598,
                urlWithMoreInformation = "https://www.kyotojournal.org/tea-food-2/the-world-of-japanese-dango/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_hanami_dango),
                emoji = "🍡", // 🍡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_fortune_cookie),
                yearOfInvention = 1914,
                yearOfInventionEnd = 1918,
                urlWithMoreInformation = "https://www.infoplease.com/culture-entertainment/food/history-fortune-cookie",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_fortune_cookie),
                emoji = "🥠", // 🥠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_takeout_box),
                yearOfInvention = 1894,
                urlWithMoreInformation = "https://www.nytimes.com/2012/01/15/magazine/the-chinese-takeout-container-is-uniquely-american.html",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_takeout_box),
                emoji = "🥡", // 🥡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_doughnut),
                yearOfInvention = 1847,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Doughnut",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_doughnut),
                emoji = "🍩", // 🍩
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_cupcake),
                yearOfInvention = 1796,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Cupcake",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_cupcake),
                emoji = "🧁", // 🧁
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_chocolate_bar),
                yearOfInvention = 1847,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Chocolate_bar",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_chocolate_bar),
                emoji = "🍫", // 🍫
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_lollipop),
                yearOfInvention = 1908,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Lollipop",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_lollipop),
                emoji = "🍭", // 🍭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_baby_bottle),
                yearOfInvention = 1841,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Baby_bottle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_baby_bottle),
                emoji = "🍼", // 🍼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_horse_race),
                yearOfInvention = 1776,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Horse_racing",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_horse_race),
                emoji = "🏇", // 🏇
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_snowboarding),
                yearOfInvention = 1965,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Snowboarding",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_snowboarding),
                emoji = "🏂", // 🏂
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_golf),
                yearOfInvention = 1457,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Golf",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_golf),
                emoji = "🏌️", // 🏌️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bouncy_ball),
                yearOfInvention = 1965,
                urlWithMoreInformation = "https://www.benjobags.com/the-mighty-bouncy-ball/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bouncy_ball),
                emoji = "⛹️", // ⛹️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_clapper_board),
                yearOfInvention = 1920,
                yearOfInventionEnd = 1929,
                urlWithMoreInformation = "https://definition.org/clapperboard-finally-explained/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_clapper_board),
                emoji = "🎬", // 🎬
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_violin),
                yearOfInvention = 1530,
                yearOfInventionEnd = 1539,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_violin",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_violin),
                emoji = "🎻", // 🎻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_saxophone),
                yearOfInvention = 1846,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Saxophone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_saxophone),
                emoji = "🎷", // 🎷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_headphones),
                yearOfInvention = 1910,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Headphones",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_headphones),
                emoji = "🎧", // 🎧
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_microphone),
                yearOfInvention = 1876,
                yearOfInventionEnd = 1877,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Microphone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_microphone),
                emoji = "🎤", // 🎤
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_disco_ball),
                yearOfInvention = 1917,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Disco_ball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_disco_ball),
                emoji = "🪩", // 🪩
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_puzzle_piece),
                yearOfInvention = 1760,
                yearOfInventionEnd = 1762,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Jigsaw_puzzle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_puzzle_piece),
                emoji = "🧩", // 🧩
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_slot_machine),
                yearOfInvention = 1891,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Slot_machine",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_slot_machine),
                emoji = "🎰", // 🎰
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pool_8_ball),
                yearOfInvention = 1900,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Eight-ball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pool_8_ball),
                emoji = "🎱", // 🎱
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_curling_stone),
                yearOfInvention = 1511,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Curling",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_curling_stone),
                emoji = "🥌", // 🥌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_sled),
                yearOfInvention = 1880,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Sled",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_sled),
                emoji = "🛷", // 🛷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_frisbee_disc),
                yearOfInvention = 1957,
                yearOfInventionEnd = 1958,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Frisbee",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_frisbee_disc),
                emoji = "🥏", // 🥏
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_train),
                yearOfInvention = 1804,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Train",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_train),
                emoji = "🚆", // 🚆
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_xbox_controller),
                yearOfInvention = 2001, // 2000-2001
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Xbox_controller",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_xbox_controller),
                emoji = "🎮", // 🎮
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_synthesizer),
                yearOfInvention = 1952,
                urlWithMoreInformation = "https://artsandculture.google.com/story/NAWhuXju46u1pg",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_synthesizer),
                emoji = "🎹", // 🎹
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_guitar),
                yearOfInvention = 1932,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Electric_guitar",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_guitar),
                emoji = "🎸", // 🎸
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_figure_skates),
                yearOfInvention = 1865,
                urlWithMoreInformation = "https://www.wonderopolis.org/wonder/when-were-ice-skates-invented",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_figure_skates),
                emoji = "⛸️", // ⛸️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_goal_net),
                yearOfInvention = 1889,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/John_Alexander_Brodie",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_goal_net),
                emoji = "🥅", // 🥅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_boxing_gloves),
                yearOfInvention = 1743,
                urlWithMoreInformation = "https://www.infinitudefight.com/boxing-gloves-when-did-boxing-start-using-gloves/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_boxing_gloves),
                emoji = "🥊", // 🥊
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_badminton_game),
                yearOfInvention = 1873,
                urlWithMoreInformation = "https://www.britannica.com/sports/badminton",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_badminton_game),
                emoji = "🏸", // 🏸
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ping_pong),
                yearOfInvention = 1860,
                yearOfInventionEnd = 1879,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Table_tennis",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ping_pong),
                emoji = "🏓", // 🏓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_named_the_game_lacrosse),
                yearOfInvention = 1636,
                urlWithMoreInformation = "https://worldlacrosse.sport/about-world-lacrosse/origin-history/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_named_the_game_lacrosse),
                emoji = "🥍", // 🥍
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ten_pin_bowling),
                yearOfInvention =
                1820,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ten-pin_bowling",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ten_pin_bowling),
                emoji = "🎳", // 🎳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_tennis_rules),
                yearOfInvention = 1875,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_tennis",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_tennis_rules),
                emoji = "🎾", // 🎾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_rugby_football),
                yearOfInvention = 1823,
                urlWithMoreInformation = "https://hanazono-rugby-hos.com/museum-en/origins/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_rugby_football),
                emoji = "🏉", // 🏉
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_american_football_match),
                yearOfInvention = 1869,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/American_football",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_american_football_match),
                emoji = "🏈", // 🏈
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_volleyball),
                yearOfInvention = 1895,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Volleyball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_volleyball),
                emoji = "🏐", // 🏐
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_basketball),
                yearOfInvention = 1891,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Basketball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_basketball),
                emoji = "🏀", // 🏀
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_softball),
                yearOfInvention = 1887,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Softball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_softball),
                emoji = "🥎", // 🥎
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_reference_to_baseball),
                yearOfInvention = 1744,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Baseball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_reference_to_baseball),
                emoji = "⚾", // ⚾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_32_panel_soccer_ball),
                yearOfInvention = 1962,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ball_(association_football)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_32_panel_soccer_ball),
                emoji = "⚽", // ⚽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_roller_skates),
                yearOfInvention = 1760,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Roller_skates",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_roller_skates),
                emoji = "🛼", // 🛼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_skateboard),
                yearOfInvention = 1920,
                yearOfInventionEnd = 1929,

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Skateboard",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_skateboard),
                emoji = "🛹", // 🛹
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_circus_tent),
                yearOfInvention = 1825,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Circus",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_circus_tent),
                emoji = "🎪", // 🎪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bicycle),
                yearOfInvention = 1817,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bicycle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bicycle),
                emoji = "🚴", // 🚴
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_keikogi),
                yearOfInvention = 1882,
                yearOfInventionEnd = 1889,

                urlWithMoreInformation = "https://dragonspiritaylesbury.co.uk/education/the-history-of-the-keikogi/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_keikogi),
                emoji = "🥋", // 🥋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_darts),
                yearOfInvention = 1896,
                urlWithMoreInformation = "https://darthelp.com/articles/the-history-of-darts/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_darts),
                emoji = "🎯", // 🎯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mention_a_flying_saucer),
                yearOfInvention = 1878,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Flying_saucer",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mention_a_flying_saucer),
                emoji = "🛸", // 🛸
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_space_shuttle),
                yearOfInvention = 1976,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Space_Shuttle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_space_shuttle),
                emoji = "🚀", // 🚀
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_satellite),
                yearOfInvention = 1957,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Satellite",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_satellite),
                emoji = "🛰️", // 🛰️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_aerial_tramway),
                yearOfInvention = 1644,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Aerial_tramway",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_aerial_tramway),
                emoji = "🚡", // 🚡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_table_mountain_aerial_cableway),
                yearOfInvention = 1929,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Table_Mountain_Aerial_Cableway",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_table_mountain_aerial_cableway),
                emoji = "🚠", // 🚠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_suspension_railway),
                yearOfInvention = 1825,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Suspension_railway",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_suspension_railway),
                emoji = "🚟", // 🚟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mentioned_word_helicopter),
                yearOfInvention = 1861,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Helicopter",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mentioned_word_helicopter),
                emoji = "🚁", // 🚁
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_parachute),
                yearOfInvention = 1783, // in 1785 coined the word "parachute"
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Parachute",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_parachute),
                emoji = "🪂", // 🪂
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = ItemBackgroundRed,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_airplane),
                yearOfInvention = 1903,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Airplane",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_airplane),
                emoji = "✈️", // ✈️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorboat),
                yearOfInvention = 1886,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Motorboat",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorboat),
                emoji = "🛥️", // 🛥️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ferry),
                yearOfInvention = 1811,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ferry",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ferry),
                emoji = "⛴️", // ⛴️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_passenger_ship),
                yearOfInvention = 1900,
                yearOfInventionEnd = 1901,

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Prinzessin_Victoria_Luise",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_passenger_ship),
                emoji = "🛳️", // 🛳️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_life_preserver),
                yearOfInvention = 1928,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Personal_flotation_device",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_life_preserver),
                emoji = "🛟", // 🛟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_admiralty_pattern_anchor),
                yearOfInvention = 1946,
                yearOfInventionEnd = 1952,

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_anchor",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_admiralty_pattern_anchor),
                emoji = "⚓", // ⚓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_system_of_traffic_signals),
                yearOfInvention = 1868,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Traffic_light",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_system_of_traffic_signals),
                emoji = "🚦", // 🚦
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_traffic_light),
                yearOfInvention = 1912,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Traffic_light",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_traffic_light),
                emoji = "🚥", // 🚥
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_police_car_light),
                yearOfInvention = 1930,
                yearOfInventionEnd = 1939,

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Emergency_vehicle_lighting",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_police_car_light),
                emoji = "🚨", // 🚨
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_tire),
                yearOfInvention = 1845,
                yearOfInventionEnd = 1847,

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Tire",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_tire),
                emoji = "\uD83D\uDEDE", // 🛞 // TODO fix by using iOS 15 or earlier font
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_gasoline_pump),
                yearOfInvention = 1885,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Gasoline_pump",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_gasoline_pump),
                emoji = "⛽", // ⛽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_iron_rails),
                yearOfInvention = 1767,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Railway_track",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_iron_rails),
                emoji = "🛤️", // 🛤️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorway),
                yearOfInvention = 1924,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Controlled-access_highway",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorway),
                emoji = "🛣️", // 🛣️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bus_stop),
                yearOfInvention = 1829,
                urlWithMoreInformation = "https://www.shelter-solutions.co.uk/who-invented-the-bus-stop/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bus_stop),
                emoji = "🚏", // 🚏
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_kickn_go),
                yearOfInvention = 1974,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Kick_scooter",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_kickn_go),
                emoji = "🛴", // 🛴
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pedal_bicycle),
                yearOfInvention = 1863,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_bicycle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pedal_bicycle),
                emoji = "🚲", // 🚲
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_auto_rickshaw),
                yearOfInvention = 1959,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Auto_rickshaw",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_auto_rickshaw),
                emoji = "🛺", // 🛺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motor_scooter),
                yearOfInvention = 1915,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Scooter_(motorcycle)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motor_scooter),
                emoji = "🛵", // 🛵
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorcycle),
                yearOfInvention = 1885,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Motorcycle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorcycle),
                emoji = "🏍️", // 🏍️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_formula_one),
                yearOfInvention = 1950,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Formula_One",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_formula_one),
                emoji = "🏎️", // 🏎️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_gasoline_powered_tractor),
                yearOfInvention = 1889,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Tractor",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_gasoline_powered_tractor),
                emoji = "🚜", // 🚜
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_truck),
                yearOfInvention = 1895,
                yearOfInventionEnd = 1896,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Truck",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_truck),
                emoji = "🚛", // 🚛
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pickup_truck),
                yearOfInvention = 1925,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pickup_truck",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pickup_truck),
                emoji = "🛻", // 🛻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_suv_in_the_modern_style),
                yearOfInvention = 1984,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Sport_utility_vehicle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_suv_in_the_modern_style),
                emoji = "🚙", // 🚙
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_taxicab),
                yearOfInvention = 1897,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Taxi",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_taxicab),
                emoji = "🚕", // 🚕
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_police_car),
                yearOfInvention = 1899,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Police_car",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_police_car),
                emoji = "🚓", // 🚓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_motorised_fire_engines),
                yearOfInvention = 1897,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fire_engine",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_motorised_fire_engines),
                emoji = "🚒", // 🚒
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_gas_powered_ambulance),
                yearOfInvention = 1905,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_the_ambulance",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_gas_powered_ambulance),
                emoji = "🚑", // 🚑
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_minibus),
                yearOfInvention = 1935,
                yearOfInventionEnd = 1955,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Minibus",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_minibus),
                emoji = "🚐", // 🚐
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_trolleybus),
                yearOfInvention = 1882,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Trolleybus",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_trolleybus),
                emoji = "🚎", // 🚎
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mass_produced_bus_model),
                yearOfInvention = 1910,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bus",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mass_produced_bus_model),
                emoji = "🚌", // 🚌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_tram_line),
                yearOfInvention = 1875,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Tram",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_tram_line),
                emoji = "🚋", // 🚋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_monorail_prototype),
                yearOfInvention = 1820,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Monorail",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_monorail_prototype),
                emoji = "🚝", // 🚝
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_lrt_introduced_term),
                yearOfInvention = 1972,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Light_rail",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_lrt_introduced_term),
                emoji = "🚈", // 🚈
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_metro),
                yearOfInvention = 1890,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Rapid_transit",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_metro),
                emoji = "🚇", // 🚇
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bullet_train),
                yearOfInvention = 1964,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/High-speed_rail",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bullet_train),
                emoji = "🚅", // 🚅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_high_speed_train),
                yearOfInvention = 1975,
                yearOfInventionEnd = 1982,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/InterCity_125",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_high_speed_train),
                emoji = "🚄", // 🚄
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_railway_steam_locomotive),
                yearOfInvention = 1804,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Locomotive",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_railway_steam_locomotive),
                emoji = "🚂", // 🚂
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_roller_coaster),
                yearOfInvention = 1817,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Roller_coaster",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_roller_coaster),
                emoji = "🎢", // 🎢
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ferris_wheel),
                yearOfInvention = 1893,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ferris_wheel",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ferris_wheel),
                emoji = "🎡", // 🎡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_merry_go_round),
                yearOfInvention = 1861,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Carousel",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_merry_go_round),
                emoji = "🎠", // 🎠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_statue_of_liberty),
                yearOfInvention = 1886,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Statue_of_Liberty",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_statue_of_liberty),
                emoji = "🗽", // 🗽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_tokyo_tower),
                yearOfInvention = 1957,
                yearOfInventionEnd = 1958,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Tokyo_Tower",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_tokyo_tower),
                emoji = "🗼", // 🗼
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_love_hotel),
                yearOfInvention = 1968,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Love_hotel",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_love_hotel),
                emoji = "🏩", // 🏩
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_hotel),
                yearOfInvention = 1768,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Hotel",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_hotel),
                emoji = "🏨", // 🏨
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_modern_japanese_castle),
                yearOfInvention = 1576,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Japanese_castle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_modern_japanese_castle),
                emoji = "🏯", // 🏯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_24_hour_store),
                yearOfInvention = 1963,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Convenience_store",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_24_hour_store),
                emoji = "🏪", // 🏪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_glasses),
                yearOfInvention = 1285,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Glasses",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_glasses),
                emoji = "👓", // 👓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_robot),
                yearOfInvention = 1954,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Robot",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_robot),
                emoji = "🤖", // 🤖
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_movie_with_robots),
                yearOfInvention = 1919,
                urlWithMoreInformation = "https://history-computer.com/the-10-best-movies-about-robots/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_movie_with_robots),
                emoji = "🤖", // 🤖
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_selfie),
                yearOfInvention = 1839,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Selfie",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_selfie),
                emoji = "🤳", // 🤳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_known_use_of_the_word_selfie),
                yearOfInvention = 2002,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Selfie",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_known_use_of_the_word_selfie),
                emoji = "🤳", // 🤳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_uv_gel_system),
                yearOfInvention = 1982,
                urlWithMoreInformation = "https://beautytrainingstudio.co.uk/history-of-nails",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_uv_gel_system),
                emoji = "💅", // 💅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_robotic_arm),
                yearOfInvention = 1961,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mechanical_arm",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_robotic_arm),
                emoji = "🦾", // 🦾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_recorded_word_zombie),
                yearOfInvention = 1819,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Zombie",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_recorded_word_zombie),
                emoji = "🧟", // 🧟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bikini),
                yearOfInvention = 1946,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bikini",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bikini),
                emoji = "👙", // 👙
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_commercial_lipstick),
                yearOfInvention = 1884,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Lipstick",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_commercial_lipstick),
                emoji = "💄", // 💄
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_pointe_shoe),
                yearOfInvention = 1795,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Pointe_shoe",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_pointe_shoe),
                emoji = "🩰", // 🩰
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_alien_film),
                yearOfInvention = 1979,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Alien_(film)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_alien_film),
                emoji = "👽", // 👽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_alien_video_game),
                yearOfInvention =
                1982,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/List_of_Alien,_Predator,_and_Alien_vs._Predator_games",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_alien_video_game),
                emoji = "👽", // 👽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_electric_loudspeaker),
                yearOfInvention = 1876,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Loudspeaker",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_electric_loudspeaker),
                emoji = "📢", // 📢
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_transistorized_megaphone),
                yearOfInvention = 1954,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Megaphone",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_transistorized_megaphone),
                emoji = "📣", // 📣
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_grapes),
                yearOfInvention = 2021,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/100691-most-grapes-eaten-in-one-minute",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_grapes),
                emoji = "🍇", // 🍇
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_lemons),
                yearOfInvention = 2010,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/fastest-time-to-peel-and-eat-a-lemon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_lemons),
                emoji = "🍋", // 🍋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_bananas),
                yearOfInvention = 2021,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/615526-fastest-time-to-eat-a-banana-no-hands",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_bananas),
                emoji = "🍌", // 🍌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_pineapples),
                yearOfInvention = 2020,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/450297-most-pineapples-on-heads-cut-in-half-in-30-seconds",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_pineapples),
                emoji = "🍍", // 🍍
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_hot_dog),
                yearOfInvention = 2021,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/546576-most-hot-dogs-eaten-at-a-nathans-hot-dog-eating-contest-male",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_hot_dog),
                emoji = "🌭", // 🌭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_burrito),
                yearOfInvention = 2022,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/438487-fastest-time-to-eat-a-burrito",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_burrito),
                emoji = "🌯", // 🌯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_longest_tamale),
                yearOfInvention =
                2018,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/longest-tamale",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_longest_tamale),
                emoji = "🫔", // 🫔
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_heaviest_watermelon),
                yearOfInvention = 2013,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/heaviest-watermelon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_heaviest_watermelon),
                emoji = "🍉", // 🍉
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_longest_snake_melon),
                yearOfInvention = 2020,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/609444-longest-snake-melon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_longest_snake_melon),
                emoji = "🍈", // 🍈
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_eating_kiwi_fruit),
                yearOfInvention = 2008,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/fastest-time-to-peel-and-eat-a-kiwi-fruit",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_eating_kiwi_fruit),
                emoji = "🥝", // 🥝
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_coconut_festival),
                yearOfInvention =
                1996,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Coconut_Festival",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_coconut_festival),
                emoji = "🥥", // 🥥
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_antivirus_program),
                yearOfInvention = 1987,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Antivirus_software",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_antivirus_program),
                emoji = "🛡️", // 🛡️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_known_computer_virus),
                yearOfInvention = 1971,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Antivirus_software",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_known_computer_virus),
                emoji = "🦠", // 🦠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_coronavirus),
                yearOfInvention = 1968,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Coronavirus",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_coronavirus),
                emoji = "🦠", // 🦠
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_movie_about_spider_man),
                yearOfInvention = 2002,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Spider-Man_(2002_film)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_movie_about_spider_man),
                emoji = "🕷️", // 🕷️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_internet),
                yearOfInvention = 1969,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Internet",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_internet),
                emoji = "\uD83C\uDF10️", // 🌐
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_chess_tournament),
                yearOfInvention =
                1841,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Chess_tournament",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_chess_tournament),
                emoji = "♟️", // ♟️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_oktoberfest),
                yearOfInvention = 1810,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Oktoberfest",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_oktoberfest),
                emoji = "🍻", // 🍻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_refrigeration_machine),
                yearOfInvention =
                1805,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Icemaker",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_refrigeration_machine),
                emoji = "🧊", // 🧊
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_single_use_ice_cube_bag),
                yearOfInvention =
                1978,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ice_cube",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_single_use_ice_cube_bag),
                emoji = "🧊", // 🧊
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_juicebox),
                yearOfInvention =
                1963, // officially incorporated in the U.S. market in 1980
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Juicebox_(container",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_juicebox),
                emoji = "🧃", // 🧃
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bank_robbery),
                yearOfInvention = 1831,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bank_robbery",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bank_robbery),
                emoji = "🏦", // 🏦
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_published_issue_of_new_york_daily_times),
                yearOfInvention =
                1851,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/The_New_York_Times",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_published_issue_of_new_york_daily_times),
                emoji = "📰", // 📰
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_barber_college),
                yearOfInvention = 1893,
                urlWithMoreInformation = "https://www.main-street-barbershop.com/blog/articles/History-of-an-Icon-The-Barbershop",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_barber_college),
                emoji = "💈", // 💈
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ogre_board_game),
                yearOfInvention = 1977,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ogre_(board_game)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ogre_board_game),
                emoji = "👹", // 👹
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ghosts_n_goblins_video_game),
                yearOfInvention = 1985,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ghosts_%27n_Goblins_(video_game)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ghosts_n_goblins_video_game),
                emoji = "👺", // 👺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_fencing_as_a_part_of_olympic_games),
                yearOfInvention = 1896,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fencing",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_fencing_as_a_part_of_olympic_games),
                emoji = "🤺", // 🤺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_weightlifting_as_a_part_of_olympic_games),
                yearOfInvention = 1896,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Olympic_weightlifting",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_weightlifting_as_a_part_of_olympic_games),
                emoji = "🏋️", // 🏋️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_male_world_championship_in_weightlifting),
                yearOfInvention = 1891,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Olympic_weightlifting",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_male_world_championship_in_weightlifting),
                emoji = "🏋🏻‍♂️", // 🏋🏻‍♂️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_blue_jeans),
                yearOfInvention = 1871,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Jeans",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_blue_jeans),
                emoji = "👖", // 👖
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ninja_anime),
                yearOfInvention = 1993,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Ninja_Scroll",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ninja_anime),
                emoji = "🥷", // 🥷
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_water_polo_was_played),
                yearOfInvention = 1888,
                urlWithMoreInformation = "https://collegiatewaterpolo.org/fans/gameinfo/history/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_water_polo_was_played),
                emoji = "🤽", // 🤽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ever_official_handball_match),
                yearOfInvention = 1917,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Handball",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ever_official_handball_match),
                emoji = "🤾", // 🤾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_migdal_synagogue_was_discovered),
                yearOfInvention = 2009,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Migdal_Synagogue",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_migdal_synagogue_was_discovered),
                emoji = "🕍", // 🕍
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_mosque_in_north_america),
                yearOfInvention = 1915,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mosque",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_mosque_in_north_america),
                emoji = "🕌", // 🕌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_identified_christian_church),
                yearOfInvention = 233, // founded between 233 and 256
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Church_(building)",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_identified_christian_church),
                emoji = "⛪", // ⛪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_observed_the_rings_of_saturn),
                yearOfInvention = 1655, // 1659, also Galileo Galilei observed the rings of Saturn in 1610, but was unable to determine what they were
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Saturn",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_observed_the_rings_of_saturn),
                emoji = "🪐", // 🪐
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_attempt_to_describe_the_shape_of_the_milky_way),
                yearOfInvention = 1785,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Milky_Way",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_attempt_to_describe_the_shape_of_the_milky_way),
                emoji = "🌌", // 🌌
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_heaviest_onion),
                yearOfInvention = 2014,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/heaviest-onion",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_heaviest_onion),
                emoji = "🧅", // 🧅
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_longest_bean),
                yearOfInvention = 1996,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/73819-longest-green-bean",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_longest_bean),
                emoji = "🫘", // 🫘
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_gilroy_garlic_festival),
                yearOfInvention = 1979,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Gilroy_Garlic_Festival",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_gilroy_garlic_festival),
                emoji = "🧄", // 🧄
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_longest_cucumber),
                yearOfInvention = 2022,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/longest-cucumber",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_longest_cucumber),
                emoji = "🥒", // 🥒
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_eggplant_emoji),
                yearOfInvention = 2010,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Eggplant_emoji",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_eggplant_emoji),
                emoji = "🍆", // 🍆
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_heaviest_avocado),
                yearOfInvention = 2018,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/heaviest-avocado",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_heaviest_avocado),
                emoji = "🥑", // 🥑
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_largest_bread),
                yearOfInvention = 2008,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/largest-bread",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_largest_bread),
                emoji = "🍞", // 🍞
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_largest_pancake),
                yearOfInvention = 1994,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/68403-largest-pancake",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_largest_pancake),
                emoji = "🥞", // 🥞
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_largest_waffle),
                yearOfInvention = 2013,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/largest-waffle",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_largest_waffle),
                emoji = "🧇", // 🧇
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_commercial_bacon_processing_plant),
                yearOfInvention = 1770,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bacon",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_commercial_bacon_processing_plant),
                emoji = "🥓", // 🥓
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_most_expensive_french_fries),
                yearOfInvention = 2021,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/655477-most-expensive-french-fries-chips",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_most_expensive_french_fries),
                emoji = "🍟", // 🍟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_popcorn_machine),
                yearOfInvention =
                1893,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Popcorn_maker",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_popcorn_machine),
                emoji = "🍿", // 🍿
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_largest_oyster),
                yearOfInvention =
                2013,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/largest-oyster",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_largest_oyster),
                emoji = "🦪", // 🦪
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_radio_cooking_show),
                yearOfInvention =
                1924,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Cooking_show",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_radio_cooking_show),
                emoji = "🍳", // 🍳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_umbrella_manufacturing),
                yearOfInvention = 1787,
                urlWithMoreInformation = "https://beachbrella.com/the-history-of-beach-umbrellas/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_umbrella_manufacturing),
                emoji = "⛱️", // ⛱️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_silent_fireworks),
                yearOfInvention = 2015,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Fireworks",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_silent_fireworks),
                emoji = "🎆", // 🎆
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_recorded_railway_station),
                yearOfInvention = 1807,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Train_station",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_recorded_railway_station),
                emoji = "🚉", // 🚉
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_japanese_map_of_provincial_surveys),
                yearOfInvention =
                738,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Japanese_maps",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_japanese_map_of_provincial_surveys),
                emoji = "🗾", // 🗾
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_record_of_displaying_the_doll),
                yearOfInvention =
                1625,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Hinamatsuri",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_record_of_displaying_the_doll),
                emoji = "🎎", // 🎎
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_hinamatsuri_legally_became_the_holiday),
                yearOfInvention =
                1687,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Hinamatsuri",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_hinamatsuri_legally_became_the_holiday),
                emoji = "🎎", // 🎎
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_time_koinobori_have_been_flying_on_childrens_day),
                yearOfInvention = 1948,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Koinobori",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_time_koinobori_have_been_flying_on_childrens_day),
                emoji = "🎏", // 🎏
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_digital_equivalent_of_red_envelope),
                yearOfInvention = 2014,
                urlWithMoreInformation = "https://www.imd.org/research-knowledge/articles/the-uneasy-truce-between-alibaba-and-tencent-is-over/",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_digital_equivalent_of_red_envelope),
                emoji = "🧧", // 🧧
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_standards_relating_to_diving_masks),
                yearOfInvention = 1969,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Diving_mask",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_standards_relating_to_diving_masks),
                emoji = "🤿", // 🤿
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_yo_yo_manufacturing_company),
                yearOfInvention = 1928,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Yo-yo",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_yo_yo_manufacturing_company),
                emoji = "🪀", // 🪀
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_woodcut_print_of_a_kite),
                yearOfInvention =
                1635,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Kite",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_woodcut_print_of_a_kite),
                emoji = "🪁", // 🪁
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_device_for_recording_sound),
                yearOfInvention = 1857,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Sound_recording_and_reproduction",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_device_for_recording_sound),
                emoji = "🎵", // 🎵
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_developed_a_form_of_musical_notation),
                yearOfInvention = 1252,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Musical_notation",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_developed_a_form_of_musical_notation),
                emoji = "🎶", // 🎶
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_series_of_spongebob_squarepants),
                yearOfInvention = 1999,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/SpongeBob_SquarePants",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_series_of_spongebob_squarepants),
                emoji = "🧽", // 🧽
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_known_american_cookbook),
                yearOfInvention = 1796,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Cookbook",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_known_american_cookbook),
                emoji = "🍳", // 🍳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_ever_international_cricket_game),
                yearOfInvention = 1844,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_cricket",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_ever_international_cricket_game),
                emoji = "🏏", // 🏏
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_cookbooks_based_on_renaissance_ideals),
                yearOfInvention = 1475,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Cookbook",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_cookbooks_based_on_renaissance_ideals),
                emoji = "🍳", // 🍳
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_silk_top_hat),
                yearOfInvention = 1793,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Top_hat",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_silk_top_hat),
                emoji = "🎩", // 🎩
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_evil_clown_comics),
                yearOfInvention = 1987,
                yearOfInventionEnd = 1992, // ran in the late 1980s and early 1990s

                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Frenchy_the_Clown",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_evil_clown_comics),
                emoji = "🤡", // 🤡
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_silk_factory),
                yearOfInvention = 1721,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Factory",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_silk_factory),
                emoji = "🏭", // 🏭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_recorded_use_of_the_term_industrial_revolution),
                yearOfInvention = 1799,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Industrial_Revolution",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_recorded_use_of_the_term_industrial_revolution),
                emoji = "🏭", // 🏭
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_high_visibility_clothing),
                yearOfInvention = 1930,
                yearOfInventionEnd = 1939,
                urlWithMoreInformation = "https://www.hbcw.co.uk/news/history-of-high-visibility-workwear",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_high_visibility_clothing),
                emoji = "🦺", // 🦺
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_sale_of_mens_classic_briefs),
                yearOfInvention =
                1935,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Briefs",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_sale_of_mens_classic_briefs),
                emoji = "🩲", // 🩲
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_arrest_because_of_one_piece_swimsuit),
                yearOfInvention =
                1907,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/One-piece_swimsuit",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_arrest_because_of_one_piece_swimsuit),
                emoji = "🩱", // 🩱
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_havaianas),
                yearOfInvention = 1962,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Havaianas",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_havaianas),
                emoji = "🩴", // 🩴
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_shoes_designed_for_running),
                yearOfInvention = 1895,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Sneakers",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_shoes_designed_for_running),
                emoji = "👟", // 👟
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_national_park),
                yearOfInvention = 1872,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/National_park",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_national_park),
                emoji = "🏞️", // 🏞️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_heaviest_cherry),
                yearOfInvention = 2021,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/heaviest-cherry",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_heaviest_cherry),
                emoji = "🍒", // 🍒
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_railway_car),
                yearOfInvention = 1800,
                yearOfInventionEnd = 1809,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Passenger_railroad_car",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_railway_car),
                emoji = "🚃", // 🚃
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_tram),
                yearOfInvention = 1807,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/History_of_trams",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_tram),
                emoji = "🚊", // 🚊
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_white_cane),
                yearOfInvention = 1921,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/White_cane",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_white_cane),
                emoji = "🦯", // 🦯
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_bubble_tea),
                yearOfInvention = 1988,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Bubble_tea",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_bubble_tea),
                emoji = "🧋", // 🧋
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_guinness_record_for_the_largest_accordion),
                yearOfInvention = 2001,
                urlWithMoreInformation = "https://www.guinnessworldrecords.com/world-records/largest-accordion",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_guinness_record_for_the_largest_accordion),
                emoji = "🪗", // 🪗
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_soft_ice_cream),
                yearOfInvention = 1938,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Soft_serve",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_soft_ice_cream),
                emoji = "🍦", // 🍦
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_commercial_camping_ground),
                yearOfInvention = 1894,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Camping",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_commercial_camping_ground),
                emoji = "🏕️", // 🏕️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_recorded_eruption_of_mount_fuji),
                yearOfInvention = 781,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Mount_Fuji",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_recorded_eruption_of_mount_fuji),
                emoji = "🗻", // 🗻
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_calendar_alter_to_celebrate_tsukimi),
                yearOfInvention = 1684,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Tsukimi",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_calendar_alter_to_celebrate_tsukimi),
                emoji = "🎑", // 🎑
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_attested_coffin),
                yearOfInvention = 1380,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Coffin",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_attested_coffin),
                emoji = "⚰️", // ⚰️
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_patented_cigarette_making_machine),
                yearOfInvention = 1847,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Cigarette",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_patented_cigarette_making_machine),
                emoji = "🚬", // 🚬
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_japanese_postal_mark),
                yearOfInvention = 1887,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Japanese_postal_mark",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_japanese_postal_mark),
                emoji = "🏣", // 🏣
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_series_of_the_hospital),
                yearOfInvention = 1971,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/The_Hospital",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_series_of_the_hospital),
                emoji = "🏥", // 🏥
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_primary_school_in_nigeria),
                yearOfInvention = 1845,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/School",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_primary_school_in_nigeria),
                emoji = "🏫", // 🏫
                imageUrl = ""
            )
        ),
        Item(
            id = 0,
            backgroundColor = null,
            invention = Item.Invention(
                nameOfInvention = UiText.StringResource(R.string.invention_first_comet_discovered_by_telescope),
                yearOfInvention = 1680,
                urlWithMoreInformation = "https://en.wikipedia.org/wiki/Great_Comet_of_1680",
                urlWithMoreInformationUiText = UiText.StringResource(R.string.invention_url_first_comet_discovered_by_telescope),
                emoji = "☄️", // ☄️
                imageUrl = ""
            )
        ),
        // END
    )
}
