package com.example.staticfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.staticfragments.databinding.FragmentCountDownBinding

class CountDownFragment : Fragment() {

    private var _binding: FragmentCountDownBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment using ViewBinding
        _binding = FragmentCountDownBinding.inflate(inflater, container, false)
        var count = 0
        // Set the counter text using the binding
        binding.btnSub.setOnClickListener {
            count--;
            binding.tvCounter.text = count.toString()
        }
        return binding.root
    }


}