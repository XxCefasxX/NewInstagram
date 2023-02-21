package com.cfsproj.thenewinstagram.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun storiesBar() {
    Row(
        modifier =
        Modifier.horizontalScroll(rememberScrollState())
    ) {
        for (s in 0..15) {
            storyItem(s.toString())
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Composable
fun storyItem(storyNumber: String) {
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(text = storyNumber)
    }
}