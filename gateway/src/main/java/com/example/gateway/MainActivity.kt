package com.example.gateway

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.Modifier
import com.example.shared_ui.navigation.RootNavGraphProvider
import com.example.shared_ui.ui.Theme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var rootNavGraphProvider: RootNavGraphProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
                RootScreen(
                    modifier = Modifier,
                    rootNavGraphProvider = rootNavGraphProvider
                )
            }
        }
    }
}