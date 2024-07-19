package com.example.tvcontrolui.ui.page.searchTvPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tvcontrolui.ui.theme.NavBack
import com.example.tvcontrolui.ui.theme.Recommendations
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.theme.MyStyle

@Composable
fun SearchTvPage() {
    MaterialTheme(
        typography = com.example.tvcontrolui.ui.theme.AppTypography
    ) {
        Scaffold(modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)) { innerPadding ->
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Box(modifier = Modifier
                    .padding(innerPadding)
                    .padding(
                        start = 20.dp,
                        end = 20.dp
                    )) {
                    NavBack(onClick = {})
                }

                Box(modifier = Modifier
                    .padding(
                        top = 100.dp,
                        start = 69.dp,
                        end = 69.dp,
                        bottom = 10.dp
                    ).padding(innerPadding)) {

                    val imagePainter = rememberVectorPainter(image = ImageVector.vectorResource(id = R.drawable.tv_search))
                    Image(
                        painter = imagePainter,
                        contentDescription = "Search Tv",
                        modifier = Modifier.size(346.dp, 248.dp)
                    )
                }
                Text( modifier = Modifier.fillMaxWidth().padding(bottom = 136.dp),
                    text = "Поиск...",
                    textAlign = TextAlign.Center,
                    style = MyStyle.text_H1
                )

                Box(modifier = Modifier
                    .padding(innerPadding)
                    .padding(
                        top = 58.dp,
                        start = 20.dp,
                        end = 20.dp,
                    )) {
                    Recommendations()
                }

            }

        }
    }
}