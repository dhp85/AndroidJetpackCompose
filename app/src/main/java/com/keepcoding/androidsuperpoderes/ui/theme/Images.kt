package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keepcoding.androidsuperpoderes.R

@Composable
fun MyImage1(){
 Image(painterResource(id = R.drawable.ic_launcher_foreground),
     contentDescription = "Android image",
     alpha = 0.5f,
     modifier = Modifier.size(100.dp,50.dp),
     contentScale = ContentScale.Crop)
}




@Composable
fun MyImage(){
    Image(painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Android image",
        alpha = 0.5f, modifier = Modifier.clip(CircleShape).border(3.dp, Color.Red, CircleShape))
}


@Preview
@Composable
fun MyImage_Preview(){
    MyImage()

}


@Preview
@Composable
fun MyImage1_Preview(){
    MyImage1()

}