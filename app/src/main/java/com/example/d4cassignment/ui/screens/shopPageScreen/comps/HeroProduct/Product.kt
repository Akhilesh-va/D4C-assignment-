package com.example.d4cassignment.ui.screens.shopPageScreen.comps.HeroProduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.d4cassignment.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Product() {
    Box(modifier = Modifier.height(550.dp).padding(top = 20.dp), contentAlignment = Alignment.Center) {
        Column {
            Box() {
                Image(
                    painter = painterResource(R.drawable.card_grey_bg_png), "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(550.dp)


                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Image(
                        painter = painterResource(R.drawable.love), "",
                        modifier = Modifier
                            .padding(top = 8.dp, start = 8.dp)
                            .clip(shape = CircleShape)
                            .background(Color.Black)
                            .size(40.dp)
                            .padding(8.dp)


                    )

                    Text(
                        text = "Best seller",
                        modifier = Modifier
                            .padding(end = 40.dp)
                            .clip(
                                RoundedCornerShape(200.dp)
                            )
                            .background(Color.Black)
                            .padding(horizontal = 12.dp, vertical = 6.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.d4cgreen)
                    )

                }
                Image(
                    painterResource(R.drawable.product_image),
                    "",
                    modifier = Modifier
                        .size(900.dp)
                        .offset(y = -70.dp)

                )
                Image(
                    painterResource(R.drawable.card_black_shape), "",
                    modifier = Modifier
                        .width(2800.dp)
                        .height(350.dp)
                        .padding(20.dp)
                        .offset(y = 260.dp)
                )

                Image(
                    painter = painterResource(R.drawable.cart3), "",
                    modifier = Modifier
                        .offset(y = 460.dp, x = 315.dp)
                        .padding(3.dp)
                        .size(60.dp)
                        .clip(CircleShape)
                        .border(
                            2.dp, color = colorResource(R.color.white),
                            CircleShape
                        )
                        .padding(12.dp)
                )

                Row(
                    modifier = Modifier
                        .offset(y = 355.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "clencera", color = colorResource(R.color.d4cgreen),
                        fontSize = 36.sp, modifier = Modifier,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 35.dp)

                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(colorResource(R.color.d4cgreen))
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "In stock",
                            color = colorResource(R.color.d4cgreen),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                        )
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Column(
                    modifier = Modifier
                        .offset(y = 395.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 40.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        "French clay and algae-powered cleanser",
                        color = Color.White, fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Skin Tightness",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(colorResource(R.color.white))
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            "Dry & Dehydrated Skin",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "RS. 355.20", color = colorResource(R.color.teal_700),
                            fontSize = 16.sp, fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "RS. 444.00", color = Color.LightGray,
                            fontSize = 14.sp, fontWeight = FontWeight.Normal,
                            style = TextStyle(textDecoration = TextDecoration.LineThrough)
                        )

                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        repeat(5) {
                            Image(
                                painterResource(R.drawable.star),
                                "",
                                modifier = Modifier.size(16.dp).padding(start = 2.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(text = "249 reviews" , color = Color.White ,
                            textDecoration = TextDecoration.Underline ,)
                    }

                }


            }


        }
    }


}