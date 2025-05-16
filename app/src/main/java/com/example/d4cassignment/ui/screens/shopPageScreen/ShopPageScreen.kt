package com.example.d4cassignment.ui.screens.shopPageScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.d4cassignment.R
import com.example.d4cassignment.ui.screens.shopPageScreen.comps.Bars
import com.example.d4cassignment.ui.screens.shopPageScreen.comps.Categories.Categories
import com.example.d4cassignment.ui.screens.shopPageScreen.comps.HeroProduct.Product
import com.example.d4cassignment.ui.screens.shopPageScreen.comps.NewProduct
import com.example.d4cassignment.ui.screens.shopPageScreen.comps.ShopPageTopBar

@Composable
fun ShopPageScreen() {
    val categoryList = listOf(
        "Cleaners" to R.drawable.categorysample,
        "Groceries" to R.drawable.categorysample,
        "Stationery" to R.drawable.categorysample,
        "Laundry" to R.drawable.categorysample,
        "Beverages" to R.drawable.categorysample,
        "Groceries" to R.drawable.categorysample,
        "Stationery" to R.drawable.categorysample,
        "Laundry" to R.drawable.categorysample,
        "Beverages" to R.drawable.categorysample
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)
    ) {
        item {
            ShopPageTopBar()
        }

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)

            ) {
                Image(painter = painterResource(R.drawable.shopflowcard1), "")
                Column(modifier = Modifier.padding(start = 44.dp, top = 36.dp)) {
                    Text(
                        text = "GET 20% OFF",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                    Text(
                        text = "GET 20% OFF",
                        modifier = Modifier.padding(top = 16.dp, bottom = 24.dp),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                    Text(
                        text = "12-16 October",
                        modifier = Modifier
                            .clip(RoundedCornerShape(200.dp))
                            .background(color = colorResource(R.color.d4cgreen))
                            .padding(horizontal = 8.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.DarkGray
                    )
                }
                Icon(
                    painter = painterResource(R.drawable.sunset),
                    " ",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(bottom = 54.dp, end = 76.dp)
                        .size(54.dp)
                        .align(Alignment.BottomEnd)
                )
                Bars(
                    modifier = Modifier
                        .padding(start = 55.dp)
                        .align(Alignment.BottomStart)
                        .width(130.dp)
                )
            }
        }

        item {
            Categories(categoryList)
        }

        item {
            NewProduct()
        }

        items(4) {
            Product()
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ShopPageScreenPreview() {
    ShopPageScreen()

}