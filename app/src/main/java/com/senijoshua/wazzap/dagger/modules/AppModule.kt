package com.senijoshua.wazzap.dagger.modules

import android.app.Application
import android.content.Context
import com.senijoshua.wazzap.dagger.modules.uimodules.ActivityModule
import com.senijoshua.wazzap.dagger.modules.uimodules.FragmentModule
import com.senijoshua.wazzap.dagger.modules.uimodules.ViewModelBindingModule
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.Module
import dagger.Provides

/**
 * Application Module responsible for instantiating and supplying application scope dependencies
 *
 * @author Seni Joshua
 */
@Module(includes = [ActivityModule::class, FragmentModule::class, ViewModelBindingModule::class])
class AppModule {

    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }
}
