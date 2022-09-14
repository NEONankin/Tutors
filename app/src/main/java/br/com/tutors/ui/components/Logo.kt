package br.com.tutors.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.tutors.model.Logo
import br.com.tutors.model.imageLogo

@Composable
fun LogoTutors(img : Logo) {
    Image(
        painter = painterResource(id = img.image),
        contentDescription = "Logo do aplicativo Tutors."
    )
}

@Preview
@Composable
fun LogoTutorsPreview() {
    LogoTutors(img = imageLogo)
}
