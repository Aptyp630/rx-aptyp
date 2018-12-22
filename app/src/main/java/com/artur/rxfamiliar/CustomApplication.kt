package com.artur.rxfamiliar

import android.app.Application
import com.artur.rxfamiliar.network.NetworkAPI
import com.artur.rxfamiliar.network.manager.NetworkManager

class CustomApplication: Application() {

    companion object {
        lateinit var instance: CustomApplication
            private set
    }

    private lateinit var networkManager: NetworkManager
    private lateinit var networkAPI: NetworkAPI

    override fun onCreate() {
        super.onCreate()
        instance = this
        networkManager = NetworkManager()
        networkAPI = networkManager.initRetrofit().create(NetworkAPI::class.java)
    }

    fun getApi(): NetworkAPI {
        return networkAPI
    }
}