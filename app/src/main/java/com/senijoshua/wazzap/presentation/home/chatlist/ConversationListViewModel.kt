package com.senijoshua.wazzap.presentation.home.chatlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.getstream.sdk.chat.enums.FilterObject
import com.getstream.sdk.chat.enums.Filters
import com.senijoshua.wazzap.config.USER_ID
import com.senijoshua.wazzap.utils.annotations.OpenForTesting

/**
 * ViewModel that stores and manages the conversation list and proffers it to the view
 * through a LiveData observable.
 *
 * @author Seni Joshua
 */
@OpenForTesting
class ConversationListViewModel() : ViewModel() {
    private val conversationMutableList: MutableLiveData<FilterObject?> by lazy {
        MutableLiveData<FilterObject?>().also {
            loadConversations()
        }
    }
    val conversationList: LiveData<FilterObject?> = conversationMutableList

    /**
     * Query all channels of type messaging
     */
    private fun loadConversations(): FilterObject? {
        return Filters.and(
            Filters.eq("type", "messaging"),
            Filters.`in`("members", USER_ID)
        )
    }
}
