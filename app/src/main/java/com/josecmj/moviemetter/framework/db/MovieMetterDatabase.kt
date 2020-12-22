package com.josecmj.moviemetter.framework.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [RatingEntity::class, MovieEntity::class],
    version = 1,
    exportSchema = false
)
abstract class MovieMetterDatabase : RoomDatabase() {

    companion object {

        private const val DATABASE_NAME = "reader.db"

        private var instance: MovieMetterDatabase? = null

        private fun create(context: Context): MovieMetterDatabase =
            Room.databaseBuilder(context, MovieMetterDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()


        fun getInstance(context: Context): MovieMetterDatabase =
            (instance ?: create(context)).also { instance = it }
    }

    abstract fun ratingDao(): RatingDao

    abstract fun movieDao(): MovieDao
}