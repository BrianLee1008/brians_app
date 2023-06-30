package com.example.shared_ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.shared_ui.ext.RouteDestination.HOME
import com.example.shared_ui.state.RootState

class RootNavGraphProvider(
    private val navGraphProviderMap: Map<String, NavGraphProvider?>,
) {
    @Composable
    fun RootNavHost(
        rootState: RootState,
        navHostController: NavHostController
    ) {
        NavHost(
            modifier = Modifier,
            navController = navHostController,
            startDestination = HOME
        ) {
            navGraphProviderMap.forEach {
                it.value?.provide(
                    rootState = rootState,
                    route = it.key,
                    navController = navHostController,
                    navGraphBuilder = this
                )
            }
        }
    }
}