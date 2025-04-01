package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Shapes
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
fun HeroLisView(modifier: Modifier = Modifier) {
val heroes = listOf(
        "Goku", "Vegeta", "Freezer", "Majin Boo", "Gohan", "Trunks", "Piccolo", "Krillin", "Yamcha",
        "Tien", "Cell", "Broly", "Bardock", "Raditz", "Nappa", "Android 18", "Android 17", "Android 16",
        "Beerus", "Whis", "Goten", "Champa", "Vados", "Zeno", "Hit", "Jiren", "Toppo", "Dyspo",
        "Zamasu", "Goku Black", "Roshi", "Bulma", "Chi-Chi", "Pan", "Uub", "Dabura", "Shenron",
        "King Kai", "Supreme Kai", "Kibito", "Gotenks", "Vegito", "Gogeta", "Caulifla", "Kale",
        "Cabba", "Frost", "Basil", "Bergamo", "Lavender"
    )

        LazyColumn {
              items(heroes.size){ hero ->
                  MyListItem(heroes[hero])
              }
        }

}


@Composable
fun MyListItem(text: String, modifier: Modifier = Modifier ){

    Card(modifier= Modifier.padding(8.dp), shape = Shapes().extraLarge) {
        Row(Modifier.background(Color.Cyan).fillMaxSize(), verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image Example")
            Text(text, Modifier.padding(16.dp))
        }
    }
}

@Preview
@Composable
fun MyListItem_Preview() {
  MyListItem("Goku")
}

@Preview(showSystemUi = true)
@Composable
fun HeroLisView_Preview() {
  HeroLisView()
}