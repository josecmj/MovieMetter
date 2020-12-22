package com.josecmj.core.interactors

import com.josecmj.core.data.MovieRepository

class GetMovies(private val movieRepository: MovieRepository) {
    suspend operator fun invoke() = movieRepository.getAll()
}