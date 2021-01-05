package mk.com.ukim.finki.mpip.lab3

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class MovieSearchFragmentDirections private constructor() {
  private data class ActionMovieSearchFragmentToMovieDetailsFragment(
    public val movieId: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_movieSearchFragment_to_movieDetailsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("movieId", this.movieId)
      return result
    }
  }

  public companion object {
    public fun actionMovieSearchFragmentToMovieDetailsFragment(movieId: String): NavDirections =
        ActionMovieSearchFragmentToMovieDetailsFragment(movieId)
  }
}
