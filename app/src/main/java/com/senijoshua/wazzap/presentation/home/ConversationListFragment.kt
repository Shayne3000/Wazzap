package com.senijoshua.wazzap.presentation.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        // set the android injection to perform injection of dependencies into the fragment
        AndroidSupportInjection.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
