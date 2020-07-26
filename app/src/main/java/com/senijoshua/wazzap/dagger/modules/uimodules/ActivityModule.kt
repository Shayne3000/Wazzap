package com.senijoshua.wazzap.dagger.modules.uimodules

import com.senijoshua.wazzap.presentation.root.WazzapActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module responsible for generating AndroidInjectors for Activities which is used
 * to perform dependency injection into a given Activity
 *
 * @author Seni Joshua
 */
@Module
abstract class ActivityModule {

    /**
     * [ContributesAndroidInjector] is required to perform dependency injection using the
     * AndroidInjector in the [WazzapActivity] as it generates an instance of the injector for
     * said Activity and adds [WazzapActivity] to dagger's graph.
     */
    @ContributesAndroidInjector
    abstract fun bindWazzapActivity(): WazzapActivity
}
