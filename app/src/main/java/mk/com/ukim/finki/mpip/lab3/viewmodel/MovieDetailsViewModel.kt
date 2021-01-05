package mk.com.ukim.finki.mpip.lab3.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails
import mk.com.ukim.finki.mpip.lab3.persistence.AppDatabase

class MovieDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val db: AppDatabase = AppDatabase.getInstance(application)
    private var movie: MutableLiveData<MovieDetails> = MutableLiveData()

    fun getMovie(): LiveData<MovieDetails> {
        return movie
    }

    fun loadMovie(movieId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val persisted = db.movieDao().findById(movieId)
                movie.postValue(persisted)
            } catch (exception: Exception) {
                exception.printStackTrace()
            }
        }
    }
}