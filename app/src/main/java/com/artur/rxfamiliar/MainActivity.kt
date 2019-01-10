package com.artur.rxfamiliar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.artur.rxfamiliar.network.pojo.ExchangeLatest
import com.artur.rxfamiliar.network.response.ApiCallResponse
import retrofit2.Response

class MainActivity: AppCompatActivity() {

    companion object {
        val TAG: String? = MainActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomApplication.instance
                .getApi()
                .getLatestExchange()
                .enqueue(object : ApiCallResponse<ExchangeLatest>() {
                    override fun onSuccess(response: Response<ExchangeLatest>) {
                        Log.v(TAG, "Response------------- ${response.body()}")
                    }

                    override fun onError(t: Throwable) {
                        Log.v(TAG, "Error")
                    }
                })
    }
}
