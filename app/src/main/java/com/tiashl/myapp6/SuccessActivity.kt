package com.tiashl.myapp6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        supportActionBar?.hide()
    }
}