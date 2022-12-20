package com.example.librarydatabaseapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey(autoGenerate = true) val inventory_number: Int,
    val name: String,
    val authors: String,
    val genre: String,
    val publish_year: Int,
    val publish_house: String,
    val publish_address: String,
    val pages: Int,
    val price: Int,
    val picture: String,
    @ColumnInfo(defaultValue = "false") val written_off: Boolean
)
