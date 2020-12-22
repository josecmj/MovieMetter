package com.josecmj.moviemetter.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface RatingDao {
    @Insert(onConflict = REPLACE)
    suspend fun addRating(rating: RatingEntity)

    @Query("SELECT * FROM Rating WHERE movieId = :movieId")
    suspend fun getRatings(movieId: Int): List<RatingEntity>

    @Delete
    suspend fun removeRating(rating: RatingEntity)
}