package com.example.ucp2.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.ucp2.data.entity.Dosen

@Dao
interface DosenDao {
    //fungsi get all data
    @Insert
        (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDosen(dosen: Dosen)
}
