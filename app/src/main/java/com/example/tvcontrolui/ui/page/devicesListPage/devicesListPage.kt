package com.example.tvcontrolui.ui.page.devicesListPage

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import com.example.tv.ui.theme.NavAllIcons
import com.example.tvcontrolui.ui.components.DeviceButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DevicesListPage(devices: MutableList<String> = mutableListOf(), modifier: Modifier = Modifier){
    Scaffold (
        topBar = { TopAppBar(title = { NavAllIcons(title = "Устройства") }) }
    ){ innerPadding ->
        if (devices.size == 0){
            Column(modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Устройства отсутствуют")
            }
        }
        else{
            LazyVerticalGrid(
                modifier = modifier.padding(innerPadding).padding(12.dp),
                columns = GridCells.Adaptive(160.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(devices){device ->
                    DeviceButton(title = device)
                }
            }
        }
    }

}