package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 private   val adapter :ListAdapter= ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter=adapter

        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        setdata()
    }

    fun setdata(){

        val models :MutableList <user> = mutableListOf()


        for(i in 0 until 1000){

            val model :user=user()

            model.title="Title ${i+1}"
            model.description="Description ${i+1}"

            models.add(model)
        }

        adapter.setData(models)
    }

}
