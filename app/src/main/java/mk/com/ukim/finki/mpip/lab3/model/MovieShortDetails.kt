package mk.com.ukim.finki.mpip.lab3.model;

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName;

@Entity
class MovieShortDetails(
    @PrimaryKey(autoGenerate = true) var id: String,
    @SerializedName("Title") var title: String,
    @SerializedName("Year") var year: String,
    var imdbID: String,
    @SerializedName("Type") var type: String,
    @SerializedName("Poster") var poster: String?
) {
    override fun toString(): String {
        return "MovieSearchResponse(title='$title', year=$year, imdbID='$imdbID', type='$type', poster='$poster')"
    }
}
