package com.example.kod1_4_variant2_laptev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(
    private val movieList: List<Movie>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPoster: ImageView = itemView.findViewById(R.id.ivPoster)
        val tvMovieTitle: TextView = itemView.findViewById(R.id.tvMovieTitle)
        val ivPlay: ImageView = itemView.findViewById(R.id.ivPlay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.tvMovieTitle.text = movie.title
        holder.ivPoster.setImageResource(movie.imageRes)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, movie.title, Toast.LENGTH_SHORT).show()
        }

        holder.ivPlay.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Воспроизведение: ${movie.title}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = movieList.size
}
