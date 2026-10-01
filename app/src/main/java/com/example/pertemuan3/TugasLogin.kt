package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {

    val background = painterResource(id = R.drawable.background_login)
    val logo = painterResource(id = R.drawable.logo_umy)
    val profile = painterResource(id = R.drawable.gambar)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.25f))
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 25.dp,
                    end = 25.dp,
                    top = 55.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.size(15.dp))

            Text(
                text = "Login",
                color = Color.White,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.size(45.dp))

            Image(
                painter = logo,
                contentDescription = "Logo UMY",
                modifier = Modifier.size(125.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.size(45.dp))

            Text(
                text = "Nama",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.size(4.dp))

            Text(
                text = "Fadhil Mudzaki Hartono putra",
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.size(5.dp))

            Text(
                text = "20240140063",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.size(12.dp))

            Image(
                painter = profile,
                contentDescription = "Foto Profile",
                modifier = Modifier
                    .size(285.dp)
                    .clip(CircleShape)
                    .border(
                        width = 4.dp,
                        color = Color.White,
                        shape = CircleShape
                    ),
                contentScale = ContentScale.Crop
            )
        }
    }
}