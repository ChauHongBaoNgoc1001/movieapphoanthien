package com.example.movieapp_hoanthien

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    // Khai báo biến rỗng lưu thông tin  tạm thời mk và tên
    var saveUsername: String = ""
    var savePassword: String = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val name = findViewById<EditText>(R.id.name)
        val pass = findViewById<EditText>(R.id.pass)
        val dangKi = findViewById<Button>(R.id.login)
        val dangNhap = findViewById<Button>(R.id.register) // đăng kí

        dangKi.setOnClickListener {
            // Tạo dialog để gán với layout
            val builder = AlertDialog.Builder(this)
            // Thiết lập dialog
            val inflater = this.layoutInflater
            val view = inflater.inflate(R.layout.dialog_register, null)
            builder.setView(view)

            val dialogName = view.findViewById<EditText>(R.id.dialogName)
            val dialogPass = view.findViewById<EditText>(R.id.dialogPass)
            val dialogDangKi = view.findViewById<Button>(R.id.dialogLogin)
            val dialogCancel = view.findViewById<Button>(R.id.dialogCancel)

            // Tạo AlertDialog
            val alertDialog = builder.create()
            alertDialog.show()

            val passwordPattern = "^[a-zA-Z0-9]+$"

            dialogDangKi.setOnClickListener {
                val username = dialogName.text.toString()
                val password = dialogPass.text.toString()

                if (username.isNotEmpty() && password.isNotEmpty()) {// kiểm tra rống
                    if (password.matches(passwordPattern.toRegex())) {  // Kiểm tra xem mật khẩu có đúng yêu cầu không
                        saveUsername = username
                        savePassword = password
                        name.setText("$saveUsername")
                        pass.setText("$savePassword")
                        Toast.makeText(this, "Account registration successful!", Toast.LENGTH_SHORT)
                            .show() // Đăng ký tài khoản thành công!"
                        alertDialog.dismiss() // đóng dialog
                    } else {
                        Toast.makeText(
                            this,
                            "Password must be alphanumeric without diacritics.",
                            Toast.LENGTH_SHORT
                        ).show()// "Mật khẩu phải là chữ và số không có dấu."
                    }
                } else {
                    Toast.makeText(
                        this,
                        "Please enter your username and password.",
                        Toast.LENGTH_SHORT
                    ).show() //"Vui lòng nhập tên người dùng và mật khẩu của bạn."
                }
            }

            dialogCancel.setOnClickListener {
                alertDialog.dismiss() // đóng dialog
            }
        }

        val eye = findViewById<ImageView>(R.id.eye)

        eye.setOnClickListener {
            if (pass.inputType == InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                // Nếu hiện mật khẩu, thay đổi thành ẩn mật khẩu
                pass.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                eye.setImageResource(R.drawable.eye)  // Thay đổi hình ảnh của ImageView
            } else {
                // Nếu ẩn mật khẩu, thay đổi thành hiển thị chữ
                pass.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                eye.setImageResource(R.drawable.eyean) // Thay đổi hình ảnh của ImageView
            }
            pass.setSelection(pass.text.length) // Di chuyển con trỏ của EditText về cuối văn bản
        }

        dangNhap.setOnClickListener {
            val username = name.text.toString()
            val password = pass.text.toString()

            if (username.isEmpty() || password.isEmpty()) { // kiểm tra rỗng
                Toast.makeText(
                    this,
                    "Please enter your login name and password.", //"Vui lòng nhập tên đăng nhập và mật khẩu"
                    Toast.LENGTH_SHORT
                ).show()
            } else if (username == saveUsername && password == savePassword) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)

                finish() // Kết thúc hoạt động LoginActivity sau khi chuyển sang MainActivity
            } else {
                Toast.makeText(
                    this,
                    "Incorrect username or password.",// Tên đăng nhập hoặc mật khẩu không đúng
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
