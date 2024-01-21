package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloBtn = findViewById<Button>(R.id.helloButton)
        helloBtn.setOnClickListener {
            Log.v("hello world", "Button clicked")
            Toast.makeText(this, "Hello android user", Toast.LENGTH_SHORT).show()
        }
    }
}