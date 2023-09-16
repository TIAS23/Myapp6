package com.tiashl.myapp6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtNextStepListener()
        btnBackListener()
        btnNextStepListener()
    }

    private fun txtNextStepListener() {
        val txtLogin = findViewById<TextView>(R.id.txt_login) // Replace TextView with your element type
        txtLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun btnBackListener() {
        val rImg2 = findViewById<ImageView>(R.id.R_img_2) // Replace ImageView with your element type
        rImg2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnNextStepListener() {
        val LBtn2 = findViewById<Button>(R.id.R_btn_2)
        LBtn2.setOnClickListener {
            startActivity(Intent(this, StepActivity::class.java))
        }
    }
}