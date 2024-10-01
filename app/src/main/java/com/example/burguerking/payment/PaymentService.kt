package com.example.burguerking.payment

import com.example.burguerking.entity.PaymentInfo
import com.example.burguerking.entity.PaymentResponse
import com.google.android.gms.common.api.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PaymentService {
    @POST("payments")
    suspend fun processPayment(@Body paymentInfo: PaymentInfo): Response<PaymentResponse>
}
