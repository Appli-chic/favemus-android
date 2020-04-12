package com.applichic.favemus.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["id"])
data class User (
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("name")
    val name:String? = null
)