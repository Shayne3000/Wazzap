package com.senijoshua.wazzap.presentation.home.chatlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.getstream.sdk.chat.adapter.ChannelListItemAdapter
import com.getstream.sdk.chat.enums.Filters
import com.getstream.sdk.chat.viewmodel.ChannelListViewModel
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.config.USER_ID
import com.senijoshua.wazzap.databinding.FragmentConversationListBinding
import com.senijoshua.wazzap.presentation.home.HomeFragmentDirections
import com.senijoshua.wazzap.presentation.root.WazzapFragment
import com.senijoshua.wazzap.utils.observeNonNull
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

/**
 * Fragment that holds a list of the various chat conversations.
 *
 * @author Seni Joshua
 */
class ConversationListFragment : WazzapFragment(R.layout.fragment_conversation_list) {
    @Inject lateinit var viewModel: ConversationListViewModel
    @Inject lateinit var channelViewModel: ChannelListViewModel
    var binding: FragmentConversationListBinding? = null
    val conversationListAdapter by lazy { ChannelListItemAdapter(activity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set the android support injector to perform injection of dependencies into the fragment
        AndroidSupportInjection.inject(this)
        // holds all bindings from the layout's variables/data sources to its UI components
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // holds all layout variables, UI components, and the bindings from the layout's
        // variables/data sources to its UI components.
        binding = FragmentConversationListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.lifecycleOwner = this

        binding?.viewModel = channelViewModel

        binding?.conversationList?.setViewModel(channelViewModel, this, conversationListAdapter)

        // query all channels of type messaging
        val filter = Filters.and(
            Filters.eq("type", "messaging"),
            Filters.`in`("members", USER_ID)
        )

        channelViewModel.setChannelFilter(filter)

        binding?.conversationList?.setOnChannelClickListener {
            navController.navigate(HomeFragmentDirections.homeToConversation(it.id, it.type))
        }
    }
}
