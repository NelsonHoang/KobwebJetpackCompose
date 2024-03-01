package com.omega.san.style

import com.omega.san.components.ID.BOX_PARENT_ID
import com.omega.san.components.ID.COLUMN_PARENT_ID
import com.omega.san.components.ID.GREEN_OVERLAY_ID
import com.omega.san.components.ID.LINK_ICON_ID
import com.omega.san.components.ID.PORTFOLIO_DESCRIPTION_ID
import com.omega.san.components.ID.PORTFOLIO_TITLE_ID
import com.omega.san.model.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val PortfolioSectionStyle by ComponentStyle {
    cssRule(" > #$COLUMN_PARENT_ID > #$BOX_PARENT_ID > #$GREEN_OVERLAY_ID") {
        Modifier
            .width(0.px)
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(":hover > #$COLUMN_PARENT_ID > #$BOX_PARENT_ID > #$GREEN_OVERLAY_ID") {
        Modifier.width(300.px)
    }

    cssRule(" > #$COLUMN_PARENT_ID > #$BOX_PARENT_ID > #$GREEN_OVERLAY_ID > #$LINK_ICON_ID") {
        Modifier
            .visibility(Visibility.Hidden)
    }


    cssRule(":hover > #$COLUMN_PARENT_ID > #$BOX_PARENT_ID > #$GREEN_OVERLAY_ID > #$LINK_ICON_ID") {
        Modifier
            .visibility(Visibility.Visible)
    }

    cssRule(" > #$COLUMN_PARENT_ID > #$PORTFOLIO_TITLE_ID") {
        Modifier
            .color(Theme.Secondary.rgb)
            .translateX(0.percent)
            .transition(
                CSSTransition(property = "width", duration = 200.ms),
                CSSTransition(property = "translate", duration = 200.ms))
    }

    cssRule(":hover > #$COLUMN_PARENT_ID > #$PORTFOLIO_TITLE_ID") {
        Modifier
            .color(Theme.Primary.rgb)
            .translateX(5.percent)
    }

    cssRule(" > #$COLUMN_PARENT_ID > #$PORTFOLIO_DESCRIPTION_ID") {
        Modifier
            .color(Theme.Secondary.rgb)
            .translateX(0.percent)
            .transition(
                CSSTransition(property = "width", duration = 200.ms),
                CSSTransition(property = "translate", duration = 200.ms))
    }

    cssRule(":hover > #$COLUMN_PARENT_ID > #$PORTFOLIO_DESCRIPTION_ID") {
        Modifier
            .color(Theme.Primary.rgb)
            .translateX(5.percent)
    }
}