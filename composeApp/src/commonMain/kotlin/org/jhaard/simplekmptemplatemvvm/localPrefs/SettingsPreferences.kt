package org.jhaard.simplekmptemplatemvvm.localPrefs

import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json

/**
 * Local prefs for key/value with examples.
 * Documentation via: https://github.com/russhwolf/multiplatform-settings.
 *
 * @param settings The default Settings instance from Koin.
 */
class SettingsPreferences(private val settings: Settings) {
    private val json = Json

    /**
     * Save value list locally.
     * @param values The value list.
     */
    fun saveValues(key: String, values: List<String?>) {
        val jsonString = json.encodeToString(values)
        settings.putString(key, jsonString)
    }

    /**
     * Fetch values.
     * @return List of values.
     */
    fun getValues(key: String): List<String> {
        val jsonString = settings.getStringOrNull(key) ?: return emptyList()
        return json.decodeFromString(jsonString)
    }

    /**
     * Delete value list from local storage.
     */
    fun clear(key: String) {
        settings.remove(key)
    }

}