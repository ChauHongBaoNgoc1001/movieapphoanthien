package com.example.movieapp_hoanthien

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xem = findViewById<Button>(R.id.xemDS)
        val logOut = findViewById<Button>(R.id.logOut)
        val hienThi = findViewById<TextView>(R.id.hienthi)

        val username = intent.getStringExtra("username")
        val hien = "Welcome $username to the movie-watching application!"
        hienThi.text = hien

        xem.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            this.startActivity(intent) // chuyển màn hình
        }

        logOut.setOnClickListener {
            // Tạo dialog để gán với layout
            val builder = AlertDialog.Builder(this)
            // Thành lập dialog
            // Bước 1 Tạo layout
            val inflater = this.layoutInflater
            val view = inflater.inflate(R.layout.dialog_logout, null)
            builder.setView(view)
            // Bước 2 - Ánh xạ
            val dllogOut = view.findViewById<Button>(R.id.dialog_logout)
            val dltcancel = view.findViewById<Button>(R.id.dialog_cencel)
            // Tạo AlertDialog
            val alertDialog = builder.create()
            alertDialog.show()

            dllogOut.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent) // Chuyển sang màn hình LoginActivity
                finish() //  Kết thúc MainActivity hiện tại
            }

            dltcancel.setOnClickListener {
                alertDialog.dismiss() // Đóng dialog khi nhấp vào nút "Cancel"
            }
        }
    }
}