package mk.com.ukim.finki.mpip.lab3

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class MovieDetailsFragmentArgs(
  public val movieId: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("movieId", this.movieId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MovieDetailsFragmentArgs {
      bundle.setClassLoader(MovieDetailsFragmentArgs::class.java.classLoader)
      val __movieId : String?
      if (bundle.containsKey("movieId")) {
        __movieId = bundle.getString("movieId")
        if (__movieId == null) {
          throw IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue")
      }
      return MovieDetailsFragmentArgs(__movieId)
    }
  }
}
