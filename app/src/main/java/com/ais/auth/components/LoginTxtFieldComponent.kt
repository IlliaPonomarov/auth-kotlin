package com.ais.auth.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import com.ais.auth.ui.theme.LightPink80
import com.ais.auth.ui.theme.Pink80

data class LoginTxtFieldComponent(
    val name: String,
    val label: String,
    val modifier: Modifier=Modifier,
    val input: (String) -> Unit
) {

    @Composable
    fun Build() {
        OutlinedTextField(value = name,
            onValueChange = {
                input(it)
            },
            placeholder = {
                Text(text = label, color = Color(Color.Black.value))
            },
            modifier = modifier,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(LightPink80.value),
                unfocusedPlaceholderColor = Color(LightPink80.value),
                focusedPlaceholderColor = Color(Pink80.value),
                focusedContainerColor = Color(Pink80.value),
            )
        )
    }
}