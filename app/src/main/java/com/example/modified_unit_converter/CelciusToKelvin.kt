package com.example.modified_unit_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modified_unit_converter.databinding.FragmentCelciusToKelvinBinding

class CelciusToKelvin : Fragment() {

    private lateinit var binding: FragmentCelciusToKelvinBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentCelciusToKelvinBinding.inflate(inflater,container,false)

        binding.convertCelcius.setOnClickListener {
            val input= binding.enterNumber.text.toString()

            if(input.isNotEmpty()){
                val input = input.toDouble()
                val showRes = toKelvin(input)

                binding.result.text=showRes.toString()
            }

        }


        return binding.root
    }

    fun toKelvin(cel : Double ): Double{
        return cel + 273.15
    }

}