package com.example.movieapp_hoanthien

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomListView(
    context: Context,
    private val resource: Int,
    private val items: MutableList<ItemComment>
) : ArrayAdapter<ItemComment>(context, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(resource, parent, false)

        val item: ItemComment = items[position]
        val user: TextView = view.findViewById(R.id.list_user)
        user.text = item.User

        val comment: TextView = view.findViewById(R.id.list_cmt)
        comment.text = item.Comment

        val Xoa: ImageView = view.findViewById(R.id.xoa)
        Xoa.setOnClickListener {
            items.removeAt(position)// xóa item tại vị trí đó
            notifyDataSetChanged()// cập nhật lại listView
        }
        return view
    }
}
