package com.example.home_ui.di

import com.example.home_ui.navigation.HomeNavGraphProvider
import com.example.shared_ui.navigation.HomeNavGraph
import com.example.shared_ui.navigation.NavGraphProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeNavigationModule {
    @Binds
    @Singleton
    @HomeNavGraph
    abstract fun bindsHomeNavGraphProvider(homeNavGraphProvider: HomeNavGraphProvider): NavGraphProvider

}