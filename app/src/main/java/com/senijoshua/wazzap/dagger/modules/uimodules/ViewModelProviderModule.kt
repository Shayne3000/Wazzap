package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModel
import com.getstream.sdk.chat.viewmodel.ChannelListViewModel
import com.getstream.sdk.chat.viewmodel.ChannelViewModel
import com.senijoshua.wazzap.config.AppConfig
import com.senijoshua.wazzap.presentation.home.HomeViewModel
import com.senijoshua.wazzap.presentation.home.chatlist.ConversationListViewModel
import com.senijoshua.wazzap.utils.annotations.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


/**
 * Module responsible for instantiating and provisioning [ViewModel] instances
 * for injection into any fragment.
 *
 * @author Seni Joshua
 */
@Module
class ViewModelProviderModule {

    /**
     * Sets the [ConversationListViewModel] type as the associated key for retrieving
     * the provider method in the Dagger generated map that is bound to the
     * [ConversationListViewModel] instance.
     *
     * It's associating the key of type [ConversationListViewModel]
     * to the [ConversationListViewModel] VM in Dagger's generated map.
     */
    @Provides
    @IntoMap
    @ViewModelKey(ConversationListViewModel::class)
    fun provideConversationListViewModel(): ViewModel = ConversationListViewModel()

    @Provides
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun provideHomeViewModel(): ViewModel = HomeViewModel()

    @Provides
    @IntoMap
    @ViewModelKey(ChannelListViewModel::class)
    fun provideChannelListViewModel(): ViewModel = ChannelListViewModel(AppConfig.appInstance!!)

    @Provides
    @IntoMap
    @ViewModelKey(ChannelViewModel::class)
    fun provideChannelViewModel(): ViewModel = ChannelViewModel(AppConfig.appInstance!!)
}
