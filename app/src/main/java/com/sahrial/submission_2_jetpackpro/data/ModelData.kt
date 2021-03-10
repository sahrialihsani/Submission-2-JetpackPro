package com.sahrial.submission_2_jetpackpro.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelData (
    var id:Int=0,
    var vote_average:Float?=0F,
    var title:String?=null,
    var overview:String?=null,
    var date:String?=null,
    var poster:String?=null,
    var backdrop:String?=null
):Parcelable