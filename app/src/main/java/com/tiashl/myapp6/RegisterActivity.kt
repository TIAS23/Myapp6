package com.tiashl.myapp6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.R_img_2
import kotlinx.android.synthetic.main.activity_register.txt_login

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtNextStepListener()
        btnBackListener()
    }

    private fun txtNextStepListener(){
        txt_login.setOnClickListener {
            startActivity(Intent(this,StepActivity::class.java))
        }
    }
    private fun btnBackListener(){
        R_img_2.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}