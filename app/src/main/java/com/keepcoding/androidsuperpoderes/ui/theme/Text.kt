package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyText(){
    Text(text = "Hola Android", fontSize = 20.sp, color = Color.Red, modifier = Modifier.background(Color.Yellow))
}


@Preview
@Composable
private fun Mytext_Preview(){
    MyText()
}