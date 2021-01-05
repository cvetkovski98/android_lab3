package mk.com.ukim.finki.mpip.lab3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.view.*
import mk.com.ukim.finki.mpip.lab3.R
import mk.com.ukim.finki.mpip.lab3.model.MovieShortDetails
import java.util.*

class MovieAdapter(
    private var movies: MutableList<MovieShortDetails>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position];
        holder.bind(movie)
    }

    override fun getItemCount() = movies.size

    fun setItems(newMovies: List<MovieShortDetails>) {
        movies.clear()
        movies.addAll(newMovies)
    }

    class MovieViewHolder(
        itemView: View,
        private val onClick: (String) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        private var movieId: String? = null

        init {
            itemView.setOnClickListener {
                movieId?.let {
                    onClick(it)
                }
            }
        }

        fun bind(movie: MovieShortDetails) {
            Glide.with(itemView.context)
                .load(movie.poster)
                .into(itemView.movie_image)
            itemView.movie_title.text = movie.title
            itemView.movie_details_type.text = movie.type.capitalize(Locale.getDefault())
            itemView.movie_year.text = movie.year
            movieId = movie.imdbID
        }
    }

}
