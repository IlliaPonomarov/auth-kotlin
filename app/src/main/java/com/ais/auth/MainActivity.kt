package com.ais.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ais.auth.ui.theme.AuthTheme
import com.ais.auth.components.LoginComponent;


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold(Modifier.fillMaxSize(), contentColor = Color.Black) { padd ->
                AuthTheme {
                    Column {
                        val loginComponent: LoginComponent = LoginComponent()
                        loginComponent.Logging()
                    }
                }
            }
        }
    }
}





