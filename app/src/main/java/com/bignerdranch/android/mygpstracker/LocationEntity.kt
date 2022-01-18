package com.bignerdranch.android.mygpstracker

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//an entity is composed of the coordinates and is identified by an index that allows the DB to work as a circular array
@Entity
data class LocationEntity(val ii: Int, val xx: Int, val yy: Int) {
    @PrimaryKey
    val index : Int = ii
        get() = index
    @ColumnInfo(name = "xValue")
    val x : Int = xx
        get() = x
    @ColumnInfo(name = "yValue")
    val y : Int = yy
        get() = y

}