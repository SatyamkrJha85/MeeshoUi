package com.theapplication.meeshoui.Screens

import android.graphics.Paint.Align
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplication.meeshoui.R
import com.theapplication.meeshoui.ui.theme.LightPurple
import com.theapplication.meeshoui.ui.theme.bgwhite
import com.theapplication.meeshoui.ui.theme.darkPink
import com.theapplication.meeshoui.ui.theme.lightPink
import com.theapplication.meeshoui.ui.theme.lightwhite
import com.theapplication.meeshoui.ui.theme.madimi
import com.theapplication.meeshoui.ui.theme.ubuntu

@Preview(showSystemUi = true)
@Composable
fun Graph() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(bgwhite)
    ) {

        Column {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                lightPink, darkPink, darkPink,
                                darkPink
                            )
                        ),
                        shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)
                    )
                    .height(330.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.women4edited),
                    contentDescription = null,
                    modifier = Modifier
                        .width(500.dp)
                        .align(Alignment.Center)
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterStart), tint = Color.White
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterEnd), tint = Color.White
                )

                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .clip(CircleShape)
                            .background(lightwhite)
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .clip(CircleShape)
                            .background(lightwhite)
                    )
                    Spacer(modifier = Modifier.width(7.dp))

                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .clip(CircleShape)
                            .background(lightwhite)
                    )

                    Spacer(modifier = Modifier.width(7.dp))

                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .clip(CircleShape)
                            .background(lightwhite)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Thalasi Knitfab",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black
                    )
                    Text(text = "Classic", color = Color.Black)
                }

                Text(
                    text = "$259",
                    fontSize = 21.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Black
                )
            }

            Divider(thickness = 1.dp)

            Text(
                text = "Color",
                color = Color.Black,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 10.dp, top = 5.dp)
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                item {
                    smallboxwomen(R.drawable.women1)
                }
                item {
                    smallboxwomen(R.drawable.women2)
                }
                item {
                    smallboxwomen(R.drawable.women3)
                }

                item {
                    smallboxwomen(R.drawable.women4edited)
                }

                item {
                    smallboxwomen(R.drawable.women5)
                }
            }

            Text(
                text = "Select Size",
                color = Color.Black,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 10.dp, top = 5.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                sizebox("38")
                sizebox("40")
                sizebox("42")
                sizebox("44")
                sizebox("46")
                sizebox("55")

            }


            Divider(thickness = 1.dp, modifier = Modifier.padding(top = 10.dp))


            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                ElevatedButton(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        darkPink
                    ), modifier = Modifier
                        .width(200.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Buy Now",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Icon(
                    imageVector = Icons.Rounded.ShoppingCart,
                    contentDescription = null,
                    tint = darkPink,
                    modifier =Modifier.size(45.dp).background(LightPurple, CircleShape).padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun smallboxwomen(img: Int) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .size(60.dp)
            .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp))
            .background(bgwhite)
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun sizebox(notext: String) {

    Box(
        modifier = Modifier
            .padding(top = 5.dp, start = 10.dp, end = 10.dp)
            .clip(CircleShape)
            .border(0.6.dp, Color.Gray, CircleShape)
            .background(Color.White)
            .size(40.dp)
    ) {
        Text(
            text = notext,
            fontSize = 17.sp,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }

}