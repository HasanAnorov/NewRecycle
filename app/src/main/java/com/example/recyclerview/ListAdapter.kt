package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter :RecyclerView.Adapter<viewHolder>() {

    var models : List <user> =listOf()

    fun setData(data:List <user>){
        models=data
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        val itemView :View =LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)

        return viewHolder(itemView)

    }

    override fun getItemCount(): Int {
    return models.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.populateModel(models[position])

    }

}