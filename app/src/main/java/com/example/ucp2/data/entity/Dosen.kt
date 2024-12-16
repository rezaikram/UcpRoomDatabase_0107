package com.example.ucp2.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Dosen")
data class Dosen(
    @PrimaryKey
    val nama: String,
    val jeniskelamin: String,
    val Nidn: String,

)