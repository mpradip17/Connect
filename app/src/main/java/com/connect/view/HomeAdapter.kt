package com.connect.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.connect.R
import com.connect.databinding.ItemPostBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private val list = Album.albumList()

    class ViewHolder(
        itemView: ItemPostBinding
    ) : RecyclerView.ViewHolder(itemView.root) {

        private val nameTextView: TextView = itemView.tvTitle
        private val artistTextView: TextView = itemView.tvName
        private val desc: TextView = itemView.tvDesc

        fun bind(album: Album) {
            nameTextView.text = album.name
            artistTextView.text = album.artist
            desc.text = album.desc
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

       return ViewHolder(ItemPostBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: Album = list[position]
        holder.bind(data)
    }

    override fun getItemCount() = list.size
}