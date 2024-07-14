package com.ais.auth.ux

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ais.auth.ux.entites.LoginEntity

class LoginViewModel: ViewModel() {
    var login by mutableStateOf(LoginEntity("", ""))

    fun onUsernameChange(username: String) {
        login = login.copy(username = username)
    }

    fun onPasswordChange(password: String) {
        login = login.copy(password = password)
    }

    fun getUserName(): String {
        return login.username
    }

    fun getPassword(): String {
        return login.password
    }

    fun isValid(): Boolean {
        return login.isValid()
    }
}