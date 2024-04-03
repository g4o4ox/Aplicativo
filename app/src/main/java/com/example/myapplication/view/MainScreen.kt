package com.example.myapplication.view

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    //Isac Motta --> Criando o menu de botões parte Inferior.
    Row (modifier = Modifier ){
        Button(onClick = {}, modifier = Modifier){
            Text("Jogar")
        }
    }
    //fechamento do Box <--- Isac ---->

}