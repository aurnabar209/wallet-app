package com.example.wallet.data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val type: String,
    val amount: Double,
    val category: String,
    val note: String,
    val date: String
)