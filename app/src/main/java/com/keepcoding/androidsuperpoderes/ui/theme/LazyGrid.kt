package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyLazyGrid(){

    LazyVerticalGrid(columns = GridCells.Fixed(3), Modifier.fillMaxSize()){
               items(300) {index ->
                  ItemDeListaFavorites(index)
               }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyLazyGrid_Preview(){
    MyLazyGrid()
}