package com.example.recyclerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class MyAdapter(private val exampleList : List<Itemdata>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
       return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.text1.text = currentItem.text1
        holder.text2.text = currentItem.text2
    }

    override fun getItemCount() = exampleList.size


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.image_viewId
        val text1 : TextView = itemView.text1Id
        val text2 : TextView = itemView.text2Id
    }




}