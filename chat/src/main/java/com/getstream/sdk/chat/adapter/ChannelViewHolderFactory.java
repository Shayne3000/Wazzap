package com.getstream.sdk.chat.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.getstream.sdk.chat.MarkdownImpl;
import com.getstream.sdk.chat.model.Channel;
import com.getstream.sdk.chat.view.ChannelListViewStyle;

/**
 * Allows you to easily customize channel rendering
 */
public class ChannelViewHolderFactory {
    public static int CHANNEL_GENERAL = 0;

    public int getChannelViewType(Channel channel) {
        return CHANNEL_GENERAL;
    }

    protected void configureHolder(BaseChannelListItemViewHolder holder, ChannelListItemAdapter adapter) {
        holder.setStyle(adapter.getStyle());
        holder.setMarkdownListener(MarkdownImpl.getMarkdownListener());
        holder.setChannelClickListener(adapter.getChannelClickListener());
        holder.setChannelLongClickListener(adapter.getChannelLongClickListener());
        holder.setUserClickListener(adapter.getUserClickListener());
    }

    public BaseChannelListItemViewHolder createChannelViewHolder(ChannelListItemAdapter adapter, ViewGroup parent, int viewType) {
        // get the style object
        ChannelListViewStyle style = adapter.getStyle();
        // inflate the layout specified in the style
        View v = LayoutInflater.from(parent.getContext()).inflate(style.channelPreviewLayout, parent, false);

        // configure the viewholder
        ChannelListItemViewHolder holder = new ChannelListItemViewHolder(v);
        configureHolder(holder, adapter);
        // return..

        return holder;
    }
}
