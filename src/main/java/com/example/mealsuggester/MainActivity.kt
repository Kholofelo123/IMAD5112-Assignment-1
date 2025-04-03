package com.example.buttonrowapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Buttons
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        // Set Click Listeners
        button1.setOnClickListener { showToast("Button 1 Clicked") }
        button2.setOnClickListener { showToast("Button 2 Clicked") }
        button3.setOnClickListener { showToast("Button 3 Clicked") }
    }

    // Function to Show Toast Messages
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
