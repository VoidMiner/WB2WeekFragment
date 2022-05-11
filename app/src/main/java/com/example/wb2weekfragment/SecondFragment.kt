package com.example.wb2weekfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.wb2weekfragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment(){
    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        Log.e("SecondFrag onCreateView","запущен")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.alertDialog.setOnClickListener(){
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_myAlert)
            Log.e("SecondFrag onViewCreated","запущен")
        }
    }

}