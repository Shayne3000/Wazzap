package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.presentation.home.chatlist.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.chatlist.ConversationListViewModel
import dagger.Module
import dagger.Provides

/**
 * Module that is responsible for creating ViewModels from the [ViewModelProvider] for use
 * in fragments using the fragment instance and the [WazzapViewModelFactory].
 *
 * @author Seni Joshua
 */
@Module
class ViewModelInjectorModule {

    @Provides
    fun provideConversationListViewModel(
        target: ConversationListFragment,
        factory: ViewModelProvider.Factory
    ): ConversationListViewModel =
        ViewModelProvider(target, factory).get(ConversationListViewModel::class.java)
}
