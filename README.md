# Sample Wear OS Compose With List

[![Linktree](https://img.shields.io/badge/linktree-1de9b6?style=for-the-badge&logo=linktree&logoColor=white)](https://linktr.ee/nicos_nicolaou)
[![Site](https://img.shields.io/badge/Site-blue?style=for-the-badge&label=Web)](https://nicosnicolaou16.github.io/)
[![X](https://img.shields.io/badge/X-%23000000.svg?style=for-the-badge&logo=X&logoColor=white)](https://twitter.com/nicolaou_nicos)
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/nicos-nicolaou-a16720aa)
[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@nicosnicolaou)
[![Mastodon](https://img.shields.io/badge/-MASTODON-%232B90D9?style=for-the-badge&logo=mastodon&logoColor=white)](https://androiddev.social/@nicolaou_nicos)
[![Bluesky](https://img.shields.io/badge/Bluesky-0285FF?style=for-the-badge&logo=Bluesky&logoColor=white)](https://bsky.app/profile/nicolaounicos.bsky.social)
[![Dev.to blog](https://img.shields.io/badge/dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white)](https://dev.to/nicosnicolaou16)
[![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)](https://www.youtube.com/@nicosnicolaou16)
[![Google Developer Profile](https://img.shields.io/badge/Developer_Profile-blue?style=for-the-badge&label=Google)](https://g.dev/nicolaou_nicos)

A modern test implementation for **Wear OS** using **Jetpack Compose**. This project demonstrates how to build a circular/square wearable UI with dynamic lists, dependency injection, and local data persistence.

<p align="center">
  <img src="Screenshot_20231119_123938.png" height="200" width="200" alt="wear_screenshot_1">
  <img src="Screenshot_20231119_124233.png" height="200" width="200" alt="wear_screenshot_2">
</p>

> [!IMPORTANT]  
> Check out the full setup guide here:  
> 👉 **[Standalone Wear OS Application (Setup for Jetpack Compose and Flutter) - Medium](https://medium.com/@nicosnicolaou/standalone-wear-os-application-jetpack-compose-and-flutter-5a37f4775ed8)** 👈

> [!IMPORTANT]
> Similar project (Dart/Flutter version):  
> 👉 **[SampleWearOSWithList (Flutter)](https://github.com/NicosNicolaou16/SampleWearOSWithList)** 👈

## ✨ Key Features & Technologies

*   **[Wear OS Support](https://developer.android.com/training/wearables):** Optimized for smartwatches, focusing on small screen constraints and battery efficiency.
*   **[Jetpack Compose for Wear](https://developer.android.com/training/wearables/compose):** Modern toolkit for building declarative wearable UIs.
*   **[Navigation 3](https://developer.android.com/guide/navigation/navigation-3):** Modern, Compose-native navigation system using serializable destination keys.
*   **[Shared Element Transition](https://developer.android.com/develop/ui/compose/animation/shared-elements):** Beautiful UI animations when moving from list to details.
*   **[Hilt DI](https://developer.android.com/training/dependency-injection/hilt-android):** Simplifies dependency management and ensures a testable architecture.
*   **[Retrofit & Room](https://developer.android.com/training/data-storage/room):** Remote API data fetching with SpaceX API and local caching for offline support.
*   **[MVVM Architecture](https://developer.android.com/topic/architecture):** Clean separation of concerns with Repositories and ViewModels.
*   **[Glide for Compose](https://bumptech.github.io/glide/int/compose.html):** Efficient image loading and caching.
*   **[KSP](https://developer.android.com/build/migrate-to-ksp):** Faster annotation processing for build optimization.
*   **[R8 Optimization](https://developer.android.com/build/shrink-code):** Enabled for code shrinking, obfuscation, and APK size reduction.

## 🛠️ Setup

### Manifest Configuration

For Wear OS apps, you must declare the hardware type and specify if the app is standalone.

```xml

<manifest>

    <uses-feature android:name="android.hardware.type.watch" />

    <application>
        <!--other code here-->

        <!--Optional-->
        <meta-data android:name="com.google.android.wearable.standalone" android:value="true" />

        <!--other code here-->
    </application>
</manifest>
```

> [!IMPORTANT]  
> Check my article for the setup :point_right: [Standalone Wear OS Application (Setup for Jetpack Compose and Flutter) - Medium](https://medium.com/@nicosnicolaou/standalone-wear-os-application-jetpack-compose-and-flutter-5a37f4775ed8) :point_left: <br />

> [!IMPORTANT]
> Similar project with (Dart Language) :point_right: [SampleWearOSWithList](https://github.com/NicosNicolaou16/SampleWearOSWithList) :point_left: <br />


## 🔧 Versioning

- **Target SDK:** **36**
- **Minimum SDK:** **29**
- **Kotlin Version:** **2.3.20**
- **Gradle Version:** **9.1.0**

## 📡 API Reference

This project fetches and parses data from:
- **Source:** [SpaceX-API (GitHub)](https://github.com/r-spacex/SpaceX-API)
- **Documentation:** [Postman Docs](https://docs.spacexdata.com/?version=latest)

## 📚 Resources

- [Official Wear OS Compose Samples](https://github.com/android/wear-os-samples)
- [Compose for Wear OS Codelab](https://developer.android.com/codelabs/compose-for-wear-os)
- [Shared Element Transitions in Compose](https://fvilarino.medium.com/shared-element-transitions-in-jetpack-compose-8f553078101e)

## ⭐ Stargazers

If you find this project useful, please give it a star!
[View Stargazers on GitHub](https://github.com/NicosNicolaou16/SampleWearOSComposeWithList/stargazers)

## 🙏 Support & Contributions

This project is a test implementation. Feedback, bug reports, and feature requests are welcome! Please feel free to **open an issue** or submit a **pull request**.