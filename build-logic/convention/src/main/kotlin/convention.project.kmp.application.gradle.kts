import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration

plugins {
    id("com.android.application")

    id("convention.project.kmp")
}

kotlinMultiplatformConfiguration {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
    }
}
