package com.ais.auth.presentation.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.ais.auth.presentation.ui.theme.LightPink80
import com.ais.auth.presentation.ui.theme.Pink80

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
                Text(text = label, color = Color.White, style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ))
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