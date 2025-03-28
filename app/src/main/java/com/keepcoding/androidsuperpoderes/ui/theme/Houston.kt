package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun HoustonScreen() {
    //	•	En Jetpack Compose, cada vez que un @Composable se vuelve a dibujar (por ejemplo, cuando cambia el estado),
    //	todas las variables locales dentro de la función se volverían a crear desde cero.
    //	•	remember {} evita esto, manteniendo el valor anterior en memoria.
    // Variable de estado 'counter', que se recuerda entre recomposiciones
    var counter by remember { mutableStateOf(0) }

    // Box: un contenedor que permite superponer elementos
    Box(
        modifier = Modifier.fillMaxSize() // Ocupa toda la pantalla
    ) {
        // Botón centrado en la pantalla
        Button(
            onClick = { counter += 1 }, // Incrementa el contador al hacer clic
            modifier = Modifier
                .align(Alignment.Center) // Alinea el botón en el centro
                .fillMaxSize() // Hace que el botón ocupe toda la pantalla
        ) {
            // Muestra el valor actual del contador
            Text(counter.toString())
        }
    }
}

@Composable
fun HoustonScreen2() {
    // Variable de estado 'counter', que se recuerda entre recomposiciones y
    // se guarda en memoria hasta girando la pantalla.(remenberSaveable)
    var counter by rememberSaveable { mutableStateOf(0) }

    // Box: un contenedor que permite superponer elementos
    Box(
        modifier = Modifier.fillMaxSize() // Ocupa toda la pantalla
    ) {
        // Botón centrado en la pantalla
        Button(
            onClick = { counter += 1 }, // Incrementa el contador al hacer clic
            modifier = Modifier
                .align(Alignment.Center) // Alinea el botón en el centro
                .fillMaxSize() // Hace que el botón ocupe toda la pantalla
        ) {
            // Muestra el valor actual del contador
            Text(counter.toString())
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun HoustonScreen_Preview() {
    HoustonScreen2()
}