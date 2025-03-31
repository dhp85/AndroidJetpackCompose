package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keepcoding.androidsuperpoderes.R

@Composable
fun MyLazyGridExersice() {
    // Variables para determinar el tipo de dispositivo y orientación
    var isTablet = true  // Simulación de que el dispositivo es una tablet
    var isHorizontal = false // Simulación de que la orientación es vertical

    // Determinar la cantidad de columnas en la grilla según el tipo de dispositivo y orientación
    var columns = if (isTablet) {
        if (isHorizontal) {
            GridCells.Adaptive(100.dp) // En horizontal, las celdas se adaptan con un tamaño mínimo de 100.dp
        } else {
            GridCells.Fixed(3) // En vertical, la grilla tiene exactamente 3 columnas
        }
    } else {
        GridCells.Fixed(1) // En dispositivos pequeños, solo hay una columna
    }

    // Lista de personajes generada dinámicamente
    val heroes = List(50) { listOf("Mr.Satan", "Krilin", "Goku") }.flatten()

    // LazyVerticalGrid para mostrar los elementos en forma de grilla
    LazyVerticalGrid(columns = columns) {
        items(heroes.size) { index ->
            ItemDeListaExersice(heroes[index]) // Llamado al Composable que muestra cada héroe
        }
    }
}

@Composable
fun ItemDeListaExersice(hero: String) {
    // Caja con alineación al centro inferior para mostrar la imagen y el texto
    Box(contentAlignment = Alignment.BottomCenter) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground), // Imagen de ejemplo
            contentDescription = "Android image"
        )
        Text("$hero") // Nombre del personaje
    }
}

// Vista previa del Composable con diferentes configuraciones
@Preview(showSystemUi = true)
@Preview(showBackground = true, widthDp = 720, heightDp = 360)
@Composable
fun MyLazyGridExersice_Preview() {
    MyLazyGridExersice()
}

