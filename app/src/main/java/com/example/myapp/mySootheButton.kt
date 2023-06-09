package com.example.myapp

import android.graphics.Paint.Style
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import java.time.format.TextStyle

@Composable
fun MySootheButton(
    onClick:()->Unit,
    buttonText:String,
    containerColor: Color =MaterialTheme.colorScheme.primary,
    contentColor: Color=MaterialTheme.colorScheme.onSecondary,

    ){
    Button(
        onClick = onClick,
    modifier= Modifier
        .height(72.dp)
        .fillMaxSize(),
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor=contentColor,
        ),


    ) {
        Text(buttonText)

    }
}