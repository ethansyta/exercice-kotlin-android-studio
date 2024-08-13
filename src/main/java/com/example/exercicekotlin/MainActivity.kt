package com.example.exercicekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exercicekotlin.ui.theme.ExerciceKotlinTheme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExerciceKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.SpaceBetween
    ){
    var  first by remember { mutableStateOf("") }

    var second by remember { mutableStateOf("") }

    var result by remember { mutableStateOf("") }




        fun CalculateProduct(){
            val num1  = first.toDoubleOrNull()
            val num2= second.toDoubleOrNull()
            if (num1 != null) {
                result = (num1+ num2!!).toString()
            }


        }




        TextField(value = first, onValueChange = {first = it })
        TextField(value = second, onValueChange ={second = it} )

        Button(onClick = {CalculateProduct() }) {
            Text(text = "calculer")}

            Text(text = "votre result : $result")
        }






    }





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExerciceKotlinTheme {
        Greeting("Android")
    }
}