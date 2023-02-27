package com.example.praktika9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var click="0".toInt()
    private lateinit var buttonClick: Button
    private lateinit var buttonClick1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        buttonClick = findViewById(R.id.button)
        buttonClick1 = findViewById(R.id.button1)
        buttonClick.setOnClickListener{ Toast.makeText(this, R.string.button ,Toast.LENGTH_SHORT).show()
         click++
        }
        buttonClick1.setOnClickListener{
            Toast.makeText( this, click.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}