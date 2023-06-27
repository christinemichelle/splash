package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {
            val prv_intent = Intent(this,RegisterActivity::class.java)
            startActivity(prv_intent)
        }

        var btn_home = findViewById<Button>(R.id.btn_home)
        btn_home.setOnClickListener {
            val nxt = Intent(this,HomeActivity::class.java)
            startActivity(nxt)
        }

    }
}