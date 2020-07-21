package com.senijoshua.wazzap.presentation.root

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.senijoshua.wazzap.utils.annotations.OpenForTesting

/**
 * Root Fragment class that would hold common configurations for all fragments
 * such as the Toolbar.
 *
 * @author Seni Joshua
 */
@OpenForTesting
class WazzapFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
}
