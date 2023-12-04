package com.example.volunteerjunk.data.dto

import com.google.gson.annotations.SerializedName

data class AuthTokensDto(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)
