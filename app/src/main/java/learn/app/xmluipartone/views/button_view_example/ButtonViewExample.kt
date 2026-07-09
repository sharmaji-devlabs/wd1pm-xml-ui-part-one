package learn.app.xmluipartone.views.button_view_example

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class ButtonViewExample : AppCompatActivity() {
    private lateinit var btnSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_button_view_example)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // to find any view or view group activity provide findViewById() method (note : this is a generic method)
        btnSubmit = findViewById(R.id.btn_submit);

//        btnSubmit.text = "Only Submit"

        btnSubmit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                btnSubmit.text = "Clicked"
            }
        });

        btnSubmit.setOnClickListener(Click())

    }
//
//    override fun onClick(v: View?) {
//        btnSubmit.text = "Clicked"
//    }
}

//class Click : View.OnClickListener{
//    override fun onClick(v: View?) {
//
//    }
//}