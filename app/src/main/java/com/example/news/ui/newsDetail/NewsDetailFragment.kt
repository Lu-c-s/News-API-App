package com.example.news.ui.newsDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.databinding.NewsDetailFragmentBinding
import com.google.android.material.appbar.AppBarLayout


class NewsDetailFragment : Fragment() {
    private lateinit var viewModel: NewsDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = NewsDetailFragmentBinding.inflate(inflater, container, false)

        (activity as AppCompatActivity?)!!.setSupportActionBar(binding.toolbar)



        return binding.root
    }

}