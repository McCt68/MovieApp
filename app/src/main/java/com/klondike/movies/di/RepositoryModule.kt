package com.klondike.movies.di

import com.klondike.movies.data.repository.MovieRepositoryImpl
import com.klondike.movies.data.repository.MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindMovieRepository(repository : MovieRepositoryImpl) : MoviesRepository


}