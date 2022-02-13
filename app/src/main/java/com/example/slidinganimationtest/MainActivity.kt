package com.example.slidinganimationtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.slidinganimationtest.databinding.ActivityMainBinding
import com.example.slidinganimationtest.util.slideRight

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.btnChangeActivity.setOnClickListener {
            val intent = WebViewActivity.newIntent(this)
            startActivity(intent)
            slideRight()
        }
    }
}