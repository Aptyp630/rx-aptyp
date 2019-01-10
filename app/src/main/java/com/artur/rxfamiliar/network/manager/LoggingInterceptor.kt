package com.artur.rxfamiliar.network.manager

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

class LoggingInterceptor: Interceptor {

    companion object {
        val TAG: String? = LoggingInterceptor::class.simpleName
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val start = System.nanoTime()
        val request = chain.request()
        Log.d(TAG, "Sending Request: ${request.url()} \n ${chain.connection()} \n ${request.headers()}")

        val requestBuilder = request.newBuilder()
                .addHeader("Content-Type", "application/json; charset=utf-8")

        val stop = System.nanoTime()
        val response = chain.proceed(requestBuilder.build())
        Log.d(TAG, "received response: ${response.request().url()} \n ${stop-start} \n ${response.headers()}")
        return response
    }
}