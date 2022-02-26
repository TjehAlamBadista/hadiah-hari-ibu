package com.example.hariibu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ActivityTiga : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiga)

        btnPindah = findViewById(R.id.btn_tiga)
        btnPindah.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_tiga-> run{
                val pindahDua = Intent (this@ActivityTiga, ActivityEmpat::class.java)
                startActivity(pindahDua)
            }
        }
    }
}