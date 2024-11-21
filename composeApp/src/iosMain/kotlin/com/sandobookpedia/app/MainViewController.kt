package com.sandobookpedia.app

import androidx.compose.ui.window.ComposeUIViewController
import com.sandobookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }