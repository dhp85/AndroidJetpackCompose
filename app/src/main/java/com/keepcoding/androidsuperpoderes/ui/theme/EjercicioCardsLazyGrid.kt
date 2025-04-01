package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keepcoding.androidsuperpoderes.R


@Composable
fun MyCollection(){

    val heroes = List(50){
        listOf("Mr.Satan","Krilin","Goku").random()
    }
    LazyVerticalGrid(columns = GridCells.Fixed(3),Modifier.padding(8.dp)) {
        items(20){index ->

            MyCollectionItem(heroes[index])
        }
    }
}

@Composable
fun MyCollectionItem(text: String, modifier: Modifier = Modifier ){

    Card(modifier = Modifier.padding(8.dp)) {
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Image Example")
            Text(text,Modifier.padding(16.dp))
        }
    }
}

@Preview
@Composable
fun MyCollectionItem_Preview(){

    MyCollectionItem("krilin")

}

@Preview(showSystemUi = true)
@Composable
fun MyCollection_Preview(){
MyCollection()
}