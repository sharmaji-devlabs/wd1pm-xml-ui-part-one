package learn.app.xmluipartone.reusable_components

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class ReUseCompOne : AppCompatActivity() {
    private lateinit var btnCrepes : Button
    private lateinit var btnSpringRolls : Button

    private lateinit var porkSkewer : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_re_use_comp_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnCrepes = findViewById(R.id.btn_crepes)
        btnSpringRolls = findViewById(R.id.btn_spring_rolls)

        btnCrepes.text = "Crepes"
        btnSpringRolls.text = "Spring Rolls"

        porkSkewer = findViewById(R.id.pork_skewer)

        val productTitle : TextView = porkSkewer.findViewById(R.id.product_title)

        productTitle.text = "Pork Skewer"
        val productImage = porkSkewer.findViewById<ImageView>(R.id.product_img)

        productImage.setImageResource(R.drawable.snacks_2)

    }
}