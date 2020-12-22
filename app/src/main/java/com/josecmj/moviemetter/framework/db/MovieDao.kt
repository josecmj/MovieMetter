package com.josecmj.moviemetter.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface MovieDao {
    @Insert(onConflict = REPLACE)
    suspend fun addMovie(document: MovieEntity)

    @Query("SELECT * FROM movie")
    suspend fun getMovies(): List<MovieEntity>

    @Delete
    suspend fun removeMovie(movie: MovieEntity)
}