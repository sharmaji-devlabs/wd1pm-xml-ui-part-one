package learn.app.xmluipartone.views.checkbox_view_example

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.checkbox.MaterialCheckBox
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import learn.app.xmluipartone.R
import kotlin.concurrent.thread
import kotlin.concurrent.timer
import kotlin.coroutines.coroutineContext

class CheckBoxViewExamples : AppCompatActivity() {
    private lateinit var chkWeekdays : CheckBox
    private  lateinit var chkWeekend : AppCompatCheckBox
    private lateinit var chkPartTime : MaterialCheckBox
    private lateinit var btnSignUp : AppCompatButton
    private lateinit var txtError : TextView
    private lateinit var chkTermsCondition : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box_view_examples)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        chkPartTime = findViewById(R.id.chk_part_time)
        chkWeekend = findViewById(R.id.chk_weekend)
        chkWeekdays = findViewById(R.id.chk_weekdays)
        chkTermsCondition = findViewById(R.id.chk_terms_condition)
        btnSignUp = findViewById(R.id.btn_submit_terms)
        txtError = findViewById(R.id.txt_error)

//        chkPartTime.setOnClickListener {
//            toast(if(chkPartTime.isChecked) "Checked Part time" else "Unchecked Part time").show()
//        }
//
//        chkWeekend.setOnClickListener {
//            toast(if(chkWeekend.isChecked) "Checked Weekend" else "Unchecked Weekend").show()
//        }
//
//        chkWeekdays.setOnClickListener {
//            toast(if(chkWeekdays.isChecked) "Checked Weekdays" else "Unchecked Weekdays").show()
//        }
//

        btnSignUp.setOnClickListener {
            if (!chkTermsCondition.isChecked){
                toast("You've must check terms & conditions").show()
                return@setOnClickListener
            }

            toast("Signed Up").show()
        }
    }

    private fun toast(message : String) = Toast.makeText(this@CheckBoxViewExamples, message, Toast.LENGTH_SHORT)
}