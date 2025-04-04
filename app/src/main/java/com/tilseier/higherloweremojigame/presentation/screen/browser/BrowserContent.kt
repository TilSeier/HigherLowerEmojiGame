package com.tilseier.higherloweremojigame.presentation.screen.browser

import android.graphics.Bitmap
import android.net.Uri
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.google.accompanist.web.AccompanistWebViewClient
import com.google.accompanist.web.LoadingState
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewNavigator
import com.google.accompanist.web.rememberWebViewState
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundDarkPurple
import com.tilseier.higherloweremojigame.ui.theme.iOS14EmojiFont

@OptIn(ExperimentalMaterial3Api::class)
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
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(containerColor = itemColor),
            navigationIcon = {
                IconButton(onClick = { onBackClick() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
            },
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = itemEmoji,
                        fontSize = 26.sp,
                        fontFamily = iOS14EmojiFont,
                    )
                    Text(
                        text = itemName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        overflow = TextOverflow.Ellipsis,
                        minLines = 1
                    )
                }
            },
            actions = {
                IconButton(onClick = { url = initialUrl }) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "Refresh",
                        tint = Color.White
                    )
                }
            }
        )

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
