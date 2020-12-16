# Wazzap
Wazzap is a WhatsApp clone built using [Jetpack Components](https://developer.android.com/jetpack), the [Stream Chat API](https://getstream.io/), and other modern Android Development techniques. Wazzap was inspired by the WhatsApp clone created by the [GetStream Team](https://getstream.io/blog/build-whatsapp-clone/).

## Building Blocks
Wazzap was written in Kotlin and Java. It uses a Single-Activity model in tandem with a Modular structural paradigm architectural pattern, along with a bevy of tools, paradigms, plugins and libraries from the Jetpack suite and the Android ecosystem at large. These are listed below:

### Libraries
- [Jetpack][0]:
    - Foundation - Components for core system capabilities, Kotlin extensions and support for multidex and automated testing.
       - [Android KTX][2] - provide concise, idiomatic Kotlin to Jetpack and Android platform APIs.
       - [AndroidX][1] -  an improvement on the [Android Support Library][5] that provides backward compatibility across older Android versions.
   
* [Dagger2][5] for dependency injection
* [Glide][6] for image loading.
* [OkHttp][7] is an efficient HTTP client for executing network requests and receiving network responses.

### Plugins
-   [Ktlint][8] - an anti-bikeshedding Kotlin linter with built-in formatter.
-   [Versions][9] - a plugin that indicates the dependencies in one's gradle configuration file that have version updates.
-   [SafeArgs][10] - generates simple object and builder classes for type-safe navigation and provides access to any related arguments.
- [amongst others...](https://github.com/Shayne3000/Wazzap/blob/master/buildSrc/src/main/java/DependencyManager.kt)


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

