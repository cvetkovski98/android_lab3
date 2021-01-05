package mk.com.ukim.finki.mpip.lab3.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/viewmodel/MovieSearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lmk/com/ukim/finki/mpip/lab3/persistence/AppDatabase;", "movieApi", "Lmk/com/ukim/finki/mpip/lab3/api/MovieApi;", "moviesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lmk/com/ukim/finki/mpip/lab3/model/MovieSearchResponse;", "cacheMovies", "", "movies", "", "Lmk/com/ukim/finki/mpip/lab3/model/MovieShortDetails;", "getMovies", "loadMovies", "searchQuery", "", "Companion", "app_debug"})
public final class MovieSearchViewModel extends androidx.lifecycle.AndroidViewModel {
    private final mk.com.ukim.finki.mpip.lab3.api.MovieApi movieApi = null;
    private final mk.com.ukim.finki.mpip.lab3.persistence.AppDatabase db = null;
    private final androidx.lifecycle.MutableLiveData<mk.com.ukim.finki.mpip.lab3.model.MovieSearchResponse> moviesLiveData = null;
    private static final java.lang.String TAG = "MovieSearchViewModel";
    @org.jetbrains.annotations.NotNull()
    public static final mk.com.ukim.finki.mpip.lab3.viewmodel.MovieSearchViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<mk.com.ukim.finki.mpip.lab3.model.MovieSearchResponse> getMovies() {
        return null;
    }
    
    public final void loadMovies(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void cacheMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> movies) {
    }
    
    public MovieSearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/viewmodel/MovieSearchViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}