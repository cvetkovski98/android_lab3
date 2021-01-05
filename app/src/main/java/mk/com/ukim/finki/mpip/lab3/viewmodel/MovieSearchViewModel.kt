package mk.com.ukim.finki.mpip.lab3.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import mk.com.ukim.finki.mpip.lab3.api.MovieApi
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails
import mk.com.ukim.finki.mpip.lab3.model.MovieSearchResponse
import mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails
import mk.com.ukim.finki.mpip.lab3.persistence.AppDatabase

class MovieSearchViewModel(application: Application) : AndroidViewModel(application) {
    private val movieApi: MovieApi = MovieApi.instance
    private val db: AppDatabase = AppDatabase.getInstance(application)
    private val moviesLiveData = MutableLiveData<MovieSearchResponse>()

    fun getMovies(): MutableLiveData<MovieSearchResponse> {
        return moviesLiveData
    }

    fun loadMovies(searchQuery: String?) {
        Log.i(TAG, "loadMovies: $searchQuery")
        if (searchQuery != null) {
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    moviesLiveData.postValue(
                        movieApi.searchMovies(
                            MovieApi.API_KEY,
                            searchQuery
                        )
                    )
                } catch (exception: Exception) {
                    Log.i(TAG, "ERROR: $searchQuery")
                }
            }
        }
    }

    fun cacheMovies(movies: List<MovieShortDetails>) {
        viewModelScope.launch(Dispatchers.IO) {
            val movieList: MutableList<MovieDetails> = mutableListOf()
            for (m in movies) {
                val id = m.imdbID
                try {
                    val data = movieApi.getMovieById(MovieApi.API_KEY, id)
                    data.imdbId = id
                    movieList.add(data)
                } catch (exception: Exception) {
                    exception.printStackTrace()
                }
            }
            db.movieDao().insertAllMovieDetails(movieList)
        }
    }

    companion object {
        private const val TAG = "MovieSearchViewModel"
    }

}