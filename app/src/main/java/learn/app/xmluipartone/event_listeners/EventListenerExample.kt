package learn.app.xmluipartone.event_listeners

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class EventListenerExample : AppCompatActivity(), View.OnClickListener {

    lateinit var inputField : EditText
    lateinit var outputText : TextView
    lateinit var btnClick : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_event_listener_example)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inputField = findViewById(R.id.input_field)
        outputText = findViewById(R.id.output_txt)
        btnClick  = findViewById(R.id.btn_click)

        btnClick.setOnClickListener(this@EventListenerExample) // event handling

    }

    override fun onClick(v: View?) {
        val content : String = inputField.text.toString()

        outputText.text = content
    }
}