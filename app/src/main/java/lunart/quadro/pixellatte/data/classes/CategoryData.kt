package lunart.quadro.pixellatte.data.classes

import com.google.gson.annotations.SerializedName

/**
 * Created by panjiyudasetya on 11/2/17.
 */
object CategoryData {
    data class Category (
            val id: Int,
            val title: String,
            @SerializedName("photo_count") val photoCount: Int,
            val links: LinksData.CategoryLink
    )
}