package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyLazyColumn() {

    LazyColumn(Modifier.fillMaxSize()) {
        items(41) { index ->
            ItemDeLista(index)
        }

        item {
            ItemDeLista()
            LazyRow() {
                items(41) { index ->

                        ItemDeListaFavorites(index)

                }
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun MyLazyColumn_Preview() {
MyLazyColumn()

}


@Composable
fun ItemDeLista(index: Int = 0) {

        Text("Hola $index")
}

@Composable
fun ItemDeListaFavorites(index: Int = 0) {
    if (index % 2 == 0) {
        Text("Hola $index", color = Color.Red)
    } else {
        Text("Hola $index")

    }

}