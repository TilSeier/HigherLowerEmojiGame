package com.tilseier.higherloweremojigame.ui.theme

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

fun PinShape(
    angleDegrees: Float = 270f // 340f
): GenericShape {
    return GenericShape { size, _ ->
        val width = size.width
        val height = size.height

        val startAngleDegrees = 90 + ((360f - angleDegrees) / 2)
        arcTo(
            rect = Rect(
                center = Offset(
                    x = width.times(0.5f),
                    y = height.times(0.5f),
                ),
                radius = width.times(0.45f),
            ),
            startAngleDegrees = startAngleDegrees,
            sweepAngleDegrees = angleDegrees,
            forceMoveTo = false
        )

        lineTo(
            x = width.times(0.5f),
            y = height,
        )
        close()
    }
}

fun GameItemShape(
    topRadiusPx: Float,
    bottomRadiusPx: Float,
): GenericShape {

    return GenericShape { size, _ ->
        val width = size.width
        val height = size.height

        moveTo(
            width,
            height - bottomRadiusPx
        )

        arcTo(
            rect = Rect(
                center = Offset(
                    x = width - bottomRadiusPx,
                    y = height - bottomRadiusPx,
                ),
                radius = bottomRadiusPx,
            ),
            startAngleDegrees = 0f,
            sweepAngleDegrees = 90f,
            forceMoveTo = false
        )

        arcTo(
            rect = Rect(
                center = Offset(
                    x = bottomRadiusPx,
                    y = height - bottomRadiusPx,
                ),
                radius = bottomRadiusPx,
            ),
            startAngleDegrees = 90f,
            sweepAngleDegrees = 90f,
            forceMoveTo = false
        )

        arcTo(
            rect = Rect(
                center = Offset(
                    x = topRadiusPx,
                    y = height.times(0.35f) - topRadiusPx,
                ),
                radius = topRadiusPx,
            ),
            startAngleDegrees = 180f,
            sweepAngleDegrees = 75f,
            forceMoveTo = false
        )
        arcTo(
            rect = Rect(
                center = Offset(
                    x = width - topRadiusPx,
                    y = topRadiusPx,
                ),
                radius = topRadiusPx,
            ),
            startAngleDegrees = 250f,
            sweepAngleDegrees = 110f,
            forceMoveTo = false
        )

        lineTo(width, height)
        close()
    }
}
