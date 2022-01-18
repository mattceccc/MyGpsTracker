package com.bignerdranch.android.mygpstracker

import androidx.collection.CircularArray
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(location : LocationEntity)

    @Query("SELECT * FROM LocationEntity")
    fun getAll() : CircularArray(10)

    @Query("SELECT * FROM table WHERE index= :i")
    fun getLocationAt(i: Int)
}