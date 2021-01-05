package mk.com.ukim.finki.mpip.lab3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/MovieSearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "model", "Lmk/com/ukim/finki/mpip/lab3/viewmodel/MovieSearchViewModel;", "getModel", "()Lmk/com/ukim/finki/mpip/lab3/viewmodel/MovieSearchViewModel;", "model$delegate", "Lkotlin/Lazy;", "movieAdapter", "Lmk/com/ukim/finki/mpip/lab3/adapter/MovieAdapter;", "createRecyclerView", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMovieDetailsClick", "movieId", "", "onSearch", "", "v", "Landroid/widget/TextView;", "actionId", "", "updateRecyclerData", "movies", "", "Lmk/com/ukim/finki/mpip/lab3/model/MovieShortDetails;", "Companion", "app_debug"})
public final class MovieSearchFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy model$delegate = null;
    private mk.com.ukim.finki.mpip.lab3.adapter.MovieAdapter movieAdapter;
    private static final java.lang.String TAG = "MovieSearchFragment";
    @org.jetbrains.annotations.NotNull()
    public static final mk.com.ukim.finki.mpip.lab3.MovieSearchFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final mk.com.ukim.finki.mpip.lab3.viewmodel.MovieSearchViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean onSearch(android.widget.TextView v, int actionId) {
        return false;
    }
    
    private final void createRecyclerView() {
    }
    
    private final void updateRecyclerData(java.util.List<mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails> movies) {
    }
    
    private final void onMovieDetailsClick(java.lang.String movieId) {
    }
    
    public MovieSearchFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lmk/com/ukim/finki/mpip/lab3/MovieSearchFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}