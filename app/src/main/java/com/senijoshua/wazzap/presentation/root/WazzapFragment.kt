package com.senijoshua.wazzap.presentation.root

import android.content.Context
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.senijoshua.wazzap.utils.annotations.OpenForTesting

/**
 * Root Fragment class that would hold common configurations for all fragments
 * such as the Toolbar, navigationController.
 *
 * @author Seni Joshua
 */
@OpenForTesting
class WazzapFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    // Every fragment subclass should not need to always re-implement a navController as
    // it would have been done for them within this parent class.
    lateinit var navController: NavController

    val rootActivity: WazzapActivity by lazy { activity as WazzapActivity }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        navController = findNavController()
    }
}
