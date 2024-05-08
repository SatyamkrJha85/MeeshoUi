package com.theapplication.meeshoui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplication.meeshoui.R
import com.theapplication.meeshoui.ui.theme.LightBlue
import com.theapplication.meeshoui.ui.theme.LightGreen
import com.theapplication.meeshoui.ui.theme.LightPurple
import com.theapplication.meeshoui.ui.theme.bgwhite
import com.theapplication.meeshoui.ui.theme.darkPink
import com.theapplication.meeshoui.ui.theme.lightPink
import com.theapplication.meeshoui.ui.theme.madimi
import com.theapplication.meeshoui.ui.theme.ubuntu


@Preview(showSystemUi = true)
@Composable
fun Category() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        lightPink, darkPink, lightPink,
                        lightPink
                    )
                ),
            )
    ) {

        Image(
            painter = painterResource(id = R.drawable.couple), contentDescription = null,
            modifier = Modifier
                .width(400.dp)
                .height(450.dp)
        )


        Box(
            modifier = Modifier

                .clip(shape = RoundedCornerShape(topStart = 164.dp, topEnd = 164.dp))
                .width(500.dp)
                .height(450.dp)
                .background(Color.White)
                .align(Alignment.BottomEnd)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Biggest Online Store",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = madimi,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(10.dp))


                Text(
                    text = "Million of Collections",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = ubuntu,
                    color = Color.Black
                )

                Row(
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    imgbox(R.drawable.women1, LightBlue)
                    imgbox(R.drawable.women3, LightPurple)
                    imgbox(R.drawable.women4edited, LightGreen)

                }

                Row(
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    imgbox(R.drawable.women6, LightGreen)
                    imgbox(R.drawable.women5, LightPurple)
                    imgbox(R.drawable.womenbg, LightBlue)

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    ElevatedButton(
                        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                            darkPink
                        ), modifier = Modifier
                            .width(200.dp)
                            .height(50.dp)
                    ) {
                        Text(
                            text = "Go Now",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.width(10.dp))

                        Icon(imageVector = Icons.Filled.ArrowForward, contentDescription =null, tint = Color.White )
                    }
                }


            }

        }
    }
}



@Composable
fun imgbox(img:Int,color: Color) {
    Box(modifier = Modifier
        .padding(10.dp)
        .size(100.dp)
        .background(color, RoundedCornerShape(12.dp))){
        Image(painter = painterResource(id = img), contentDescription = null,
            modifier = Modifier.align(Alignment.Center))
    }

}