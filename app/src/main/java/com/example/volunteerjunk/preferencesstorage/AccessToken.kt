package com.example.volunteerjunk.preferencesstorage

import android.os.Bundle

class AccessToken(params: Map<String, String?>) {
    constructor(
        accessToken: String,
        email: String,
    ) : this(
        mapOf(
            ACCESS_TOKEN to accessToken,
            EMAIL to email
        )
    )

    val accessToken: String
    val email: String

    init {
        this.accessToken = params[ACCESS_TOKEN]!!
        this.email = params[EMAIL]!!
    }

    //TODO bm udalit
    fun save(bundle: Bundle) {
        val tokenBundle = Bundle()
        val tokenParams = toMap()
        for ((key, value) in tokenParams) {
            tokenBundle.putString(key, value)
        }
    }

    fun save(storage: KeyValueStorage) {
        val tokenParams = toMap()
        for ((key, value) in tokenParams) {
            storage.putOrRemove(key, value)
        }
    }

    private fun toMap(): Map<String, String> {
        val result = HashMap<String, String>()
        result[ACCESS_TOKEN] = accessToken
        result[EMAIL] = email
        return result
    }

    companion object {
        private const val ACCESS_TOKEN = "access_token"
        private const val EMAIL = "email"

        private val KEYS = listOf(
            ACCESS_TOKEN,
            EMAIL
        )

        fun restore(keyValueStorage: KeyValueStorage): AccessToken? {
            val tokenParams = java.util.HashMap<String, String?>(KEYS.size)
            for (key in KEYS) {
                keyValueStorage.get(key)?.let {
                    tokenParams[key] = it
                }
            }

            return if (tokenParams.containsKey(ACCESS_TOKEN) && tokenParams.containsKey(EMAIL)) {
                AccessToken(tokenParams)
            }
            else null
        }
    }
}