package com.example.myapplication.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    //Isac Motta --> Criando o menu de botões parte Inferior.
   Box(modifier=Modifier .align(Alignment.Bottom) .fillMaxHeight()){
       Row {
           Button(onClick = { /*TODO*/ }) {
               Text("jogar")

           }
       }
   }
    //fechamento do Box <--- Isac ---->
}