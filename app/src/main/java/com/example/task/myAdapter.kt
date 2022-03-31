package com.example.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(val listitems: ArrayList<String>):RecyclerView.Adapter<myAdapter.myholder>() {
    class myholder(itemView: View) :RecyclerView.ViewHolder(itemView) {
          val number=itemView.findViewById<TextView>(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return myholder(view)

    }

    override fun onBindViewHolder(holder: myholder, position: Int) {
       holder.number.text=listitems[position]
    }

    override fun getItemCount(): Int {
        return listitems.size
    }
}