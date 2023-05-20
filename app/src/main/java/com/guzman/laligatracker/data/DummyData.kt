package com.guzman.laligatracker.data

import com.guzman.laligatracker.data.models.TeamModel

val Team1 = TeamModel("Futbol Club Barcelona", "Camp Nou", "Xavi Hernandez", "Equipo vergon")
val Team2 = TeamModel("Real Madrid", "Santiago Beranbeu", "Carlo Ancelotti", "Equipo chico")

var teams = mutableListOf(
    Team1,
    Team2
)