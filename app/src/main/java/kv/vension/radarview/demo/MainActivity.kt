package kv.vension.radarview.demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener(View.OnClickListener { radar.start() })

        btn_stop.setOnClickListener(View.OnClickListener { radar.stop() })
    }
}
