package learn.app.xmluipartone.adapter.contact_using_array_adapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import learn.app.xmluipartone.R
import learn.app.xmluipartone.adapter.model_class.Contact

class ContactAdapter(private  val context: Context, val collection : List<Contact>) : ArrayAdapter<Any>(context, 0) {

    override fun getCount(): Int {
        return collection.size
    }



    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_contact_card, null)
        val title = view.findViewById<TextView>(R.id.txt_title)
        val contact = view.findViewById<TextView>(R.id.txt_contact)
        title.text = collection[position].name
        contact.text = "+91 ${collection[position].contact}"
        return view
    }


}