package com.example.news.data.repository

import com.example.news.data.local.dao.NewsDao
import com.example.news.data.model.News
import com.example.news.data.remote.ApiService
import com.example.news.data.remote.responses.DefaultListResponse
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val newsDao: NewsDao
): NewsRepository {
    override suspend fun getHeadlines(country: String?): DefaultListResponse<News> {
        return apiService.getHeadLines()
    }

    override suspend fun insertNewsListLocal(news: List<News>) {
        TODO("Not yet implemented")
    }

    override suspend fun getNewsLocal(): List<News> {
        TODO("Not yet implemented")
    }
}