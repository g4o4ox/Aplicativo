package com.example.myapplication

import RollGame
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.view.MainScreen
import com.example.myapplication.view.UserPerfil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "mainScreen",){
                        composable(route = "mainScreen") {
                            MainScreen(navController)
                        }
                        composable(route = "RollGame"){
                            RollGame(navController)
                        }
                        composable(route = "UserPerfil"){
                            UserPerfil(navController)
                        }
                    //caso seja adicionado mais telas. usar a mesma syntax acima
                }// fechamento de colchetes para a navControler
            }
        }
    }
}
