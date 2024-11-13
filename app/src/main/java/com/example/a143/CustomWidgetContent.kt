package com.example.a143

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.*
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle

class CustomWidgetContent : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            MyCustomWidgetLayout()
        }
    }
}

@Composable
fun MyCustomWidgetLayout() {
    Column(
        modifier = GlanceModifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFECEFF1)),  // Color de fondo claro en hexadecimal
        verticalAlignment = Alignment.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "Acciones Rápidas",
            style = TextStyle(
                fontSize = 20.sp
            ),
            modifier = GlanceModifier.padding(bottom = 16.dp)
        )

        // Botones con espacio entre ellos
        Row(
            modifier = GlanceModifier.padding(top = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botón de "Ir al Inicio"
            Button(
                text = "Ir al Inicio",
                onClick = actionStartActivity<MainActivity>(),
                modifier = GlanceModifier
                    .background(Color(0xFF6200EE))  // Fondo de color azul
                    .padding(horizontal = 8.dp)
            )
            // Botón de "Perfil"
            Button(
                text = "Perfil",
                onClick = actionStartActivity<ProfileActivity>(),
                modifier = GlanceModifier
                    .background(Color(0xFF03DAC5))  // Fondo de color verde
                    .padding(horizontal = 8.dp)
            )
        }
    }
}
