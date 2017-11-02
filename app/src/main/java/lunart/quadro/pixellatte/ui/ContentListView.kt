package lunart.quadro.pixellatte.ui

import android.annotation.TargetApi
import android.content.Context
import android.support.annotation.NonNull
import android.support.design.widget.CoordinatorLayout
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import butterknife.BindView
import butterknife.ButterKnife
import lunart.quadro.pixellatte.R

/**
 * Created by panjiyudasetya on 11/2/17.
 */
class ContentListView<T> : RelativeLayout {
    @BindView(R.id.content_layout)
    lateinit var contentLayout: CoordinatorLayout
    @BindView(R.id.refresh_layout)
    lateinit var refreshLayout: SwipeRefreshLayout
    @BindView(R.id.rv_content_list)
    lateinit var contentList: RecyclerView

    var dataSource: List<T>
        get() = this.dataSource
        @NonNull set(dataSource) {
            this.dataSource = dataSource

        }

    constructor(context: Context?) : super(context) {
        init(context)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    @Suppress("unused")
    @TargetApi(21)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context)
    }

    private fun init(context: Context?) {
        val contentView = View.inflate(context, R.layout.content_list_layout, this)
        ButterKnife.bind(this, contentView)
    }
}
