package com.example.volunteerjunk.data.repository

import com.example.volunteerjunk.data.dto.AuthTokensDto
import com.example.volunteerjunk.data.mapper.AuthResponseMapperImp
import com.example.volunteerjunk.data.network.ApiService
import com.example.volunteerjunk.datastore.StoreUser
import com.example.volunteerjunk.domain.entity.AuthTokenEntity
import com.example.volunteerjunk.domain.repository.VolunteerJunkRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject


class VolunteerJunkRepositoryImp @Inject constructor(
    private val apiService: ApiService,
    private val mapper: AuthResponseMapperImp,
) : VolunteerJunkRepository {

    override suspend fun postAuth(email: String, password: String): AuthTokenEntity =
        apiService.auth(
            request = AuthTokensDto(
                email = email,
                password = password
            )
        ).let(mapper::dtoToDomain)
}