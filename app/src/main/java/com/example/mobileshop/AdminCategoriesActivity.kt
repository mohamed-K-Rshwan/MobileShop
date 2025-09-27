package com.example.mobileshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AdminCategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_categories)

        val addBtn = findViewById<Button>(R.id.btnAddCategory)
        addBtn.setOnClickListener {
            val intent = Intent(this@AdminCategoriesActivity, AddCategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
