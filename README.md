#### KMP Template with MVVM, DI, Navigation, Ktor

A simple setup-template for KMP with MVVM, Koin DI, Navigation,
Ktor and other common tools.

##### Versions

![Kotlin](https://img.shields.io/badge/Kotlin-2.2.21-blue)
![Compose](https://img.shields.io/badge/Compose-1.9.3-green)
![Navigation](https://img.shields.io/badge/Navigation-2.9.1-orange)
![Koin](https://img.shields.io/badge/Koin-4.2.0alpha3-yellow)
![Ktor](https://img.shields.io/badge/Ktor-3.3.3-purple)
![MultiplatformSettings](https://img.shields.io/badge/MultiplatformSettings-1.3.0-red)

##### Instructions

1. Choose SimpleMobileKMPTemplateMVVM.
2. Use this template -> Create new repository (Give it a name)
3. Clone repo to Android Studio.
4. Go to build.gradle.kts (:composeApp) 
and change namespace and applicationId with your own id and name:

```
android {

    namespace = "org.jhaard.testproject"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "org.jhaard.testproject"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    
}
```

5. Open commonMain -> Kotlin-directory and right click on the template directory name and choose
   Refactor -> Rename -> All directories.
6. Open settings.gradle.kts and change root.name to your new project name.
7. Sync gradle.
8. Open root folder- > res -> values -> strings.xml and change app_name.
9. Choose Build -> Clean Project.
10. Choose Build -> Assemble composeApp Run Configuration.
11. Choose File -> Invalidate Caches -> Invalidate and restart.

For iOS module:
1. Choose project level and on iosApp[SimpleMobileKMPTemplateMVVM] right click and choose refactor -> What would you
   like to do? -> Choose Rename module.
2. Go to Configuration folder In iosApp module and open Config.xcconfig file. Replace:

```
   PRODUCT_NAME=SimpleMobileKMPTemplateMVVM
   PRODUCT_BUNDLE_IDENTIFIER=org.jhaard.simplekmptemplatemvvm.SimpleMobileKMPTemplateMVVM$(TEAM_ID)
```

With your new project id and name (example):

```
PRODUCT_NAME=TestProject
PRODUCT_BUNDLE_IDENTIFIER=org.jhaard.testproject.TestProject$(TEAM_ID)
```

3. Clean, rebuild iosApp and invalidate caches again.
4. Build and run the application.

##### Features

- MVVM architecture
- Koin dependency injection
- Jetpack Compose
- Navigation
- Ktor for networking
- Error handling
- State management
- Persistent storage with key/value
- Preparing for unit testing and CI automation

##### Architecture

```
View (Composables) 
    ↓
ViewModel (State management)
    ↓
Repository (Data layer)
    ↓
Ktor Client (API calls)
```

##### Roadmap

- [x] Koin setup
- [x] Navigation
- [x] MVVM
- [x] UiState
- [x] Ktor integration
- [x] Local preferences
- [x] CI automation and testing preparation

##### 👨‍💻 About

Built by Jörgen Hård as a foundation for KMP projects.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?logo=linkedin)](https://www.linkedin.com/in/j%C3%B6rgen-h%C3%A5rd-17853960/) | [![Portfolio](https://img.shields.io/badge/github-portfolio-green?logo=github)](https://github.com/jhaard) | [![Email](https://img.shields.io/badge/Email-red?logo=gmail)](mailto:jorgen.hard@gmail.com)