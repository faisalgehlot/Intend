package com.faisalgehlot.intend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faisalgehlot.intend.databinding.ActivityMain2Binding
import com.faisalgehlot.intend.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLayoutTwo.setOnClickListener {
            val intent = Intent(this, ActivityMainBinding::class.java).apply {
            }
            startActivity(intent)
        }
    }
}