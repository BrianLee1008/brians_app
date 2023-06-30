package com.example.home_ui.ui.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.home_ui.viewmodel.HomeViewModel
import com.example.shared_ui.state.RootState

@Composable
fun HomeRoute(rootState: RootState) {

    val homeViewModel = hiltViewModel<HomeViewModel>()
}