package lunart.quadro.pixellatte.data.classes

import com.google.gson.annotations.SerializedName

/**
 * Created by panjiyudasetya on 11/2/17.
 */
object ImageCollectionData {
    data class Collection(
            val id: Int,
            val title: String,
            val publishedAt: String,
            val updatedAt:String,
            val curated: Boolean,
            @SerializedName("cover_photo") val coverPhoto: ImageData.CoverPhoto,
            val user: UserData.User,
            val links: LinksData.PhotosLink
    )
}