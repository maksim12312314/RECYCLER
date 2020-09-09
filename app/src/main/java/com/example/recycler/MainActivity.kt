package com.example.recycler

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class RecData (var item:String, var description: String )



class ImageAdapter(var items:List<RecData>,var context: Context): RecyclerView.Adapter<ImageAdapter.Holder>() {
    class Holder(view: View):RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.name)
        var description = view.findViewById<TextView>(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var view = LayoutInflater.from(context).inflate(R.layout.element, parent, false)
        var holder = Holder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.name.text = items[position].item
        holder.description.text = items[position].description
    }


}


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = mutableListOf<RecData>(RecData("name", "20"), RecData("resp", "34"), RecData("title", "45"))
        spisok.adapter = ImageAdapter(items, this )
        spisok.layoutManager = LinearLayoutManager(this)

        buttonDel.setOnClickListener {
            fun delThis () {
                
            }
        }

    }
}
