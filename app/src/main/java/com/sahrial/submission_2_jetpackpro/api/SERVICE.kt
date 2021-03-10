package com.sahrial.submission_2_jetpackpro.api

import com.sahrial.submission_2_jetpackpro.BuildConfig
import com.sahrial.submission_2_jetpackpro.data.source.remote.response.ResponseAll
import com.sahrial.submission_2_jetpackpro.data.source.remote.response.ResponseMovie
import com.sahrial.submission_2_jetpackpro.data.source.remote.response.ResponseTV
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.Call
interface SERVICE {
    //MovieDetail
    @GET("movie/{movie_id}")
    fun getMovieDetail(@Path("movie_id") movie_id:Int,
    @Query("api_key") api_key:String=BuildConfig.API_KEY)
    //MovieNow
    @GET("movie/now_playing")
    fun getMovieNow(@Query("api_key") api_key: String=BuildConfig.API_KEY) : Call<ResponseAll<ResponseMovie>>
    //DetailTv
    @GET("tv/{tv_id}")
    fun getDetailTv(@Path("tv_id") tv_id:Int,
    @Query("api_key") api_key:String =BuildConfig.API_KEY): Call<ResponseTV>
    //TvOnAir
    @GET("tv/on_the_air")
    fun getTvOnAir(@Query("api_key") api_key: String = BuildConfig.API_KEY): Call<ResponseAll<ResponseTV>>
}