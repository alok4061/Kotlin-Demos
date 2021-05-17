package com.`as`.demos.Adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.`as`.demos.R

class ViewPager2Adaptor : RecyclerView.Adapter<ViewPager2Adaptor.PagerVH>()  {

    private val colors = intArrayOf(
        android.R.color.holo_red_light,
        android.R.color.black,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    class PagerVH(view: View): RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.pagerImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.viewpager_adaptor,parent,false)
        return PagerVH(v)

    }

    override fun getItemCount(): Int {
        return colors.size
    }


    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
      holder.image.setImageResource(colors.get(position))
    }
}