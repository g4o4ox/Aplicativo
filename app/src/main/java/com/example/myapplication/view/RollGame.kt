package com.example.myapplication.view

import android.graphics.PathIterator.Segment
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//Jogo da roleta
@Composable
fun RollGame(navController: NavController){
    val rolColors = listOf(
        Color.Blue,
        Color.Green,
        Color.Yellow,
        Color.Red,
        Color.Magenta
    )
    val segAngular = listOf(60f,60f,60f,60f,60f,60f)
    val rollSize = 300.dp

    Canvas(modifier = Modifier.size(rollSize) ) {
        var angleStarter = 0f
        val miniS = minOf(rolColors.size, segAngular.size)
        for (i in 0 until miniS) { // Itera até o tamanho mínimo
            drawArc(
                color = rolColors[i],
                startAngle = angleStarter,
                sweepAngle = segAngular[i],
                useCenter = true,
                topLeft = Offset.Zero,
                size = size
            )
            angleStarter += segAngular[i]
        }
    }

}





