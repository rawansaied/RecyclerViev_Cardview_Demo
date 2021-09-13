package com.rawan.recyclerviev_cardview_demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val fname:Array<String> = arrayOf("Dental checkup","Dental crown","Tooth implant","Dental care")
    private val pics:IntArray = intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4)


    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var  image :   ImageView = itemView.findViewById(R.id.imageView)
        var fname :TextView = itemView.findViewById(R.id.textView)
        init {
            itemView.setOnClickListener{v:View ->
                val position:Int = adapterPosition
                Toast.makeText(itemView.context,"you clicked on item #${position + 1}",Toast.LENGTH_SHORT).show()

            }
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount () : Int {
        return fname.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fname.text=fname[position]
        holder.image.setImageResource(pics[position])

    }

}
