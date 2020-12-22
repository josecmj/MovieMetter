package com.josecmj.moviemetter.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Movie")
data class MovieEntity (
    @PrimaryKey val id : Int,
    @ColumnInfo(name = "title") val title: String
)