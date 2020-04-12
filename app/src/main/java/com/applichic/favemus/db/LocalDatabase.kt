package com.applichic.favemus.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.applichic.favemus.model.User

@Database(
    entities = [
        User::class
    ],
    version = 4,
    exportSchema = false
)
abstract class LocalDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}