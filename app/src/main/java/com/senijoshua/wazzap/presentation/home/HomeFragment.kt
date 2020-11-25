package com.senijoshua.wazzap.presentation.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.presentation.home.calls.CallsFragment
import com.senijoshua.wazzap.presentation.home.chatlist.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.status.StatusFragment
import com.senijoshua.wazzap.presentation.root.WazzapActivity
import com.senijoshua.wazzap.presentation.root.WazzapFragment
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

private const val TAB_COUNT = 3
private const val CHAT_INDEX = 0
private const val STATUS_INDEX = 1
private const val CALLS_INDEX = 2

/**
 * Fragment that is the first point of entry into the app and holds all the primary fragments
 * in a Viewpager.
 *
 * @author Seni Joshua
 */
class HomeFragment : WazzapFragment(R.layout.fragment_home) {
    @Inject lateinit var viewModel: HomeViewModel
    private val homeTabTitles = listOf(R.string.chats, R.string.status, R.string.calls)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        // Denotes that the fragment participates in options menu handling
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // sets the toolbar view as the action bar for this fragment in the root activity
        rootActivity.setSupportActionBar(home_toolbar)

        home_view_pager.adapter = HomeViewPagerAdapter(childFragmentManager, lifecycle)

        // initialise the tablayout and attach the view pager to it
        TabLayoutMediator(home_tab_layout, home_view_pager) { tab, position ->
            when (position) {
                CHAT_INDEX -> tab.text = getString(homeTabTitles[CHAT_INDEX])
                STATUS_INDEX -> tab.text = getString(homeTabTitles[STATUS_INDEX])
                CALLS_INDEX -> tab.text = getString(homeTabTitles[CALLS_INDEX])
            }
            // when a certain tab is selected, the viewpager should page to that tab
            home_view_pager.currentItem = tab.position
        }.attach()
        home_tab_layout.selectTab(home_tab_layout.getTabAt(CHAT_INDEX))
    }
}

class HomeViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = TAB_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            CHAT_INDEX -> ConversationListFragment()

            STATUS_INDEX -> StatusFragment()

            CALLS_INDEX -> CallsFragment()

            else -> Fragment()
        }
    }
}
