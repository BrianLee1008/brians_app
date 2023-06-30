package com.example.gateway

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.shared_ui.ui.surface1
import com.example.shared_ui.navigation.RootNavGraphProvider
import com.example.shared_ui.state.rememberRootState

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RootScreen(
    modifier: Modifier = Modifier,
    rootNavGraphProvider: RootNavGraphProvider,
) {
    val rootState = rememberRootState()
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface1),
        scaffoldState = rootState.scaffoldState,
        snackbarHost = { rootState.scaffoldState.snackbarHostState },
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surface1),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            rootNavGraphProvider.RootNavHost(
                rootState = rootState,
                navHostController = rememberNavController()
            )
        }
    }
}