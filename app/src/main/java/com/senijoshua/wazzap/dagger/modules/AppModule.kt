package com.senijoshua.wazzap.dagger.modules

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.getstream.sdk.chat.StreamChat
import com.getstream.sdk.chat.rest.core.Client
import com.senijoshua.wazzap.dagger.modules.uimodules.ActivityModule
import com.senijoshua.wazzap.dagger.modules.uimodules.FragmentModule
import com.senijoshua.wazzap.utils.ChatIgnition
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Provider

/**
 * Application Module responsible for instantiating and supplying application scope dependencies
 *
 * @author Seni Joshua
 */
@Module(includes = [ActivityModule::class, FragmentModule::class])
class AppModule {

    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @ApplicationScope
    fun provideStreamChat(application: Application): Client {
        val configuration =
            StreamChat.Config(application.applicationContext, ChatIgnition.getClient())
        StreamChat.init(configuration)
        return StreamChat.getInstance(application.applicationContext)
    }

    /**
     * This sets the [WazzapViewModelFactory] as the [ViewModelProvider.Factory] that would be
     * used for ViewModel creation throughout the app.
     */
    @Provides
    fun provideViewModelFactory(
        providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ): ViewModelProvider.Factory = WazzapViewModelFactory(providers)
}
