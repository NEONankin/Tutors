package br.com.tutors.model

import androidx.annotation.DrawableRes

class Tutor(
    val name: String,
    val specialty: String,
    @DrawableRes val image: Int
)