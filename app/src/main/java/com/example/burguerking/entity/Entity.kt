package com.example.burguerking.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Order(
    @PrimaryKey(autoGenerate = true) val orderId: Int,
    val menuItemId: Int,
    val quantity: Int,
    val totalPrice: Double
)
