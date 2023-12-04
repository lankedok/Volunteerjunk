package com.example.volunteerjunk.data.mapper

import com.example.volunteerjunk.data.dto.AuthTokenResponseDto
import com.example.volunteerjunk.domain.entity.AuthTokenEntity
import javax.inject.Inject


interface AuthResponseMapper {
    fun dtoToDomain(responseDto: AuthTokenResponseDto) : AuthTokenEntity
}

class AuthResponseMapperImp @Inject constructor() :  AuthResponseMapper {
    override fun dtoToDomain(responseDto: AuthTokenResponseDto): AuthTokenEntity = AuthTokenEntity(
        accessToken = responseDto.accessToken,
        refreshToken = responseDto.refreshToken,
        token = responseDto.token
    )
}