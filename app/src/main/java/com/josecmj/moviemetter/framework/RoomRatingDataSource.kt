package com.josecmj.moviemetter.framework

import android.content.Context
import com.josecmj.core.data.RatingDataSource
import com.josecmj.core.domain.Movie
import com.josecmj.core.domain.Rating
import com.josecmj.moviemetter.framework.db.MovieEntity
import com.josecmj.moviemetter.framework.db.MovieMetterDatabase
import com.josecmj.moviemetter.framework.db.RatingEntity

class RoomRatingDataSource(context: Context) : RatingDataSource {

    private val ratingDao = MovieMetterDatabase.getInstance(context).ratingDao();

    override suspend fun add(movie: Movie, rating: Rating) {
        
        ratingDao.addRating(RatingEntity(rating.id ,movie.id ,rating.stars))
    }

    override suspend fun getAll(movie: Movie): List<Rating> {
        return ratingDao.getRatings(movie.id).map { r -> Rating(r.id, r.movieId, "", r.stars) }
    }

    override suspend fun remove(rating: Rating) {
        ratingDao.removeRating(RatingEntity(rating.id, rating.movieId, rating.stars))
    }

}