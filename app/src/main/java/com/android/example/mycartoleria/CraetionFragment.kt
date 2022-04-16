package com.android.example.mycartoleria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.example.mycartoleria.databinding.FragmentCraetionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [CraetionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CraetionFragment : Fragment() {

    private var _binding: FragmentCraetionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_craetion, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}