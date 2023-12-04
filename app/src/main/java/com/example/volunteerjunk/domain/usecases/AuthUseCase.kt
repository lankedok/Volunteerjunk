package com.example.volunteerjunk.domain.usecases

import com.example.volunteerjunk.domain.entity.AuthTokenEntity
import com.example.volunteerjunk.domain.repository.VolunteerJunkRepository
import javax.inject.Inject



class AuthUseCase @Inject constructor(
    private val repository: VolunteerJunkRepository,
) {
    suspend operator fun invoke(email: String, password: String): AuthTokenEntity {
        return repository.postAuth(email, password)
    }
}