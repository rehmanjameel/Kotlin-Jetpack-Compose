package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            FirstComposeAppTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
//                    .width(600.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Hello", modifier = Modifier
                    .border(5.dp, Color.Black)
                    .padding(15.dp)
                    .offset(10.dp, 20.dp)
                    .border(10.dp, Color.Yellow)
                    .padding(10.dp))
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World!")


            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//    modifier = Modifier.background(Color.Gray))
    Column {
        for (i in 1 .. 10) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        }
    }

//    Box(
//        modifier = Modifier.size(400.dp),
//
//    ) {
//
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 20.sp,
//            modifier = Modifier.align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "Some Other text!",
//            modifier = modifier,
//            color = Color.Blue,
//            fontSize = 20.sp
//        )

//    }
}

@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun GreetingPreview() {
    FirstComposeAppTheme {
//        Greeting("ARJamil")
    }
}