package com.example.news.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.news.data.local.dao.NewsDao
import com.example.news.data.local.db.AppDatabase
import com.example.news.data.remote.ApiService
import com.example.news.data.repository.NewsRepository
import com.example.news.data.repository.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

const val DATABASE_NAME = "news_database"

@InstallIn(ApplicationComponent::class)
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieDao(appDatabase: AppDatabase): NewsDao = appDatabase.newsDao()

    @Singleton
    @Provides
    fun provideAppContext(@ApplicationContext context: Context): Context = context

    @Singleton
    @Provides
    fun provideAppDatabase(context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideNewsRepository(apiService: ApiService, newsDao: NewsDao): NewsRepository =
        NewsRepositoryImpl(apiService, newsDao)
}