package com.example.myapplication.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//perfil do usuario
@Composable
fun UserPerfil(navController: NavController) {
    
    Box(modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)
            .background(color = Color.Gray)
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly){

            Text(text = "Perfil de usuario.")

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .background(color = Color.Gray)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly) {
            TextButton(onClick = {navController.navigate(route = "MainScreen")}) {
                Text("MainScreen")
            }
            TextButton(onClick = {navController.navigate(route = "GameList")}) {
                Text(text = "Jogar")
            }
            
        }
    }
}
