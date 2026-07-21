package learn.app.xmluipartone.event_listeners.onclicklisteneter_on_anotherview

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class OnClickEventOnAnotherView : AppCompatActivity() {
    private lateinit var txtClickEvent: TextView
    private lateinit var rootContainer: LinearLayout

    private var isDark = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_click_event_on_another_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_click)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rootContainer = findViewById(R.id.main_click)
        txtClickEvent = findViewById(R.id.txt_click_event)
        var click = 0
        txtClickEvent.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                click++;
                txtClickEvent.text = "Clicked : $click"
                Toast.makeText(
                    this@OnClickEventOnAnotherView,
                    "😍😍 Clicked $click times",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })


//        rootContainer.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                isDark = !isDark
//                if (isDark) {
//                    rootContainer.setBackgroundColor(getColor(R.color.black))
//                    txtClickEvent.setTextColor(getColor(R.color.white))
//                } else {
//                    rootContainer.setBackgroundColor(getColor(R.color.white))
//                    txtClickEvent.setTextColor(getColor(R.color.black))
//                }
//            }
//        })

        // long click event
//        rootContainer.setOnLongClickListener(object : View.OnLongClickListener{
//            override fun onLongClick(v: View?): Boolean {
//
//                isDark = !isDark
//                if (isDark) {
//                    rootContainer.setBackgroundColor(getColor(R.color.black))
//                    txtClickEvent.setTextColor(getColor(R.color.white))
//                } else {
//                    rootContainer.setBackgroundColor(getColor(R.color.white))
//                    txtClickEvent.setTextColor(getColor(R.color.black))
//                }
//                return true
//            }
//        })

        var isBold = false
        txtClickEvent.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                txtClickEvent.textSize = if(isBold)33.5f else 22.4f
                return false;
            }
        })

    }
}