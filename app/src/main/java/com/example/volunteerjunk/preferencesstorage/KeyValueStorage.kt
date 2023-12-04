package com.example.volunteerjunk.preferencesstorage

interface KeyValueStorage {
    fun put(key: String, value: String)
    fun get(key: String): String?
    fun remove(key: String)
    fun putOrRemove(key: String, value: String?) {
        value?.let { put(key, value) } ?: remove(key)
    }
}