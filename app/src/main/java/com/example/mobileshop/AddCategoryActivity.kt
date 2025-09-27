package com.example.mobileshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_category)

        findViewById<Button>(R.id.btnSaveCategory).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnCancelCategory).setOnClickListener { finish() }
    }
}
