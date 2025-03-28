package com.keepcoding.androidsuperpoderes.ui.theme



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.keepcoding.androidsuperpoderes.R

@Composable
fun Login() {

    // Variables para guardar el estado del email, la contraseña y la visibilidad de la contraseña
    var textEmail by rememberSaveable { mutableStateOf("") }
    var textPass by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    // Caja principal que ocupa todo el tamaño de la pantalla
    Box(Modifier.fillMaxSize()) {

        // Caja centrada para el formulario con un ancho fijo
        Box(Modifier.align(Alignment.Center).width(350.dp)) {
            // Columna que alinea los elementos verticalmente al centro
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                // Imagen circular, con borde negro y fondo verde
                Image(
                    painterResource(id = R.drawable.ic_launcher_foreground), // Cargar la imagen
                    contentDescription = "Android image", // Descripción accesible para la imagen
                    alpha = 0.5f, // Opacidad
                    modifier = Modifier
                        .clip(CircleShape) // Forma circular
                        .border(3.dp, Color.Black, CircleShape) // Borde negro
                        .background(Color.Green) // Fondo verde
                        .size(100.dp) // Tamaño de la imagen
                )

                // Texto que actúa como título debajo de la imagen
                Text("Android Superpoderes", fontSize = 25.sp)

                Spacer(Modifier.size(25.dp)) // Espacio entre el título y el campo de email

                // Campo de texto para el email
                TextField(
                    value = textEmail,
                    onValueChange = { textEmail = it }, // Actualiza el valor del email
                    placeholder = { Text("Email") }, // Placeholder que aparece cuando está vacío
                    modifier = Modifier.fillMaxWidth(), // Hace que ocupe todo el ancho disponible
                    leadingIcon = { // Ícono de email
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Email icon")
                    }
                )

                // Campo de texto para la contraseña
                TextField(
                    value = textPass,
                    onValueChange = { textPass = it }, // Actualiza el valor de la contraseña
                    placeholder = { Text("Password") }, // Placeholder cuando está vacío
                    modifier = Modifier.fillMaxWidth(), // Hace que ocupe todo el ancho disponible
                    leadingIcon = { // Ícono de la contraseña
                        Icon(
                            painter = painterResource(id = R.drawable.ic_password_24px),
                            contentDescription = "Password icon"
                        )
                    },
                    trailingIcon = { // Ícono para mostrar/ocultar la contraseña
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            // Alterna entre mostrar y ocultar la contraseña
                            if (passwordVisible) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_visibility_24px),
                                    contentDescription = "Toggle visibility"
                                )
                            } else {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_visibility_off_24px),
                                    contentDescription = "Toggle visibility"
                                )
                            }
                        }
                    },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation() // Alterna la visibilidad de la contraseña
                )

                Spacer(Modifier.size(10.dp)) // Espacio entre el campo de contraseña y el botón de login

                // Botón de login, con un color y forma personalizados
                Button(
                    onClick = {
                        // Aquí va la lógica de autenticación
                        // Se pueden agregar validaciones para los campos antes de proceder con el login
                    },
                    colors = ButtonDefaults.buttonColors(Color.Magenta) // Color del botón
                ) {
                    Text("Login") // Texto del botón
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Login_Preview() {
    Login() // Vista previa del Composable Login()
}