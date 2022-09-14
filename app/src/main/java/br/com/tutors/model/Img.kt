package br.com.tutors.model

import androidx.annotation.DrawableRes
import br.com.tutors.R

class Logo(
    @DrawableRes val image: Int
)

val imageLogo = Logo(
        image = R.drawable.logotutors
    )