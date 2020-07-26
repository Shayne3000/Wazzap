package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import dagger.Module
import dagger.Provides

/**
 * Module that is responsible for supplying ViewModels
 * to the generated AndroidInjector for injection into bound Fragments using the fragment
 * instance and the [WazzapViewModelFactory].
 *
 * @author Seni Joshua
 */
@Module
class ViewModelProviderModule {

    @Provides
    fun provideConversationListViewModel(
        target: ConversationListFragment,
        factory: ViewModelProvider.Factory
    ): ConversationListViewModel =
        ViewModelProvider(target, factory).get(ConversationListViewModel::class.java)
}
