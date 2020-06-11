package com.example.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle.*

class Recycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        val exampleList = generateDummyList(500)
        recylerViewId.adapter = MyAdapter(exampleList)
        recylerViewId.layoutManager = LinearLayoutManager(this)
        recylerViewId.setHasFixedSize(true)

    }

    private fun generateDummyList(size: Int): List<Itemdata> {
        val list = ArrayList<Itemdata>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_baseline
                1 -> R.drawable.ic_baseline_2
                else -> R.drawable.ic_baseline3
            }
            val item = Itemdata(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}