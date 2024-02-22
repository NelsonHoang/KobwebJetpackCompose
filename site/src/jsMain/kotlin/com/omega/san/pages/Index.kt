package com.omega.san.pages

import androidx.compose.runtime.*
import com.omega.san.sections.AboutSection
import com.omega.san.sections.MainSection
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import com.omega.san.worker.EchoWorker
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainSection()
        AboutSection()
    }
}
