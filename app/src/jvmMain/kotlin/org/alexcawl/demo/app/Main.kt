package org.alexcawl.demo.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    application {
        Window(::exitApplication) {
            App()
        }
    }
}
