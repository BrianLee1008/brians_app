package com.example.shared_ui.di

import com.example.shared_ui.ext.RouteDestination
import com.example.shared_ui.navigation.HomeNavGraph
import com.example.shared_ui.navigation.NavGraphProvider
import com.example.shared_ui.navigation.RootNavGraph
import com.example.shared_ui.navigation.RootNavGraphProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ComposeNavigationModule {

    @RootNavGraph
    @Provides
    @Singleton
    fun provideRootNavGraphMap(
        @HomeNavGraph homeNavGraphProvider: NavGraphProvider,
    ): Map<String, NavGraphProvider> {
        return mapOf(RouteDestination.HOME to homeNavGraphProvider)
    }

    @Provides
    @Singleton
    fun provideRootNavGraphProvider(@RootNavGraph navGraphProviderMap: Map<String, @JvmSuppressWildcards NavGraphProvider>): RootNavGraphProvider {
        return RootNavGraphProvider(navGraphProviderMap)
    }
}