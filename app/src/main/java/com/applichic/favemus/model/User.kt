package com.applichic.favemus.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(primaryKeys = ["id"])
data class User(
    @field:SerializedName("ID")
    val id: Int? = null,

    @field:SerializedName("Name")
    val name: String? = null,

    @field:SerializedName("CreatedAt")
    val createdAt: Date? = null,

    @field:SerializedName("UpdatedAt")
    val updatedAt: Date? = null
)