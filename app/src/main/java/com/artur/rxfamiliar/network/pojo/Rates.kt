package com.artur.rxfamiliar.network.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Rates(
        @Expose @SerializedName("PHP") val PHP: Float, @Expose @SerializedName("HUF") val HUF: Float,
        @Expose @SerializedName("SGD") val SGD: Float, @Expose @SerializedName("CZK") val CZK: Float,
        @Expose @SerializedName("RUB") val RUB: Float, @Expose @SerializedName("ILS") val ILS: Float,
        @Expose @SerializedName("JPY") val JPY: Float, @Expose @SerializedName("DKK") val DKK: Float,
        @Expose @SerializedName("CAD") val CAD: Float, @Expose @SerializedName("MYR") val MYR: Float,
        @Expose @SerializedName("AUD") val AUD: Float, @Expose @SerializedName("THB") val THB: Float,
        @Expose @SerializedName("TRY") val TRY: Float, @Expose @SerializedName("NOK") val NOK: Float,
        @Expose @SerializedName("MXN") val MXN: Float, @Expose @SerializedName("CNY") val CNY: Float,
        @Expose @SerializedName("KRW") val KRW: Float, @Expose @SerializedName("GBP") val GBP: Float,
        @Expose @SerializedName("RON") val RON: Float, @Expose @SerializedName("HKD") val HKD: Float,
        @Expose @SerializedName("INR") val INR: Float, @Expose @SerializedName("CHF") val CHF: Float,
        @Expose @SerializedName("HRK") val HRK: Float, @Expose @SerializedName("BRL") val BRL: Float,
        @Expose @SerializedName("NZD") val NZD: Float, @Expose @SerializedName("PLN") val PLN: Float,
        @Expose @SerializedName("BGN") val BGN: Float, @Expose @SerializedName("IDR") val IDR: Float,
        @Expose @SerializedName("ISK") val ISK: Float, @Expose @SerializedName("USD") val USD: Float,
        @Expose @SerializedName("SEK") val SEK: Float, @Expose @SerializedName("ZAR") val ZAR: Float
)