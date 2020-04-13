package com.applichic.favemus.db

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.*

object DbTypeConverters {

    @TypeConverter
    @JvmStatic
    fun stringToDate(dateText: String): Date? {
        val dateFormat =
            SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault())

        return dateFormat.parse(dateText)
    }

    @TypeConverter
    @JvmStatic
    fun dateToString(date: Date): String? {
        val dateFormat =
            SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault())

        return dateFormat.format(date)
    }
}