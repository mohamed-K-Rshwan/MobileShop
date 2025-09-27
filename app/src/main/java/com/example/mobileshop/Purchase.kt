package com.example.mobileshop

data class Purchase(
    val name: String,
    val price: Double,
    val quantity: Int,
    val date: String,       // مؤقتاً نص
    val imageResId: Int     // مؤقتاً من drawable
) {
    val total: Double get() = price * quantity
}
