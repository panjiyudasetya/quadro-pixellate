package lunart.quadro.pixellatte.data.classes

import com.google.gson.annotations.SerializedName

/**
 * Created by panjiyudasetya on 11/2/17.
 */
object LinksData {
    data class CategoryLink(
            val self: String,
            val photos: String
    )
    data class UserLink(
            val self: String,
            val html: String,
            val photos: String,
            val likes: String,
            val portfolio: String
    )
    data class PhotosLink(
            val self: String,
            val html: String,
            val photos: String
    )
    data class ImageLink(
            val self: String,
            val html: String,
            val download: String,
            @SerializedName("download_location") val downloadLocation: String
    )
}