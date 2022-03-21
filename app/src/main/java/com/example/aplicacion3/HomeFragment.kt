package com.example.aplicacion3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplicacion3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // binding = FragmentHomeBinding.inflate(layoutInflater)
        binding = FragmentHomeBinding.inflate(inflater,container, false)
      val navController = findNavController()
       binding.buttonHomeToInside.setOnClickListener(){
        //navController.navigate(R.id.action_homeFragment_to_insideHome)
           val testArgument = "desde el home"
       val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(testArgument)
           navController.navigate(directions)
       }

        return binding.root
    }
}