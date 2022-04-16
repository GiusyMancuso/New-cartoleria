package com.android.example.mycartoleria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ricerca, container, false)

        binding.buttonRicerca.setOnClickListener {
            if(binding.ricerca.text.isNotEmpty()){
                Snackbar.make(binding.buttonRicerca, R.string.not_find, Snackbar.LENGTH_SHORT).show()
            }else{
                Snackbar.make(binding.buttonRicerca, R.string.no_search, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}