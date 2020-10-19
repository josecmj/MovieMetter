package com.josecmj.core.data

import com.josecmj.core.domain.Movie
import com.josecmj.core.domain.Rating

interface RatingDataSource {
    suspend fun add(movie : Movie, rating : Rating)
    suspend fun getAll(movie : Movie) : List<Rating>
    suspend fun remove(rating: Rating)
}