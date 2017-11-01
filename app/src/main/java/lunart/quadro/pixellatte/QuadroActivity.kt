package lunart.quadro.pixellatte

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class QuadroActivity : AppCompatActivity() {
    abstract fun initWithLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initWithLayout())
    }
}
