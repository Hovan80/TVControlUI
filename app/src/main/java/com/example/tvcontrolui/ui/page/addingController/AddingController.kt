package com.example.tvcontrolui.ui.page.addingController

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.ui.theme.NavSupportAndTitle
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.theme.BottomNavigationComponent
import com.example.tvcontrolui.ui.theme.CustomButton
import com.example.tvcontrolui.ui.theme.MyStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddingController(modifier: Modifier = Modifier){
    Scaffold(modifier = Modifier,
        topBar = { TopAppBar(title = { NavSupportAndTitle(modifier = Modifier.padding(end = 20.dp), onClick = {},title = "Пульт от телевизора") })}
    ){ innerPadding ->
        Column(modifier = modifier
            .padding(innerPadding)
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally){
                val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.tv_and_controller))
                Image(
                    painter = imagePainter,
                    contentDescription = "Search Tv",
                    modifier = Modifier.size(276.dp, 249.dp)
                )
                CustomButton(modifier = Modifier.padding(top = 268.dp), onClick = { /*TODO*/ }, text = "Добавить пульт")
                //BottomNavigationComponent()
            }
        }
    }
}