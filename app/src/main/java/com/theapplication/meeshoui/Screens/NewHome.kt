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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplication.meeshoui.R
import com.theapplication.meeshoui.ui.theme.LightBlue
import com.theapplication.meeshoui.ui.theme.LightPurple
import com.theapplication.meeshoui.ui.theme.bgwhite
import com.theapplication.meeshoui.ui.theme.darkPink
import com.theapplication.meeshoui.ui.theme.lightPink
import com.theapplication.meeshoui.ui.theme.lightwhite
import com.theapplication.meeshoui.ui.theme.madimi
import com.theapplication.meeshoui.ui.theme.messhocolor
import com.theapplication.meeshoui.ui.theme.ubuntu

@Preview(showSystemUi = true)
@Composable
fun NewHome() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(bgwhite)
    ) {

        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .background(darkPink, CircleShape)
                        .size(40.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.dollar),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                            .align(Alignment.Center), tint = Color.White
                    )
                }
                Text(
                    text = "meesho",
                    fontSize = 30.sp,
                    color = messhocolor,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = ubuntu
                )

                Image(
                    painter = painterResource(id = R.drawable.women1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .border(1.dp, Color.Gray, CircleShape)
                        .clip(
                            CircleShape
                        )
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                TextField(value = "", onValueChange = { }, leadingIcon = {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = null, modifier = Modifier.size(35.dp))

                }, colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White,
                    disabledContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.White,
                    focusedTextColor = Color.Black,
                    unfocusedLabelColor = LightBlue,
                    focusedPlaceholderColor = Color.Black,
                    disabledPlaceholderColor = Color.Black,
                    unfocusedPlaceholderColor = Color.Black,
                    errorPlaceholderColor = Color.Black
                ), shape = CircleShape, modifier = Modifier
                    .width(290.dp)
                    .height(50.dp)
                    .padding(start = 10.dp, end = 30.dp)
                    .background(Color.White, shape = CircleShape)
                    .shadow(
                        3.dp,
                        CircleShape
                    )
                )

                Box(
                    modifier = Modifier
                        .background(darkPink, RoundedCornerShape(10.dp))
                        .size(45.dp),

                    ) {
                    Icon(
                        painter = painterResource(id = R.drawable.category),
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp)
                            .align(Alignment.Center), tint = Color.White
                    )
                }
            }


            Box(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 30.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(lightPink)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.women3), contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .width(180.dp)
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 7.dp)
                ) {
                    Text(
                        text = "Big Sale",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Get the trendy \n clothes at a discount \n on up to 30%",
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 2.dp, end = 3.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Button(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        lightPink
                    )
                ) {
                    Text(text = "All", color = Color.White)
                }


                Button(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        lightPink
                    )
                ) {
                    Text(text = "Men",color = Color.White)
                }
                Button(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        lightPink
                    )
                ) {
                    Text(text = "Women",color = Color.White)
                }


                Button(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        lightPink
                    )
                ) {
                    Text(text = "Child",color = Color.White)
                }


            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Photocard(R.drawable.women1,"Casual V-neck","120.00")
                Photocard(R.drawable.women4edited,"Casual Top","100.00")

            }

            Row {
                Photocard(R.drawable.women5,"Party V-neck","320.00")
                Photocard(R.drawable.women6,"Home V-neck","1420.00")

            }


        }
    }
}

@Composable
fun Photocard(img: Int,title:String,price:String) {
Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {


    ElevatedCard(
        modifier = Modifier
            .padding(10.dp)
            .width(160.dp)
            .height(220.dp),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            Color.White
        ),
        elevation = CardDefaults.cardElevation(22.dp)
    ) {
        Image(painter = painterResource(id = img), contentDescription = null,modifier=Modifier.fillMaxSize(), contentScale = ContentScale.Fit)

    }
    Text(text = "$title", fontSize = 15.sp, fontWeight = FontWeight.SemiBold, fontFamily = ubuntu, color = Color.Black)
    Text(text = "$ $price", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, fontFamily = ubuntu, color = lightPink)

}

}


