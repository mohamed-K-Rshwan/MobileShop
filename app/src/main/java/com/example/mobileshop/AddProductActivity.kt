package com.example.mobileshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        findViewById<Button>(R.id.btnSaveProduct).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnCancelProduct).setOnClickListener { finish() }
    }
}
