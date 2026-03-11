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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recap_android.models.MushroomSpot

class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Svampe samler app
            var mushroomSpotText: String by remember { mutableStateOf("") }
            var mushroomSpots: MutableList<MushroomSpot> = mutableStateListOf(MushroomSpot("asd"))

            Column(modifier = Modifier.padding(24.dp)) {
                Text("Svampe spot app")

                TextField(value = mushroomSpotText, onValueChange = { newText ->
                    mushroomSpotText = newText
                })

                Button(onClick = {
                    val newMushroomSpot = MushroomSpot(mushroomSpotText)
                    mushroomSpots.add(newMushroomSpot)
                }) {
                    Text("Opret svampe spot")
                }

                LazyColumn() {
                    items(mushroomSpots) { mushroomSpot ->
                        Text(mushroomSpot.spotDescription)
                    }
                }


            }
        }
    }
}

