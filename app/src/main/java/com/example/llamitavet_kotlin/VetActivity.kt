package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet)

        val btn: Button = findViewById(R.id.button5)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, ReviewActivity:: class.java)
            startActivity(intent);
        }
    }
}