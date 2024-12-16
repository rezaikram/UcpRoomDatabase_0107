package com.example.ucp2.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "MataKuliah")
data class MataKuliah(
    @PrimaryKey
    val Nama: String,
    val Kode: String,
    val SKS: String,
    val Semester: String,
    val Jenis: String,
    val Dospem: String
)