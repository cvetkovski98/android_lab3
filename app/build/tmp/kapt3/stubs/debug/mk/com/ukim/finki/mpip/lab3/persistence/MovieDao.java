package mk.com.ukim.finki.mpip.lab3.persistence;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\'J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\'\u00a8\u0006\f"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/persistence/MovieDao;", "", "findById", "Lmk/com/ukim/finki/mpip/lab3/model/MovieDetails;", "movieId", "", "insertAllMovieDetails", "", "movies", "", "insertMovieDetails", "movie", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM MovieDetails WHERE imdbId=:movieId ")
    public abstract mk.com.ukim.finki.mpip.lab3.model.MovieDetails findById(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllMovieDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieDetails> movies);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertMovieDetails(@org.jetbrains.annotations.NotNull()
    mk.com.ukim.finki.mpip.lab3.model.MovieDetails movie);
}