package com.example.w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.w2.databinding.ActivityMain7Binding
import com.example.w2.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    private lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main8)
    }
}