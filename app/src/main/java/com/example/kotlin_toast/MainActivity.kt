package com.example.kotlin_toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_click = findViewById<Button>(R.id.button)

        btn_click.setOnClickListener {
            Toast.makeText(this, "Hello World!", Toast.LENGTH_LONG).show()
        }
    }
}
