package com.example.tabbed_0105

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieAdapter(private val listMovie:ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtTitle: TextView? = itemView.findViewById(R.id.txtTitle)
        var txtYear: TextView? = itemView.findViewById(R.id.txtYear)

        fun bind(movie: Movie) {
            with(itemView){
                txtTitle?.text = movie.title
                txtYear?.text = movie.year
            }
        }
    }
}