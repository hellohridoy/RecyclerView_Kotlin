package com.example.recyclerview_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerButtonId.setOnClickListener {
            val intent = Intent(applicationContext,Recycle::class.java)
            startActivity(intent)
        }
    }
}