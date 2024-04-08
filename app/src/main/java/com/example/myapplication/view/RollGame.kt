package com.example.myapplication.view

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//Jogo da roleta
@Composable
fun RollGame(navController: NavController){

    //Options Menu
    Box(modifier = Modifier .fillMaxWidth()){

        Row(modifier = Modifier .align(Alignment.TopCenter)) {

            Button(onClick = { navController.navigate(route="MainScreen") }) {

                Text("Voltar.")
            }
        }
    }


    // roleta vetor
    Canvas(modifier = Modifier .fillMaxSize()) {
        drawCircle(color = Color.Green,
            radius = 180.dp.toPx() ,
            center=center,

            )
    }

    // roleta Button


}