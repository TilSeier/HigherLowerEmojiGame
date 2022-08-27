package com.tilseier.higherloweremojigame.presentation.components.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.presentation.components.ButtonWithBottomBorder
import com.tilseier.higherloweremojigame.ui.theme.Background
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyMedium
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyMediumBorder
import com.tilseier.higherloweremojigame.util.Intents

@Composable
fun RateDialog(onDismissRequest: () -> Unit) {
    val context = LocalContext.current
    Dialog(onDismissRequest = onDismissRequest) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .background(Color.White)// TODO darker
                .padding(start = 4.dp, end = 4.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Background)
                .clickable {
                    // nothing to do
                }
                .padding(PaddingValues(16.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.rate_message),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = R.drawable.img_five_stars),
                contentDescription = "Five Stars",
                modifier = Modifier.width(180.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            ButtonWithBottomBorder(
                onClick = {
                    Intents.openRatePage(context)
                },
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth(),
                borderColor = MenuDifficultyMediumBorder,
                backgroundColor = MenuDifficultyMedium,
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.button_rate),
                    fontSize = 18.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            ButtonWithBottomBorder(
                onClick = {
                    onDismissRequest()
                },
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth(),
                borderColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.button_maybe_later),
                    fontSize = 18.sp,
                    color = Color.Gray
                )
            }
        }
    }
}
