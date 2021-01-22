package com.example.news.ui.newsList

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.news.databinding.NewsListFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsListFragment : Fragment() {
    private lateinit var viewModel: NewsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = NewsListFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(NewsListViewModel::class.java)
        val adapter = NewsListAdapter()

       binding.newsList.adapter = adapter
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.newsList.observe(viewLifecycleOwner , Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        return binding.root
    }

}