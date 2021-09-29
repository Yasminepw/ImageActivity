package edu.temple.imageactivity

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (private val dataSet: List<Images>, activity: Activity) : RecyclerView.Adapter<ImageAdapter.Viewer>() {
    var imageView: ImageView = activity.findViewById(R.id.imageView)
    var textView: TextView = activity.findViewById(R.id.titleTextView)

    class Viewer(_itemView: View) : RecyclerView.ViewHolder(_itemView) {
        val imageView : ImageView = _itemView.findViewById(R.id.imageViewLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewer {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.`image_main`, parent, false)
        return Viewer(view)
    }


    override fun onBindViewHolder(holder: Viewer, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)

        holder.imageView.setOnClickListener{
            imageView.setImageResource(dataSet[position].resourceId)
            textView.text = dataSet[position].title
        }
    }

    override fun getItemCount() = 12

}