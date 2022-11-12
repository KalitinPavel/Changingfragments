package com.example.changingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.changingfragments.databinding.FragmentFirstBinding

class firstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_fragment1)
        }

        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_second_main)
        }
    }

}