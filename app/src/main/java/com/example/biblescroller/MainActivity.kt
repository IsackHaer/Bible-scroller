package com.example.biblescroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.biblescroller.adapter.ImageAdapter
import com.example.biblescroller.adapter.pageAdapter
import com.example.biblescroller.data.Datasource
import com.example.biblescroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource(this)
        val bibleList = datasource.loadBible()
        val snapHelper = PagerSnapHelper()

        binding.pageScrollerVRv.adapter = pageAdapter(this,bibleList)
        snapHelper.attachToRecyclerView(binding.pageScrollerVRv)

    }
}