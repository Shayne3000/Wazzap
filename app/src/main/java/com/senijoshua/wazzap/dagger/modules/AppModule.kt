package com.senijoshua.wazzap.dagger.modules

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Provider

/**
 * Application Module responsible for instantiating and supplying application scope dependencies
 *
 * @author Seni Joshua
 */
@Module(includes = [FragmentBinderModules::class, ViewModelProviderModule::class])
class AppModule {

    @ApplicationScope
    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    /**
     * Factory that uses a given VMKey to search the generated map of <VMKey, Provider> for
     * a specific provider and uses it to instantiate and supply ViewModel instances.
     * The VMKey is the ViewModel class name.
     */
    @ApplicationScope
    @Provides
    fun provideViewModelFactory(providers: Map<Class<out ViewModel>, Provider<ViewModel>>) =
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return requireNotNull(providers[modelClass]).get() as T
            }
        }
}
