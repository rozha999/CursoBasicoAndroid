package com.example.cursobasicoandroid.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun TextExample(name:String){
    Text(
        text ="hola: $name",
        fontSize = 40.sp ,
        color = Color(0xFFA42121),
        fontWeight = FontWeight.Thin
    )
}

@Preview
@Composable
fun TextExamplePreview(){
    TextExample(name = "rosa")
}