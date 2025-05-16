package com.example.d4cassignment.ui.screens.shopPageScreen.comps

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewProduct() {
    Row( modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.SpaceBetween ) {
        Text(
            text = "New products", fontSize = 24.sp, fontWeight = FontWeight.ExtraBold , color = Color.White
        )
        Text(
            text = "See all",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            style = TextStyle(textDecoration = TextDecoration.Underline),
            color = Color.White
        )
    }

}