package com.`as`.demos.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.`as`.demos.Adaptors.RecyclerViewAdaptor
import com.`as`.demos.Modals.RecyclerViewModal
import com.`as`.demos.R
import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    var str = String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val list = ArrayList<RecyclerViewModal>()
        list.add(RecyclerViewModal("ViewPager2"))
        recyclerView.adapter = RecyclerViewAdaptor(list,this,"alok")
        calculateSum()


    }
    fun calculateSum(){
        val arrray = arrayOf(0,1,0,0,1,1)
        val arrayNew = ArrayList<Int>()
        for (i in 0 .. arrray.size){
            if (i == 1){

            }
        }
//        for (i in arrray.indices){
//            for (j in arrray.indices){
//                var temp: Int
//                if (arrray[i] < arrray[j]){
//                    temp = arrray[i]
//                    arrray[i] = arrray[j]
//                    arrray[j] = temp
////                    swap(arrray[i],arrray[j])
//                }
//            }
//        }
        println(Arrays.toString(arrray))

    }
    fun swap( a : String, b : String){
        println("$a $b")
        var first = a
        var second = b
        var temp:String

        temp = first
        first = b
        second = temp

        println("$first $second")
    }
//    fun add(a: Int, b: Int) {
//        a =5
//        println(a)
//    }


    




}