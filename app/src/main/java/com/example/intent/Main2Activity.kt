package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras
        val nim = bundle?.get("Nim")
        val nama = bundle?.get("Nama")
        val nilai = bundle?.get("Nilai")
        val keterangan = bundle?.get("Keterangan")

        textView2.text = ("Nim : " + (nim))
        textView3.text = ("Nama : " + (nama))
        textView4.text = ("Nilai : " + (nilai))
        textView5.text = ("Keterangan Nilai : " + (keterangan))

        button3.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
