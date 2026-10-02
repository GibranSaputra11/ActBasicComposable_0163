package com.ktp.p3_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun login(modifier: Modifier){
    val bg = painterResource(id = R.drawable.alam)
    val logo = painterResource(id = R.drawable.umylogo)
    val foto = painterResource(id = R.drawable.petani)
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(modifier = Modifier.fillMaxSize(),
            painter = bg,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}