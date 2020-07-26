package com.senijoshua.wazzap.dagger

import android.app.Application
import com.senijoshua.wazzap.config.AppConfig
import com.senijoshua.wazzap.dagger.modules.AppModule
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Application component responsible for injecting application scope dependencies
 *
 * @author Seni Joshua
 */
@ApplicationScope
@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AppModule::class
])
interface AppComponent {

    fun initFieldInjection(app: AppConfig)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        /**
         * Bind this application instance to the AppComponent/Dagger graph
         * as the app within which the AppComponent would perform DI.
         */
        @BindsInstance
        fun application(application: Application): Builder
    }
}
