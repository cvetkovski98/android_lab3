package mk.com.ukim.finki.mpip.lab3.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails

@Dao
interface MovieDao {

    @Query("SELECT * FROM MovieDetails WHERE imdbId=:movieId ")
    fun findById(movieId: String): MovieDetails

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllMovieDetails(movies: List<MovieDetails>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovieDetails(movie: MovieDetails)

}