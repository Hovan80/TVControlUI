package com.example.tvcontrolui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.R


@Composable
fun DeviceButton(title: String = "") {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .border(2.dp, Color.LightGray, shape = RoundedCornerShape(16.dp)),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .clickable {  } //Необходимо вставить фунцию для вызова контекстного меню
                        .clip(CircleShape)
                ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_menu_dots),
                            contentDescription = null,
                            tint = Color.Unspecified
                        )
                    }
                }
            Spacer(modifier = Modifier.height(4.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_interior_tv),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = title)
        }
    }
}