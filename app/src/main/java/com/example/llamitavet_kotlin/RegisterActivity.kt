package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn: Button = findViewById(R.id.button4)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, IndexActivity:: class.java)
            startActivity(intent);
        }
    }
}