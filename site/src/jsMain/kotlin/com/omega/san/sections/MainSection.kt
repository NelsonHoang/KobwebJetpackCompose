package com.omega.san.sections

import androidx.compose.runtime.Composable
import com.omega.san.components.Header
import com.omega.san.components.SocialBar
import com.omega.san.model.Section
import com.omega.san.util.Constants.SECTION_WIDTH
import com.omega.san.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Box(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        MainContent()
    }
}

@Composable
fun MainBackground() {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.Image.BACKGROUND,
        description = "Background Image"
    )
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        SocialBar()
    }
}