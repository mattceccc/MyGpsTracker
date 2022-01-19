package com.bignerdranch.android.mygpstracker

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(location : LocationEntity)

    @Query("SELECT * FROM locations")
    fun getAll() : Array<LocationEntity>

    @Query("SELECT * FROM locations WHERE `index`= :i")
    fun getLocationAt(i: Int) : LocationEntity
}