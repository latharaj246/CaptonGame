package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptonGame()
                }
            }
        }
    }
}
@Composable
fun CaptonGame(){
    val treasureFound = remember { mutableStateOf(0)}
    val direction = remember { mutableStateOf("North") }
    val health = remember { mutableStateOf(100) }
    Column {
        Text(text = "Teasure Found: ${treasureFound.value}")
        Text(text = "Current Direction: ${direction.value}")
        Text(text = "stormOrTreasure: ${health.value}")
        Button(onClick = { /*TODO*/
            direction.value = "East"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                println("Wow Teasure")
            }else {
                health.value -= 1
               println("wooh Strom")
            }
        })
        {
            Text(text = "Sail East")
        }
        Button(onClick = { /*TODO*/
            direction.value = "West"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                println("Wow Teasure")
            }else {
                health.value -= 1
                println("wooh Strom")

            }
        })
        {
            Text(text = "Sail West")
        }
        Button(onClick = { /*TODO*/
            direction.value = "South"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                println("Wow Teasure")
            }else {
                health.value -= 1
                println("wooh Strom")

            }
        })
        {
            Text(text = "Sail South")
        }
        Button(onClick = { /*TODO*/
            direction.value = "North"
            if(Random.nextBoolean()){
                treasureFound.value += 1
                println("Wow Teasure")
            }else {
                health.value -= 1
                println("wooh Strom")

            }})
        {
            Text(text = "Sail North")
        }
    }

}