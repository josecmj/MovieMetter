package com.josecmj.moviemetter.framework

import android.content.Context
import com.josecmj.core.data.MovieDataSource
import com.josecmj.core.domain.Movie
import com.josecmj.core.domain.Rating
import com.josecmj.moviemetter.framework.db.MovieEntity
import com.josecmj.moviemetter.framework.db.MovieMetterDatabase

class RoomMovieDataSource(context : Context) : MovieDataSource {
    private val ratingDao = MovieMetterDatabase.getInstance(context).movieDao()

    override suspend fun add(movie: Movie) {
        ratingDao.addMovie(MovieEntity(movie.id,movie.name))
    }

    override suspend fun getAll(): List<Movie> {
        return ratingDao.getMovies().map { entity -> Movie(entity.id,entity.title) }
    }

    override suspend fun remove(movie: Movie) {
        ratingDao.removeMovie(MovieEntity(movie.id,movie.name))
    }
}