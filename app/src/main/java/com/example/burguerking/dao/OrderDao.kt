package com.example.burguerking.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.burguerking.entity.Order

@Dao
interface OrderDao {
    @Insert
    fun insertOrder(order: Order)

    @Query("SELECT * FROM `Order` WHERE orderId = :id")
    fun getOrder(id: Int): Order
}
