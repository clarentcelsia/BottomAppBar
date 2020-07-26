package com.example.bottomappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //OR YOU CAN USE THIS WAY
    }

    fun Add(view: View) {
        val text = findViewById<TextView>(R.id.textView)
        text.text = getString(R.string.text1)
    }
}