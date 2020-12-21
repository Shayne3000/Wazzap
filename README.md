# Wazzap
Wazzap is a WhatsApp clone built using [Jetpack Components](https://developer.android.com/jetpack), the [Stream Chat API](https://getstream.io/), and other modern Android Development techniques. Wazzap was inspired by the [WhatsApp clone](https://getstream.io/blog/build-whatsapp-clone/) created by the GetStream Team.

## Building Blocks
Wazzap was written in Kotlin and Java. It uses a single-activity architecture in tandem with a modular structural paradigm. It also employs a bevy of other tools, plugins, and libraries from the Jetpack suite; and the Android ecosystem at large. These are listed below:

### Libraries
- [Jetpack][0]:
    - Foundation - Components for core system capabilities, Kotlin extensions and support for multidex and automated testing.
       - [Android KTX][2] - provide concise, idiomatic Kotlin to Jetpack and Android platform APIs.
       - [AndroidX][1] - an improvement on the [Android Support Library][5].
       
    - [Architecture][16]- a collection of libraries that help design robust, testable, and maintainable apps.
       - [DataBinding][17] - declaratively bind data sources to UI components in a layout. 
       - [Navigation][18] - handles everything to do with navigation within the single activity.
       - [Lifecycle][19] - attaches lifecycle-aware capabilities to architecture components.
       - [LiveData][20] - a lifecycle-aware, observable data holding component.
       - [ViewModel][21] - stores and manages UI-related data in a lifecycle-conscious manner. It also retains its data through configuration changes like screen rotations.
      
    - UI - User-interface components from Jetpack used for building 
       - [AndroidX Kotlin Fragment][11] - a Kotlin implementation of a Fragment from the AndroidX Fragment Library.
       - [AndroidX Kotlin Activity][12] - a Kotlin implementation of an Activity from the AndroidX Acivity Library.
       - [AppCompat][14]- Provides backward compatibility across older Android releases i.e. allows access to new APIs on older API versions of the platform (many using Material Design).
       - [Material Design Components][15] - Modular and customizable Material Design UI components for Android.
   
* [Dagger2][5] for dependency injection
* [Glide][6] for image loading.
* [OkHttp][7] is an efficient HTTP client for executing network requests and receiving network responses.

### Plugins
Several other 3rd party plugins and dependencies are used in this project, some of which are:
-   [Ktlint][8] - an anti-bikeshedding Kotlin linter with built-in formatter.
-   [Versions][9] - a plugin that indicates the dependencies in one's gradle configuration file that have version updates.
-   [SafeArgs][10] - generates simple object and builder classes for type-safe navigation and provides access to any related arguments.
- [and others...][13]


[0]: https://developer.android.com/jetpack
[1]: https://developer.android.com/jetpack/androidx
[2]: https://developer.android.com/kotlin/ktx
[3]: https://developer.android.com/training/testing/
[4]: https://developer.android.com/topic/libraries/support-library/index
[5]: https://google.github.io/dagger/
[6]: https://bumptech.github.io/glide/
[7]: https://square.github.io/okhttp/
[8]: https://github.com/pinterest/ktlint
[9]: https://github.com/ben-manes/gradle-versions-plugin
[10]: https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args
[11]: https://developer.android.com/guide/fragments/create
[12]: https://developer.android.com/jetpack/androidx/releases/activity
[13]: https://github.com/Shayne3000/Wazzap/blob/master/buildSrc/src/main/java/DependencyManager.kt
[14]: https://developer.android.com/jetpack/androidx/releases/appcompat
[15]: https://material.io/components?platform=android
[16]: https://developer.android.com/topic/libraries/architecture
[17]: https://developer.android.com/topic/libraries/data-binding
[18]: https://developer.android.com/guide/navigation
[19]: https://developer.android.com/topic/libraries/architecture/lifecycle
[20]: https://developer.android.com/topic/libraries/architecture/livedata
[21]: https://developer.android.com/topic/libraries/architecture/viewmodel

## License 

Copyright (C) 2020 Seni Joshua.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

