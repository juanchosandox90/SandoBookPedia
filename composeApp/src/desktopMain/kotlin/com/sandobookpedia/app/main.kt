package com.sandobookpedia.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.sandobookpedia.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "SandoBookPedia",
    ) {
        App()
    }
}