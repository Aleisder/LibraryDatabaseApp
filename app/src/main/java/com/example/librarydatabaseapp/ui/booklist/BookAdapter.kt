package com.example.librarydatabaseapp.ui.booklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.librarydatabaseapp.R

class BookAdapter() : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    class BookViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val picture: ImageView = view.findViewById(R.id.book_image)
        val title: TextView = view.findViewById(R.id.tv_title)
        val author: TextView = view.findViewById(R.id.tv_author)
        val publishingHouse: TextView = view.findViewById(R.id.tv_publishing_house)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(
        R.layout.book_list_item,
        parent,
        false
        )
        return BookViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}