package com.example.biblescroller.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.biblescroller.R
import com.example.biblescroller.data.model.Bible

class pageAdapter(
    private val context: Context,
    private val dataset: List<Bible>    //Expects to receive a List of Bibles
) : RecyclerView.Adapter<pageAdapter.itemViewHolder>() {

    class itemViewHolder(private val view: View): ViewHolder(view){
        val bibleImage = view.findViewById<RecyclerView>(R.id.imageScrollerH_rv)
        val bibleName = view.findViewById<TextView>(R.id.bibleName_tv)
        val bibleTranslation = view.findViewById<TextView>(R.id.bibleTranslation_tv)
        val bibleMaterial = view.findViewById<TextView>(R.id.bibleMaterial_tv)
        val bibleColor = view.findViewById<TextView>(R.id.bibleColor_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.page_item, parent, false)
        return itemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val bible = dataset[position]

        holder.bibleImage.adapter = ImageAdapter(context, bible.imageList) //In goes the list with images
        PagerSnapHelper().attachToRecyclerView(holder.bibleImage)

        holder.bibleName.text = bible.name
        holder.bibleTranslation.text = "Translation:\n${bible.translation}"
        holder.bibleMaterial.text = "Material:\n${bible.material}"
        holder.bibleColor.text = "Color:\n${ bible.color }"

    }

    override fun getItemCount(): Int {
       return dataset.size
    }
}