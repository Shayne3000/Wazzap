package com.senijoshua.wazzap.presentation.home

import android.os.Bundle
import android.view.*
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.presentation.root.WazzapFragment

/**
 * Fragment that is the first point of entry into the app and holds all the primary fragments
 * in a Viewpager.
 *
 * @author Seni Joshua
 */
class HomeFragment : WazzapFragment(R.layout.fragment_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
