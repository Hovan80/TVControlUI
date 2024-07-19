package com.example.tvcontrolui.ui.page.languageSettingsPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSettingPage(){
    val languageList = listOf("Русский", "Английский", "Французский")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(languageList[0]) }
    Scaffold(
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
        topBar = {
            TopAppBar(title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    IconButton(onClick = { },
                        modifier = Modifier.background(Color.White, shape = CircleShape)
                    ) {
                        Image(painter = painterResource(id = R.drawable.baseline_keyboard_backspace_24), contentDescription = null)
                    }
                    Text(text = "Язык приложения")
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
            languageList.forEach{ text ->
                Box(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .border(
                            width = 2.dp,
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable { onOptionSelected(text) },
                ){
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = text, color = Color.Black)
                        RadioButton(selected = text == selectedOption, onClick = {onOptionSelected(text)})
                    }
                }
            }
        }
    }

}

