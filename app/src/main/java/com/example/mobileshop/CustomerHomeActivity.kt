package com.example.mobileshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CustomerHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_home)

        val rv = findViewById<RecyclerView>(R.id.rvProducts)
        rv.layoutManager = LinearLayoutManager(this)

        val items: List<Product> = emptyList() // لحد الربط
        rv.adapter = ProductAdapter(this, items)
    }
}
