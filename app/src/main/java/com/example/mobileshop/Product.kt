package com.example.mobileshop

data class Product(
    val name: String,
    val desc: String,
    val price: Double,
    val rate: Float,
    val location: String,
    val imageResId: Int // مؤقّتًا من drawable. لاحقًا بنحوّلها لِـ imageUrl من Firebase Storage
)
