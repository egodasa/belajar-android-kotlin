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
        this.Bback.setOnClickListener(this.Kembali)
        this.Bganti.setOnClickListener(this.GantiText)
    }

    // list fungsi event
    private val Kembali = View.OnClickListener {
        finish()
    }

    private val GantiText = View.OnClickListener {
        this.Tlayout.setText(Tteks.text.toString())
    }
}