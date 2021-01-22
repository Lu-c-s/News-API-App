package com.example.news.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "news")
@Parcelize
data class News(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    @ColumnInfo(name = "published_at")
    val publishedAt: String?,
    val title: String?,
    val url: String?,
    @ColumnInfo(name = "url_to_image")
    val urlToImage: String?,
    @Embedded
    val source: Source?
) : Parcelable