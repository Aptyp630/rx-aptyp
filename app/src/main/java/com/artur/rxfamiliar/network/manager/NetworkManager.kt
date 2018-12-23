package com.artur.rxfamiliar.network.manager

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class NetworkManager {

    companion object {
        const val BASE_URL: String = "https://api.exchangeratesapi.io/"
        const val TIMEOUT_REQUEST: Long = 15L
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
                .readTimeout(TIMEOUT_REQUEST, TimeUnit.SECONDS)
                .build()
    }
}