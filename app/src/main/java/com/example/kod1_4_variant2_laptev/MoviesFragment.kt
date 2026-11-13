package com.example.kod1_4_variant2_laptev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MoviesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvMoviesTitle = view.findViewById<TextView>(R.id.tvMoviesTitle)
        tvMoviesTitle.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        val rvMovies = view.findViewById<RecyclerView>(R.id.rvMovies)
        rvMovies.layoutManager = LinearLayoutManager(requireContext())

        val movieList = listOf(
            Movie("Witcher", R.drawable.poster_witcher),
            Movie("Jessica Jones", R.drawable.poster_jessica),
            Movie("Magicians", R.drawable.poster_magicians)
        )

        rvMovies.adapter = MovieAdapter(movieList)
    }
}
