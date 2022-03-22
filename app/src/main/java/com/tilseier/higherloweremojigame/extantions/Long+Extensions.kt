package com.tilseier.higherloweremojigame.extantions

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import kotlin.math.abs

fun Long.formatNumberToString(): String {
    val number = this

    val formattedNumber = DecimalFormat("###,###", DecimalFormatSymbols().apply {
        groupingSeparator = ' '
    }).format(number)

    return formattedNumber
}

fun Long.formatNumberToPrettyString(): String {
    val number = this
    return when {
        abs(number / 1000000) > 1 -> {
            (number / 1000000).toString() + "m"
        }
        abs(number / 1000) > 1 -> {
            (number / 1000).toString() + "k"
        }
        else -> {
            number.toString()
        }
    }
}
