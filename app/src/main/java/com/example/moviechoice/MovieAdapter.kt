package com.example.moviechoice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviechoice.databinding.ItemMovieBinding
import com.google.android.material.snackbar.Snackbar


class MovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.titleTextview.text = movie.title
        holder.binding.ratingTextview.text = movie.rating.toString()
        holder.binding.movieImageview.setImageResource(movie.posterId)

        holder.binding.infoButton.setOnClickListener(){
            Snackbar.make(holder.binding.root, "${movie.title}, ${movie.rating.toString()}", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = movies.size
}