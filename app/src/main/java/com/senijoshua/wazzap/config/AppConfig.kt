package com.senijoshua.wazzap.config

import android.app.Application
import android.content.Context
import com.senijoshua.wazzap.dagger.AppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/**
 *  Application subclass that contains the setup and initialisation of
 *  3rd-party libraries and other components with application scope.
 *
 * @author Seni Joshua
 */
class AppConfig : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        //Initialise dagger/base app component here and
        //Then initialise field injection in the application class
    }

    /**
     * Returns the injected Android Injector from dagger that will be used
     * for performing field injection in Android framework classes.
     */
    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    companion object {
        var appInstance: Application? = null
        var appComponent: AppComponent? = null
        var applicationContext: Context = appInstance!!.applicationContext
    }
}
