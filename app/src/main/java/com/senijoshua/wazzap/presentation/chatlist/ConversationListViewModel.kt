package com.senijoshua.wazzap.presentation.chatlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.senijoshua.wazzap.utils.annotations.OpenForTesting

/**
 * ViewModel that stores and manages the conversation list and proffers it to the view
 * through a LiveData observable.
 *
 * @author Seni Joshua
 */
@OpenForTesting
class ConversationListViewModel() : ViewModel() {
    private val conversationMutableList: MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            loadConversations()
        }
    }
    val conversationList: LiveData<String> = conversationMutableList

    val toolbarTitle: LiveData<String> = MutableLiveData<String> ("Super")

    private fun loadConversations() {
        // TODO Call the repository and ask it to load the
        //  conversation list using the DB as a source of truth
    }
}
