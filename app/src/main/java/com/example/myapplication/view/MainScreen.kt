package com.example.myapplication.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    //Isac Motta --> Criando o menu de botões parte Inferior.
   Box(modifier= Modifier.fillMaxSize()){
       Row(modifier = Modifier
           .fillMaxWidth()
           .align(Alignment.BottomCenter)
           .background(color = Color.Gray)){
           TextButton(onClick = { navController.navigate(route = "RollGame") },modifier = Modifier ) {
               Text("jogar")
           }

           }
       }//Fechamento do Row
   } //fechamento do Box <--- Isac ---->

