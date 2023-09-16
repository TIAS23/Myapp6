package com.tiashl.myapp6

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class StepActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step)
        supportActionBar?.hide()

        btnBackListener()
        btnNextSuccessListener()

        val spinner: Spinner = findViewById(R.id.spinner)
        val items = arrayOf("Indonesian", "Java", "English", "China", "Arabian")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        /*spinner.setOnItemSelectedListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()
        }*/
    }

    private fun btnBackListener() {
        val sImg7 = findViewById<ImageView>(R.id.S_img_7) // Replace ImageView with your element type
        sImg7.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun btnNextSuccessListener() {
        val RBtn2 = findViewById<Button>(R.id.R_btn_2)
        RBtn2.setOnClickListener {
            startActivity(Intent(this, SuccessActivity::class.java))
        }
    }
}