package com.example.w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.w2.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main6)
        binding.Login1.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}