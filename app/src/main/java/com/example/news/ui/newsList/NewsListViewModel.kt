package com.example.news.ui.newsList

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.news.data.model.News
import com.example.news.data.repository.NewsRepository
import kotlinx.coroutines.launch
import java.lang.Exception


class NewsListViewModel @ViewModelInject constructor(newsRepository: NewsRepository) :
    ViewModel() {
    private val _newsList = MutableLiveData<List<News>>()
    val newsList: LiveData<List<News>> = _newsList

    init {
        viewModelScope.launch {
            try {
                var responseList = newsRepository.getHeadlines()
                if (responseList?.totalResults!! > 0) {
                    Log.d("TAG", responseList.toString())
                    _newsList.value = responseList.articles
                }
            } catch (e: Exception) {
                Log.d("ERROR", e.toString())
            }
        }
    }

}