package mk.com.ukim.finki.mpip.lab3.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/viewmodel/MovieDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lmk/com/ukim/finki/mpip/lab3/persistence/AppDatabase;", "movie", "Landroidx/lifecycle/MutableLiveData;", "Lmk/com/ukim/finki/mpip/lab3/model/MovieDetails;", "getMovie", "Landroidx/lifecycle/LiveData;", "loadMovie", "", "movieId", "", "app_debug"})
public final class MovieDetailsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final mk.com.ukim.finki.mpip.lab3.persistence.AppDatabase db = null;
    private androidx.lifecycle.MutableLiveData<mk.com.ukim.finki.mpip.lab3.model.MovieDetails> movie;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<mk.com.ukim.finki.mpip.lab3.model.MovieDetails> getMovie() {
        return null;
    }
    
    public final void loadMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId) {
    }
    
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}