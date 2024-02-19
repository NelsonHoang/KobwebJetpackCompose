package com.omega.san.components

import androidx.compose.runtime.Composable
import com.omega.san.style.SocialLinkStyle
import com.omega.san.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar() {
    Column(
        modifier =
        Modifier
            .margin(right = 25.px)
            .padding(top = 25.px)
            .minWidth(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialLinks()
    }
}

@Composable
private fun SocialLinks() {
    Link(
        path = Constants.FACEBOOK_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaFacebook(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = Constants.TWITTER_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaTwitter(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = Constants.INSTAGRAM_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaInstagram(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = Constants.LINKEDIN_URL,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedinIn(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
}