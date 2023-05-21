package com.guzman.laligatracker.ui.teamhome.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.guzman.laligatracker.data.models.TeamModel
import com.guzman.laligatracker.databinding.TeamItemBinding

class TeamRecyclerViewAdapter(private val clickListener: (TeamModel) -> Unit) : RecyclerView.Adapter<TeamRecyclerViewHolder>() {

    private val teams = arrayListOf<TeamModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamRecyclerViewHolder {
        val binding = TeamItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeamRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int = teams.size

    override fun onBindViewHolder(holder: TeamRecyclerViewHolder, position: Int) {
        val team = teams[position]
        holder.bind(team, clickListener)
    }

    fun setData(teamsList: List<TeamModel>){
        teams.clear()
        teams.addAll(teamsList)
    }
}