package learn.app.xmluipartone.adapter.contact_using_array_adapter

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import learn.app.xmluipartone.R
import learn.app.xmluipartone.adapter.ExampleOfBaseAdapter
import learn.app.xmluipartone.adapter.contact_using_array_adapter.adapter.ContactAdapter
import learn.app.xmluipartone.adapter.model_class.Contact

class ContactScreenUsingArrayAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_screen_using_array_adapter)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val contactViewList = findViewById<ListView>(R.id.contact_view_list)

        val contactList = listOf(Contact("Abhishek", "930934894389"),
            Contact("Aditi Goswami", "439823982332"),
            Contact("Chandan", "98473732432"))
        // example of custom array adapter
//        val adapter = ContactAdapter(this@ContactScreenUsingArrayAdapter, contactList)

        // base adapter
        val adapter = ExampleOfBaseAdapter(this@ContactScreenUsingArrayAdapter, contactList)
        contactViewList.adapter = adapter

    }
}