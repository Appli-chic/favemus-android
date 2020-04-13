package com.applichic.favemus.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.applichic.favemus.model.User

@Database(
    entities = [
        User::class
    ],
    version = 5,
    exportSchema = false
)
@TypeConverters(DbTypeConverters::class)
abstract class LocalDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}