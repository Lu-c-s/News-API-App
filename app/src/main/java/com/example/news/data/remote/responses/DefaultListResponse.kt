package com.example.news.data.remote.responses

import com.example.news.data.model.News

class DefaultListResponse<T>(
    val status: String? = null,
    val totalResults: Int? = null,
    val articles: List<News>? = null
) : BaseResponse()




