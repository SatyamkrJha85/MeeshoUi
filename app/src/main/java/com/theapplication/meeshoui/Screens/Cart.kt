package com.theapplication.meeshoui.Screens

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplication.meeshoui.R
import com.theapplication.meeshoui.ui.theme.bgwhite
import com.theapplication.meeshoui.ui.theme.darkPink
import com.theapplication.meeshoui.ui.theme.messhocolor
import com.theapplication.meeshoui.ui.theme.ubuntu


@Preview(showSystemUi = true)
@Composable
fun Cart() {
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

            Spacer(modifier = Modifier.height(20.dp))

            CartCard(R.drawable.women1,"Top Neck Top","211.00")
            CartCard(R.drawable.women6,"Crop Neck Top","321.00")
            CartCard(R.drawable.women5,"Bottom Neck Top","261.00")

            Spacer(modifier = Modifier.height(20.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "Total",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "$210.00",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black
                    )
                }
                ElevatedButton(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        darkPink
                    ), modifier = Modifier
                        .width(200.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Pay Now",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
        }
    }
}

@Composable
fun mediumboxwomen(img: Int) {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(12.dp))
            .size(100.dp)
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
fun CartCard(img: Int,title:String,price:String) {
    Card(
        colors = CardDefaults.cardColors(
            Color.White
        ),
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
            .border(1.dp, Color.Gray, RoundedCornerShape(12.dp))
            .padding(2.dp)
    ) {
        Column {

            Row {
                mediumboxwomen(img = img)

                Column {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, start = 10.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = title, fontSize = 17.sp, fontWeight = FontWeight.ExtraBold, fontFamily = ubuntu, color = Color.Black)

                    Box(
                        modifier = Modifier
                            .background(darkPink, RoundedCornerShape(10.dp))
                            .size(25.dp),

                        ) {
                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(Alignment.Center), tint = Color.White
                        )
                    }
                }
                    Text(text = "Classic", color = Color.Black, modifier = Modifier.padding(start = 10.dp))

                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            text = "$$price",
                            fontSize = 21.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.Black
                        )

                        Row {
                            Icon(imageVector = Icons.Filled.Add, contentDescription = null, tint = Color.Black)

                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "1",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.width(10.dp))

                            Icon(painter = painterResource(id = R.drawable.remove), contentDescription = null, tint = Color.Black)

                        }
                    }
                }
            }



        }


    }
}