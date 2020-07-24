package com.senijoshua.wazzap.dagger.modules

import androidx.lifecycle.ViewModelProvider
import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import dagger.Module
import dagger.Provides

/**
 * Module that is responsible for creating ViewModels for injection into Fragments
 * using the bound fragment instance and the supplied ViewModelProvider factory.
 *
 * @author Seni Joshua
 */
@Module
class ViewModelInjectionModule {

    @Provides
    fun supplyConversationListViewModel(
        target: ConversationListFragment,
        factory: ViewModelProvider.Factory
    ): ConversationListViewModel =
        ViewModelProvider(target, factory).get(ConversationListViewModel::class.java)
}
