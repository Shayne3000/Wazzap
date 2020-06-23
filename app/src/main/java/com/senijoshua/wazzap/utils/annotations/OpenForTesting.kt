package com.senijoshua.wazzap.utils.annotations

/**
 * This annotation changes the modifier of a kotlin class
 * from final to open in order to mock Kotlin classes in unit tests.
 * 
 * @author Seni Joshua
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class OpenForTesting
