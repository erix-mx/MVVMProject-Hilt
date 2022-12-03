package io.github.afalalabarce.mvvmproject.data.datastore

import io.github.afalalabarce.mvvmproject.datasource.datastore.PreferencesDataStore
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PreferencesDatastoreRepository @Inject constructor(
    private val preferencesDataStore: PreferencesDataStore
) {
    fun getDeviceId(): Flow<String> = this.preferencesDataStore.getDeviceId()
    fun setDeviceId(deviceId: String){ this.preferencesDataStore.setDeviceId(deviceId) }
}