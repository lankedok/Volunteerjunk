package com.example.volunteerjunk.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class StoreUser(private val context: Context)  {

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("Token")
        val TOKEN_KEY = stringPreferencesKey("token")
    }

    val getToken: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[TOKEN_KEY] ?: ""
        }

    suspend fun safeToken(name: String) {
        context.dataStore.edit { preferences ->
            preferences[TOKEN_KEY] = name
        }
    }


}