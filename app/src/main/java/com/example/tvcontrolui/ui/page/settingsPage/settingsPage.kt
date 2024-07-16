package com.example.tvcontrolui.ui.page.settingsPage

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tvcontrolui.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsPage(){
    Scaffold(
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
        topBar = {
            TopAppBar(title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    Text(text = "Настройки")
                }
            })
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxHeight()
            .selectableGroup(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            NavigationButton(
                image = painterResource(id = R.drawable.baseline_live_help_24),
                title = "Обратная связь",
                description = "Вы можете оценить наше приложение, а также сообщить об ошибках"
            )
            NavigationButton(
                image = painterResource(id = R.drawable.baseline_language_24),
                title = "Язык приложения",
                description = "Русский" // По идее данные о языке берутся из глобал стейт
            )
            NavigationButton(
                image = painterResource(id = R.drawable.baseline_share_24),
                title = "Поделиться",
                description = "Расскажите друзьям и знакомым о нашем приложении"
            )
            NavigationButton(
                image = painterResource(id = R.drawable.baseline_lock_outline_24),
                title = "Политика конфиденциальности"
            )

        }
    }
}

@Composable
fun NavigationButton(onClick: () -> Unit = {}, image: Painter, title: String = "", description: String = ""){
    Button(onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.DarkGray),
        contentPadding = PaddingValues(24.dp),
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
            )
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                Text(text = title, fontWeight = FontWeight(600), fontSize = 20.sp)
                if (description != "") Text(text = description)
            }
        }
    }
}
