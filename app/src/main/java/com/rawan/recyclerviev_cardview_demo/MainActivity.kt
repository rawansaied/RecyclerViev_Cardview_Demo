package com.rawan.recyclerviev_cardview_demo


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    lateinit  var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
     lateinit var layoutManager:RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager=GridLayoutManager(this,2)
        recyclerView.layoutManager=layoutManager

        adapter=RecyclerAdapter()
        recyclerView.adapter=adapter


    }


}