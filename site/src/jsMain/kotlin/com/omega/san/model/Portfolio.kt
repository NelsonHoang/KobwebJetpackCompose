package com.omega.san.model

import com.omega.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String
){
    One(
        image = Res.Image.PORTFOLIO1,
        title = "Kudoe",
        description = "Web Design"
    ),
    Two(
        image = Res.Image.PORTFOLIO2,
        title = "Landing Page for NFT",
        description = "Frontend"
    ),
    Three(
        image = Res.Image.PORTFOLIO3,
        title = "NFT Application",
        description = "Frontend/Backend"
    ),
    Four(
        image = Res.Image.PORTFOLIO4,
        title = "Game Statistics Application",
        description = "Web/Mobile App"
    ),
    Five(
        image = Res.Image.PORTFOLIO5,
        title = "Platform for Online Courses",
        description = "Web/Mobile App"
    )
}