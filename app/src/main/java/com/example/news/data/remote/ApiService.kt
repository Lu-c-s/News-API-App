package com.example.news.data.remote

import com.example.news.data.model.News
import com.example.news.data.remote.responses.DefaultListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getHeadLines(
        @Query(ApiParams.COUNTRY) country: String = "br"
    ): Response<DefaultListResponse<News>>
}

object ApiParams  {
    const val COUNTRY = "country"
    const val SEARCH = "q"
    const val CATEGORY = "category"
}