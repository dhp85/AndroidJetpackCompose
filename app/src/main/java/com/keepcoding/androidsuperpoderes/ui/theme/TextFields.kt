package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTestField() {
    // Variable para almacenar el texto ingresado
    var text = ""

    TextField(
        value = text, // Valor actual del campo de texto
        onValueChange = { text = it }, // Se actualiza el valor cuando el usuario escribe
        leadingIcon = { MyIcon() }, // Ícono al inicio del campo de texto
        trailingIcon = { MyIcon() }, // Ícono al final del campo de texto
        placeholder = {
            Text("Introduce tu nombre", Modifier.alpha(0.5f)) // Texto de sugerencia con opacidad
        },
        maxLines = 1 // Limita el campo de texto a una sola línea
    )
}

@Preview(showSystemUi = true)
@Composable
private fun MyTestField_Preview() {
    MyTestField() // Vista previa del componente en el editor
}