package mk.com.ukim.finki.mpip.lab3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_movie_search.*
import mk.com.ukim.finki.mpip.lab3.adapter.MovieAdapter
import mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails
import mk.com.ukim.finki.mpip.lab3.viewmodel.MovieSearchViewModel

class MovieSearchFragment : Fragment() {
    private val model: MovieSearchViewModel by viewModels()
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_search, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        createRecyclerView()
        model.getMovies().observe(viewLifecycleOwner, { movieResponse ->
            var data = movieResponse.search
            if (data.isNullOrEmpty()) {
                data = mutableListOf()
            }
            updateRecyclerData(data)
            model.cacheMovies(data)
        })

        edit_title.setOnEditorActionListener { v, i, _ -> onSearch(v, i) }
    }

    private fun onSearch(v: TextView, actionId: Int): Boolean {
        if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_NEXT) {
            val searchQuery = v.text.toString()
            return if (searchQuery.isNotEmpty() && searchQuery.isNotBlank()) {
                model.loadMovies(searchQuery)
                true
            } else {
                Toast.makeText(
                    this.context,
                    "Please enter a valid string",
                    Toast.LENGTH_SHORT
                ).show()
                false
            }
        }
        return false
    }

    private fun createRecyclerView() {
        movieAdapter = MovieAdapter(mutableListOf()) { movieId -> onMovieDetailsClick(movieId) }
        movie_list.apply {
            adapter = movieAdapter
            layoutManager = LinearLayoutManager(this.context)
        }
    }

    private fun updateRecyclerData(movies: List<MovieShortDetails>) {
        movieAdapter.setItems(movies)
        movieAdapter.notifyDataSetChanged()
    }

    private fun onMovieDetailsClick(movieId: String) {
        val action = MovieSearchFragmentDirections
            .actionMovieSearchFragmentToMovieDetailsFragment(movieId)
        Log.i(TAG, "onMovieDetailsClick: $movieId")
        findNavController().navigate(action)
    }

    companion object {
        private const val TAG = "MovieSearchFragment"
    }
}