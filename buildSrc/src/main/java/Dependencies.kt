object Versions {
    const val build_gradle = "4.2.0-alpha07"
    const val kotlin_version = "1.4.0"
    const val core_ktx = "1.5.0-alpha02"
    const val appcompat = "1.3.0-alpha02"
    const val material = "1.3.0-alpha02"
    const val ui_layout = "0.1.0-dev14"
    const val ui_material = "0.1.0-dev14"
    const val ui_tooling = "1.0.0-alpha02"
    const val junit = "4.13"
    const val ext_junit = "1.1.2"
    const val espresso_core = "3.3.0"
}

object PluginsID{
    const val android_application = "com.android.application"
    const val android = "android"
    const val android_extensions = "android.extensions"
    const val kapt = "kapt"
}

object Compose{
    const val extension_version = "0.1.0-dev13"
    const val compiler_version = "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
}

object Libs {
    object Gradle{
        const val build = "com.android.tools.build:gradle:${Versions.build_gradle}"
    }

    object Kotlin{
        const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    }

    object Ktx{
        const val core = "androidx.core:core-ktx:${Versions.core_ktx}"
    }

    object UI{
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material::${Versions.material}"
    }

    object Compose{
        const val layout = "androidx.ui:ui-layout:${Versions.ui_layout}"
        const val material = "androidx.ui:ui-material:${Versions.ui_material}"
        const val tooling = "androidx.ui:ui-tooling:${Versions.ui_tooling}"
    }

    object Test{
        const val junit = "junit:junit:${Versions.junit}"
        const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
        const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
        const val junit_runner = "androidx.test.runner.AndroidJUnitRunner"
    }
}