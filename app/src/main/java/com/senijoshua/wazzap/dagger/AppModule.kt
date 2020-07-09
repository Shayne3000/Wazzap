package com.senijoshua.wazzap.dagger

import android.app.Application
import android.content.Context
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.Module
import dagger.Provides

/**
 * Application Module responsible for instantiating and supplying application scope dependencies
 *
 * @author Seni Joshua
 */
@Module
class AppModule {

    @ApplicationScope
    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }
}
