package com.example.news.utils

import android.util.Log
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.news.data.model.News
import com.example.news.ui.newsList.NewsListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(rv: RecyclerView, data: List<News>?) {
    val adapter = rv.adapter as NewsListAdapter
    adapter.submitList(data)
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

@BindingAdapter("newsTitle")
fun bindNewsTitle(textView: TextView, news: News?){
    Log.d("news", news.toString())
    news?.title?.let {
        textView.text = it
    }
}
@BindingAdapter("newsDescription")
fun TextView.bindNewsDescription(news: News?){
    news?.description?.let {
        text = it
    }
}

