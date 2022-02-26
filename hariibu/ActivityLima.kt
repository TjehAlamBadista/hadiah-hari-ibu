package com.example.hariibu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityLima : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lima)

        btnPindah = findViewById(R.id.btn_lima)
        btnPindah.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_lima -> run{
                val pindahDua = Intent (this@ActivityLima, ActivityEnam::class.java)
                startActivity(pindahDua)
            }
        }
    }
}