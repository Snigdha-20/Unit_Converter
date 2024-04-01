package com.example.modified_unit_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modified_unit_converter.databinding.FragmentMeterToFeetBinding


class MeterToFeet : Fragment() {

    private lateinit var binding : FragmentMeterToFeetBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentMeterToFeetBinding.inflate(inflater, container, false)

        binding.convertMeter.setOnClickListener {
            val input = binding.inputMeter.text.toString()

        if (input.isNotEmpty()){
            val input = input.toDouble()
            val res = toFeet(input)

            binding.result.text =res.toString()

        }

        }
        return binding.root
    }

    fun toFeet(meter: Double): Double{
        return meter * 3.28084
    }

}