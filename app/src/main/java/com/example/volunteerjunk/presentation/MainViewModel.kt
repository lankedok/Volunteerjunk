package com.example.volunteerjunk.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.volunteerjunk.data.dto.AuthTokensDto
import com.example.volunteerjunk.data.network.ApiFactory
import com.example.volunteerjunk.domain.usecases.AuthUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val postAuth: AuthUseCase
) : ViewModel(

)  {

    private val _authState = MutableLiveData<AuthState>(AuthState.Initial)
    val authState: LiveData<AuthState> = _authState



    init {
        getToken()

    }

    private fun getToken() {
        viewModelScope.launch {
            postAuth("excom", "pass1")

        }
    }
}