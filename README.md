# Sample Wear OS Compose With List

The project is a test implementation of Jetpack Compose for a Wear OS app that includes API
requests (dynamic list), Hilt for dependency injection, and Room Database. <br />

<a title="simulator_image"><img src="Screenshot_20231119_123938.png" height="200" width="200"></a>
<a title="simulator_image"><img src="Screenshot_20231119_124233.png" height="200" width="200"></a>

## Similar project with (Dart Language)

https://github.com/NicosNicolaou16/SampleWearOSWithList <br />

# This Project contains:

For Wear OS support <br />
Compose <br />
Hilt <br />
Room Database <br />
Coroutines <br />
Kotlin ktx <br />
MVVM <br />
Support kapt and ksp (ksp only setup for Room Database) <br />
minifyEnabled, shrinkResources, R8 are enabled <br />
Gradle Kotlin DSL <br />
Repository <br />
KSP <br />
Offline <br />

# References/Tutorials Follow/For Manifest Setup

https://medium.com/flutter-community/flutter-building-wearos-app-fedf0f06d1b4 <br />
https://developer.android.com/training/wearables/compose <br />

# Setup in Manifest

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

## Check my article

https://medium.com/@nicosnicolaou/standalone-wear-os-application-jetpack-compose-and-flutter-5a37f4775ed8

# Feeds/Urls/End Point (parsing some data from response)

## (Links References for Ends Points)

https://github.com/r-spacex/SpaceX-API (GitHub) <br />
https://docs.spacexdata.com/?version=latest (Postman) <br />

Target SDK version: 35 <br />
Minimum SDK version: 28 <br />
Kotlin version: 2.0.21 <br />
Gradle version: 8.7.2 <br />