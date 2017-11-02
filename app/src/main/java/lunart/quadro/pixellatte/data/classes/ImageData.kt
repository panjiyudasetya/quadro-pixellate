package lunart.quadro.pixellatte.data.classes

import com.google.gson.annotations.SerializedName

/**
 * Created by panjiyudasetya on 11/2/17.
 */
object ImageData {
    data class CoverPhoto (
            val id: String,
            val width: Int,
            val height: Int,
            val color: String,
            val likes: Int,
            @SerializedName("liked_by_user") val likedByUser: Boolean,
            val description: String,
            val user: UserData.User,
            val urls: Urls,
            val categories: List<CategoryData.Category>,
            val links: LinksData.ImageLink
    )
    data class Urls(
            val raw: String,
            val full: String,
            val regular: String,
            val small: String,
            val thumb: String
    )
    data class Image(
            val id: String,
            @SerializedName("created_at") val createdAt: String,
            @SerializedName("updated_at") val updatedAt: String,
            val width: Int,
            val height: Int,
            val color: String,
            val likes: Int,
            @SerializedName("liked_by_user") val likedByUser: Boolean,
            val description: String,
            val user: UserData.User,
            @SerializedName("current_user_collections") val collections: List<ImageCollectionData.Collection>,
            val urls: Urls,
            val links: LinksData.ImageLink
    )
}