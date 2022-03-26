package com.example.shortmovieapp.repository

import com.example.shortmovieapp.service.Api
import javax.inject.Inject

class movieRepository @Inject constructor(private val movieApi: Api) {

    suspend fun getMovies()=movieApi.getMovieList()

    suspend fun getMovieDetail(id:String)=movieApi.getMovieDetail(id)
}