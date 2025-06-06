package com.supunishara.sqlitevsormandroid.roomsample

import android.content.Context
import androidx.room.*

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "mydb"
            ).build()
        }
    }
}
