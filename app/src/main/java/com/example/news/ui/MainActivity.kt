package com.example.news.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    //lateinit var binding: ActivityMainBinding
    //lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(R.layout.activity_main)
//
//        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
//        binding.drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        binding.navView.setNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.miItem1 -> Toast.makeText(applicationContext, "Clicked item 1", Toast.LENGTH_SHORT).show()
//                R.id.miItem2 -> Toast.makeText(applicationContext, "Clicked item 2", Toast.LENGTH_SHORT).show()
//                R.id.miItem3 -> Toast.makeText(applicationContext, "Clicked item 3", Toast.LENGTH_SHORT).show()
//            }
//
//            true
//        }
//
//        setBottomNavigation()
    }

//    private fun setBottomNavigation() {
//        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.miHome -> true
//            }
//            true
//        }
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(toggle.onOptionsItemSelected(item)){
//            return true
//        }
//
//        return super.onOptionsItemSelected(item)
//    }
}