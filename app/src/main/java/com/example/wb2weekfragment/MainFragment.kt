package com.example.wb2weekfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.wb2weekfragment.databinding.MainFragmentBinding

class MainFragment : Fragment() { //использован navigation component

    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= MainFragmentBinding.inflate(inflater,container,false)
        Log.e("MainFrag onCreateView","запущен")
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.openSecondFragment.setOnClickListener(){
            Navigation.findNavController(binding.root).navigate(R.id.action_mainFragment_to_secondFragment)
            Log.e("SecondFrag onViewCreated","запущен")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("SecondFrag onAttach","запущен")
    }

}