package com.josecmj.moviemetter.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Rating",
        foreignKeys = arrayOf(  ForeignKey( entity = MovieEntity::class,
                                            parentColumns = arrayOf("id"),
                                            childColumns = arrayOf("movieId"),
                                            onDelete = ForeignKey.CASCADE)
        ))
data class RatingEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "movieId") val movieId: Int,
    @ColumnInfo(name = "stars") val stars: Int
)