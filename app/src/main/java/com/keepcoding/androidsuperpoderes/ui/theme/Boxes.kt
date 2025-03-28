package com.keepcoding.androidsuperpoderes.ui.theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun MyBox(){
    Box(modifier = Modifier
        .size(80.dp)
        .background(Color.Green)){
        Box(modifier = Modifier
            .size(60.dp)
            .background(Color.Red)
            .align(Alignment.Center)){
            Box(modifier = Modifier
                .size(8.dp)
                .background(Color.White))
            Box(modifier = Modifier
                .size(15.dp)
                .background(Color.Blue)
                .align(Alignment.CenterEnd))
        }
        Box(modifier = Modifier.size(25.dp)
            .background(Color.Black)
            .align(Alignment.BottomStart))
        Box(modifier = Modifier
            .size(width = 18.dp, height = 70.dp)
            .background(Color.Gray)
            .align(Alignment.Center))

    }
}
