package com.example.modified_unit_converter

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modified_unit_converter.databinding.FragmentKgToGramBinding


class KgToGram : Fragment() {

    private lateinit var binding: FragmentKgToGramBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKgToGramBinding.inflate(inflater, container ,false)

        binding.convertKg.setOnClickListener {
            val input = binding.inputKg.text.toString()

            if(input.isNotEmpty()) {
                val input = input.toDouble()
                val showResult = kgToGram(input)

                binding.result.text = showResult.toString()
            }
        }


        return binding.root
    }

    fun kgToGram(kg: Double):Double{
        return kg * 1000.0
    }

}