package com.example.modified_unit_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.modified_unit_converter.databinding.ActivityMainBinding
import com.example.modified_unit_converter.databinding.FragmentHomeScreenBinding


class HomeScreen : Fragment() {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeScreenBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            it.findNavController().navigate(R.id.kgToGram)
        }

        binding.button2.setOnClickListener{
            it.findNavController().navigate(R.id.kgToPound)
        }

        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.celciusToKelvin)
        }

        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.meterToFeet)
        }
        return binding.root
    }


}