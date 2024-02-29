package com.omega.san.model

import com.omega.san.util.Constants.LOREM_IPSUM_SHORTEST
import com.omega.san.util.Res

enum class Service(
    val icon: String,
    val imageDescription: String,
    val title : String,
    val description: String
) {
    Android(
        icon = Res.Icon.ANDROID,
        imageDescription = "Android Icon",
        title = "Android Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    IOS(
        icon = Res.Icon.APPLE,
        imageDescription = "Apple Icon",
        title = "iOS Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Web(
        icon = Res.Icon.WEB,
        imageDescription = "Desktop Icon",
        title = "Web Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Design(
        icon = Res.Icon.DESIGN,
        imageDescription = "Pen Icon",
        title = "UX/UI Design",
        description = LOREM_IPSUM_SHORTEST
    ),
    Business(
        icon = Res.Icon.BUSINESS,
        imageDescription = "Chart Icon",
        title = "Business Analysis",
        description = LOREM_IPSUM_SHORTEST
    ),
    SEO(
        icon = Res.Icon.SEO,
        imageDescription = "Megaphone Icon",
        title = "SEO Marketing",
        description = LOREM_IPSUM_SHORTEST
    )
}