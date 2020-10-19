package com.josecmj.core.data

import com.josecmj.core.domain.Movie

class MovieRepository(private val dataSource:MovieDataSource) {
    suspend fun add(movie : Movie) = dataSource.add(movie);
    suspend fun getAll() : List<Movie> = dataSource.getAll();
    suspend fun remove(movie: Movie) = dataSource.remove(movie);
}