package com.cfsproj.thenewinstagram.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun postsBody() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(
                rememberScrollState()
            ).background(Color.Yellow), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (p in 0..10) {
            postItem(post = p.toString())
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun postItem(post: String) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text(text = post)
    }
}