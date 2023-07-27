package com.example.movieapp_hoanthien

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class ImgDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imgdetail)

        val img = intent.getStringExtra("anh")
        val imgView: ImageView = findViewById(R.id.anh)
        Picasso.get().load(img).into(imgView)
    }
}