package com.example.mobileshop

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_product)

        findViewById<Button>(R.id.btnUpdateProduct).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnDeleteProduct).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnCancelEditProd).setOnClickListener { finish() }
    }
}
