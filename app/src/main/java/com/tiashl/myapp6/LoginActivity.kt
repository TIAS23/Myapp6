package com.tiashl.myapp6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        btnNextStepListener()
    }

    private fun btnBackLoginListener() {
        val LImg2 = findViewById<ImageView>(R.id.L_img_2)
        LImg2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnNextStepListener() {
        val LBtn2 = findViewById<Button>(R.id.L_btn_2)
        LBtn2.setOnClickListener {
            startActivity(Intent(this, StepActivity::class.java))
        }
    }
}