package com.example.a143

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.a143.ui.theme._143Theme// Asegúrate de tener este tema o cambia el nombre al que uses en tu proyecto

class Actividad : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _143Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    GreetingScreen()
                }
            }
        }
    }
}

@Composable
fun GreetingScreen() {
    Text(text = "¡bienvenido anais!")
}
