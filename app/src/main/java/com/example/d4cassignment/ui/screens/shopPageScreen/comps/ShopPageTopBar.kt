package com.example.d4cassignment.ui.screens.shopPageScreen.comps

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.d4cassignment.R
import com.example.d4cassignment.ui.theme.ScreenHeading
import com.example.d4cassignment.ui.theme.StandardFont

@Composable
fun ShopPageTopBar() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 36.dp, start = 16.dp, end = 16.dp) ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row() {
            Icon(Icons.Default.ArrowBack, "", tint = Color.White, modifier = Modifier.size(28.dp))
            Text(text = "Shop", fontFamily = ScreenHeading, fontSize = 24.sp, color = Color.White, fontWeight = FontWeight.ExtraBold,
             modifier = Modifier.padding(start = 10.dp))

        }

        Row(verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.Center) {
            Icon(Icons.Default.Search, "", tint = Color.White, modifier = Modifier.size(28.dp))
            IconWithBadge(R.drawable.heart, 5)
            IconWithBadge(R.drawable.shopping, 3)

        }

    }

}

@Preview()
@Composable
fun ShopPageTopBarPreview() {
    ShopPageTopBar()

}