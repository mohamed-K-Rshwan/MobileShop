package com.example.mobileshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PurchasedProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchased_products)

        val rv = findViewById<RecyclerView>(R.id.rvPurchased)
        rv.layoutManager = LinearLayoutManager(this)

        // لحد الربط: خليه فاضي (أو عيّن قائمة تجريبية لو حبيت تشوف الشكل)
        val items: List<Purchase> = emptyList()
        rv.adapter = PurchasedAdapter(items)
    }
}
