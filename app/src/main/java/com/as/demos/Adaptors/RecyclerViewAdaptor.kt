package com.`as`.demos.Adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.`as`.demos.Modals.RecyclerViewModal
import com.`as`.demos.R
import com.`as`.demos.Views.ViewPager2Activity

class RecyclerViewAdaptor(private val data: ArrayList<RecyclerViewModal>, val context: Context,val intq : String) : RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_adaptor,parent,false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerViewModal = data[position]
        holder.title.setText(recyclerViewModal.name)
        holder.title.setOnClickListener(View.OnClickListener {
            if (position == 0){
                Toast.makeText(context,recyclerViewModal.name,Toast.LENGTH_SHORT).show()
                val intent = Intent(context, ViewPager2Activity::class.java)
                context.startActivity(intent)
            }
        })


    }

     class ViewHolder(private val view1: View) : RecyclerView.ViewHolder(view1){
         val title = view1.findViewById(R.id.title) as TextView

     }

}