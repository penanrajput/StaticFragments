package com.example.staticfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.staticfragments.databinding.FragmentCountUpBinding


class CountUpFragment : Fragment() {

    private var _binding: FragmentCountUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment using ViewBinding
        _binding = FragmentCountUpBinding.inflate(inflater, container, false)
        var count = 0
        // Set the counter text using the binding
        binding.btnAdd.setOnClickListener {
            count++;
            binding.tvCounter.text = count.toString()
        }
        return binding.root
    }
}