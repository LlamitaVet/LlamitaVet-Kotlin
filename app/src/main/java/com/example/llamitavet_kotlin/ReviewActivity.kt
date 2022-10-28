package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val btn: Button = findViewById(R.id.button6)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, VetActivity:: class.java)
            startActivity(intent);
        }
    }
}