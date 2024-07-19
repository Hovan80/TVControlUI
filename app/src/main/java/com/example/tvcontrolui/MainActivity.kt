package com.example.tvcontrolui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tvcontrolui.ui.page.devicesListPage.DevicesListPage
import com.example.tvcontrolui.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme(darkTheme = false) {
                val devices: MutableList<String> = mutableListOf("Hello", "World", "Mother", "Fucker")
                DevicesListPage(devices = devices)
            }
        }
    }
}
