package mk.com.ukim.finki.mpip.lab3.model

import androidx.annotation.Nullable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
class MovieDetails(
    @PrimaryKey @SerializedName("imdbId") var imdbId: String,
    @Nullable @SerializedName("Title") var title: String?,
    @Nullable @SerializedName("Year") var year: String?,
    @Nullable @SerializedName("Rated") var rated: String?,
    @Nullable @SerializedName("Released") var released: String?,
    @Nullable @SerializedName("Runtime") var runtime: String?,
    @Nullable @SerializedName("Genre") var genre: String?,
    @Nullable @SerializedName("Director") var director: String?,
    @Nullable @SerializedName("Writer") var writer: String?,
    @Nullable @SerializedName("Actors") var actors: String?,
    @Nullable @SerializedName("Plot") var plot: String?,
    @Nullable @SerializedName("Language") var language: String?,
    @Nullable @SerializedName("Country") var country: String?,
    @Nullable @SerializedName("Awards") var awards: String?,
    @Nullable @SerializedName("Poster") var poster: String?,
    @Nullable @SerializedName("Metascore") var metascore: String?,
    @Nullable @SerializedName("imdbRating") var imdbRating: String?,
    @Nullable @SerializedName("imdbVotes") var imdbVotes: String?,
    @Nullable @SerializedName("Type") var type: String?,
    @Nullable @SerializedName("DVD") var dvd: String?,
    @Nullable @SerializedName("BoxOffice") var boxOffice: String?,
    @Nullable @SerializedName("Production") var production: String?,
    @Nullable @SerializedName("Website") var website: String?,
    @Nullable @SerializedName("Response") var response: String?
) {
    override fun toString(): String {
        return "Movie(title='$title', year=$year, rated='$rated', released=$released, runtime='$runtime', genre='$genre', director='$director', writer='$writer', actors='$actors', plot='$plot', language='$language', country='$country', awards='$awards', poster='$poster', metascore=$metascore, imdbRating=$imdbRating, imdbVotes=$imdbVotes, imdbId='$imdbId', type='$type', boxOffice='$boxOffice', production='$production', website='$website', response='$response')"
    }
}