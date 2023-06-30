package com.example.home_ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.home_ui.ui.screen.HomeRoute
import com.example.shared_ui.ext.RouteDestination
import com.example.shared_ui.navigation.HomeNavGraph
import com.example.shared_ui.navigation.NavGraphProvider
import com.example.shared_ui.state.RootState
import javax.inject.Inject

@HomeNavGraph
class HomeNavGraphProvider @Inject constructor(): NavGraphProvider {
    override fun provide(
        route: String,
        rootState: RootState,
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        with(navGraphBuilder) {
            navigation(RouteDestination.HOME_ROUTE, route) {
                composable(RouteDestination.HOME_ROUTE) {
                    HomeRoute(rootState)
                }
            }
        }
    }
}