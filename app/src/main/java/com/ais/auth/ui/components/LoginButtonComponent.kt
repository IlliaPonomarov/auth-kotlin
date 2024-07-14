package com.ais.auth.ui.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ais.auth.ui.theme.LightPink80
import com.ais.auth.ux.LoginViewModel

data class LoginButtonComponent(val username: MutableState<String>,
                                val password: MutableState<String>,
                                val cusModifier: Modifier = Modifier) {


    @Composable
    fun Build(vm: LoginViewModel = viewModel()) {

        Button(
            onClick = {
                println("Button clicked")
                vm.onUsernameChange(username.value)
                vm.onPasswordChange(password.value)
                println("Username: ${vm.getUserName()} Password: ${vm.getPassword()}")

            },
            modifier = Modifier
                .padding(16.dp)
                .then(cusModifier)
            , colors = ButtonDefaults.buttonColors(containerColor = LightPink80,
                contentColor = Color.White),
                border = BorderStroke(2.dp, Color.Black),
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Text("Login", fontSize = 18.sp)
            }
        }
    }
}