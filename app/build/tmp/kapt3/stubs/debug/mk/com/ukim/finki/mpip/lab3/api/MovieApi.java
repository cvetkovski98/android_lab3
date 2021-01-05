package mk.com.ukim.finki.mpip.lab3.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/api/MovieApi;", "", "getMovieById", "Lmk/com/ukim/finki/mpip/lab3/model/MovieDetails;", "apiKey", "", "id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "Lmk/com/ukim/finki/mpip/lab3/model/MovieSearchResponse;", "searchQuery", "Companion", "app_debug"})
public abstract interface MovieApi {
    @org.jetbrains.annotations.NotNull()
    public static final mk.com.ukim.finki.mpip.lab3.api.MovieApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "620dc19a";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/")
    public abstract java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super mk.com.ukim.finki.mpip.lab3.model.MovieSearchResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/")
    public abstract java.lang.Object getMovieById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super mk.com.ukim.finki.mpip.lab3.model.MovieDetails> p2);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/api/MovieApi$Companion;", "", "()V", "API_KEY", "", "API_ULR", "instance", "Lmk/com/ukim/finki/mpip/lab3/api/MovieApi;", "getInstance", "()Lmk/com/ukim/finki/mpip/lab3/api/MovieApi;", "app_debug"})
    public static final class Companion {
        private static final java.lang.String API_ULR = "http://www.omdbapi.com/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "620dc19a";
        @org.jetbrains.annotations.NotNull()
        private static final mk.com.ukim.finki.mpip.lab3.api.MovieApi instance = null;
        
        @org.jetbrains.annotations.NotNull()
        public final mk.com.ukim.finki.mpip.lab3.api.MovieApi getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}