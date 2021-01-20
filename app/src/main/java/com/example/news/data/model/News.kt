package com.example.news.data.model

import androidx.room.Entity

@Entity(tableName = "news")
data class News(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val url: String,
    val urlToImage: String,
    val source: Source
)