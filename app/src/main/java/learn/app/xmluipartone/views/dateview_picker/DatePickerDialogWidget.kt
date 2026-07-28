package learn.app.xmluipartone.views.dateview_picker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R
import java.util.Calendar

class DatePickerDialogWidget : AppCompatActivity() {
    private lateinit var selectDob : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_picker_dialog_widget)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        selectDob = findViewById(R.id.select_dob)

        // date picker dialog setup
        val datePicker = DatePickerDialog(this@DatePickerDialogWidget, object: DatePickerDialog.OnDateSetListener{
            override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                selectDob.text = "Date of Birth : $dayOfMonth/${month+1}/$year"
            }
        }, 2026, 6, 28)

        datePicker.setCancelable(false)
        selectDob.setOnClickListener {
            datePicker.show()
        }

    }
}