package com.omega.san.sections

import androidx.compose.runtime.Composable
import com.omega.san.components.PortfolioCard
import com.omega.san.components.SectionTitle
import com.omega.san.model.Portfolio
import com.omega.san.model.Section
import com.omega.san.util.Constants
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun PortfolioSection() {
    Box(
        modifier = Modifier
            .id(Section.Portfolio.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        PortfolioContent()
    }
}

@Composable
fun PortfolioContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 25.px),
            section = Section.Portfolio
        )
        PortfolioCards()
    }
}

@Composable
fun PortfolioCards() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(950.px)
            .overflow(Overflow.Hidden)
            .scrollBehavior(ScrollBehavior.Smooth)) {
        Portfolio.entries.forEach { portfolio ->
            PortfolioCard(
                modifier = Modifier.margin(right = 25.px),
                portfolio = portfolio
            )
        }
    }
}