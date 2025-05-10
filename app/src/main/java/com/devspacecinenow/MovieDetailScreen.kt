package com.devspacecinenow

import android.graphics.Movie
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MovieDetailScreen(){
    MovieDetailContent()
}

@Composable
fun MovieDetailContent(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Movie Detail Screen")
    }
}