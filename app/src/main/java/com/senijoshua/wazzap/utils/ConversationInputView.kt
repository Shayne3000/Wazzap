package com.senijoshua.wazzap.utils

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.LifecycleOwner
import com.getstream.sdk.chat.rest.Message
import com.getstream.sdk.chat.rest.interfaces.MessageCallback
import com.getstream.sdk.chat.rest.response.MessageResponse
import com.getstream.sdk.chat.viewmodel.ChannelViewModel
import com.senijoshua.wazzap.databinding.ViewConversationInputBinding

class ConversationInputView : ConstraintLayout {
    private lateinit var conversationInputView: ViewConversationInputBinding

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    private fun init(context: Context) {
        conversationInputView =
            ViewConversationInputBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun addViewModel(
        viewModel: ChannelViewModel,
        lifecycleOwner: LifecycleOwner?
    ) {
        conversationInputView.lifecycleOwner = lifecycleOwner
        conversationInputView.viewModel = viewModel

        conversationInputView.messageInputSend.setOnClickListener {
            val message = Message()
            message.text = conversationInputView.messageInputEdit.text.toString()

            // send a message to the recipient(s)
            viewModel.sendMessage(message, object : MessageCallback {
                override fun onSuccess(response: MessageResponse?) {
                    viewModel.messageInputText.value = "What's good"
                }

                override fun onError(errMsg: String?, errCode: Int) {
                }
            })
        }

        // Listen to text changes on the edittext
        conversationInputView.messageInputEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(editable: Editable?) {
                val enteredText = editable.toString()
                if (!enteredText.isNullOrBlank())
                    viewModel.keystroke()
            }
        })
    }
}
