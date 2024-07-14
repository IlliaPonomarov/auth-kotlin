package com.ais.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.ais.auth.R

public class LoginComponent {
    @Composable
    fun Logging() {
        val scrollState = rememberScrollState(0)
        val username: MutableState<String> = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }

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
            Column (modifier = Modifier
                .offset(x = 130.dp)
                .padding(5.dp)
                .background(Color.Green),
                verticalArrangement = Arrangement.Center
            )
            {
                /**
                 * Unicorn Logo
                 */
                Logo();
            }

            Spacer(modifier = Modifier.size(8.dp))

            Column (
                    modifier = Modifier
                        .background(Color.LightGray)
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                )
            {
                /**
                 * username and password text fields
                 **/
                LoginTextFields(username, password)
            }


            LoginButtonComponent(username, password, Modifier.align(Alignment.CenterHorizontally)).Build()

        }
    }


    @Composable
    private fun Logo() {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.unicornicons),
            modifier = Modifier.size(80.dp),
            contentDescription = "Unicorn Logo"
        )
    }


    @Composable
    private fun LoginTextFields(username: MutableState<String>, password: MutableState<String>) {
        LoginTxtFieldComponent(
            name = username.value,
            label = "username",
            input = {
                username.value = it
            }
        ).Build()
        Spacer(modifier = Modifier.size(8.dp))

        LoginTxtFieldComponent(
            name = password.value,
            label = "password",
            input = {
                password.value = it

            }
        ).Build()
    }


}