package com.example.news.utils

import androidx.core.net.toUri
import com.bumptech.glide.Glide
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.news.data.model.News
import com.example.news.ui.newsList.NewsListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(rv: RecyclerView, data: List<News>?) {
    val adapter = rv.adapter as NewsListAdapter
    data?.let {
        adapter.submitList(it)
    }
}

@BindingAdapter("bindImage")
fun bindNewsImage(imageView: ImageView, url: String?) {
    url?.let {
        val imgUri = url.toUri().buildUpon().scheme("https").build()

        Glide.with(imageView.context)
            .load(imgUri)
            .into(imageView)
    }
}