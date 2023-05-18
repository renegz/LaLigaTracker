package com.guzman.laligatracker.ui.teamhome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.guzman.laligatracker.R
import com.guzman.laligatracker.databinding.FragmentTeamHomeBinding

class TeamHomeFragment : Fragment() {

    private lateinit var binding: FragmentTeamHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeamHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addListeners()
    }

    private fun addListeners() {
        binding.CreateMovieAction.setOnClickListener {
            findNavController().navigate(R.id.action_teamHomeFragment_to_createTeamFragment)
        }
    }
}