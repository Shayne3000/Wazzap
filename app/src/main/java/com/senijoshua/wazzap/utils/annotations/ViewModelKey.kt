package com.senijoshua.wazzap.utils.annotations

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Key used to map ViewModels to their Providers which makes it possible
 * to supply said ViewModel for injection.
 *
 * @author Seni Joshua
 */
@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ViewModelKey(val value: KClass<out ViewModel>)
