package com.artur.rxfamiliar.network.response

import android.widget.Toast
import com.artur.rxfamiliar.CustomApplication
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class ApiCallResponse<T>: Callback<T> {

    abstract fun onSuccess(response: Response<T>)
    abstract fun onError(t:Throwable)

    override fun onResponse(call: Call<T>, response: Response<T>) {
        if (response.isSuccessful) {
            onSuccess(response)
            Toast.makeText(CustomApplication.instance.applicationContext, "200 OK", Toast.LENGTH_LONG).show()
        } else {
           Toast.makeText(CustomApplication.instance.applicationContext, "Not 200", Toast.LENGTH_LONG).show()
        }
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        onError(t)
        Toast.makeText(CustomApplication.instance.applicationContext, "on Error", Toast.LENGTH_LONG).show()
    }

}