package com.example.tvcontrolui.ui.page.settingsPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.components.DeviceButton
import com.example.tvcontrolui.ui.components.NavigationButton
import com.example.tvcontrolui.ui.theme.AppTypography
import com.example.tvcontrolui.ui.theme.BottomNavigationComponent
import com.example.tvcontrolui.ui.theme.MyStyle
import com.example.tvcontrolui.ui.theme.NavTitleOnly

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsPage(){
    MaterialTheme(
        typography = com.example.tvcontrolui.ui.theme.AppTypography
    ) {
        Scaffold(
            modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),

        ) { innerPadding ->
                Column(modifier = Modifier
                    .padding(innerPadding)
                    .padding(
                        start = 20.dp,
                        end = 20.dp
                    )
                    .fillMaxHeight()
                    .selectableGroup(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    Box(modifier = Modifier.padding(bottom = 36.dp)) {
                        NavTitleOnly(title = "Настройки")
                    }

                    NavigationButton(
                        image = painterResource(id = R.drawable.ic_support),
                        title = "Обратная связь",
                        description = "Вы можете оценить наше приложение, а также сообщить об ошибках"
                    )
                    NavigationButton(
                        image = painterResource(id = R.drawable.ic_earth),
                        title = "Язык приложения",
                        description = "Русский" // По идее данные о языке берутся из глобал стейт
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    //BottomNavigationComponent()
                }

        }

    }

}
