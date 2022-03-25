package com.tilseier.higherloweremojigame.extantions

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import kotlin.math.abs
import kotlin.math.roundToLong

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

fun Long.roundTo10(): Long {
    val number = this
    return (number / 10.0).roundToLong() * 10
}

fun Long.roundTo100(): Long {
    val number = this
    return (number / 100.0).roundToLong() * 100
}

fun Long.roundTo1000(): Long {
    val number = this
    return (number / 1000.0).roundToLong() * 1000
}

fun Long.roundTo10000(): Long {
    val number = this
    return (number / 10000.0).roundToLong() * 10000
}

fun Long.roundTo100000(): Long {
    val number = this
    return (number / 100000.0).roundToLong() * 100000
}
