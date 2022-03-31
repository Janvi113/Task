package com.example.task

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.items.*

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: myAdapter
    lateinit var listitems:ArrayList<String>
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers=1
        listitems= ArrayList()
        listitems.add(numbers.toString())
        recylerview.apply {
            myAdapter= myAdapter(listitems)
            adapter=myAdapter
            layoutManager=LinearLayoutManager(this@MainActivity)
        }
        swipe.setOnRefreshListener {
            listitems.add((listitems.size+1).toString())
            recylerview.adapter?.notifyDataSetChanged()
            swipe.isRefreshing=false
        }
    }



}



