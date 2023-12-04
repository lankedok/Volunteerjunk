package com.example.volunteerjunk.data.dto

import com.google.gson.annotations.SerializedName

data class AuthTokenResponseDto(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("refreshToken") val refreshToken: String,
    @SerializedName("token") val token: String
)
