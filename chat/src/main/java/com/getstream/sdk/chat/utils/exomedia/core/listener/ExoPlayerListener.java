/*
 * Copyright (C) 2015 - 2017 ExoMedia Contributors,
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.getstream.sdk.chat.utils.exomedia.core.listener;

import com.getstream.sdk.chat.utils.exomedia.core.exoplayer.ExoMediaPlayer;
import com.getstream.sdk.chat.utils.exomedia.listener.OnSeekCompletionListener;

/**
 * A listener for core {@link ExoMediaPlayer} events
 */
public interface ExoPlayerListener extends OnSeekCompletionListener {
    void onStateChanged(boolean playWhenReady, int playbackState);

    void onError(ExoMediaPlayer exoMediaPlayer, Exception e);

    void onVideoSizeChanged(int width, int height, int unAppliedRotationDegrees, float pixelWidthHeightRatio);
}
