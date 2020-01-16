package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapter.foodAdapter
import com.example.myapplication.model.Foods

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.food_recycler)
        val foodArray=ArrayList<Foods>()
        foodArray.add(Foods(R.drawable.sugar,"Sugar","Price-$30","3Kg"))
        foodArray.add(Foods(R.drawable.rice,"Rice","Price-$70","1Kg"))
        foodArray.add(Foods(R.drawable.peanut,"Peanuts","Price-$25","2Kg"))
        foodArray.add(Foods(R.drawable.rice,"Rice","Price-$70","1Kg"))
        foodArray.add(Foods(R.drawable.sugar,"Sugar","Price-$30","3Kg"))
        val foodadapter=foodAdapter(foodArray)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=foodadapter
    }
}
