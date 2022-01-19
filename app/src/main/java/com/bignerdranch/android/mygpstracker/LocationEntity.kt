package com.bignerdranch.android.mygpstracker

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//an entity is composed of the coordinates and is identified by an index that allows the DB to work as a circular array
@Entity(tableName = "locations")
data class LocationEntity(val ii: Int, val xx: Int, val yy: Int) {
    @PrimaryKey(autoGenerate = false)
    var index : Int = ii
    @ColumnInfo(name = "xValue")
    var xVal : Int = xx
    @ColumnInfo(name = "yValue")
    var yVal : Int = yy


}

