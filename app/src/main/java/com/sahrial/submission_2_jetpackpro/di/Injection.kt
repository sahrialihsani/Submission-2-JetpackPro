package com.sahrial.submission_2_jetpackpro.di

import android.app.Application
import com.sahrial.submission_2_jetpackpro.helper.JSONUtils

object Injection {
    fun providingRepo(api: ApiClient, application: Application): DataRepository {

        val localRepository = LocalRepo.getInstance(JSONUtils(application))
        val remoteRepository = RemoteRepo(api)

        return DataRepository.getInstance(localRepository, remoteRepository)
    }
}