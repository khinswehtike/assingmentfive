package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Foods
import kotlinx.android.synthetic.main.foods_show.view.*


class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var foodname = itemView.findViewById<TextView>(R.id.txtfoodname)
    var foodprice=itemView.findViewById<TextView>(R.id.txtprice)
    var foodweight=itemView.findViewById<TextView>(R.id.txtweight)
    var img=itemView.findViewById<ImageView>(R.id.img)


}

class foodAdapter (val foodlist:ArrayList<Foods>):RecyclerView.Adapter<FoodViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.foods_show,parent,false)
        return FoodViewHolder(view)

    }

    override fun getItemCount(): Int {
        return foodlist.size

    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.img.setImageResource(foodlist[position].img)
       holder.foodname.text=foodlist[position].name
        holder.foodprice.text=foodlist[position].price
        holder.foodweight.text=foodlist[position].weight


    }

}