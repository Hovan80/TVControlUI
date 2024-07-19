package com.example.tvcontrolui.ui.page.controllerSetting

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.example.tvcontrolui.ui.theme.NavBackAndTitle
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.theme.CustomButton
import com.example.tvcontrolui.ui.theme.MyStyle
import com.example.tvcontrolui.ui.theme.DeviceConnectedRecommendations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ControllerSetting(modifier: Modifier = Modifier){
    val (controllerName, onControllerNameChanged) = remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(title = { NavBackAndTitle(onClick = {}, title = "Сохранить пульт")})
        }
    ){ innerPadding ->
        Column(modifier = modifier
            .padding(innerPadding)
            .padding(20.dp, 46.dp),
            verticalArrangement = Arrangement.spacedBy(64.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            DeviceConnectedRecommendations(deviceName = "Xiaomi")
            Column (modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ){ 
                Text(text = "Имя пульта", style = MyStyle.text_H2)
                Spacer(modifier = Modifier.height(20.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .border(color = MaterialTheme.colorScheme.outlineVariant, width = 1.dp, shape = RoundedCornerShape(16.dp))
                    .padding(16.dp)
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        BasicTextField(
                            modifier = Modifier.weight(1f),
                            value = controllerName,
                            onValueChange = {newName -> onControllerNameChanged(newName)}
                        )
                        Box(modifier = Modifier
                            .clip(CircleShape)
                            .clickable { onControllerNameChanged("") }
                        ){
                            Image(painter = painterResource(id = R.drawable.ic_close), contentDescription = null)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            CustomButton(onClick = { /*TODO*/ }, text = "Сохранить")
        }
    }
}

