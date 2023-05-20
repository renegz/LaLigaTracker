package com.guzman.laligatracker.ui.createteam

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.guzman.laligatracker.LaLigaTrackerApplication
import com.guzman.laligatracker.data.models.TeamModel
import com.guzman.laligatracker.repositories.TeamRepository

class CreateTeamViewModel(private val teamRepository: TeamRepository): ViewModel() {

    var name = MutableLiveData("")
    var stadium = MutableLiveData("")
    var coach = MutableLiveData("")
    var description = MutableLiveData("")

    fun getTeams() = teamRepository.getTeams()

    private fun addTeam(newTeam: TeamModel) = teamRepository.addTeam(newTeam)

    fun createTeam(){
        val newTeam = TeamModel(
            name.value.toString(),
            stadium.value.toString(),
            coach.value.toString(),
            description.value.toString()
        )

        addTeam(newTeam)
        Log.d("TAG APP" , getTeams().toString())
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as LaLigaTrackerApplication
                CreateTeamViewModel(app.teamRepository)
            }
        }
    }
}