/*
 * Copyright (C) 2016 ExoMedia Contributors
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

package com.getstream.sdk.chat.utils.exomedia.core.video;

/**
 * Represents a protocol that the object can call clear.  This
 * is used to reference both the {@link com.getstream.sdk.chat.utils.exomedia.core.video.ResizingSurfaceView}
 * and {@link com.getstream.sdk.chat.utils.exomedia.core.video.ResizingTextureView} which can both
 * have their surfaces cleared.
 */
public interface ClearableSurface {
    void clearSurface();
}
