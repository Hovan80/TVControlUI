package com.example.tvcontrolui.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.ui.theme.NavBackAndTitle
import com.example.tvcontrolui.ui.theme.NavSupportAndTitle
import com.example.tvcontrolui.ui.theme.Recommendations
import com.example.tvcontrolui.ui.components.NavigationButton
import com.example.tvcontrolui.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TVSelectList(modifier: Modifier = Modifier, tvList: MutableList<String> = mutableListOf()){
    Scaffold(
        topBar = { TopAppBar(title = { NavBackAndTitle(onClick = {}, title = "Выберите устройство") }) },
    ) { innerPadding ->
        Column(modifier = modifier
            .padding(innerPadding).padding(horizontal = 20.dp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn(modifier = modifier
                .fillMaxWidth().padding(top = 36.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(tvList){tv ->
                    NavigationButton(image = painterResource(id = R.drawable.ic_tv_list), title = tv)
                }
            }
                Recommendations()

        }
    }
}

