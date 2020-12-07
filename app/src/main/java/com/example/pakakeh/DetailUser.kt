package com.example.pakakeh

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class DetailUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val Bkembali: Button = findViewById(R.id.Bback)
        Bkembali.setOnClickListener {
            finish()
        }

        val Bganti: Button = findViewById(R.id.Bganti)
        val Tlayout: TextView = findViewById(R.id.Tlayout)
        val Tteks: TextView = findViewById(R.id.Tteks)
        Bganti.setOnClickListener{
            Tlayout.setText(Tteks.text.toString())
        }
    }
}