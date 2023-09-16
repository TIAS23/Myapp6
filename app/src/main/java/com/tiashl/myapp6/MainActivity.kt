package com.tiashl.myapp6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLoginListener()
        btnRegisterListener()
    }

    private fun btnLoginListener() {
        val btn1 = findViewById<Button>(R.id.btn_1) // Replace Button with your element type
        btn1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun btnRegisterListener() {
        val btn2 = findViewById<Button>(R.id.btn_2) // Replace Button with your element type
        btn2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}