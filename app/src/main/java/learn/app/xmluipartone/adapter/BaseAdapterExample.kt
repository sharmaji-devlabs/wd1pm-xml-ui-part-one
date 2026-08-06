package learn.app.xmluipartone.adapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R

class BaseAdapterExample : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_base_adapter_example)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val courses = arrayOf("Select course","Flutter Developement", "Androd Development", "KMP Development", "React Native", "MERN Developlent", "Java Development" )

        val coursesDropDown = findViewById<Spinner>(R.id.course_selection)
        val btnSelected = findViewById<Button>(R.id.btn_get_course)

        // pre-define
        val adapter = ArrayAdapter<String>(this@BaseAdapterExample, R.layout.custom_text_view, R.id.custom_text, courses )

        coursesDropDown.adapter = adapter


        btnSelected.setOnClickListener {
            Toast.makeText(this@BaseAdapterExample, coursesDropDown.selectedItem.toString(), Toast.LENGTH_SHORT).show()
        }



    }
}
/*
What is Adapter?
    An adapter is bridge between data and UI component.
    It can render multiple data with same component.

    Types of Adapter:
        -> Base Adapter
        -> ArrayAdapter
            -> pre-define
            -> custom ArrayAdapter
        -> Cursor Adapter
            -> pre-define
            -> Custom ArrayAdapter
        -> RecyclerView.Adapter


 */