package br.com.tutors

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.tutors.model.imageLogo
import br.com.tutors.ui.components.LogoTutors

class LoginScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LogoTutors(img = imageLogo)
                Button(
                    onClick = {
                        val navigate = Intent(this@LoginScreen, MainActivity::class.java)
                        startActivity(navigate)
                    },
                    Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(
                            start = 16.dp,
                            end = 16.dp
                        ),
                    shape = RoundedCornerShape(40.dp)
                ) {
                    Text(
                        text = "Login", fontSize = 16.sp,
                        fontWeight = FontWeight.W600
                    )
                }
            }
        }
    }
}