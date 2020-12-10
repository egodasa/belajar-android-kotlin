package com.example.pakakeh

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_user.*
import org.w3c.dom.Text

class DetailUser : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)
        setEvent()
    }

    // set semua event ke control
    private fun setEvent() {
        val btnBack: Button = findViewById(R.id.Bback)
        val btnGanti: Button = findViewById(R.id.Bganti)

        btnBack.setOnClickListener(this.eventKembali())
        btnGanti.setOnClickListener(this.eventGantiText())
    }


    // list fungsi event
    private fun eventKembali(): View.OnClickListener {
        return View.OnClickListener {
            finish()
        }
    }

    private fun eventGantiText(): View.OnClickListener {
        return View.OnClickListener {
            val tlayout = findViewById<TextView>(R.id.Tlayout)
            tlayout.setText(Tteks.text.toString())
        }
    }
}