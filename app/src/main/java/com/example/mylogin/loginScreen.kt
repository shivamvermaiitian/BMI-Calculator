package com.example.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mylogin.ui.theme.EmailPasswordActivity.*
import com.google.firebase.Firebase


@Composable
fun loginScreen(navController: NavController){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment=Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.a), contentDescription ="Login image", modifier = Modifier.size(200.dp))
        Text(text = "Welcome back Associates", fontSize = 21.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "login to your account")
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value =email, onValueChange ={email=it
        }, label = {
            Text(text = "Username/Email")
        } )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value =password , onValueChange ={password=it }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
//            Firebase.analyticslogEvent("log_button_event")
            navController.navigate("screenB"+"/$email")
//            Firebase.analytics.logEvent
//            keyboardController?.hide()
//            createAccount(email,password)
            Log.i("data","Email: $email Password: $password")
        }) {
            Text(text = "login")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Forgot Password ?", modifier = Modifier.clickable {  })
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or sign in with")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.b), contentDescription = "Google", modifier = Modifier
                .size(
                    50.dp
                )
                .clickable { })
            Image(painter = painterResource(id = R.drawable.c), contentDescription = "Facebook", modifier = Modifier
                .size(50.dp)
                .clickable { })
            Image(painter = painterResource(id = R.drawable.d), contentDescription = "Twitter", modifier = Modifier
                .size(50.dp)
                .clickable { })
        }

    }

}