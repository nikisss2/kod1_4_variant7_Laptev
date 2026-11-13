package com.example.kod1_4_variant2_laptev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class MainMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNavDiscussions = view.findViewById<LinearLayout>(R.id.btnNavDiscussions)
        val btnNavMovies = view.findViewById<LinearLayout>(R.id.btnNavMovies)
        val btnNavFavorites = view.findViewById<LinearLayout>(R.id.btnNavFavorites)

        btnNavDiscussions.setOnClickListener {
            openFragment(ChatListFragment())
        }

        btnNavMovies.setOnClickListener {
            openFragment(MoviesFragment())
        }

        btnNavFavorites.setOnClickListener {
            openFragment(FavoritesFragment())
        }
    }

    private fun openFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
