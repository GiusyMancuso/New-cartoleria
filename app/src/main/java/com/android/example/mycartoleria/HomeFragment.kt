package com.android.example.mycartoleria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.example.mycartoleria.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCategorie.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_categoryActivity2) }

        binding.buttonCerca.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_ricercaFragment) }

        binding.buttonCreazioni.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_craetionFragment) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}