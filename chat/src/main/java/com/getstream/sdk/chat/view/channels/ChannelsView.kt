package com.getstream.sdk.chat.view.channels

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.TextView
import com.getstream.sdk.chat.R
import com.getstream.sdk.chat.adapter.ChannelViewHolderFactory
import com.getstream.sdk.chat.view.channels.ChannelListView.ChannelClickListener
import com.getstream.sdk.chat.view.common.visible
import io.getstream.chat.android.client.models.Channel

private val LOADING_VIEW_ID = R.id.channels_loading_view_id
private val EMPTY_STATE_VIEW_ID = R.id.channels_empty_state_view_id
private val CHANNEL_LIST_VIEW_ID = R.id.channels_list_view_id

class ChannelsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private var emptyStateView: View = defaultEmptyStateView()
    private var loadingView: View = defaultLoadingView()
    private val channelListView: ChannelListView = ChannelListView(context, attrs, defStyleAttr).apply { id = CHANNEL_LIST_VIEW_ID }

    init {
        addView(channelListView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
        emptyStateView.apply {
            visible(false)
            addView(this, defaultChildLayoutParams())
        }
        loadingView.apply {
            visible(false)
            addView(loadingView, defaultChildLayoutParams())
        }
    }

    fun setEmptyStateView(view: View, layoutParams: LayoutParams = defaultChildLayoutParams()) {
        removeView(this.emptyStateView)
        this.emptyStateView = view.apply { id = EMPTY_STATE_VIEW_ID }
        addView(emptyStateView, layoutParams)
    }

    fun setLoadingView(view: View, layoutParams: LayoutParams = defaultChildLayoutParams()) {
        removeView(this.loadingView)
        this.loadingView = view.apply { id = LOADING_VIEW_ID }
        addView(loadingView, layoutParams)
    }

    fun setViewHolderFactory(factory: ChannelViewHolderFactory) {
        this.channelListView.setViewHolderFactory(factory)
    }

    fun setOnChannelClickListener(listener: (Channel) -> Unit) {
        channelListView.setOnChannelClickListener(listener)
    }

    fun setOnLongClickListener(listener: ChannelClickListener) {
        channelListView.setOnLongClickListener(listener)
    }

    fun setOnEndReachedListener(listener: () -> Unit) {
        channelListView.setOnEndReachedListener(listener)
    }

    fun setChannels(channels: List<Channel>) {
        channelListView.setChannels(channels)
    }

    fun hideLoadingView() {
        this.loadingView.visible(false)
    }

    fun showLoadingView() {
        this.loadingView.visible(true)
    }

    fun showEmptyStateView() {
        this.emptyStateView.visible(true)
    }

    fun hideEmptyStateView() {
        this.emptyStateView.visible(false)
    }

    private fun defaultChildLayoutParams() =
        LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, Gravity.CENTER)

    private fun defaultLoadingView(): View = ProgressBar(context).apply {
        id = LOADING_VIEW_ID
    }

    private fun defaultEmptyStateView(): View = TextView(context).apply {
        setText(R.string.stream_channels_empty_state_label)
        id = EMPTY_STATE_VIEW_ID
    }
}
