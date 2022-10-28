package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, IndexActivity:: class.java)
            startActivity(intent);
        }
    }
}