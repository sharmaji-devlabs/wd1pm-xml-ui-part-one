package learn.app.xmluipartone.views.toast_view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class AllToastViewExamples : AppCompatActivity() {
    private lateinit var preDefinedToast : Button
    private lateinit var btnCustomToast : Button

    private lateinit var customToastText : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_toast_view_examples)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        preDefinedToast = findViewById(R.id.btn_pre_toast)
        btnCustomToast  = findViewById(R.id.btn_custom_toast)
//
//        val toast = Toast(this@AllToastViewExamples)
//        toast.setText("Pre-defined Toast😍😍😍")
//        toast.setDuration(Toast.LENGTH_SHORT)
        preDefinedToast.setOnClickListener {
//            toast.show()
//            toast.cancel() // close
            Toast.makeText(this@AllToastViewExamples, "pre-defined Toast", Toast.LENGTH_LONG).show()
        }

//        val customToast = createCustomToast("Custom Toast")

        btnCustomToast.setOnClickListener {
//            customToast.show()
            createCustomToast("Create Custom toast").show()
        }


    }

    private  fun createCustomToast(message:String) : Toast {
        val toastView : View = layoutInflater.inflate(R.layout.custom_view_toast, null, false)

        customToastText = toastView.findViewById(R.id.custom_toast_txt)
        val customToast : Toast = Toast(this@AllToastViewExamples)
        customToast.view = toastView
        customToast.duration = Toast.LENGTH_LONG
        customToastText.text = message

        return customToast
    }

//    private fun preDefined(message:String){
//    }

    /*
        To create a custom toast :
            1. create toast design using xml
            2 convert xml layout into view by using layoutInflator
            3. create a toast object and set inflated view
            4. now we can ready to show

     */



}