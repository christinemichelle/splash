package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var webpage= findViewById<Button>(R.id.btn_webpage)
        webpage.setOnClickListener {
            val toweb = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bing.com/search?pglt=41&q=goojara&cvid=93dfb70efdf74afc8b4081fc6c54c651&aqs=edge.0.0l9.6337j0j1&FORM=ANSPA1&PC=DCTS"))
            startActivity(toweb)
        }
    }
}