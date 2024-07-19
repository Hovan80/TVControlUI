package com.example.tvcontrolui.ui.page.remoteControlPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.tvcontrolui.ui.theme.NavAllIcons
import com.example.tvcontrolui.R
import com.example.tvcontrolui.ui.components.BackButton
import com.example.tvcontrolui.ui.components.DownButton
import com.example.tvcontrolui.ui.components.DownVolumeButton
import com.example.tvcontrolui.ui.components.HomeButton
import com.example.tvcontrolui.ui.components.LeftButton
import com.example.tvcontrolui.ui.components.MuteButton
import com.example.tvcontrolui.ui.components.NextChannelButton
import com.example.tvcontrolui.ui.components.PlayPauseButton
import com.example.tvcontrolui.ui.components.PowerButton
import com.example.tvcontrolui.ui.components.PreviousChannelButton
import com.example.tvcontrolui.ui.components.RightButton
import com.example.tvcontrolui.ui.components.SourceButton
import com.example.tvcontrolui.ui.components.SubmitButton
import com.example.tvcontrolui.ui.components.UpButton
import com.example.tvcontrolui.ui.components.UpVolumeButton

@Composable
fun RemoteControlPage() {
    MaterialTheme(
        typography = com.example.tvcontrolui.ui.theme.AppTypography
    ) {
        Scaffold(modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)) { innerPadding ->
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier
                    .padding(innerPadding)
                    .padding(start = 20.dp, end = 20.dp,))
                {
                    NavAllIcons(onClick = {},"Телевизор MiTV-MOSR1")
                    Column(
                        modifier = Modifier.padding(top = 80.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 86.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            PowerButton(onClick = {})

                            SourceButton(onClick = {})
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {

                            PlayPauseButton(onClick = {})

                            HomeButton(onClick = {})

                            BackButton(onClick = {})
                        }

                        Box(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        ) {
                            SubmitButton(modifier = Modifier.align(Alignment.Center),
                                onClick = {})

                            UpButton(modifier = Modifier.align(Alignment.TopCenter),
                                onClick = {})

                            RightButton(modifier = Modifier.align(Alignment.CenterEnd),
                                onClick = {})

                            DownButton(modifier = Modifier.align(Alignment.BottomCenter),
                                onClick = {})

                            LeftButton(modifier = Modifier.align(Alignment.CenterStart),
                                onClick = {})

                            val controllerMaxBackground = painterResource(id = R.drawable.ic_controller_background_max_size)
                            Image(painter = controllerMaxBackground,
                                contentDescription = null, modifier = Modifier
                                    .size(244.dp)
                                    .zIndex(-1f)
                                    .align(Alignment.Center)
                            )
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 32.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceAround

                        ) {

                            Box(modifier = Modifier) {
                                val controllerMinBackground = painterResource(id = R.drawable.ic_controller_background_min_size)
                                Image(painter = controllerMinBackground,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .zIndex(-1f)
                                        .size(100.dp, 187.dp))

                                UpVolumeButton(modifier = Modifier.align(Alignment.TopCenter),
                                    onClick = {})

                                DownVolumeButton(modifier = Modifier.align(Alignment.BottomCenter),
                                    onClick = {})
                            }

                            MuteButton(onClick = {})

                            Box(modifier = Modifier) {
                                val controllerMinBackground = painterResource(id = R.drawable.ic_controller_background_min_size)
                                Image(painter = controllerMinBackground,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .zIndex(-1f)
                                        .size(100.dp, 187.dp)
                                        .align(Alignment.Center) )

                                NextChannelButton(modifier = Modifier.align(Alignment.TopCenter),
                                    onClick = {})

                                PreviousChannelButton(modifier = Modifier.align(Alignment.BottomCenter),
                                    onClick = {})
                            }

                        }

                    }

                }

            }

        }
    }
}