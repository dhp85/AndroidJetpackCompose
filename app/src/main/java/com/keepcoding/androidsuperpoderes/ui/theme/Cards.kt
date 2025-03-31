package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keepcoding.androidsuperpoderes.R

@Composable
fun MyCard() {
    Box(Modifier.fillMaxSize(), Alignment.Center){
        Card(colors = CardDefaults.cardColors(containerColor = Color.Cyan), elevation = CardDefaults.cardElevation(60.dp)) {
            Row {
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                Text("Mi Imagen")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyCard_Preview(){
    MyCard()
}