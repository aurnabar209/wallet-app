package com.example.wallet.data
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TransactionDao {

    @Insert
    suspend fun insert(tx: Transaction)

    @Delete
    suspend fun delete(tx: Transaction)

    @Query("SELECT * FROM Transaction ORDER BY id DESC")
    fun getAll(): LiveData<List<Transaction>>
}