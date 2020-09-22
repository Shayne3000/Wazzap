package com.senijoshua.wazzap.presentation.chatlist

import android.os.Bundle
import android.view.View
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.presentation.root.WazzapFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

/**
 * Fragment that holds a list of the various chat conversations that are currently active
 *
 * @author Seni Joshua
 */
class ConversationListFragment : WazzapFragment(R.layout.fragment_conversation_list) {
    @Inject lateinit var viewModel: ConversationListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set the android support injector to perform injection of dependencies into the fragment
        AndroidSupportInjection.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //navController.navigate(R.id.conversation_list_to_conversation_details)
    }
}
