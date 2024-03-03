package com.omega.san.model

import com.omega.san.util.Constants.LOREM_IPSUM_SHORT
import com.omega.san.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String
) {
    First(
        image = Res.Image.AVATAR1,
        fullName = "Milica Ilic",
        profession = "Web Designer",
        review = LOREM_IPSUM_SHORT
    ),
    Second(
        image = Res.Image.AVATAR2,
        fullName = "Stefan Jovanovic",
        profession = "Android Developer",
        review = LOREM_IPSUM_SHORT
    ),
    Third(
        image = Res.Image.AVATAR3,
        fullName = "Ana Milic",
        profession = "Business Analyst",
        review = LOREM_IPSUM_SHORT
    ),
    Fourth(
        image = Res.Image.AVATAR4,
        fullName = "Darko Pesic",
        profession = "Top Manager",
        review = LOREM_IPSUM_SHORT
    ),
    Fifth(
        image = Res.Image.AVATAR5,
        fullName = "Milena Nesovic",
        profession = "HR Recruiter",
        review = LOREM_IPSUM_SHORT
    ),
    Sixth(
        image = Res.Image.AVATAR6,
        fullName = "Aca Rodic",
        profession = "Cyber Security Analyst",
        review = LOREM_IPSUM_SHORT
    )
}