package com.tiashl.myapp6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tiashl.myapp6.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        btnBackLoginListener()
        btnStepListener()
    }

    private fun btnStepListener() {
        val btn2 = findViewById<Button>(R.id.btn_2) // Replace Button with your element type
        btn2.setOnClickListener {
            startActivity(Intent(this, StepActivity::class.java))
        }
    }

    private fun btnBackLoginListener() {
        binding.LImg2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}


