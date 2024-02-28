package com.omega.san.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.browser.document
import kotlinx.browser.window
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay
import org.w3c.dom.events.EventListener

@Composable
fun ObserveViewPortEntered(
    sectionId: String,
    distanceFromTop: Double,
    onViewportEntered: () -> Unit
) {
    var viewportEntered by remember { mutableStateOf(false) }
    val listener = remember {
        EventListener {
            val top =
                document.getElementById(sectionId)?.getBoundingClientRect()?.top
            if (top != null && top < distanceFromTop) {
                viewportEntered = true
            }
        }
    }

    LaunchedEffect(viewportEntered) {
        if (viewportEntered) {
            onViewportEntered()
            window.removeEventListener(
                type = EVENT_LISTENER_TYPE,
                callback = listener
            )
        } else {
            window.addEventListener(
                type = EVENT_LISTENER_TYPE,
                callback = listener
            )
        }
    }
}

suspend fun animatePercentage(
    percent: Int,
    delay : Long = 10L,
    onUpdate: (Int) -> Unit
) {
    (0..percent).forEach {
        delay(delay)
        onUpdate(it)
    }
}
const val EVENT_LISTENER_TYPE = "scroll"