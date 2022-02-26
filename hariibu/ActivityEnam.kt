package com.example.hariibu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityEnam : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enam)

        btnPindah = findViewById(R.id.btn_enam)
        btnPindah.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_enam -> run{
                val pindahDua = Intent (this@ActivityEnam, ActivityTujuh::class.java)
                startActivity(pindahDua)
            }
        }
    }
}