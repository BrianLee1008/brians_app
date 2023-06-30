package com.example.shared_ui.state

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

class RootState(
    val coroutineScope: CoroutineScope,
    val scaffoldState: ScaffoldState,
    val navController: NavController
)

@Composable
fun rememberRootState(
    navController: NavController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
): RootState {
    return remember(
        navController,
        coroutineScope,
        scaffoldState
    ) {
        RootState(
            coroutineScope = coroutineScope,
            scaffoldState = scaffoldState,
            navController = navController
        )
    }
}