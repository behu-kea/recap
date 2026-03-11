package com.example.recap_android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recap_android.components.MushroomSpots
import com.example.recap_android.models.MushroomSpot
import com.example.recap_android.view_models.MushroomViewModel

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mushroomViewModel = viewModel<MushroomViewModel>();

            MushroomSpots(
                mushroomSpotText = mushroomViewModel.mushroomSpotText,
                mushroomSpots = mushroomViewModel.mushroomSpots,
                onValueChange = { newText ->
                    mushroomViewModel.onValueChange(newText)
                },
                onCreateMushroomClick = {
                    mushroomViewModel.onCreateMushroomClick()
                })
        }
    }
}

