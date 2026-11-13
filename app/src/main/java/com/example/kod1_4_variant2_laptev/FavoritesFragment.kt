package com.example.kod1_4_variant2_laptev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoritesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvFavoritesTitle = view.findViewById<TextView>(R.id.tvFavoritesTitle)
        tvFavoritesTitle.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        val rvFavorites = view.findViewById<RecyclerView>(R.id.rvFavorites)
        rvFavorites.layoutManager = LinearLayoutManager(requireContext())

        val favoritesList = listOf(
            Movie("Witcher", R.drawable.poster_witcher),
            Movie("Jessica Jones", R.drawable.poster_jessica)
        )

        rvFavorites.adapter = MovieAdapter(favoritesList)
    }
}
