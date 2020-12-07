package com.example.pakakeh

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setEvent()
    }

    private fun setEvent() {
        this.Bselanjutnya.setOnClickListener(BukaDetailUser)
        this.Bhitung.setOnClickListener(HitungBmi)
    }

    private val HitungBmi = View.OnClickListener {
        var teks = ""
        var warnaTeks: Int = Color.BLACK
        try {
            val bmi: Double = this.hitungBmi(
                TberatBadan.text.toString().toDouble(),
                TtinggiBadan.text.toString().toDouble()
            )
            teks += bmi.toString()
            if (bmi < 18.5) {
                teks += ", Pakakeh Anda kurat berat"
                warnaTeks = Color.GREEN
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                teks += ", Pakakeh normal"
                warnaTeks = Color.BLUE
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                teks += ", Kelebihan berat pakakeh"
                warnaTeks = Color.MAGENTA
            } else {
                teks += ", Pakakeh obesitas"
                warnaTeks = Color.RED
            }
        } catch (e: Exception) {
            teks = "Gagal menghitung BMI. Silahkan ulangi lagi!"
            warnaTeks = Color.BLACK
        } finally {
            Lhasil.setText(teks)
            Lhasil.setTextColor(warnaTeks)
        }
    }

    private val BukaDetailUser = View.OnClickListener {
        startActivity(Intent(this@MainActivity, DetailUser::class.java))
    }

    private fun hitungBmi(berat: Double, tinggi: Double): Double {
        return berat / (tinggi * tinggi)
    }
}
