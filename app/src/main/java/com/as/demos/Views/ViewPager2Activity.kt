package com.`as`.demos.Views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.`as`.demos.Adaptors.ViewPager2Adaptor
import com.`as`.demos.R

class ViewPager2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewpager_activity)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = ViewPager2Adaptor()
    }


}