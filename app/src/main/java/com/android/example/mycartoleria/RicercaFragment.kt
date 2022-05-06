package com.android.example.mycartoleria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.android.example.mycartoleria.databinding.FragmentHomeBinding
import com.android.example.mycartoleria.databinding.FragmentRicercaBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass.
 * Use the [RicercaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("UNREACHABLE_CODE")
class RicercaFragment : Fragment() {

    private var _binding: FragmentRicercaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRicercaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRicerca.setOnClickListener {
            printMessage()
        }
    }
    private fun printMessage (){
        val valueSearched : String = binding.ricerca.text.toString()
        Toast.makeText(context, valueSearched, Toast.LENGTH_LONG).show()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}