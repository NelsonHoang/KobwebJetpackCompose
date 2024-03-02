package com.omega.san.model

import com.omega.san.util.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
) {
    Completed(
        icon = Res.Icon.CHECKMARK,
        number = 120,
        description = "Completed Projects"
    ),
    Active(
        icon = Res.Icon.SHIELD,
        number = 12,
        description = "Active Projects"
    ),
    Satisfied(
        icon = Res.Icon.HAPPY,
        number = 42,
        description = "Satisfied Clients"
    ),
    Team(
        icon = Res.Icon.USER,
        number = 10,
        description = "Team Members"
    )
}