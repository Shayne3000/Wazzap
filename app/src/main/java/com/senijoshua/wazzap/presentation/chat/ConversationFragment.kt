package com.senijoshua.wazzap.presentation.chat

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.databinding.FragmentConversationBinding
import com.senijoshua.wazzap.presentation.root.WazzapFragment

class ConversationFragment : WazzapFragment(R.layout.fragment_conversation) {

    private lateinit var layoutDataBinding: FragmentConversationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_fragment_conversation, menu)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutDataBinding = FragmentConversationBinding.bind(view)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
}
