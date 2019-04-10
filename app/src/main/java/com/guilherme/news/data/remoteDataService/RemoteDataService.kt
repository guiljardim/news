package com.guilherme.news.data.remoteDataService

import com.guilherme.news.data.model.ResponseModel
import kotlinx.coroutines.Deferred
import retrofit2.Call

class RemoteDataService {

     fun callNews(newsApiClient: newsApi, token: String,source:String): Call<ResponseModel> {
        return newsApiClient.getListofNews(source, token)
    }
}