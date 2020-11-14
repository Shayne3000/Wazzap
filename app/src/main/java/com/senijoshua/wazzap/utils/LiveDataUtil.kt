package com.senijoshua.wazzap.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * Class that wraps items emitted from a LiveData in order to implement several
 * operations and/or transformations on said item
 *
 * Based off
 * https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150
 */

/**
 * Similar to [LiveData.observe], but only calls [onChanged] if the value
 * emitted is non-null.
 */
inline fun <T> LiveData<T>.observeNonNull(
    owner: LifecycleOwner,
    crossinline onChanged: (T) -> Unit
) {
    observe(owner, { t ->
        if (t != null) {
            onChanged(t)
        }
    })
}
