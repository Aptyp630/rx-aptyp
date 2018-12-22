package com.artur.rxfamiliar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.artur.rxfamiliar.network.pojo.ExchangeLatest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity: AppCompatActivity() {

    companion object {
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = CustomApplication.instance.getApi().getLatestExchange()
        call.enqueue(object : Callback<ExchangeLatest> {
            override fun onFailure(call: Call<ExchangeLatest>, t: Throwable) {
                Log.v(TAG, "Failure:")
            }

            override fun onResponse(call: Call<ExchangeLatest>, response: Response<ExchangeLatest>) {
                if (response.isSuccessful) {
                    Log.v(TAG, "Success")
                } else {
                    Log.v(TAG, "Unsuccess")
                }
            }
        })
    }
}
