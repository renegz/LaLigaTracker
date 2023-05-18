package com.guzman.laligatracker.repositories

import com.guzman.laligatracker.data.models.LaLigaTeam

class TeamRepository(private var teams: MutableList<LaLigaTeam>) {

    fun getTeams() = teams

    fun addTeam(newTeam: LaLigaTeam) = teams.add(newTeam)
}