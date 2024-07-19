package com.example.tvcontrolui.ui.theme

import androidx.annotation.RestrictTo
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.tvcontrolui.R


@Composable
public fun CustomButton(modifier: Modifier = Modifier, onClick: () -> Unit, text: String) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
            .padding(horizontal = 48.dp)
            .width(420.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.tertiary)
    )
    {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MyStyle.text_H2,
            color = MaterialTheme.colorScheme.background
        )

    }
}

@Composable
fun NavAllIcons(onClick: () -> Unit, title: String) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onClick,
            contentPadding = PaddingValues(2.dp),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),

            ) {
            val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_arrow_left))
            Image(
                painter = imagePainter,
                contentDescription = "Back",
                modifier = Modifier.size(40.dp, 40.dp)
            )
        }
        Text(
            text = title,
            textAlign = TextAlign.Center,
            style = MyStyle.text_H1
        )
        Button(onClick = onClick,
            contentPadding = PaddingValues(2.dp),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),
        ) {
            val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_support_nav))
            Image(
                painter = imagePainter,
                contentDescription = "Support",
                modifier = Modifier.size(40.dp, 40.dp)
            )
        }
    }
}

@Composable
fun NavSupportAndTitle(modifier: Modifier,onClick: () -> Unit, title: String) {
    Row (
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            style = MyStyle.text_H1
        )
        Button(onClick = onClick,
            contentPadding = PaddingValues(2.dp),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),
        ) {
            val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_support_nav))
            Image(
                painter = imagePainter,
                contentDescription = "Support",
                modifier = Modifier.size(40.dp, 40.dp)
            )
        }
    }
}

@Composable
fun NavBackAndTitle(onClick: () -> Unit, title: String) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onClick,
            contentPadding = PaddingValues(2.dp),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),

            ) {
            val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_arrow_left))
            Image(
                painter = imagePainter,
                contentDescription = "Back",
                modifier = Modifier.size(40.dp, 40.dp)
            )
        }
        Text( modifier = Modifier.padding(start = 44.dp),
            text = title,
            textAlign = TextAlign.Center,
            style = MyStyle.text_H1
        )

    }
}

@Composable
fun NavTitleOnly(title: String) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            style = MyStyle.text_H1
        )
    }
}

@Composable
fun NavBack(onClick: () -> Unit) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onClick,
            contentPadding = PaddingValues(2.dp),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),

            ) {
            val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_arrow_left))
            Image(
                painter = imagePainter,
                contentDescription = "Back",
                modifier = Modifier.size(40.dp, 40.dp)
            )
        }
    }
}

@Composable
fun NumberedListItem(index: Int, text: String) {
    Row(modifier = Modifier.padding(bottom = 8.dp)) {
        Text(
            text = "${index + 1}. ",
            style = MyStyle.text_P,
            color = MaterialTheme.colorScheme.scrim
        )
        Text(
            text = text,
            style = MyStyle.text_P,
            color = MaterialTheme.colorScheme.scrim
        )
    }
}

@Composable
fun Recommendations() {
    Box(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.surfaceVariant,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 32.dp, horizontal = 32.dp)
        ) {
            Text(
                text = "Убедитесь, что:",
                style = MyStyle.text_H3,
                color = MaterialTheme.colorScheme.scrim,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            NumberedListItem(0, "Ваш смартфон и ТВ подключены к одной сети Wi-Fi")
            NumberedListItem(1, "Ваш ТВ включен")
            NumberedListItem(2, "На вашем смартфоне выключен VPN")
        }
    }
}

@Composable
fun DeviceConnectedRecommendations(deviceName: String) {
    Box(modifier = Modifier.background(
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = RoundedCornerShape(16.dp)
    )) {
        Column(
            modifier = Modifier.padding(vertical = 32.dp, horizontal = 48.dp)
        ) {
            Text(
                text = "Телевизор $deviceName подключен!",
                style = MyStyle.text_H3,
                color = MaterialTheme.colorScheme.scrim,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 24.dp, bottom = 12.dp),
            )

            Text(
                text = "Пульт дистанционного управления подключен к вашему ТВ. Сохраните его для использования в будущем.",
                style = MyStyle.text_P,
                color = MaterialTheme.colorScheme.scrim,
                textAlign = TextAlign.Center
            )
        }
    }
}

//@Composable
//fun BottomNavigation() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(82.dp)
//            //.border()
//            .padding(top = 1.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//
//            Button(onClick = { /*TODO*/ }) {
//                val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.ic_nav_controller_active))
//                Image(painter = imagePainter, contentDescription = null, modifier = Modifier.size(40.dp, 40.dp))
//            }
//            BottomNavigationButton(R.drawable.ic_controller_default, R.drawable.ic_controller_active)
//            BottomNavigationButton(R.drawable.ic_burger_default, R.drawable.ic_burger_active)
//        }
//    }
//}

@Composable
fun BottomNavigationComponent() {
    //val navigationController = rememberNavController()
    //val context = LocalContext.current.applicationContext
    val selectedButtonIndex = remember { mutableStateOf(0) } // Хранит индекс активной кнопки
    BottomAppBar(containerColor = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(82.dp),
                //.border(BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outlineVariant)),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomNavigationButton(R.drawable.ic_nav_controller_default, R.drawable.ic_nav_controller_active, selectedButtonIndex, 0)
                BottomNavigationButton(R.drawable.ic_nav_burger_default, R.drawable.ic_nav_burger_active, selectedButtonIndex, 1)
            }
        }
    }
}

@Composable
fun BottomNavigationButton(defaultIcon: Int, activeIcon: Int, selectedButtonIndex: MutableState<Int>, index: Int) {
    IconButton(
        onClick = {
            if (selectedButtonIndex.value != index) {
                selectedButtonIndex.value = index
            }
        },
        enabled = selectedButtonIndex.value != index // Устанавливает доступность кнопки в зависимости от активности
    ) {
        Image(
            painter = painterResource(if (selectedButtonIndex.value == index) activeIcon else defaultIcon),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
    }
}
