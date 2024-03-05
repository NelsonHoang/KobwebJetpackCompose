package com.omega.san.pages

import androidx.compose.runtime.Composable
import com.omega.san.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

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
        ServiceSection()
        PortfolioSection()
        AchievementSection()
        TestimonialSection()
        ExperienceSection()
        ContactSection()
        FooterSection()
    }
}
