package com.example.telegramproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telegramproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize your UI here
        binding.textView.text = getString(R.string.hello_world)
    }
}
