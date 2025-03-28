package com.keepcoding.androidsuperpoderes.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyColumn(){
    Column(modifier = Modifier.background(Color.White). fillMaxSize()) {
        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End){
            Box(modifier = Modifier.size(50.dp).background(Color.Blue)
                .align(Alignment.CenterVertically))
            Box(modifier = Modifier.size(100.dp).background(Color.Red)
                .align(Alignment.CenterVertically))
            Box(modifier = Modifier.size(150.dp).background(Color.Yellow))
        }

        Spacer(modifier = Modifier.size(20.dp))

        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End ) {
            Box(modifier = Modifier.size(50.dp).background(Color.Blue)
                )
            Box(modifier = Modifier.size(100.dp).background(Color.Red)
              )
            Box(modifier = Modifier.size(150.dp).background(Color.Yellow))
        }

        Spacer(modifier = Modifier.size(20.dp))

        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Box(modifier = Modifier.background(Color.Black).size(50.dp))
            Box(modifier = Modifier.background(Color.Gray).size(50.dp))
            Box(modifier = Modifier.background(Color.Blue).size(50.dp))
        }

        Spacer(modifier = Modifier.size(20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.height(60.dp).weight(1f).background(Color.Green))
                Box(modifier = Modifier.height(60.dp).weight(1f).background(Color.Cyan))
                Box(modifier = Modifier.height(60.dp).weight(1f).background(Color.Magenta))
        }

        Spacer(modifier = Modifier.size(20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(Modifier.height(50.dp).weight(1f).background(Color.Blue))
            Row(Modifier.height(50.dp).weight(2f).fillMaxSize()) {
                    Box(Modifier.height(50.dp).weight(1f).background(Color.White))
                    Box(Modifier.height(50.dp).weight(1f).background(Color.Red))
                    Box(Modifier.height(50.dp).weight(1f).background(Color.Yellow))
            }
            Box(Modifier.height(50.dp).weight(1f).background(Color.Cyan))
            Column(Modifier.height(50.dp).weight(1f).fillMaxWidth()) {
                Box(Modifier.height(50.dp).weight(1f).background(Color.Blue).fillMaxWidth())
                Box(Modifier.height(50.dp).weight(1f).background(Color.Red).fillMaxWidth())
                Box(Modifier.height(50.dp).weight(1f).background(Color.Yellow).fillMaxWidth())
            }
            Box(Modifier.height(50.dp).weight(1f).background(Color.Blue))
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.height(50.dp).weight(1f).background(Color.Red))
            Box(modifier = Modifier.height(50.dp).weight(2f).background(Color.Green))
            Box(modifier = Modifier.height(50.dp).weight(2f).background(Color.White))
            Box(modifier = Modifier.height(50.dp).weight(1f).background(Color.Red))
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.height(50.dp).weight(1f).background(Color.Yellow))
            Box(modifier = Modifier.height(50.dp).weight(1f).background(Color.Black))

        }
    }
}


@Preview
@Composable
private fun MyColumn_Preview(){
    MyColumn()
}