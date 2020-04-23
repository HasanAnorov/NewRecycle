package com.example.recyclerview


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class viewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {

    private val tvTitle :TextView= itemView.tvTitle
    private val tvDescription :TextView =itemView.tvDescription

    fun populateModel(user:user){
        tvTitle.text=user.title
        tvDescription.text=user.description

    }

}