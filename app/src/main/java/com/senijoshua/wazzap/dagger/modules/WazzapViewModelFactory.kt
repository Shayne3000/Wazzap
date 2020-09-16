package com.senijoshua.wazzap.dagger.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import java.lang.ClassCastException
import javax.inject.Inject
import javax.inject.Provider

/**
 * [ViewModelProvider.Factory] subclass that uses a given VMKey to search the generated
 * map of <VMKey, Provider> for a specific provider and uses it to instantiate and
 * supply ViewModel instances. The VMKey is the ViewModel class name.
 *
 * @author Seni Joshua
 */
class WazzapViewModelFactory(
    private val providers: Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        requireNotNull(getProvider(modelClass).get()) {
            "Provider for $modelClass returned null"
        }

    @Suppress("UNCHECKED_CAST")
    private fun <T : ViewModel> getProvider(viewModelClass: Class<T>): Provider<T> =
        try {
            requireNotNull(providers[viewModelClass] as Provider<T>) {
                "No ViewModel provider is associated with the key $viewModelClass"
            }
        } catch (e: ClassCastException) {
            error("Wrong provider type registered for ViewModel type $viewModelClass")
        }
}
