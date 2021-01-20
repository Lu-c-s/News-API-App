package com.example.news.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.news.data.local.dao.NewsDao
import com.example.news.data.model.News

@Database(entities = [News::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun  newsDao(): NewsDao
}