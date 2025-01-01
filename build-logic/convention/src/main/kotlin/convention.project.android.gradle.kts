import org.alexcawl.weather.androidTestImplementation
import org.alexcawl.weather.implementation
import org.alexcawl.weather.libs
import org.alexcawl.weather.testImplementation

plugins {
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")

    id("convention.base.common")
    id("convention.base.android")
}

dependencies {
    implementation(libs.bundles.common.source)
    testImplementation(libs.bundles.common.test)
    implementation(libs.bundles.android.source)
    androidTestImplementation(libs.bundles.android.test)

    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.ui)
    implementation(compose.preview)
}