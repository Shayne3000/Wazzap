package com.senijoshua.wazzap.dagger.modules

import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import com.senijoshua.wazzap.utils.annotations.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

/**
 * Module responsible supplying ViewModels gleaned from their Provider counterparts
 * in Dagger's generated map in facilitating Dagger Multibindings.
 *
 * @author Seni Joshua
 */
@Module
class ViewModelProviderModule {

    /**
     * Set the [ConversationListViewModel] type as the associated key for retrieving
     * the provider method in the generated map that supplies a [ConversationListViewModel]
     * to the fragment's subcomponent for injection
     */
    @Provides
    @IntoMap
    @ViewModelKey(ConversationListViewModel::class)
    fun provideConversationListViewModel() = ConversationListViewModel()

}
