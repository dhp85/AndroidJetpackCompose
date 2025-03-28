package com.keepcoding.androidsuperpoderes.ui.theme


import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyButton(enabled: Boolean) {
    Button(onClick = {},
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.Blue,
            disabledContainerColor = Color.Green,
            disabledContentColor = Color.Yellow
        ),
            border = if (enabled) BorderStroke(1.dp, Color.Green) else BorderStroke(1.dp, Color.Blue),
    ) {
        Text("Click me")

    }
}

@Preview
@Composable
private fun MyButton_Preview() {
   MyButton(true)
}