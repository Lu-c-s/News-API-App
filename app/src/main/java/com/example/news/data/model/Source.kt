package com.example.news.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.parcelize.Parcelize


@Parcelize
data class Source(
    @ColumnInfo(name = "source_id")
    val id: String?,
    val name: String?
) : Parcelable