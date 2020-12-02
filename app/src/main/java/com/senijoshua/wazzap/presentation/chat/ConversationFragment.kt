package com.senijoshua.wazzap.presentation.chat

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.fragment.navArgs
import com.getstream.sdk.chat.rest.core.Client
import com.getstream.sdk.chat.viewmodel.ChannelViewModel
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.databinding.FragmentConversationBinding
import com.senijoshua.wazzap.presentation.root.WazzapFragment
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_conversation.*
import javax.inject.Inject

class ConversationFragment : WazzapFragment(R.layout.fragment_conversation) {

    @Inject lateinit var client: Client
    @Inject lateinit var channelViewModel: ChannelViewModel
    private val fragmentArgs: ConversationFragmentArgs by navArgs()
    private lateinit var layoutDataBinding: FragmentConversationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_fragment_conversation, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            navController.navigateUp()
            return true
        }
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutDataBinding = FragmentConversationBinding.bind(view)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Instead of using kotlin android extensions for synthetic binding,
        // we use data binding to access the layout elements.
        rootActivity.setSupportActionBar(layoutDataBinding.conversationToolbar)

        // Whenever this fragment destination is swapped in to the navhost, we basically
        // tell the containing activity to implement certain behaviours on the action bar and those
        // remain for as long as this fragment is in the navhost.
        val supportActionBar = rootActivity.supportActionBar

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        layoutDataBinding.lifecycleOwner = this

        val channel = client.channel(fragmentArgs.conversationType, fragmentArgs.conversationId)

        channelViewModel.channel = channel

        layoutDataBinding.chatViewModel = channelViewModel

        layoutDataBinding.conversationThreadList.setViewModel(channelViewModel, this)
        layoutDataBinding.conversationInput.addViewModel(channelViewModel, this)

        layoutDataBinding.conversationAvatar.setChannelAndLastActiveUsers(
            channel,
            channel.channelState.otherUsers,
            conversation_thread_list.style
        )

        layoutDataBinding.conversationRecipient.text = channel.name
    }
}
