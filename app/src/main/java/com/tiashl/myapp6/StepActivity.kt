package com.tiashl.myapp6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.tiashl.myapp6.R

class StepActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step)

        btnBackListener()
    }

    private fun btnBackListener() {
        val sImg7 = findViewById<ImageView>(R.id.S_img_7) // Replace ImageView with your element type
        sImg7.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}