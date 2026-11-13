package com.example.kod1_4_variant2_laptev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ChatListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDiscussionsTitle = view.findViewById<TextView>(R.id.tvDiscussionsTitle)
        tvDiscussionsTitle.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
