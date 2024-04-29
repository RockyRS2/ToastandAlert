package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog


import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val alertButton: Button = findViewById(R.id.BtnAlert)
        alertButton.setOnClickListener{
             alertClick()
        }

        val toastButton = findViewById<Button>(R.id.toastButton)
        toastButton.setOnClickListener {
            showToast()
        }
    }


    private fun alertClick() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Warning")
        builder.setMessage("Ini adalah pesan alert!")
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun showToast() {
        Toast.makeText(this, "Ini adalah pesan toast!", Toast.LENGTH_LONG).show()
    }


}