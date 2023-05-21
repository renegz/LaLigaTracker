package com.guzman.laligatracker.ui.teamdescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.guzman.laligatracker.databinding.FragmentTeamDescriptionBinding
import com.guzman.laligatracker.ui.createteam.CreateTeamViewModel

class TeamDescriptionFragment : Fragment() {

    private lateinit var binding: FragmentTeamDescriptionBinding

    private val viewModel: CreateTeamViewModel by activityViewModels {
        CreateTeamViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeamDescriptionBinding.inflate(inflater, container, false)
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