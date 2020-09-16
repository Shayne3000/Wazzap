package com.senijoshua.wazzap.dagger.modules.uimodules

import androidx.lifecycle.ViewModel
import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module responsible for injecting provided [ViewModel]s into respective fragments through the
 * AndroidSupportInjector.
 *
 * @author Seni Joshua
 */
@Module(includes = [ViewModelProviderModule::class])
abstract class FragmentModule {

    /**
     * Designate the [ViewModelInjectorModule] as the supplier of the [ConversationListViewModel]
     * to the internal subcomponent that injects it for use in [ConversationListFragment]
     *
     * NB:[ContributesAndroidInjector] adds the [ConversationListFragment] to dagger's graph
     * and generates the AndroidSupportInjection that performs dependency injection in the fragment.
     * This is necessary in order to perform DI in Android Framework classes.
     */
    @ContributesAndroidInjector(modules = [ViewModelInjectorModule::class])
    abstract fun bindConversationListFragment(): ConversationListFragment
}
