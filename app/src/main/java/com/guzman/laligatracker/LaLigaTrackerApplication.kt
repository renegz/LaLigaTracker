package com.guzman.laligatracker

import android.app.Application
import com.guzman.laligatracker.data.teams
import com.guzman.laligatracker.repositories.TeamRepository
import com.guzman.laligatracker.ui.createteam.CreateTeamViewModel

class LaLigaTrackerApplication: Application() {
    val teamRepository: TeamRepository by lazy {
        TeamRepository(teams)
    }
}