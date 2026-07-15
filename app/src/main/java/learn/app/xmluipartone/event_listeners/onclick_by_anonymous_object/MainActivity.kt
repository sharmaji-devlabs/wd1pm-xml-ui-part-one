package learn.app.xmluipartone.event_listeners.onclick_by_anonymous_object

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class MainActivity : AppCompatActivity() {

    private lateinit var inputField: AppCompatEditText
    private lateinit var textOutput: AppCompatTextView

    private lateinit var btnSubmit2: AppCompatButton

    private lateinit var btnToast: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initializeView()

        btnSubmit2.setOnClickListener(clickEvent)

//        val toast = Toast(this@MainActivity)
//
////        toast.setText("Hello world")
//
//        toast.duration =  Toast.LENGTH_SHORT // compulsory

//        btnToast.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                val text = inputField.text.toString()
////                toast.setText(text)
////                toast.show() // to popup on screen
//                Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
//            }
//        })

        // passing lambda expression
//        btnToast.setOnClickListener({ view ->
//            val text = inputField.text.toString()
//            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
//        })

        // kotlin built-in provide lambda block for abstract method
        btnToast.setOnClickListener {

            val text = inputField.text.toString()
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
        }

    }


    private val clickEvent = object : View.OnClickListener {
        override fun onClick(v: View?) {
            val line = inputField.text.toString()
            textOutput.text = "${textOutput.text}$line"
        }
    }

    private fun initializeView() {
        inputField = findViewById(R.id.input_text)
        textOutput = findViewById(R.id.text_line)
        btnSubmit2 = findViewById(R.id.btn_submit_2)
        btnToast = findViewById(R.id.btn_toast)
    }


}