plugins {
    id(PluginsID.android_application)
    kotlin(PluginsID.android)
    kotlin(PluginsID.android_extensions)
    kotlin(PluginsID.kapt)
}

android {
    compileSdkVersion(AndroidModuleDependencies.TARGET_SDK_VERSION)
    buildToolsVersion(AndroidModuleDependencies.TOOL_VERSION)

    defaultConfig {
        applicationId (AndroidModuleDependencies.APPLICATION_ID)
        minSdkVersion (AndroidModuleDependencies.MIN_SDK_VERSION)
        targetSdkVersion (AndroidModuleDependencies.TARGET_SDK_VERSION)
        versionCode (AndroidModuleDependencies.VERSION_CODE)
        versionName (AndroidModuleDependencies.VERSION_NAME)

        testInstrumentationRunner(Libs.Test.junit_runner)
    }

    buildTypes {
        getByName("release"){
            isShrinkResources = true
            isMinifyEnabled = true
            isDebuggable = false
            splits.abi.isEnable = true
            aaptOptions.cruncherEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
            ext("alwaysUpdateBuildId" to true)
        }
        getByName("debug"){
            isShrinkResources = false
            isMinifyEnabled = false
            isDebuggable = true
            splits.abi.isEnable = false
            aaptOptions.cruncherEnabled = false
            ext("alwaysUpdateBuildId" to true)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion  = Compose.extension_version
        kotlinCompilerVersion = Compose.compiler_version
    }
}

dependencies {
    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Ktx.core)
    implementation(Libs.UI.appcompat)
    implementation(Libs.UI.material)
    implementation(Libs.Compose.layout)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.tooling)
    testImplementation(Libs.Test.junit)
    androidTestImplementation(Libs.Test.ext_junit)
    androidTestImplementation(Libs.Test.espresso_core)
}