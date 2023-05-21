package com.guzman.laligatracker.ui.teamhome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.guzman.laligatracker.R
import com.guzman.laligatracker.data.models.TeamModel
import com.guzman.laligatracker.databinding.FragmentTeamHomeBinding
import com.guzman.laligatracker.ui.createteam.CreateTeamViewModel
import com.guzman.laligatracker.ui.teamhome.recyclerview.TeamRecyclerViewAdapter

class TeamHomeFragment : Fragment() {

    private lateinit var binding: FragmentTeamHomeBinding
    private val viewModel: CreateTeamViewModel by activityViewModels {
        CreateTeamViewModel.Factory
    }

    private lateinit var adapter: TeamRecyclerViewAdapter

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
        setRecyclerView(view)
    }

    private fun addListeners() {
        binding.CreateMovieAction.setOnClickListener {
            findNavController().navigate(R.id.action_teamHomeFragment_to_createTeamFragment)
        }
    }

    fun showSelectedItem(team: TeamModel){
        viewModel.setSelectedMovie(team)
        findNavController().navigate(R.id.action_teamHomeFragment_to_teamDescriptionFragment)
    }

    private fun displayMovies(){
        adapter.setData(viewModel.getTeams())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view:View){
        binding.recyclerViewTeam.layoutManager = LinearLayoutManager(view.context)

        adapter = TeamRecyclerViewAdapter {
            showSelectedItem(it)
        }

        binding.recyclerViewTeam.adapter = adapter
        displayMovies()
    }
}