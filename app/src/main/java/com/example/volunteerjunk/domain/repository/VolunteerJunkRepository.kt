package com.example.volunteerjunk.domain.repository

import com.example.volunteerjunk.data.dto.AuthTokensDto
import com.example.volunteerjunk.domain.entity.AuthTokenEntity

interface VolunteerJunkRepository {

    suspend fun postAuth(email: String, password: String): AuthTokenEntity
}