package com.faisalgehlot.intend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faisalgehlot.intend.databinding.ActivityMain2Binding
import com.faisalgehlot.intend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLayoutOne.setOnClickListener{
            val intent = Intent(this, ActivityMain2Binding::class.java).apply {

            }
            startActivity(intent)
        }
    }
}