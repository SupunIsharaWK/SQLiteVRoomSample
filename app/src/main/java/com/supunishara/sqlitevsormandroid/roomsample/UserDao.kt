package com.supunishara.sqlitevsormandroid.roomsample

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM User")
    fun getAll(): Flow<List<User>>
}