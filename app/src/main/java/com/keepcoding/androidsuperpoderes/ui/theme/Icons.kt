package com.keepcoding.androidsuperpoderes.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.keepcoding.androidsuperpoderes.R

@Composable
fun MyIcon(){

    Column {

        Icon(painter = painterResource(id = R.drawable.ic_search_24px),
            contentDescription = "Search Icon", tint = Color.Red)

        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    }
}



@Preview
@Composable
fun MyIcon_Preview(){
    MyIcon()
}