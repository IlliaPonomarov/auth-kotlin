package com.ais.auth.domain.entites

data class LoginEntity (
    val username: String,
    val password: String
) {
    fun isValid(): Boolean {
        return username.isNotEmpty() && password.isNotEmpty()
    }
}