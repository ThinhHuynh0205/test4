package com.example.w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}