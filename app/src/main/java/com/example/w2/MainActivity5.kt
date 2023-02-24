package com.example.w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val login = findViewById<Button>(R.id.Login)
        login.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        val signup = findViewById<Button>(R.id.Signup)
        signup.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}