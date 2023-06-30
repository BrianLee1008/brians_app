package com.example.shared_ui.navigation

import javax.inject.Qualifier

@Qualifier
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
annotation class HomeNavGraph