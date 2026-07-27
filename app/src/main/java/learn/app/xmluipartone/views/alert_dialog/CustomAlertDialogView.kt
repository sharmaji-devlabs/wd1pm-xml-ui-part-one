package learn.app.xmluipartone.views.alert_dialog

import android.app.Dialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class CustomAlertDialogView : AppCompatActivity() {
    private lateinit var button : AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_alert_dialog_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button = findViewById(R.id.btn_custom_dialog)

        val dialog = Dialog(this@CustomAlertDialogView)

        dialog.setContentView(R.layout.custom_dialog_view)
        dialog.setCancelable(false)

        button.setOnClickListener {
            dialog.show()
        }

    }



}