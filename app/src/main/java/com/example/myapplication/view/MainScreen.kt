package com.example.myapplication.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Composable
fun MainScreen(navController: NavController){

    Box(modifier= Modifier.fillMaxSize()){

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(color = Color.Gray)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            TextButton(onClick = { navController.navigate(route = "GameList") }) {
                Text("Jogar")
            }
            TextButton(onClick = { navController.navigate(route = "UserPerfil")}) {
                Text("Perfil")
            }
        }
    }

}
