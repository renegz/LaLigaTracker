package com.guzman.laligatracker.ui.teamhome.recyclerview

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.guzman.laligatracker.data.models.TeamModel
import com.guzman.laligatracker.databinding.TeamItemBinding

class TeamRecyclerViewHolder(private val binding: TeamItemBinding) :
    ViewHolder(binding.root) {

        fun bind(team: TeamModel, clickListener: (TeamModel) -> Unit){
            binding.tvTeamName.text = team.name
            binding.tvStadium.text = team.stadium
            binding.tvCoach.text = team.coach

            binding.teamItemCardView.setOnClickListener {
                clickListener(team)
            }
        }
}