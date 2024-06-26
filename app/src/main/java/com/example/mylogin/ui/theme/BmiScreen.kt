package com.example.mylogin.ui.theme

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable

fun BmiScreen(email :String){//,navController: NavController
    var heightFt by remember {
        mutableStateOf("")
    }
    var heightIn by remember {
        mutableStateOf("")
    }
    var weight by remember {
        mutableStateOf("")
    }
       Column(
           modifier = Modifier.fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center
       ) {
           Text(text = "BMI Calculator")
           Spacer(modifier = Modifier.height(16.dp))
           Text(text = "Welcome $email to BMI Calculator")
           Spacer(modifier = Modifier.height(16.dp))
           TextField(value =weight, onValueChange ={weight=it
           }, label = {
               Text(text = "Enter Weight")
           } )
           Spacer(modifier = Modifier.height(16.dp))
           TextField(value =heightFt, onValueChange ={heightFt=it}, label = {
               Text(text = "Enter Height in Feet")
           })
           Spacer(modifier = Modifier.height(16.dp))
           TextField(value =heightIn, onValueChange ={heightIn=it}, label = {
               Text(text = "Enter Height in Inch")
           } )
           Button(onClick = {
//               navController.navigate("screenC"+"/$result");
               println("you are healthy");
           }) {
               Text(text = "Calculate")
           }
       }
}