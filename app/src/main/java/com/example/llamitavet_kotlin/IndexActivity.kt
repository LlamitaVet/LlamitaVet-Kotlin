package com.example.llamitavet_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class IndexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        val btn: ImageView = findViewById(R.id.imageView2)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, VetActivity:: class.java)
            startActivity(intent);
        }
    }
}