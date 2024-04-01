package com.example.modified_unit_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modified_unit_converter.databinding.FragmentKgToPoundBinding
import java.util.PrimitiveIterator


class KgToPound : Fragment() {

    lateinit var  binding: FragmentKgToPoundBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentKgToPoundBinding.inflate(inflater,container,false)

        binding.convertPound.setOnClickListener {

            val input = binding.inputPound.text.toString()

            if(input.isNotEmpty()){
                val input = input.toDouble()
                val res = toPound(input)

                binding.result.text =res.toString()
            }
        }
        return  binding.root
    }

    fun toPound(kg : Double):Double{
        return kg * 2.20462
    }

}