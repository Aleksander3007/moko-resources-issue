plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.moko.resources)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    androidTarget()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    applyDefaultHierarchyTemplate()

    cocoapods {
        version = "1.0"
        summary = "MyResources"
        homepage = "www.github.com"
        ios.deploymentTarget = "14.0"
        framework {
            baseName = "MyResources"
            isStatic = true

            export(libs.moko.resources)
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.moko.resources)
        }
    }
}

android {
    namespace = "com.egoriku.my.resources"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

multiplatformResources {
    resourcesPackage = "com.egoriku.mokoresourcesissue"
}
