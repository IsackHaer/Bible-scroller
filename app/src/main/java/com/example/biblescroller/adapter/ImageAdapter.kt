package com.example.biblescroller.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.biblescroller.R
import com.example.biblescroller.data.model.Bible

class ImageAdapter(
    private val context: Context,
    private val dataset: List<Int>      //expects a list of Int "images in our case"
) : RecyclerView.Adapter<ImageAdapter.itemViewHolder>() {

    class itemViewHolder(private val view: View) : ViewHolder(view) {
        val bibleImages = view.findViewById<ImageView>(R.id.bibleImage_iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_item, parent, false)
        return itemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val images = dataset[position]
        holder.bibleImages.setImageResource(images)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}