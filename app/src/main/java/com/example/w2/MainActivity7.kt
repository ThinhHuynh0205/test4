package com.example.w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.w2.databinding.ActivityMain6Binding
import com.example.w2.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main7)
        binding.Signup1.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}