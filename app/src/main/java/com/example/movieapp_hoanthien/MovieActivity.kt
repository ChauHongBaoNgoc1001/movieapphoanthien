package com.example.movieapp_hoanthien

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val listView = findViewById<ListView>(R.id.list_view)

        val adapter = ItemMovie(this)
        listView.adapter = adapter

        val myDataset = Datasource().list().toMutableList()
        adapter.updateData(myDataset)
    }
}