package com.example.firstcomposeapp

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class FontsExample {

    private val fontFamily = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Thin),
        Font(R.font.lexend_black, FontWeight.Thin),
        Font(R.font.lexend_bold, FontWeight.Thin),
        Font(R.font.lexend_extrabold, FontWeight.Thin),
        Font(R.font.lexend_light, FontWeight.Thin),
        Font(R.font.lexend_medium, FontWeight.Thin),
        Font(R.font.lexend_semibold, FontWeight.Thin),
        Font(R.font.lexend_extralight, FontWeight.Thin)
    )

    @Composable
    fun FontsContents() {
//        setContent { need to call this setContent in MainActivity class
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ) {
                        append("J")
                    }
                    append("etpack ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ) {
                        append("C")
                    }
                    append("ompose")
                },
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }
//    }
    }
}