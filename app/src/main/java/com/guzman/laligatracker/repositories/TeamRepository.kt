package com.guzman.laligatracker.repositories

import com.guzman.laligatracker.data.models.TeamModel

class TeamRepository(private var teams: MutableList<TeamModel>) {

    fun getTeams() = teams
    fun addTeam(newTeam: TeamModel) = teams.add(newTeam)

}