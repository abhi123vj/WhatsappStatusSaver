package com.abh16am.whatsappsupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

//hi
class MainActivity : AppCompatActivity() {
    lateinit var recylerHome : RecyclerView

    lateinit var  layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}