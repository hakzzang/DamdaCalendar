object Versions {
    val build_gradle = "4.2.0-alpha09"
    val kotlin_version = "1.4.0"
    val core_ktx = "1.5.0-alpha02"
    val appcompat = "1.3.0-alpha02"
    val material = "1.3.0-alpha02"
    val ui_layout = "0.1.0-dev14"
    val ui_material = "0.1.0-dev14"
    val ui_tooling = "1.0.0-alpha02"
    val junit = "4.13"
    val ext_junit = "1.1.2"
    val espresso_core = "3.3.0"
}

object Compose{
    val extension_version = "0.1.0-dev13"
    val compiler_version = "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
}

object Libs {
    val build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val material = "com.google.android.material:material::${Versions.material}"
    val ui_layout = "androidx.ui:ui-layout:${Versions.ui_layout}"
    val ui_material = "androidx.ui:ui-material:${Versions.ui_material}"
    val ui_tooling = "androidx.ui:ui-tooling:${Versions.ui_tooling}"
    val junit = "junit:junit:${Versions.junit}"
    val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}