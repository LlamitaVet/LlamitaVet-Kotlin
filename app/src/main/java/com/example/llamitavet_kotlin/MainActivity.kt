package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Register
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, RegisterActivity:: class.java)
            startActivity(intent);
        }
        //Login
        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, LoginActivity:: class.java)
            startActivity(intent);
        }
    }
}