package com.keepcoding.androidsuperpoderes.ui.theme

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Función que define un Scaffold con una TopBar y un FloatingActionButton
@Composable
fun MyScaffold() {
    Scaffold(
        topBar = { MyTopBar() }, // Barra superior personalizada
        floatingActionButton = { MyfloatingActionButton() }, // Botón flotante personalizado
        floatingActionButtonPosition = FabPosition.Center // Posiciona el botón flotante en el centro
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .padding(it) // Asegura que el contenido respete la barra superior y el FAB
        ) {
            MyLazyGrid()
            // Contenido principal vacío por ahora
        }
    }
}

// Función que define un FloatingActionButton personalizado
@Composable
fun MyfloatingActionButton() {
    FloatingActionButton(
        onClick = {}, // Acción al hacer clic en el FAB (vacía por ahora)
        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(10.dp) // Elevación del botón
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = "add") // Ícono del FAB
    }
}

// Función que define una barra de navegación personalizada con Row
@Composable
fun customTopBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color.Cyan)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween, // Distribuye los elementos equitativamente
        verticalAlignment = Alignment.CenterVertically // Centra los elementos verticalmente
    ) {
        Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "Back") // Ícono de retroceso
        Text("Mi Scaffold") // Texto de la barra superior
        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More options") // Ícono de opciones
    }
}

// Función que define una barra superior centrada con Material 3
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar() {
    CenterAlignedTopAppBar(
        title = { Text("Mi TopBar") }, // Título de la barra superior
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Gray, // Color de fondo de la barra
            titleContentColor = Color.White // Color del texto
        ),
        navigationIcon = {
            Icon(
                imageVector = Icons.AutoMirrored.Default.ArrowBack,
                contentDescription = "Back" // Ícono de retroceso
            )
        }
    )
}

// Vista previa de MyTopBar en el editor de diseño
@Preview(showBackground = true)
@Composable
fun MyTopBar_Preview() {
    MyTopBar()
}

// Vista previa de MyScaffold con la interfaz del sistema incluida
@Preview(showSystemUi = true)
@Composable
fun MyScaffold_Preview() {
    MyScaffold()
}