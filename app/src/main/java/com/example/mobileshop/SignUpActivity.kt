package com.example.mobileshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // زر يفتح شاشة Login
        findViewById<Button>(R.id.btnToLogin).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // زر Sign Up يفتح شاشة Login مؤقتاً
        findViewById<Button>(R.id.btnSignUp).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
