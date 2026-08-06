package learn.app.xmluipartone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import learn.app.xmluipartone.R
import learn.app.xmluipartone.adapter.model_class.Contact

class ExampleOfBaseAdapter(private val context: Context, val collection : List<Contact>) : BaseAdapter() {
    override fun getCount(): Int {
       return collection.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_contact_card, null)

        val container = view.findViewById<LinearLayout>(R.id.contact_card)
        container.setBackgroundColor(context.getColor(R.color.ligth_blue))
        val title = view.findViewById<TextView>(R.id.txt_title)
        val contact = view.findViewById<TextView>(R.id.txt_contact)
        title.text = collection[position].name
        contact.text = "+91 ${collection[position].contact}"
        return view
    }


}