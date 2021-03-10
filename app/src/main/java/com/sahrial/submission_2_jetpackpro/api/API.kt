package com.sahrial.submission_2_jetpackpro.api

import com.sahrial.submission_2_jetpackpro.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
    private val okHttpClient = OkHttpClient.Builder().apply {}.build()

    private val retrofit:Retrofit.Builder by lazy {
        Retrofit.Builder().apply {
            client(okHttpClient)
            baseUrl(BuildConfig.BASE_URL)
            addConverterFactory(GsonConverterFactory.create())
        }
    }
    val ins: SERVICE by lazy {
        retrofit.build().create(SERVICE::class.java)
    }
}