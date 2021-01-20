package com.example.news.data.local.db

import androidx.room.RoomDatabase
import com.example.news.data.local.dao.NewsDao

abstract class AppDatabase: RoomDatabase() {
    abstract fun  newsDao(): NewsDao
}