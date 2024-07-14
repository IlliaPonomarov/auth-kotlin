package com.ais.auth.ux.entites

data class LoginEntity (
    val username: String,
    val password: String
) {
    fun isValid(): Boolean {
        return username.isNotEmpty() && password.isNotEmpty()
    }
}