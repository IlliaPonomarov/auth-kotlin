package com.ais.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val scrollState = rememberScrollState(0)
    var txt: MutableState<String> = remember {
        mutableStateOf("Hello World")
    }
    val txtFieldNames: List<String> = listOf("username", "password");

    Column(
        modifier = Modifier
            .offset(x = 0.dp, y = 160.dp)
            .size(width = 400.dp, height = 400.dp)
            .padding(18.dp)
            .background(Color.Red)
            .border(1.dp, Color.Black)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center
    ) {

        val boxModifier = Modifier
            .sizeIn(minWidth = 100.dp, minHeight = 50.dp)
            .background(Color.LightGray)
            .border(1.dp, Color.Black)
            .padding(16.dp)
            .align(Alignment.CenterHorizontally)

        txtFieldNames.forEach { name ->

                Column (
                    modifier = Modifier
                        .background(Color.LightGray)
                        .border(1.dp, Color.Black)
                        .align(Alignment.CenterHorizontally)
                )
            {
                    TextField(value = name,
                        onValueChange = {
                            txt.value = it
                        },
                        label = { Text("Enter text") },
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        
        Button(
            onClick = {
                println("Button clicked")
            },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Login")
        }

    }
}



