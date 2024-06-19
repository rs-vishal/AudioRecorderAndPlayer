object AppVersioning {
    const val versionCode = 1
    const val versionName = "1.0"
}

object APIVersions {
    const val compileSdk = 32
    const val minSdk = 21
    const val targetSdk = 32
}

object Versions {
    const val coreKTX = "1.7.0"
    const val runtimeKTX = "2.3.1"
    const val composeActivity = "1.3.1"
    const val compose = "1.1.1"
    const val jUnit = "4.13.2"
    const val jUnitExt = "1.1.4"
    const val espresso = "3.5.0"
    const val gradlePlugin = "7.3.1"
    const val kotlinPlugin = "1.6.10"
}

object Implementation {
    const val coreKTX = "androidx.core:core-ktx:${Versions.coreKTX}"
    const val runtimeKTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKTX}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
}

object TestImplementation {
    const val jUnit = "junit:junit:${Versions.jUnit}"
}

object AndroidTestImplementation {
    const val jUnitEXT = "androidx.test.ext:junit:${Versions.jUnitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val jUnitCompose = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"

}

object DebugImplementation {
    const val composeUITooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeUiManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
}

object ClassPath {
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlinPlugins = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}"
}
