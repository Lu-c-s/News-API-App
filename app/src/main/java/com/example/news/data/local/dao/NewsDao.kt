package com.example.news.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.news.data.model.News

@Dao
interface NewsDao {
    @Query("SELECT * from news")
    suspend fun getNewsLocal(): List<News>
}