package com.tiashl.myapp6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.L_img_2

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()

    }

    private fun btnBackLoginListener() {
        L_img_2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

