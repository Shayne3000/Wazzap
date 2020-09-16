package com.senijoshua.wazzap.dagger.modules.uimodules

import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.ConversationListViewModel
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module responsible for generating AndroidInjectors for fragments
 * which performs injection into said fragments through the underlying subcomponent it implements.
 *
 * @author Seni Joshua
 */
@Module(includes = [ViewModelProviderModule::class])
abstract class FragmentModule {

    /**
     * Designate the [ViewModelInjectorModule] as the supplier of the [ConversationListViewModel]
     * injected into the given Fragment through the internal subcomponent
     *
     * NB:[ContributesAndroidInjector] adds the [ConversationListFragment] to dagger's graph
     * and generates the AndroidSupportInjection that performs dependency injection in the fragment.
     * This is necessary in order to perform DI in Android Framework classes.
     */
    @ContributesAndroidInjector(modules = [ViewModelInjectorModule::class])
    abstract fun bindConversationListFragment(): ConversationListFragment
}
