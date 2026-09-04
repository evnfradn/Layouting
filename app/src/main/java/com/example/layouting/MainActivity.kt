package com.example.layouting

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEditProfile = findViewById<Button>(R.id.btnEditProfile)
        val btnShareProfile = findViewById<Button>(R.id.btnShareProfile)

        btnEditProfile.setOnClickListener {
            Toast.makeText(this, "Tombol Edit Profile diklik", Toast.LENGTH_SHORT).show()
        }

        btnShareProfile.setOnClickListener {
            Toast.makeText(this, "Tombol Share Profile diklik", Toast.LENGTH_SHORT).show()
        }

        val tvFotoProfil = findViewById<TextView>(R.id.tvFotoProfil)
        tvFotoProfil.setOnClickListener {
            Toast.makeText(this, "Foto Profil diklik", Toast.LENGTH_SHORT).show()
        }

        val foto1 = findViewById<TextView>(R.id.foto1)
        foto1.setOnClickListener {
            Toast.makeText(this, "Foto 1 dipilih", Toast.LENGTH_SHORT).show()
        }
    }
}