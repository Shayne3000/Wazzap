package com.senijoshua.wazzap.dagger.modules.uimodules

import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Module responsible for generating AndroidInjectors for Fragments
 * which performs injection into said fragments through an underlying subcomponent it implements.
 *
 * @author Seni Joshua
 */
@Module
abstract class FragmentModule {

    /**
     * Designate a module as the sole supplier of dependencies i.e ViewModels to the generated
     * AndroidSupportInjector for injection into the given Fragment.
     *
     * NB:[ContributesAndroidInjector] adds the [ConversationListFragment] to dagger's graph
     * and generates the AndroidSupportInjection that performs dependency injection in the fragment.
     * This is necessary in order to perform DI in Android Framework classes.
     */
    @ContributesAndroidInjector(modules = [ViewModelProviderModule::class])
    abstract fun bindConversationListFragment(): ConversationListFragment
}
