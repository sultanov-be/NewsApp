package com.example.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentSavedNewsBinding

class SavedFragment : Fragment() {
    private var _binding: FragmentSavedNewsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSavedNewsBinding.inflate(inflater, container, false)

        binding.backButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_savedFragment_to_homeFragment)
        }
        return binding.root
    }
}