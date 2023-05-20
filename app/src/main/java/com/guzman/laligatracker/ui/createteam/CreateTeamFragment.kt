package com.guzman.laligatracker.ui.createteam

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.guzman.laligatracker.databinding.FragmentCreateTeamBinding

class CreateTeamFragment : Fragment() {

    private lateinit var binding: FragmentCreateTeamBinding

    private val viewModel:CreateTeamViewModel by activityViewModels {
        CreateTeamViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateTeamBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
    }


    private fun setViewModel(){
        binding.viewmodel = viewModel
    }
}