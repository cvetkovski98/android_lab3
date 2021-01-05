package mk.com.ukim.finki.mpip.lab3.model;

import com.google.gson.annotations.SerializedName

class MovieSearchResponse(
    @SerializedName("Search") var search: List<MovieShortDetails>?,
    var totalResults: Int,
    @SerializedName("Response") var response: String
) {
    override fun toString(): String {
        return "SearchResponse(search=$search, totalResults=$totalResults, response='$response')"
    }
}
