package learn.app.xmluipartone.views.alert_dialog

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class PreDefineAlertDialogBox : AppCompatActivity() {
    private var button : AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pre_define_alert_dialog_box)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button = findViewById(R.id.btn_alert_dialog)

        val alertDialog = AlertDialog.Builder(this@PreDefineAlertDialogBox)

        // to set icon on alert dialog
        // passing icon by drawable object
//        alertDialog.setIcon(getDrawable(R.drawable.icon_info))

        // passing icon by drawable reference
        alertDialog.setIcon(R.drawable.icon_info)

        // to set alert dialog title string
        alertDialog.setTitle(R.string.alert_title)

        // to set message on alert dialog title
        alertDialog.setMessage("Please check the terms and conditions")

        alertDialog.setCancelable(false) // dialog will not close mistouch


        alertDialog.setPositiveButton("Yes", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog?.cancel()
            }
        })

        alertDialog.setNegativeButton("No", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog?.cancel()
            }
        })

        button?.setOnClickListener {
            alertDialog.show()
        }


    }


}