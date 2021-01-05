package mk.com.ukim.finki.mpip.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_movie_details.*
import mk.com.ukim.finki.mpip.lab3.model.MovieDetails
import mk.com.ukim.finki.mpip.lab3.viewmodel.MovieDetailsViewModel
import java.util.*

class MovieDetailsFragment : Fragment() {
    private val args: MovieDetailsFragmentArgs by navArgs()
    private val model: MovieDetailsViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val movieId = args.movieId

        model.loadMovie(movieId)
        model.getMovie().observe(viewLifecycleOwner, { movie ->
            mapMovie(movie)
        })
    }

    private fun mapMovie(movie: MovieDetails) {
        movie.let {
            this.context?.let { it1 ->
                Glide.with(it1)
                    .load(movie.poster)
                    .into(movie_details_image)
            }
            movie_details_title.text = movie.title
            movie_details_genre.text = movie.genre
            movie_details_plot.text = movie.plot
            movie_details_release.text = movie.released
            movie_details_type.text = movie.type?.capitalize(Locale.getDefault())
        }
    }
}