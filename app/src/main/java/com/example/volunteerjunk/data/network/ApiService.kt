package com.example.volunteerjunk.data.network

import com.example.volunteerjunk.data.dto.AuthTokenResponseDto
import com.example.volunteerjunk.data.dto.AuthTokensDto
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("auth")
    @Headers("Content-Length: 2") //TODO МБ УБРАТЬ
    suspend fun auth(
        @Body request: AuthTokensDto
    ) : AuthTokenResponseDto
}