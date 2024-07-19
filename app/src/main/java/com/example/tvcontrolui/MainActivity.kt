package com.example.tvcontrolui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tvcontrolui.ui.page.TVSelectList
import com.example.tvcontrolui.ui.page.addingController.AddingController
import com.example.tvcontrolui.ui.page.connectionErrorPage.ConnectionErrorPage
import com.example.tvcontrolui.ui.page.controllerSetting.ControllerSetting
import com.example.tvcontrolui.ui.page.devicesListPage.DevicesListPage
import com.example.tvcontrolui.ui.page.homePage.HomePage
import com.example.tvcontrolui.ui.page.languageSettingsPage.LanguageSettingPage
import com.example.tvcontrolui.ui.page.remoteControlPage.RemoteControlPage
import com.example.tvcontrolui.ui.page.searchTvPage.SearchTvPage
import com.example.tvcontrolui.ui.page.settingsPage.SettingsPage
import com.example.tvcontrolui.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme(darkTheme = false) {
                HomePage()
                //AddingController()
                //ConnectionErrorPage()
                //SearchTvPage()

                val devices: MutableList<String> = mutableListOf("MiTV-MOSR1", "MiTV-MOSR1", "MiTV-MOSR1", "MiTV-MOSR1")
                DevicesListPage(devices = devices)


                //DevicesListPage()
                //ControllerSetting()


                //val tvList: MutableList<String> = mutableListOf("Tv 1", "Tv 2", "Tv 2")
                //TVSelectList(tvList = tvList)

                //SettingsPage()
                //LanguageSettingPage()
                //RemoteControlPage()
            }
        }
    }
}
