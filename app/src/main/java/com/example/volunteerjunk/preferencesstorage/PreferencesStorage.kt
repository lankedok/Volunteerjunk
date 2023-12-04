package com.example.volunteerjunk.preferencesstorage

import android.content.Context

class PreferencesStorage(context: Context, prefsName: String = "volunteer-junk_pref_name") : KeyValueStorage {
    private val prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)

    override fun put(key: String, value: String) {
        prefs.edit().putString(key, value).apply()
    }

    override fun get(key: String): String? {
        return prefs.getString(key, null)
    }

    override fun remove(key: String) {
        prefs.edit().remove(key).apply()
    }
}