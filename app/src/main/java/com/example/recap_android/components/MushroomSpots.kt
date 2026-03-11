package com.example.recap_android.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recap_android.models.MushroomSpot


@SuppressLint("UnrememberedMutableState")
@Composable
fun MushroomSpots(mushroomSpotText: String,
                  mushroomSpots: MutableList<MushroomSpot>,
                  onValueChange: (String) -> Unit,
                  onCreateMushroomClick: () -> Unit) {
    // Svampe samler app
    Column(modifier = Modifier.padding(24.dp)) {
        Text("Svampe spot app")

        TextField(value = mushroomSpotText, onValueChange = onValueChange)

        Button(onClick = onCreateMushroomClick) {
            Text("Opret svampe spot")
        }

        LazyColumn() {
            items(mushroomSpots) { mushroomSpot ->
                Text(mushroomSpot.spotDescription)
            }
        }
    }
}