package learn.app.xmluipartone.views.radioview_and_radiogroup

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class RadioViewAndRadioGroup : AppCompatActivity() {
    private lateinit var maleRadio : RadioButton
    private lateinit var femaleRadio : RadioButton
    private lateinit var otherRadio : RadioButton
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_view_and_radio_group)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        maleRadio = findViewById(R.id.male_radio)
        femaleRadio = findViewById(R.id.female_radio)
        otherRadio = findViewById(R.id.other_radio)
        button = findViewById(R.id.btn_selected_gender)

        button.setOnClickListener {
            val answer = if (maleRadio.isChecked)
                "Male"
            else if (femaleRadio.isChecked)
                "Female"
            else if (otherRadio.isChecked)
                "Other"
            else ""
            val toast = getToast(answer)
            toast.show()

        }

    }

    fun getToast(message : String) = Toast.makeText(this@RadioViewAndRadioGroup, message, Toast.LENGTH_SHORT)
}