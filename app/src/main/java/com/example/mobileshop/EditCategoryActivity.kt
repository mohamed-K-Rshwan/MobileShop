package com.example.mobileshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_category)

        findViewById<Button>(R.id.btnUpdateCategory).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnDeleteCategory).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnCancelEditCat).setOnClickListener { finish() }
    }
}
