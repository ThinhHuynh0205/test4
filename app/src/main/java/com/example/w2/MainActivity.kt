package com.example.w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
        val intent: Intent = Intent (this, MainActivity2::class.java)
        startActivity(intent)
        }, 2000) // 2000 là thời gian tạm dừng tính bằng mili giây
    }
}