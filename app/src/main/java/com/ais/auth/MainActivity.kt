package com.ais.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ais.auth.ui.theme.AuthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold(Modifier.fillMaxSize(), contentColor = Color.Black) { padd ->
                AuthTheme {
                    Column {
                        LoggingComponent()
                    }
                }
            }
        }
    }
}

@Composable
fun LoggingComponent() {
    val scrollState = rememberScrollState()


    Column(
        modifier = Modifier
            .size(width = 400.dp, height = 400.dp)
            .padding(16.dp)
            .background(Color.Red)
            .border(1.dp, Color.Black)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center
    ) {

        val boxModifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .border(1.dp, Color.Black)
            .padding(16.dp)
            .align(Alignment.CenterHorizontally)

        Box(modifier = boxModifier, contentAlignment = Alignment.Center)
        {
            Text("Hello World", style = TextStyle(fontSize = 16.sp, fontFamily = FontFamily.Serif))
        }
        Box(modifier = boxModifier,
            contentAlignment = Alignment.Center)
        {
            Text("Hello World", style = TextStyle(fontSize = 16.sp,
                fontFamily = FontFamily.Serif))
        }

    }
}



