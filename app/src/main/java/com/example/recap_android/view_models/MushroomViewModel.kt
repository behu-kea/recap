package com.example.recap_android.view_models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.recap_android.models.MushroomSpot

class MushroomViewModel: ViewModel() {
    var mushroomSpotText: String by mutableStateOf("")
    var mushroomSpots: MutableList<MushroomSpot> = mutableStateListOf(MushroomSpot("asd"))

    fun onValueChange(newText: String) {
        mushroomSpotText = newText
    }

    fun onCreateMushroomClick() {
        val newMushroomSpot = MushroomSpot(mushroomSpotText)
        mushroomSpots.add(newMushroomSpot)
    }
}