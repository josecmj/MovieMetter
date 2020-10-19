package com.josecmj.core.data

import com.josecmj.core.domain.Movie
import com.josecmj.core.domain.Rating

class RatingRepository (private val dataSource: RatingDataSource) {
    suspend fun add(movie : Movie, rating : Rating) = dataSource.add(movie,rating);
    suspend fun getAll(movie : Movie) : List<Rating> = dataSource.getAll(movie);
    suspend fun remove(rating: Rating) = dataSource.remove(rating);
}