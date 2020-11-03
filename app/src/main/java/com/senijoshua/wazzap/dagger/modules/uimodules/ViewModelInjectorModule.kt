package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModelProvider
import com.getstream.sdk.chat.viewmodel.ChannelListViewModel
import com.senijoshua.wazzap.presentation.home.HomeFragment
import com.senijoshua.wazzap.presentation.home.HomeViewModel
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
    fun initConversationListViewMode(
        target: ConversationListFragment,
        factory: ViewModelProvider.Factory
    ): ConversationListViewModel =
        ViewModelProvider(target, factory).get(ConversationListViewModel::class.java)

    @Provides
    fun initHomeViewModel(target: HomeFragment, factory: ViewModelProvider.Factory) =
        ViewModelProvider(target, factory).get(HomeViewModel::class.java)

    @Provides
    fun initChannelListViewModel(
        target: ConversationListFragment,
        factory: ViewModelProvider.Factory
    ) = ViewModelProvider(target, factory).get(ChannelListViewModel::class.java)
}
