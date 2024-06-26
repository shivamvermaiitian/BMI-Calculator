package com.example.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.ui.theme.RealTimeWeatherTheme
import com.example.mylogin.ui.theme.WeatherPage
import com.example.mylogin.ui.theme.EmailPasswordActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        enableEdgeToEdge()
        setContent {
//            BmiScreen()
            val navController= rememberNavController()
            NavHost(navController = navController, startDestination = "screenA" ) {
                composable("screenA"){
                    loginScreen(navController)
                }
                composable("screenB"+"/{email}"){
                    val email=it.arguments?.getString("email")
                    RealTimeWeatherTheme {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            WeatherPage(weatherViewModel)
                        }
                    }
                }
            }

        }
    }
}

