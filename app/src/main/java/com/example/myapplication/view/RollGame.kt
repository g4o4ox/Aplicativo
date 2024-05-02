package com.example.myapplication.view
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
//Jogo da roleta
@Composable
fun RollGame(navController: NavController){
    val rolColors = listOf(
        Color.Blue,
        Color.Green,
        Color.Yellow
    )
    val segAngular = listOf(60f,60f,60f,60f,60f,60f)
    val rollSize = 300.dp
    Canvas(modifier = Modifier.size(rollSize)) {
        var angleStarter = 0f
        segAngular.forEachIndexed { index, angle ->
            drawArc(
                color = rolColors[index],
                startAngle = angleStarter,
                sweepAngle = angle,
                useCenter = true,
                topLeft = Offset.Zero,
                size = size
            )
            angleStarter += angle
        }
     }
    Button(onClick = {navController.navigate(route = "MainScreen")}) {
        
    }
            
    }





