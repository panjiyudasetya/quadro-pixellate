package lunart.quadro.pixellatte.fragments

import butterknife.BindView
import lunart.quadro.pixellatte.R
import lunart.quadro.pixellatte.data.classes.ImageData
import lunart.quadro.pixellatte.ui.ContentListView

/**
 * Created by panjiyudasetya on 11/2/17.
 */
class ContentListFragment : BaseFragment() {
    @BindView(R.id.content_list_view)
    lateinit var contentListView: ContentListView<ImageData.Image>

    override fun initWithLayout(): Int {
        return R.layout.fragment_content_list
    }

    override fun onViewReady() {

    }
}