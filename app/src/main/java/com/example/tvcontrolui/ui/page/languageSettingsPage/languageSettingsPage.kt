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
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.theme.BottomNavigationComponent
import com.example.tvcontrolui.ui.theme.MyStyle
import com.example.tvcontrolui.ui.theme.NavBackAndTitle
import com.example.tvcontrolui.ui.theme.NavTitleOnly

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSettingPage(){
    val languageList = listOf("Русский", "English", "Français")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(languageList[0]) }
    Scaffold(
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars)
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(
                start = 20.dp,
                end = 20.dp)
            .fillMaxHeight()
            .selectableGroup(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Box(modifier = Modifier.padding(bottom = 36.dp)) {
                NavBackAndTitle(onClick = { }, title = "Язык приложения")
            }
            languageList.forEach{ text ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .clickable{ onOptionSelected(text) }
                        .background(color = MaterialTheme.colorScheme.surfaceVariant, shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.outlineVariant,
                            shape = RoundedCornerShape(16.dp)
                        )
                ){
                    Row(
                        modifier = Modifier
                            .padding(start = 20.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = text, style = MyStyle.text_H3)
                        RadioButton(selected = text == selectedOption, onClick = {onOptionSelected(text)},
                            colors = RadioButtonColors(
                                disabledSelectedColor = MaterialTheme.colorScheme.tertiary,
                                selectedColor = MaterialTheme.colorScheme.tertiary,
                                unselectedColor = MaterialTheme.colorScheme.tertiary,
                                disabledUnselectedColor = MaterialTheme.colorScheme.tertiary))
                    }

                }

            }
            //BottomNavigationComponent()
        }
    }
}





