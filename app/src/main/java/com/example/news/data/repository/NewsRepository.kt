package com.example.news.data.repository

import com.example.news.data.model.News
import com.example.news.data.remote.responses.DefaultListResponse

interface NewsRepository {
    // Remote
    suspend fun getHeadlines(country: String? = "br"): DefaultListResponse<News>

    // Local
    suspend fun insertNewsListLocal(news: List<News>)
    suspend fun getNewsLocal(): List<News>
}