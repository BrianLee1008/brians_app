package com.example.shared_ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.example.shared_ui.state.RootState

interface NavGraphProvider {
    fun provide(
        route: String,
        rootState : RootState,
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    )
}