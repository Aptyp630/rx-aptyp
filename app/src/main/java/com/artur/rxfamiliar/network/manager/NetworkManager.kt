package com.artur.rxfamiliar.network.manager

import com.artur.rxfamiliar.network.NetworkAPI
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkManager {

    companion object {
        const val BASE_URL: String = "https://api.exchangeratesapi.io/"
    }

    fun initRetrofit(): Retrofit {
        val gson = GsonBuilder()
                .setLenient()
                .create()

        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(initOkHttpClient())
                .build()
    }

    private fun initOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
                .addInterceptor(LoggingInterceptor())
                .addInterceptor(interceptor)
                .build()
    }
}