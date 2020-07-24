package com.senijoshua.wazzap.dagger.modules

import com.senijoshua.wazzap.presentation.home.ConversationListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module responsible for generating an AndroidInjector for a given Fragment and binding those
 * fragment instances to subcomponents implemented by the generated AndroidInjector
 * for performing injection in said fragments.
 * @author Seni Joshua
 */
@Module
abstract class FragmentBinderModules {

    /**
     * Input a Module that creates and supplies a specific ViewModel into the implemented
     * subcomponent for injection in the bound Fragment instance. The module has acccess
     * to the bound Fragment instance and is the designated module for dependency supply in the
     * subcomponent
     */
    @ContributesAndroidInjector(modules = [ViewModelInjectionModule::class])
    abstract fun bindConversationListFragment(): ConversationListFragment
}

