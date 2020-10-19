package com.josecmj.core.data

import com.josecmj.core.domain.Movie

interface MovieDataSource {
    suspend fun add(movie : Movie)
    suspend fun getAll() : List<Movie>
    suspend fun remove(movie: Movie)
}