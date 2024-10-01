package com.example.burguerking

import com.example.burguerking.entity.PaymentInfo
import com.example.burguerking.entity.PaymentResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface PaymentService {
    @POST("payments")
    suspend fun processPayment(@Body paymentInfo: PaymentInfo): PaymentResponse
}

object RetrofitClient {
    private const val BASE_URL = "https://api.tupagoservicio.com/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val paymentService: PaymentService by lazy {
        retrofit.create(PaymentService::class.java)
    }
}
