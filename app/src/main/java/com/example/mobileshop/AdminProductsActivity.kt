package com.example.mobileshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AdminProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_products)

        val addBtn = findViewById<Button>(R.id.btnAddProduct)
        addBtn.setOnClickListener {
            val i = Intent(this@AdminProductsActivity, AddProductActivity::class.java)
            startActivity(i)
        }
    }
}
