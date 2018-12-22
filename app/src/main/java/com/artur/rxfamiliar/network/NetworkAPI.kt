package com.artur.rxfamiliar.network

import com.artur.rxfamiliar.network.pojo.ExchangeLatest
import retrofit2.Call
import retrofit2.http.GET

interface NetworkAPI {

    @GET("latest")
    fun getLatestExchange(): Call<ExchangeLatest>


}