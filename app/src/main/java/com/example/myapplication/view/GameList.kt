package com.example.myapplication.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Composable
fun GameList(navController: NavController){






     //Barra de menu
    Box(modifier = Modifier .fillMaxSize()){
        Row (modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)
            .background(color = Color.Gray)
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "jOGOS")

        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)
            .background(color = Color.Gray)
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){

            TextButton(onClick = {navController.navigate(route = "RollGame")}) {

                Text(text = "RollGame")

            }

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .background(color = Color.Gray)
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){

            TextButton(onClick = {navController.navigate(route="UserPerfil")}) {
                Text("Perfil")
            }
            TextButton(onClick = {navController.navigate(route = "MainScreen")}) {
                Text(text = "MainScreen")
            }
        }//Row
    }//Box
}