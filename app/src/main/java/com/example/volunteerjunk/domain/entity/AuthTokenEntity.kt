package com.example.volunteerjunk.domain.entity

import android.os.Parcelable
import androidx.compose.runtime.Immutable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AuthTokenEntity(
    val accessToken: String,
    val refreshToken: String,
    val token: String,
) : Parcelable
