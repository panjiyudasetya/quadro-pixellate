package lunart.quadro.pixellatte.activities

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import lunart.quadro.pixellatte.QuadroActivity
import lunart.quadro.pixellatte.R

class DashboardActivity : QuadroActivity() {
    val layout by lazy { findViewById(R.id.activity_dashboard) as CoordinatorLayout }

    override fun initWithLayout(): Int {
        return R.layout.activity_dashboard
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
