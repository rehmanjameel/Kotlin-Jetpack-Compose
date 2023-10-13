package com.example.firstcomposeapp

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val fontFamily: FontFamily(
//            Font(R.font.lexend_regular, FontWeight.Thin),
//            Font(R.font.lexend_black, FontWeight.Thin),
//            Font(R.font.lexend_bold, FontWeight.Thin),
//            Font(R.font.lexend_extrabold, FontWeight.Thin),
//            Font(R.font.lexend_light, FontWeight.Thin),
//            Font(R.font.lexend_medium, FontWeight.Thin),
//            Font(R.font.lexend_semibold, FontWeight.Thin),
//            Font(R.font.lexend_extralight, FontWeight.Thin)
//        )
        setContent {

            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF10101010))) {
                Text(text = "Jetpack compose",
                    color = Color.White,
                    fontSize = 30.sp
                )
            }

        }

    }

}
