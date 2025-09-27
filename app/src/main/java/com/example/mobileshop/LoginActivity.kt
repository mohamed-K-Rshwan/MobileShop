package com.example.mobileshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // زر يفتح شاشة SignUp
        findViewById<Button>(R.id.btnToSignUp).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        // زر Login يفتح شاشة الأدمن Categories
        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, AdminCategoriesActivity::class.java))
        }
    }
}
