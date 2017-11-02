package lunart.quadro.pixellatte.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder

/**
 * Created by panjiyudasetya on 11/2/17.
 */
abstract class BaseFragment : Fragment() {
    private var unbinder: Unbinder? = null

    abstract fun initWithLayout(): Int
    abstract fun onViewReady()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(initWithLayout(), container, false)
        if (view != null) unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder?.unbind()
    }
}