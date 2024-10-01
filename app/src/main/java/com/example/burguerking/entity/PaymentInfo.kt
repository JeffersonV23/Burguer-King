package com.example.burguerking.entity

class PaymentInfo(
    val amount: Double,
    val sourceAccount: String,
    val destinationAccount: String,
    val description: String
)

data class PaymentResponse(
    val success: Boolean,
    val message: String
)

