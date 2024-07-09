package com.tilseier.higherloweremojigame.presentation.screen.browser

import android.graphics.Bitmap
import android.net.Uri
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.google.accompanist.web.*
import com.tilseier.higherloweremojigame.presentation.components.AutoSizeText
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundDarkPurple
import com.tilseier.higherloweremojigame.ui.theme.iOS14EmojiFont

@Composable
fun BrowserContent(
    initialUrl: String,
    itemName: String,
    itemEmoji: String,
    itemColor: Color,
    onBackClick: () -> Unit,
) {
    var url by remember { mutableStateOf(initialUrl) }
    val state = rememberWebViewState(url = url)
    val navigator = rememberWebViewNavigator()
    val context = LocalContext.current

    Column {
        TopAppBar(backgroundColor = itemColor) {
            IconButton(onClick = { onBackClick() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = itemEmoji,
                fontSize = 26.sp,
                fontFamily = iOS14EmojiFont,
            )
            Spacer(modifier = Modifier.width(16.dp))
            AutoSizeText(
                text = itemName,
                modifier = Modifier.weight(1f),
                color = Color.White,
                maxFontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.width(16.dp))
            Row(horizontalArrangement = Arrangement.End) {
                IconButton(onClick = { url = initialUrl }) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "Refresh",
                        tint = Color.White
                    )
                }
            }
        }

        val loadingState = state.loadingState
        if (loadingState is LoadingState.Loading) {
            LinearProgressIndicator(
                progress = loadingState.progress,
                modifier = Modifier.fillMaxWidth(),
                color = ItemBackgroundDarkPurple,
            )
        }

        // A custom WebViewClient and WebChromeClient can be provided via subclassing
        val webClient = remember {
            object : AccompanistWebViewClient() {
                override fun onPageStarted(
                    view: WebView,
                    startedUrl: String?,
                    favicon: Bitmap?
                ) {
                    url = startedUrl ?: url
                    super.onPageStarted(view, startedUrl, favicon)
                    Log.d("Accompanist WebView", "Page started loading for $startedUrl")
                }

                override fun shouldOverrideUrlLoading(
                    view: WebView?,
                    request: WebResourceRequest?
                ): Boolean {
                    val uri = request?.url ?: return false
                    return handleUri(uri)
                }

                private fun handleUri(uri: Uri): Boolean {
                    val host = uri.host
                    val currentHost = state.content.getCurrentUrl()?.toUri()?.host

                    // Based on some condition you need to determine if you are going to load the url
                    // in your web view itself or in a browser.
                    // You can use `host` or `scheme` or any part of the `uri` to decide.
                    return if (
                        host == currentHost ||
                        host?.contains("wikipedia.org") == true
                    ) {
                        // Returning false means that you are going to load this url in the webView itself
                        false
                    } else {
                        // Returning true means that you need to handle what to do with the url
                        // e.g. open web page in a Browser
                        Toast.makeText(context, "External Link", Toast.LENGTH_SHORT).show()
                        true
                    }
                }
            }
        }

        WebView(
            state = state,
            modifier = Modifier.weight(1f),
            captureBackPresses = false,
            navigator = navigator,
            onCreated = { webView ->
                webView.settings.javaScriptEnabled = true
                webView.settings.loadWithOverviewMode = true
                webView.settings.useWideViewPort = true
                webView.settings.domStorageEnabled = true
                webView.settings.setSupportZoom(true)
                webView.settings.builtInZoomControls = true
                webView.settings.displayZoomControls = false

                webView.settings.mediaPlaybackRequiresUserGesture = false

                webView.scrollBarStyle = WebView.SCROLLBARS_OUTSIDE_OVERLAY
                webView.isScrollbarFadingEnabled = false
                webView.isVerticalScrollBarEnabled = false
                webView.isHorizontalScrollBarEnabled = false
            },
            client = webClient
        )
    }
}
