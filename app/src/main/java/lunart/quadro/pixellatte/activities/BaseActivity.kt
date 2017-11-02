package lunart.quadro.pixellatte.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.Unbinder

abstract class BaseActivity : AppCompatActivity() {
    private var unbinder: Unbinder? = null

    abstract fun initWithLayout(): Int
    abstract fun onViewReady()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initWithLayout())
        ButterKnife.bind(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }
}
