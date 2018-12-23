package com.artur.rxfamiliar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.artur.rxfamiliar.network.pojo.ExchangeLatest
import com.artur.rxfamiliar.network.response.ApiCallResponse
import retrofit2.Response

class MainActivity: AppCompatActivity() {

    companion object {
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomApplication.instance
                .getApi()
                .getLatestExchange()
                .enqueue(object : ApiCallResponse<ExchangeLatest>() {
                    override fun onSuccess(response: Response<ExchangeLatest>) {

                    }

                    override fun onError(t: Throwable) {

                    }
                })
    }
}
