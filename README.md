# The project is a test project that implements and test Jetpack Compose for Wear OS app with API request (dynamic list), Hilt and Room Database.

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

# Feeds/Urls/End Point (parsing some data from response)
## (Links References for Ends Points)
https://github.com/r-spacex/SpaceX-API (GitHub) <br />
https://docs.spacexdata.com/?version=latest (Postman) <br />

Target SDK version: 34 <br />
Minimum SDK version: 27 <br />
Kotlin version: 1.9.10 <br />
Gradle version: 8.1.2 <br />