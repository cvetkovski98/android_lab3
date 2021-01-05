package mk.com.ukim.finki.mpip.lab3.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\bH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/model/MovieSearchResponse;", "", "search", "", "Lmk/com/ukim/finki/mpip/lab3/model/MovieShortDetails;", "totalResults", "", "response", "", "(Ljava/util/List;ILjava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "setResponse", "(Ljava/lang/String;)V", "getSearch", "()Ljava/util/List;", "setSearch", "(Ljava/util/List;)V", "getTotalResults", "()I", "setTotalResults", "(I)V", "toString", "app_debug"})
public final class MovieSearchResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Search")
    private java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> search;
    private int totalResults;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Response")
    private java.lang.String response;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.Nullable()
    java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public MovieSearchResponse(@org.jetbrains.annotations.Nullable()
    java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> search, int totalResults, @org.jetbrains.annotations.NotNull()
    java.lang.String response) {
        super();
    }
}