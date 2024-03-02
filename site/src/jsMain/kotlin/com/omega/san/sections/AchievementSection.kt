package com.omega.san.sections

import androidx.compose.runtime.Composable
import com.omega.san.components.AchievementCard
import com.omega.san.model.Achievement
import com.omega.san.model.Section
import com.omega.san.model.Theme
import com.omega.san.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun AchievementSection() {
    val brekapoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .id(Section.Portfolio.id)
            .fillMaxWidth()
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 100.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center
    ) {
        AchievementContent(brekapoint)
    }
}

@Composable
fun AchievementContent(breakpoint: Breakpoint) {
    SimpleGrid(numColumns = numColumns(base = 1, md = 2, lg = 4)) {
        Achievement.entries.forEach { achievement ->
            AchievementCard(
                modifier = Modifier.margin(
                    right = if (achievement == Achievement.Team) 0.px
                    else {
                        if (breakpoint > Breakpoint.SM) 40.px else 0.px
                    },
                    bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
                ),
                achievement = achievement
            )
        }
    }
}