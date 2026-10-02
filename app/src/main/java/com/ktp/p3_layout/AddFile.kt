package com.ktp.p3_layout

import android.media.Image
import android.text.Layout
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Kolom(modif: Modifier){
    Column(modifier = modif.padding(
        start = 16.dp,
        top =  16.dp,
        bottom = 16.dp,
        end = 16.dp)
    ) {
        Text("Hallo Kelas D")
        Spacer(Modifier.height(30.dp))
        Text("Ini kolom ke 2",
            fontWeight = FontWeight.
            Bold, fontSize = 12.sp,
            fontFamily = FontFamily.Serif)
    }
}

@Composable
fun Baris(modifBaris: Modifier){
    Row(modifier = modifBaris.padding(top = 16.dp, start = 16.dp)) {
        val row1 = stringResource(id = R.string.Layout )
        Text(row1)
    }
}
