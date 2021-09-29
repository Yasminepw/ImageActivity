package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ImageAdapter(photoList(), this)
        val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        mRecyclerView.layoutManager = GridLayoutManager(this, 2)
        mRecyclerView.adapter = adapter


    }
}
