package com.example.news.data.model

import androidx.room.ColumnInfo

data class Source(
    @ColumnInfo(name = "source_id")
    val id: String,
    val name: String
)