package lunart.quadro.pixellatte.data.classes

import com.google.gson.annotations.SerializedName

/**
 * Created by panjiyudasetya on 11/2/17.
 */
object UserData {
    data class ProfileImage(
            val small: String,
            val medium: String,
            val large: String
    )
    data class User(
            val id: String,
            @SerializedName("updated_at") val updatedAt:String,
            val username: String,
            val name: String,
            @SerializedName("first_name") val firstName: String,
            @SerializedName("last_name") val lastName: String,
            @SerializedName("twitter_username") val twitterUserName: String,
            @SerializedName("portfolio_url") val portfolioUrl: String,
            val bio: String,
            val location: String,
            @SerializedName("total_likes") val totalLikes: Int,
            @SerializedName("total_photos") val totalPhotos: Int,
            @SerializedName("total_collections") val totalCollection: Int,
            @SerializedName("profile_image") val profileImage: ProfileImage,
            val links: LinksData.UserLink
    )
}