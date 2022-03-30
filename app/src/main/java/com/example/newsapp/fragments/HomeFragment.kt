package com.example.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.savedButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_savedFragment)
        }

        //test of Nav
        binding.itemNews.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_selectedFragment)
        }

        //test of Refresh
        binding.refreshButton.setOnClickListener{
            Toast.makeText(context, "Refreshing News", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}