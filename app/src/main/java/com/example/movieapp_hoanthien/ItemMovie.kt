package com.example.movieapp_hoanthien

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class ItemMovie(context: Context) : ArrayAdapter<Phim>(context, 0) {

    private val dataset: MutableList<Phim> = mutableListOf()

    fun updateData(data: MutableList<Phim>) {
        dataset.clear()
        dataset.addAll(data)
        notifyDataSetChanged()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_movie, parent, false)

        val item = dataset[position]

        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val textView: TextView = itemView.findViewById(R.id.item_title)
        val textView1: TextView = itemView.findViewById(R.id.item_overview)

        Glide.with(context)
            .load(item.poster)
            .into(imageView)

        textView.text = item.title
        textView1.text = item.overview

        itemView.setOnClickListener {
            val intent = Intent(context,DetailActivity::class.java) // chuyển trang
            intent.putExtra("MOVIE_TITLE", item.title)
            intent.putExtra("MOVIE_OVERVIEW", item.overview)
            intent.putExtra("MOVIE_POSTER_URL", item.poster)
            intent.putExtra("Director", item.director)
            intent.putExtra("time", item.time)
            intent.putExtra("Category", item.category)
            intent.putExtra("Performer", item.performer)
            context.startActivity(intent)
        }
        return itemView
    }

    override fun getCount(): Int {
        return dataset.size
    }
}