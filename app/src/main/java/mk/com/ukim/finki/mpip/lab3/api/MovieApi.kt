package mk.com.ukim.finki.mpip.lab3.api

import mk.com.ukim.finki.mpip.lab3.model.MovieDetails
import mk.com.ukim.finki.mpip.lab3.model.MovieSearchResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieApi {

    @GET("/")
    suspend fun searchMovies(
        @Query("apikey") apiKey: String,
        @Query("s") searchQuery: String,
    ): MovieSearchResponse

    @GET("/")
    suspend fun getMovieById(
        @Query("apikey") apiKey: String,
        @Query("i") id: String
    ): MovieDetails

    companion object {
        private const val API_ULR = "http://www.omdbapi.com/"
        const val API_KEY = "620dc19a"

        val instance: MovieApi = Retrofit.Builder()
            .baseUrl(API_ULR)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApi::class.java)
    }

}
