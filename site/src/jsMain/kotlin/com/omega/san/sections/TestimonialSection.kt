package com.omega.san.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.omega.san.components.SectionTitle
import com.omega.san.components.TestimonialCard
import com.omega.san.model.Section
import com.omega.san.model.Testimonial
import com.omega.san.model.Theme
import com.omega.san.util.Constants
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*

@Composable
fun TestimonialSection() {
    Box(
        modifier = Modifier
            .id(Section.Testimonial.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        TestimonialContent()
    }
}

@Composable
fun TestimonialContent() {
    val breakpoint = rememberBreakpoint()
    var selectedPage by remember { mutableStateOf(0) }
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
            section = Section.Testimonial,
            alignment = Alignment.CenterHorizontally
        )
        TestimonialCards(breakpoint, selectedPage)
        TestimonialNavigation(
            selectedPage = selectedPage,
            onNavigate = { index ->
                selectedPage = index
            }
        )
    }
}

@Composable
fun TestimonialCards(breakpoint: Breakpoint, selectedPage: Int) {
    val testimonial1 =
        listOf(Testimonial.First, Testimonial.Third, Testimonial.Fifth)
    val testimonial2 =
        listOf(Testimonial.Second, Testimonial.Fourth, Testimonial.Sixth)
    SimpleGrid(
        modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 40.px),
        numColumns = numColumns(base = 1, md = 2)
    ) {
        Box {
            testimonial1.forEach { testimonial ->
                createTestimonialCard(breakpoint, testimonial, selectedPage)
            }
        }
        Box {
            testimonial2.forEach { testimonial ->
                createTestimonialCard(breakpoint, testimonial, selectedPage)
            }
        }
    }
}

@Composable
fun TestimonialNavigation(
    selectedPage: Int,
    onNavigate: (Int) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(3) { index ->
            Box(
                modifier = Modifier
                    .margin(right = 10.px)
                    .cursor(Cursor.Pointer)
                    .size(12.px)
                    .borderRadius(50.px)
                    .backgroundColor(
                        if (selectedPage == index) Theme.Primary.rgb
                        else Theme.LightGray.rgb
                    )
                    .onClick {
                        onNavigate(index)
                    }
            )
        }
    }
}

@Composable
fun createTestimonialCard(
    breakpoint: Breakpoint,
    testimonial: Testimonial,
    selectedPage: Int
) {
    TestimonialCard(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 90.percent
                else 100.percent
            )
            .margin(
                bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
            )
            .visibility(
                setVisibility(
                    selectedPage = selectedPage,
                    testimonial = testimonial
                )
            )
            .opacity(
                setOpacity(
                    selectedPage = selectedPage,
                    testimonial = testimonial
                )
            )
            .transition(
                CSSTransition(property = "visibility", duration = 300.ms),
                CSSTransition(property = "opacity", duration = 300.ms)
            ),
        testimonial = testimonial,
        breakpoint = breakpoint
    )
}

private fun setVisibility(
    selectedPage: Int,
    testimonial: Testimonial
): Visibility {
    return when (testimonial) {
        Testimonial.First -> {
            if (selectedPage == 0) Visibility.Visible else Visibility.Hidden
        }

        Testimonial.Second -> {
            if (selectedPage == 0) Visibility.Visible else Visibility.Hidden
        }

        Testimonial.Third -> {
            if (selectedPage == 1) Visibility.Visible else Visibility.Hidden
        }

        Testimonial.Fourth -> {
            if (selectedPage == 1) Visibility.Visible else Visibility.Hidden
        }

        Testimonial.Fifth -> {
            if (selectedPage == 2) Visibility.Visible else Visibility.Hidden
        }

        Testimonial.Sixth -> {
            if (selectedPage == 2) Visibility.Visible else Visibility.Hidden
        }
    }
}

private fun setOpacity(
    selectedPage: Int,
    testimonial: Testimonial
): CSSSizeValue<CSSUnit.percent> {
    return when (testimonial) {
        Testimonial.First -> {
            if (selectedPage == 0) 100.percent else 0.percent
        }

        Testimonial.Second -> {
            if (selectedPage == 0) 100.percent else 0.percent
        }

        Testimonial.Third -> {
            if (selectedPage == 1) 100.percent else 0.percent
        }

        Testimonial.Fourth -> {
            if (selectedPage == 1) 100.percent else 0.percent
        }

        Testimonial.Fifth -> {
            if (selectedPage == 2) 100.percent else 0.percent
        }

        Testimonial.Sixth -> {
            if (selectedPage == 2) 100.percent else 0.percent
        }
    }
}