import org.gradle.api.JavaVersion

object SDKConfig {
    const val minSdk = 21
    const val compileSdk = 30
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0"
    val javaVersion = JavaVersion.VERSION_1_8
}

object Version {
    const val navigation = "2.3.0"
    const val retrofit = "2.6.2"
    const val moshi = "1.9.2"
    const val dagger = "2.25.2"
    const val room = "2.2.5"
    const val lifecycle = "2.2.0"
    const val glide = "4.11.0"
    const val okhttp = "4.2.1"
    const val archCoreTesting = "2.1.0"

    const val kotlin = "1.4.10"
    const val gradle = "4.0.2"

    const val junit = "4.12"
    const val androidx_espresso = "3.1.0"
    const val androidx_testing = "1.1.1"
}

object Plugins {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.gradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val kotlinAllOpenGradlePlugin = "org.jetbrains.kotlin:kotlin-allopen:${Version.kotlin}"
    const val navigationSafeArgsGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigation}"

    // chat-module-specific plugins
    const val androidMavenGradlePlugin =
        "com.github.dcendents:android-maven-gradle-plugin:$ANDROID_MAVEN_GRADLE_PLUGIN_VERSION"
    const val googleServicesPlugin = "com.google.gms:google-services:$GOOGLE_SERVICES_VERSION"
    const val mannodermaus = "de.mannodermaus.gradle.plugins:android-junit5:1.5.1.0"
    const val jacoco = "com.hiya:jacoco-android:$JACOCO_VERSION"
}

object Libraries {
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"

    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val navigationFrag =
        "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"

    const val androidKTXCore = "androidx.core:core-ktx:1.3.2"
    const val androidKTXActivity = "androidx.activity:activity-ktx:1.1.0"
    const val androidKTXFragment = "androidx.fragment:fragment-ktx:1.2.5"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.2"
    const val materialComponents = "com.google.android.material:material:1.2.1"

    const val rxJava2 = "io.reactivex.rxjava2:rxjava:2.2.17"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
    const val room = "androidx.room:room-runtime:${Version.room}"
    const val roomCoroutinesSupport = "androidx.room:room-ktx:${Version.room}"
    const val roomRxJavaSupport = "androidx.room:room-rxjava2:${Version.room}"
    const val viewModelAndLiveData = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
    const val java8IncrementalBuildProcessor =
        "androidx.lifecycle:lifecycle-common-java8:${Version.lifecycle}"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"

    const val dagger = "com.google.dagger:dagger:${Version.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Version.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Version.dagger}"
    const val daggerKaptCompiler = "com.google.dagger:dagger-compiler:${Version.dagger}"
    const val daggerKaptProcessor = "com.google.dagger:dagger-android-processor:${Version.dagger}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
    const val moshi = "com.squareup.moshi:moshi:${Version.moshi}"
    const val moshiCodegenKapt = "com.squareup.moshi:moshi-kotlin-codegen:${Version.moshi}"
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val glideKapt = "com.github.bumptech.glide:compiler:${Version.glide}"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:${Version.glide}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okhttp}"
    const val okHttpLogInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttp}"

    const val junit = "junit:junit:4.12"
    const val testAssertions = "androidx.test.ext:junit:1.1.2"
    const val liveDataTestHelpers = "androidx.arch.core:core-testing:${Version.archCoreTesting}"
    const val androidJunitTestRunner = "androidx.test:runner:1.3.0"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}


// Chat module dependency constants //
private const val ACTIVITY_KTX_VERSION = "1.2.0-alpha07"
private const val ANDROID_BUILD_TOOL_VERSION = "4.0.1"
private const val ANDROID_JUNIT5_GRADLE_PLUGIN_VERSION = "1.6.2.0"
private const val ANDROID_MAVEN_GRADLE_PLUGIN_VERSION = "2.1"
private const val ANDROID_LEGACY_SUPPORT = "1.0.0"
private const val ANDROIDX_CORE_TEST_VERSION = "2.1.0"
private const val ANDROIDX_MEDIA_VERSION = "1.1.0"
private const val ANDROID_X_KTX_VERSION = "1.3.1"
private const val APP_COMPAT_VERSION = "1.1.0"
private const val COIL_VERSION = "0.11.0"
private const val CONSTRAINT_LAYOUT_VERSION = "2.0.0"
private const val COROUTINES_VERSION = "1.3.8"
private const val DEXTER_VERSION = "6.2.1"
private const val DOKKA_VERSION = "0.10.1"
private const val DRAWABLETOOLBOX_VERSION = "1.0.7"
private const val EXOPLAYER_VERSION = "2.12.0"
private const val FIREBASE_ANALYTICS_VERSION = "17.4.4"
private const val FIREBASE_CRASHLYTICS_VERSION = "17.1.1"
private const val FIREBASE_MESSAGING_VERSION = "20.2.4"
private const val FIREBASE_PLUGIN_VERSION = "2.2.0"
private const val FRAGMENT_KTX_VERSION = "1.3.0-alpha07"
private const val FRESCO_VERSION = "2.3.0"
private const val GITVERSIONER_VERSION = "0.5.0"
private const val GLIDE_VERSION = "4.11.0"
private const val GLIDE_REDIRECT_VERSION = "2.0.1"
private const val GOOGLE_SERVICES_VERSION = "4.3.3"
private const val GRADLE_VERSIONS_PLUGIN = "0.29.0"
private const val GSON_VERSION = "2.8.6"
private const val JACOCO_VERSION = "0.2"
private const val JUNIT5_VERSION = "5.6.2"
private const val KEYBOARD_VISIBILITY_EVENT_VERSION = "2.3.0"
private const val KLUENT_VERSION = "1.61"
private const val KOIN_VERSION = "2.1.6"
private const val KOTLIN_VERSION = "1.4.10"
private const val KTLINT_VERSION = "9.3.0"
private const val LEAK_CANARY_VERSION = "2.4"
private const val LIFECYCLE_EXTENSION_VERSION = "2.2.0"
private const val LIFECYCLE_VIEWMODEL_KTX_VERSION = "2.2.0"
private const val MATERIAL_COMPONENTS_VERSION = "1.1.0"
private const val MARWON_VERSION = "4.4.0"
private const val MOKITO_KOTLIN_VERSION = "2.2.0"
private const val MOKITO_VERSION = "3.4.6"
private const val NAVIGATION_VERSION = "2.3.0"
private const val OKHTTP_VERSION = "4.8.0"
private const val PHOTODRAWEEVIEW_VERSION = "1.1.0"
private const val PREFERENCES_VERSION = "1.1.1"
private const val TIMBER_VERSION = "4.7.1"
private const val RECYCLERVIEW_VERSION = "1.2.0-alpha05"
private const val RETROFIT_VERSION = "2.9.0"
private const val ROOM_VERSION = "2.2.5"
private const val STREAM_LIVEDATA_VERSION = "0.8.5"

object ChatLibraries {
    const val activityKtx = "androidx.activity:activity-ktx:$ACTIVITY_KTX_VERSION"
    const val androidBuildToolGradlePlugin = "com.android.tools.build:gradle:$ANDROID_BUILD_TOOL_VERSION"
    const val androidJunit5GradlePlugin = "de.mannodermaus.gradle.plugins:android-junit5:$ANDROID_JUNIT5_GRADLE_PLUGIN_VERSION"
    const val androidMavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:$ANDROID_MAVEN_GRADLE_PLUGIN_VERSION"
    const val androidLegacySupport = "androidx.legacy:legacy-support-v4:$ANDROID_LEGACY_SUPPORT"
    const val androidxCoreTest = "androidx.arch.core:core-testing:$ANDROIDX_CORE_TEST_VERSION"
    const val androidXKTX = "androidx.core:core-ktx:$ANDROID_X_KTX_VERSION"
    const val androidxMedia = "androidx.media:media:$ANDROIDX_MEDIA_VERSION"
    const val appCompat = "androidx.appcompat:appcompat:$APP_COMPAT_VERSION"
    const val coil = "io.coil-kt:coil:$COIL_VERSION"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_VERSION"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$CONSTRAINT_LAYOUT_VERSION"
    const val dexter = "com.karumi:dexter:$DEXTER_VERSION"
    const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:$DOKKA_VERSION"
    const val drawabletoolbox = "com.github.duanhong169:drawabletoolbox:$DRAWABLETOOLBOX_VERSION"
    const val exoplayerCore = "com.google.android.exoplayer:exoplayer-core:$EXOPLAYER_VERSION"
    const val exoplayerDash = "com.google.android.exoplayer:exoplayer-dash:$EXOPLAYER_VERSION"
    const val exoplayerHls = "com.google.android.exoplayer:exoplayer-hls:$EXOPLAYER_VERSION"
    const val exoplayerSmoothstreaming = "com.google.android.exoplayer:exoplayer-smoothstreaming:$EXOPLAYER_VERSION"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx:$FIREBASE_ANALYTICS_VERSION"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:$FIREBASE_CRASHLYTICS_VERSION"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging:$FIREBASE_MESSAGING_VERSION"
    const val firebasePlugin = "com.google.firebase:firebase-crashlytics-gradle:$FIREBASE_PLUGIN_VERSION"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$FRAGMENT_KTX_VERSION"
    const val fresco = "com.facebook.fresco:fresco:$FRESCO_VERSION"
    const val gitversionerPlugin = "com.pascalwelsch.gitversioner:gitversioner:$GITVERSIONER_VERSION"
    const val glide = "com.github.bumptech.glide:glide:$GLIDE_VERSION"
    const val glideCompiler = "com.github.bumptech.glide:compiler:$GLIDE_VERSION"
    const val glideRedirect = "com.aminography:redirectglide:$GLIDE_REDIRECT_VERSION"
    const val googleServicesPlugin = "com.google.gms:google-services:$GOOGLE_SERVICES_VERSION"
    const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:$GRADLE_VERSIONS_PLUGIN"
    const val gson = "com.google.code.gson:gson:$GSON_VERSION"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
    const val jacoco = "com.hiya:jacoco-android:$JACOCO_VERSION"
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:$JUNIT5_VERSION"
    const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:$JUNIT5_VERSION"
    const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$JUNIT5_VERSION"
    const val keyboardVisibilityEvent = "net.yslibrary.keyboardvisibilityevent:keyboardvisibilityevent:$KEYBOARD_VISIBILITY_EVENT_VERSION"
    const val kluent = "org.amshove.kluent:kluent:$KLUENT_VERSION"
    const val koinAndroidxExt = "org.koin:koin-androidx-ext:$KOIN_VERSION"
    const val koinAndroidxScope = "org.koin:koin-androidx-scope:$KOIN_VERSION"
    const val koinAndroidxViewmodel = "org.koin:koin-androidx-viewmodel:$KOIN_VERSION"
    const val koinCore = "org.koin:koin-core:$KOIN_VERSION"
    const val koinCoreExt = "org.koin:koin-core-ext:$KOIN_VERSION"
    const val koinTest = "org.koin:koin-test:$KOIN_VERSION"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    const val kotlinSTDLib = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
    const val ktlintPlugin = "org.jlleitschuh.gradle:ktlint-gradle:$KTLINT_VERSION"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$LEAK_CANARY_VERSION"
    const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_EXTENSION_VERSION"
    const val lifecycleViewModelKTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VIEWMODEL_KTX_VERSION"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"
    const val materialComponents = "com.google.android.material:material:$MATERIAL_COMPONENTS_VERSION"
    const val marwonCore = "io.noties.markwon:core:$MARWON_VERSION"
    const val marwonLinkify = "io.noties.markwon:linkify:$MARWON_VERSION"
    const val marwonextStrikethrough = "io.noties.markwon:ext-strikethrough:$MARWON_VERSION"
    const val marwonImage = "io.noties.markwon:image:$MARWON_VERSION"
    const val mockito = "org.mockito:mockito-core:$MOKITO_VERSION"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:$MOKITO_KOTLIN_VERSION"
    const val navigationFragmentKTX = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
    const val navigationSafeArgsGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$NAVIGATION_VERSION"
    const val navigationRuntimeKTX = "androidx.navigation:navigation-runtime-ktx:$NAVIGATION_VERSION"
    const val navigationUIKTX = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"
    const val okhttp = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
    const val photodraweeview = "me.relex:photodraweeview:$PHOTODRAWEEVIEW_VERSION"
    const val preferences = "androidx.preference:preference:$PREFERENCES_VERSION"
    const val timber = "com.jakewharton.timber:timber:$TIMBER_VERSION"
    const val recyclerview = "androidx.recyclerview:recyclerview:$RECYCLERVIEW_VERSION"
    const val retrofit = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val roomRuntime = "androidx.room:room-runtime:$ROOM_VERSION"
    const val streamLivedata = "com.github.getstream:stream-chat-android-livedata:$STREAM_LIVEDATA_VERSION"

    @JvmStatic
    fun isNonStable(version: String): Boolean = isStable(version).not()

    @JvmStatic
    fun isStable(version: String): Boolean = ("^[0-9.]+$").toRegex().matches(version)
}
