package com.example.movieapp_hoanthien

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val posterUrl = intent.getStringExtra("MOVIE_POSTER_URL")
        val imageView: ImageView = findViewById(R.id.detail_img)
        Picasso.get().load(posterUrl).into(imageView)

        imageView.setOnClickListener {
            val intent = Intent(this, ImgDetailActivity::class.java)
            intent.putExtra("anh", posterUrl)
            startActivity(intent)
        }

        val text = intent.getStringExtra("MOVIE_TITLE")
        val textView: TextView = findViewById(R.id.detail_Title)
        textView.text = text.toString()// GỌI ĐỂ HIỂN THỊ

        val text1 = intent.getStringExtra("MOVIE_OVERVIEW")
        val textView1: TextView = findViewById(R.id.detail_Overview)
        textView1.text = text1.toString()// GỌI ĐỂ HIỂN THỊ

        val daodien = intent.getStringExtra("Director")
        val Director: TextView = findViewById(R.id.detail_Director)
        Director.text = daodien.toString()// GỌI ĐỂ HIỂN THỊ

        val tGian = intent.getStringExtra("time")
        val time: TextView = findViewById(R.id.detail_time)
        time.text = tGian.toString()// GỌI ĐỂ HIỂN THỊ

        val theLoai = intent.getStringExtra("Category")
        val Category: TextView = findViewById(R.id.detail_Category)
        Category.text = theLoai.toString()// GỌI ĐỂ HIỂN THỊ

        val dienVien = intent.getStringExtra("Performer")
        val Performer: TextView = findViewById(R.id.detail_Performer)
        Performer.text = dienVien.toString()// GỌI ĐỂ HIỂN THỊ

        val Ten = findViewById<EditText>(R.id.user)
        val comment = findViewById<EditText>(R.id.cmt)
        val DanhSach = findViewById<ListView>(R.id.list_cmt)
        val btnComment = findViewById<Button>(R.id.btn_cmt)

        val danhsach: MutableList<ItemComment> = mutableListOf()
        val adapter = CustomListView(this@DetailActivity, R.layout.item_commet, danhsach)

        DanhSach.adapter = adapter

        btnComment.setOnClickListener {
            val cmt = comment.text.toString()
            val ten = Ten.text.toString()

            if (ten.isNotEmpty() && cmt.isNotEmpty()) {
                val userInfo = ItemComment(ten, cmt)

                danhsach.add(userInfo)
                adapter.notifyDataSetChanged()

                comment.text.clear()
                Ten.text.clear()
            } else {
                Toast.makeText(this, "Please provide complete information.", Toast.LENGTH_SHORT).show() // vui lòng nhập đủ thông tin
            }
        }
    }
}
