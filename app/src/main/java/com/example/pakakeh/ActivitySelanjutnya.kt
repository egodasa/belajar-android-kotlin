package com.example.pakakeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivitySelanjutnya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selanjutnya)

        val Bkembali: Button = findViewById(R.id.Bkembali)
        Bkembali.setOnClickListener {
            finish()
        }
    }
}