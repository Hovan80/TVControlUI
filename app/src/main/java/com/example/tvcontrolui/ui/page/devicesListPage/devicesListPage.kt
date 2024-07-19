package com.example.tvcontrolui.ui.page.devicesListPage

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.theme.NavAllIcons
import com.example.tvcontrolui.ui.components.DeviceButton
import com.example.tvcontrolui.ui.theme.BottomNavigationComponent
import com.example.tvcontrolui.ui.theme.CustomButton
import com.example.tvcontrolui.ui.theme.MyStyle
import com.example.tvcontrolui.ui.theme.NavSupportAndTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DevicesListPage(devices: MutableList<String> = mutableListOf(), modifier: Modifier = Modifier){
    Scaffold (
        topBar = { TopAppBar(
            title = { NavSupportAndTitle(modifier = Modifier.padding(end = 20.dp), onClick = {}, title = "Устройства") }) }
    ){ innerPadding ->
        if (devices.size == 0){
            Column(modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Column (modifier = Modifier.padding(top = 100.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_no_devices))
                    Image(
                        painter = imagePainter,
                        contentDescription = "Search Tv",
                        modifier = Modifier.size(246.dp, 249.dp)
                    )
                    Text(text = "Устройства отсутствуют", style = MyStyle.text_H1)
                }

                Spacer(modifier = Modifier.weight(1f))
                CustomButton(onClick = { /*TODO*/ }, text = "Добавить пульт")
            }
        }
        else{
            LazyVerticalGrid(
                modifier = modifier
                    .padding(innerPadding)
                    .padding(20.dp),
                columns = GridCells.Adaptive(160.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(devices){device ->
                    DeviceButton(title = device)

                }

            }
            CustomButton(onClick = { /*TODO*/ }, text = "Добавить пульт")
            //BottomNavigationComponent()
        }

    }



}