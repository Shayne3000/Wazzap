package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.dagger.modules.WazzapViewModelFactory
import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import com.senijoshua.wazzap.utils.annotations.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Module responsible supplying ViewModels gleaned from their Provider counterparts
 * in Dagger's generated map through Dagger Multibindings. The ViewModel keys are
 * bound to their respective [ViewModel]s.
 *
 * @author Seni Joshua
 */
@Module
abstract class ViewModelBindingModule {

    /**
     * Sets the [ConversationListViewModel] type as the associated key for retrieving
     * the provider method in the Dagger generated map that supplies the [ConversationListViewModel]
     * to a fragment's subcomponent for injection into it.
     *
     * It's associating the key of type [ConversationListViewModel]
     * to the [ConversationListViewModel] VM in Dagger's generated map.
     */
    @Binds
    @IntoMap
    @ViewModelKey(ConversationListViewModel::class)
    abstract fun bindConversationListViewModelKey(viewModel: ConversationListViewModel): ViewModel

    /**
     * This sets the [WazzapViewModelFactory] as the [ViewModelProvider.Factory] that would be
     * used for ViewModel creation throughout the app.
     */
    @Binds
    abstract fun provideViewModelFactory(factory: WazzapViewModelFactory): ViewModelProvider.Factory

}
