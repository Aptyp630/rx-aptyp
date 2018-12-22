package com.artur.rxfamiliar.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ExchangeLatest(
        @Expose @SerializedName("date")  var date: String,
        @Expose @SerializedName("rates") var rates: Rates,
        @Expose @SerializedName("base")  var base: String
)