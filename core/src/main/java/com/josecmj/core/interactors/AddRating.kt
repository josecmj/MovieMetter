package com.josecmj.core.interactors

import com.josecmj.core.data.RatingRepository
import com.josecmj.core.domain.Movie
import com.josecmj.core.domain.Rating

class AddRating(private val dataRepository: RatingRepository) {
    suspend operator fun invoke(movie: Movie, rating: Rating) = dataRepository.add(movie,rating)
}