import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.20"
}

android {
    namespace = "com.nicos.samplewearoscomposewithlist"
    compileSdk = 36
    buildToolsVersion = "36.0.0"

    defaultConfig {
        applicationId = "com.nicos.samplewearoscomposewithlist"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        compilerOptions {
            jvmTarget = JvmTarget.fromTarget("21")
            freeCompilerArgs = listOf("-Xannotation-default-target=param-property")
        }
    }
    buildFeatures {
        compose = true
    }
    composeCompiler {
        reportsDestination = layout.buildDirectory.dir("compose_compiler")
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

val lifeCycleAndLiveDataCompilerAndViewModelKTXVersion by extra("2.10.0")
val coroutineVersion by extra("1.10.2")
val composeHiltNavigationVersion by extra("1.3.0")
val hiltVersion by extra("2.59.2")
val hiltCompilerVersion by extra("1.3.0")
val retrofitVersion by extra("3.0.0")
val roomVersion by extra("2.8.4")
val glideVersion by extra("5.0.5")
val glideComposeVersion by extra("1.0.0-beta08")
val materialDesignVersion by extra("1.13.0")
val multidexVersion by extra("2.0.1")
val wearComposeVersion by extra("1.6.0-alpha07")
val activityComposeVersion by extra("1.12.2")
val navigation3Version by extra("1.0.0")
val composeMaterial3AdaptiveVersion by extra("1.3.0-alpha05")
val kotlinSerializationVersion by extra("1.9.0")

dependencies {

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.10.0")
    // Compose
    implementation("androidx.activity:activity-compose:$activityComposeVersion")
    implementation(platform("androidx.compose:compose-bom:2025.12.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.wear.compose:compose-material:$wearComposeVersion")
    implementation("androidx.wear.compose:compose-foundation:$wearComposeVersion")
    implementation("androidx.wear.compose:compose-ui-tooling:$wearComposeVersion")
    implementation("wear-compose:compose-navigation3:$wearComposeVersion")
    implementation("androidx.hilt:hilt-navigation-compose:$composeHiltNavigationVersion")
    // Navigation 3
    implementation("androidx.navigation3:navigation3-runtime:${navigation3Version}")
    implementation("androidx.navigation3:navigation3-ui:${navigation3Version}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-navigation3:${lifeCycleAndLiveDataCompilerAndViewModelKTXVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:${kotlinSerializationVersion}")
    implementation("androidx.compose.material3.adaptive:adaptive:${composeMaterial3AdaptiveVersion}")
    implementation("androidx.compose.material3.adaptive:adaptive-navigation3:${composeMaterial3AdaptiveVersion}")
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion")
    // Hilt
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    ksp("com.google.dagger:hilt-compiler:$hiltVersion")
    ksp("androidx.hilt:hilt-compiler:$hiltCompilerVersion")
    // Room Database
    implementation("androidx.room:room-runtime:$roomVersion")
    ksp("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")
    // Retrofit request
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")
    // Glide - load the images
    implementation("com.github.bumptech.glide:glide:$glideVersion")
    ksp("com.github.bumptech.glide:compiler:$glideVersion")
    implementation("com.github.bumptech.glide:compose:$glideComposeVersion")
    // Materials
    implementation("com.google.android.material:material:$materialDesignVersion")
    // Multidex
    implementation("androidx.multidex:multidex:$multidexVersion")
    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
    androidTestImplementation(platform("androidx.compose:compose-bom:2025.12.01"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}