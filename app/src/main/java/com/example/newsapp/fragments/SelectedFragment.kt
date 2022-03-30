package com.example.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentSelectedNewsBinding

class SelectedFragment : Fragment() {
    private var _binding: FragmentSelectedNewsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectedNewsBinding.inflate(inflater, container, false)

        binding.backButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_selectedFragment_to_homeFragment)
        }

        var likedNews = false

        binding.likeButton.setOnClickListener{
            if (likedNews == false) {
                likedNews = true
                binding.likeButton.setImageResource(R.drawable.ic_liked_heart)
                Toast.makeText(context, "Added to Saved news", Toast.LENGTH_SHORT).show()
            } else {
                binding.likeButton.setImageResource(R.drawable.ic_heart_icon)
                Toast.makeText(context, "Removed from Saved news", Toast.LENGTH_SHORT).show()
                likedNews = false
            }
        }

        return binding.root
    }

}