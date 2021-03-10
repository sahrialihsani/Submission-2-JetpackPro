package com.sahrial.submission_2_jetpackpro.data.source

import androidx.lifecycle.LiveData
import com.sahrial.submission_2_jetpackpro.data.ModelData

interface ContentDataSource {
    //Movie
    fun getNowMovies(): LiveData<List<ModelData>>
    fun getDetailMovie(movId:Int):LiveData<ModelData>
    //TvShow
    fun getTVOnAir():LiveData<List<ModelData>>
    fun getDetailTv(tvId:Int):LiveData<ModelData>
}